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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_VERSION", "RULE_FQN", "RULE_CONSTANT", "RULE_DOWNLOAD_TEMPLATE", "RULE_INT", "RULE_DOUBLE", "RULE_DIGIT", "RULE_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID_VERSION", "'copyright'", "'project'", "'version'", "'='", "'{'", "'uiApp'", "'backgroundApp'", "'}'", "'application'", "'cache'", "'javaPackage'", "'server'", "'url'", "'extends'", "'authorization'", "'services'", "'('", "','", "')'", "'use template'", "'active'", "'generator'", "'extensionPoint'", "':'", "'mixin'", "'serialization'", "'persistence'", "'datatype'", "'isArray'", "'constraints'", "'isDate'", "'isTime'", "'isTimestamp'", "'isPredefined'", "'isString'", "'isPrimitive'", "'isBool'", "'isNumeric'", "'isDecimal'", "'enum'", "'lit'", "'isDefault'", "'isUndefined'", "'isHidden'", "'const'", "'->'", "'+'", "'friends'", "'['", "']'", "'settings'", "'type'", "'strategy'", "'interval'", "'using'", "'entity'", "'unique'", "'index'", "'dto'", "'wraps'", "'queue'", "'rest'", "'bigData'", "'path'", "'headers'", "'parameters'", "'multipart'", "'autorization'", "'requestDto'", "'responseDto'", "'errorDto'", "'contextDto'", "'method'", "'as'", "'refParam'", "'alias'", "'param'", "'attachment'", "'ContentTypeHeader'", "'RawHeader'", "'restCrud'", "'restWorkflow'", "'service'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'format'", "'refEntity'", "'cascading'", "'ref'", "'opposite'", "'embed'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'slot'", "'trigger app install'", "'trigger app update'", "'trigger email'", "'trigger device start'", "'trigger sms'", "'trigger push'", "'trigger geofence'", "'event'", "'module bluetooth'", "'module push'", "'module NFC'", "'toFirstLower'", "'toFirstUpper'", "'toLowerCase'", "'toUpperCase'", "'enter'", "'leave'", "'lowEnergy'", "'spp'", "'beacon'", "'id'", "'custom'", "'text'", "'*'", "'0'", "'?'", "'1'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_SIGN=13;
    public static final int RULE_VERSION=6;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FQN=7;
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
    public static final int RULE_ID=5;
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
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
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
    public static final int RULE_STRING=4;
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
             newCompositeNode(grammarAccess.getMobaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaModel=ruleMobaModel();

            state._fsp--;

             current =iv_ruleMobaModel; 
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
    // $ANTLR end "entryRuleMobaModel"


    // $ANTLR start "ruleMobaModel"
    // InternalMoba.g:72:1: ruleMobaModel returns [EObject current=null] : ( (otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) ) )? ( (lv_features_2_0= ruleMobaModelFeature ) )* ) ;
    public final EObject ruleMobaModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_copyright_1_0=null;
        EObject lv_features_2_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:78:2: ( ( (otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) ) )? ( (lv_features_2_0= ruleMobaModelFeature ) )* ) )
            // InternalMoba.g:79:2: ( (otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) ) )? ( (lv_features_2_0= ruleMobaModelFeature ) )* )
            {
            // InternalMoba.g:79:2: ( (otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) ) )? ( (lv_features_2_0= ruleMobaModelFeature ) )* )
            // InternalMoba.g:80:3: (otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) ) )? ( (lv_features_2_0= ruleMobaModelFeature ) )*
            {
            // InternalMoba.g:80:3: (otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMoba.g:81:4: otherlv_0= 'copyright' ( (lv_copyright_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getMobaModelAccess().getCopyrightKeyword_0_0());
                    			
                    // InternalMoba.g:85:4: ( (lv_copyright_1_0= RULE_STRING ) )
                    // InternalMoba.g:86:5: (lv_copyright_1_0= RULE_STRING )
                    {
                    // InternalMoba.g:86:5: (lv_copyright_1_0= RULE_STRING )
                    // InternalMoba.g:87:6: lv_copyright_1_0= RULE_STRING
                    {
                    lv_copyright_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_copyright_1_0, grammarAccess.getMobaModelAccess().getCopyrightSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"copyright",
                    							lv_copyright_1_0,
                    							"org.mobadsl.grammar.Moba.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:104:3: ( (lv_features_2_0= ruleMobaModelFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMoba.g:105:4: (lv_features_2_0= ruleMobaModelFeature )
            	    {
            	    // InternalMoba.g:105:4: (lv_features_2_0= ruleMobaModelFeature )
            	    // InternalMoba.g:106:5: lv_features_2_0= ruleMobaModelFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaModelAccess().getFeaturesMobaModelFeatureParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_features_2_0=ruleMobaModelFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_2_0,
            	    						"org.mobadsl.grammar.Moba.MobaModelFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleMobaModel"


    // $ANTLR start "entryRuleMobaModelFeature"
    // InternalMoba.g:127:1: entryRuleMobaModelFeature returns [EObject current=null] : iv_ruleMobaModelFeature= ruleMobaModelFeature EOF ;
    public final EObject entryRuleMobaModelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaModelFeature = null;


        try {
            // InternalMoba.g:127:57: (iv_ruleMobaModelFeature= ruleMobaModelFeature EOF )
            // InternalMoba.g:128:2: iv_ruleMobaModelFeature= ruleMobaModelFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaModelFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaModelFeature=ruleMobaModelFeature();

            state._fsp--;

             current =iv_ruleMobaModelFeature; 
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
    // $ANTLR end "entryRuleMobaModelFeature"


    // $ANTLR start "ruleMobaModelFeature"
    // InternalMoba.g:134:1: ruleMobaModelFeature returns [EObject current=null] : (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication ) ;
    public final EObject ruleMobaModelFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaProject_0 = null;

        EObject this_MobaApplication_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:140:2: ( (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication ) )
            // InternalMoba.g:141:2: (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication )
            {
            // InternalMoba.g:141:2: (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMoba.g:142:3: this_MobaProject_0= ruleMobaProject
                    {

                    			newCompositeNode(grammarAccess.getMobaModelFeatureAccess().getMobaProjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaProject_0=ruleMobaProject();

                    state._fsp--;


                    			current = this_MobaProject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:151:3: this_MobaApplication_1= ruleMobaApplication
                    {

                    			newCompositeNode(grammarAccess.getMobaModelFeatureAccess().getMobaApplicationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaApplication_1=ruleMobaApplication();

                    state._fsp--;


                    			current = this_MobaApplication_1;
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
    // $ANTLR end "ruleMobaModelFeature"


    // $ANTLR start "entryRuleMobaProject"
    // InternalMoba.g:163:1: entryRuleMobaProject returns [EObject current=null] : iv_ruleMobaProject= ruleMobaProject EOF ;
    public final EObject entryRuleMobaProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProject = null;


        try {
            // InternalMoba.g:163:52: (iv_ruleMobaProject= ruleMobaProject EOF )
            // InternalMoba.g:164:2: iv_ruleMobaProject= ruleMobaProject EOF
            {
             newCompositeNode(grammarAccess.getMobaProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaProject=ruleMobaProject();

            state._fsp--;

             current =iv_ruleMobaProject; 
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
    // $ANTLR end "entryRuleMobaProject"


    // $ANTLR start "ruleMobaProject"
    // InternalMoba.g:170:1: ruleMobaProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
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
            // InternalMoba.g:176:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalMoba.g:177:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalMoba.g:177:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalMoba.g:178:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaProjectAccess().getProjectKeyword_0());
            		
            // InternalMoba.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaProjectAccess().getVersionKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:208:3: ( (lv_version_4_0= RULE_VERSION ) )
            // InternalMoba.g:209:4: (lv_version_4_0= RULE_VERSION )
            {
            // InternalMoba.g:209:4: (lv_version_4_0= RULE_VERSION )
            // InternalMoba.g:210:5: lv_version_4_0= RULE_VERSION
            {
            lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_9); 

            					newLeafNode(lv_version_4_0, grammarAccess.getMobaProjectAccess().getVersionVERSIONTerminalRuleCall_4_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaProjectRule());
            			}
            			newCompositeNode(grammarAccess.getMobaProjectAccess().getMobaFriendsAbleParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_5;
            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getMobaProjectAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMoba.g:241:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:242:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:242:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) )
            // InternalMoba.g:243:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());
            				
            // InternalMoba.g:246:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* )
            // InternalMoba.g:247:6: ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )*
            {
            // InternalMoba.g:247:6: ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMoba.g:248:4: ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:248:4: ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:249:5: {...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:249:108: ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:250:6: ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalMoba.g:253:9: ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalMoba.g:253:10: {...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaProject", "true");
            	    }
            	    // InternalMoba.g:253:19: (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalMoba.g:253:20: otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMobaProjectAccess().getUiAppKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_9, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_7_0_1());
            	    								
            	    // InternalMoba.g:261:9: ( (otherlv_10= RULE_ID ) )
            	    // InternalMoba.g:262:10: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMoba.g:262:10: (otherlv_10= RULE_ID )
            	    // InternalMoba.g:263:11: otherlv_10= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaProjectRule());
            	    											}
            	    										
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    											newLeafNode(otherlv_10, grammarAccess.getMobaProjectAccess().getUiApplicationMobaApplicationCrossReference_7_0_2_0());
            	    										

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
            	    // InternalMoba.g:280:4: ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:280:4: ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:281:5: {...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:281:108: ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:282:6: ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalMoba.g:285:9: ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) )
            	    // InternalMoba.g:285:10: {...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaProject", "true");
            	    }
            	    // InternalMoba.g:285:19: (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) )
            	    // InternalMoba.g:285:20: otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_7); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaProjectAccess().getBackgroundAppKeyword_7_1_0());
            	    								
            	    otherlv_12=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_7_1_1());
            	    								
            	    // InternalMoba.g:293:9: ( (otherlv_13= RULE_ID ) )
            	    // InternalMoba.g:294:10: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMoba.g:294:10: (otherlv_13= RULE_ID )
            	    // InternalMoba.g:295:11: otherlv_13= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaProjectRule());
            	    											}
            	    										
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    											newLeafNode(otherlv_13, grammarAccess.getMobaProjectAccess().getBackgroundApplicationMobaApplicationCrossReference_7_1_2_0());
            	    										

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
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());
            				

            }

            otherlv_14=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMobaProjectAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMobaProject"


    // $ANTLR start "entryRuleMobaApplication"
    // InternalMoba.g:327:1: entryRuleMobaApplication returns [EObject current=null] : iv_ruleMobaApplication= ruleMobaApplication EOF ;
    public final EObject entryRuleMobaApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplication = null;


        try {
            // InternalMoba.g:327:56: (iv_ruleMobaApplication= ruleMobaApplication EOF )
            // InternalMoba.g:328:2: iv_ruleMobaApplication= ruleMobaApplication EOF
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
    // InternalMoba.g:334:1: ruleMobaApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) ) ) otherlv_14= '}' ) ;
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
        Token lv_javaPackage_12_0=null;
        Token otherlv_14=null;
        EObject this_MobaFriendsAble_8 = null;

        EObject lv_features_13_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:340:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalMoba.g:341:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalMoba.g:341:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) ) ) otherlv_14= '}' )
            // InternalMoba.g:342:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMoba.g:346:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:347:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:347:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:348:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaApplicationAccess().getVersionKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaApplicationAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:372:3: ( (lv_version_4_0= RULE_VERSION ) )
            // InternalMoba.g:373:4: (lv_version_4_0= RULE_VERSION )
            {
            // InternalMoba.g:373:4: (lv_version_4_0= RULE_VERSION )
            // InternalMoba.g:374:5: lv_version_4_0= RULE_VERSION
            {
            lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_12); 

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

            // InternalMoba.g:390:3: (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMoba.g:391:4: otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getMobaApplicationAccess().getCacheKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaApplicationAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalMoba.g:399:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMoba.g:400:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMoba.g:400:5: (otherlv_7= RULE_ID )
                    // InternalMoba.g:401:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaApplicationRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_7, grammarAccess.getMobaApplicationAccess().getDefaultCacheMobaCacheCrossReference_5_2_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaApplicationRule());
            			}
            			newCompositeNode(grammarAccess.getMobaApplicationAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_8;
            			afterParserOrEnumRuleCall();
            		
            otherlv_9=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMoba.g:428:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) ) )
            // InternalMoba.g:429:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) )
            {
            // InternalMoba.g:429:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* ) )
            // InternalMoba.g:430:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8());
            				
            // InternalMoba.g:433:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )* )
            // InternalMoba.g:434:6: ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )*
            {
            // InternalMoba.g:434:6: ( ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 0) ) {
                    alt7=1;
                }
                else if ( ( LA7_0 == 28 || LA7_0 == 30 || LA7_0 == 33 || LA7_0 >= 38 && LA7_0 <= 40 || LA7_0 >= 44 && LA7_0 <= 46 || LA7_0 == 63 || LA7_0 == 69 || LA7_0 == 74 || LA7_0 == 77 || LA7_0 >= 79 && LA7_0 <= 80 || LA7_0 >= 99 && LA7_0 <= 100 || LA7_0 >= 122 && LA7_0 <= 129 || LA7_0 >= 131 && LA7_0 <= 133 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMoba.g:435:4: ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:435:4: ({...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) ) )
            	    // InternalMoba.g:436:5: {...}? => ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaApplication", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalMoba.g:436:112: ( ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) ) )
            	    // InternalMoba.g:437:6: ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 0);
            	    					
            	    // InternalMoba.g:440:9: ({...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) ) )
            	    // InternalMoba.g:440:10: {...}? => (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaApplication", "true");
            	    }
            	    // InternalMoba.g:440:19: (otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) ) )
            	    // InternalMoba.g:440:20: otherlv_11= 'javaPackage' ( (lv_javaPackage_12_0= RULE_FQN ) )
            	    {
            	    otherlv_11=(Token)match(input,29,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaApplicationAccess().getJavaPackageKeyword_8_0_0());
            	    								
            	    // InternalMoba.g:444:9: ( (lv_javaPackage_12_0= RULE_FQN ) )
            	    // InternalMoba.g:445:10: (lv_javaPackage_12_0= RULE_FQN )
            	    {
            	    // InternalMoba.g:445:10: (lv_javaPackage_12_0= RULE_FQN )
            	    // InternalMoba.g:446:11: lv_javaPackage_12_0= RULE_FQN
            	    {
            	    lv_javaPackage_12_0=(Token)match(input,RULE_FQN,FOLLOW_13); 

            	    											newLeafNode(lv_javaPackage_12_0, grammarAccess.getMobaApplicationAccess().getJavaPackageFQNTerminalRuleCall_8_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaApplicationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"javaPackage",
            	    												lv_javaPackage_12_0,
            	    												"org.mobadsl.grammar.Moba.FQN");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:468:4: ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) )
            	    {
            	    // InternalMoba.g:468:4: ({...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ ) )
            	    // InternalMoba.g:469:5: {...}? => ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaApplication", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalMoba.g:469:112: ( ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+ )
            	    // InternalMoba.g:470:6: ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8(), 1);
            	    					
            	    // InternalMoba.g:473:9: ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        alt6 = dfa6.predict(input);
            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMoba.g:473:10: {...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleMobaApplication", "true");
            	    	    }
            	    	    // InternalMoba.g:473:19: ( (lv_features_13_0= ruleMobaApplicationFeature ) )
            	    	    // InternalMoba.g:473:20: (lv_features_13_0= ruleMobaApplicationFeature )
            	    	    {
            	    	    // InternalMoba.g:473:20: (lv_features_13_0= ruleMobaApplicationFeature )
            	    	    // InternalMoba.g:474:10: lv_features_13_0= ruleMobaApplicationFeature
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_features_13_0=ruleMobaApplicationFeature();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"features",
            	    	    											lv_features_13_0,
            	    	    											"org.mobadsl.grammar.Moba.MobaApplicationFeature");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaApplicationAccess().getUnorderedGroup_8());
            				

            }

            otherlv_14=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMoba.g:511:1: entryRuleMobaApplicationFeature returns [EObject current=null] : iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF ;
    public final EObject entryRuleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplicationFeature = null;


        try {
            // InternalMoba.g:511:63: (iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF )
            // InternalMoba.g:512:2: iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF
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
    // InternalMoba.g:518:1: ruleMobaApplicationFeature returns [EObject current=null] : (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache ) ;
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
            // InternalMoba.g:524:2: ( (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache ) )
            // InternalMoba.g:525:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache )
            {
            // InternalMoba.g:525:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache )
            int alt8=15;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMoba.g:526:3: this_MobaDataType_0= ruleMobaDataType
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
                    // InternalMoba.g:535:3: this_MobaTemplate_1= ruleMobaTemplate
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
                    // InternalMoba.g:544:3: this_MobaConstant_2= ruleMobaConstant
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
                    // InternalMoba.g:553:3: this_MobaSettings_3= ruleMobaSettings
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
                    // InternalMoba.g:562:3: this_MobaData_4= ruleMobaData
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
                    // InternalMoba.g:571:3: this_MobaREST_5= ruleMobaREST
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaRESTParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaREST_5=ruleMobaREST();

                    state._fsp--;


                    			current = this_MobaREST_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMoba.g:580:3: this_MobaGenerator_6= ruleMobaGenerator
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaGenerator_6=ruleMobaGenerator();

                    state._fsp--;


                    			current = this_MobaGenerator_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMoba.g:589:3: this_MobaAuthorization_7= ruleMobaAuthorization
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaAuthorizationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaAuthorization_7=ruleMobaAuthorization();

                    state._fsp--;


                    			current = this_MobaAuthorization_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMoba.g:598:3: this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaTransportSerializationTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaTransportSerializationType_8=ruleMobaTransportSerializationType();

                    state._fsp--;


                    			current = this_MobaTransportSerializationType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMoba.g:607:3: this_MobaExternalModule_9= ruleMobaExternalModule
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaExternalModuleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaExternalModule_9=ruleMobaExternalModule();

                    state._fsp--;


                    			current = this_MobaExternalModule_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMoba.g:616:3: this_MobaTrigger_10= ruleMobaTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaTriggerParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaTrigger_10=ruleMobaTrigger();

                    state._fsp--;


                    			current = this_MobaTrigger_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMoba.g:625:3: this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorSlotParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaGeneratorSlot_11=ruleMobaGeneratorSlot();

                    state._fsp--;


                    			current = this_MobaGeneratorSlot_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMoba.g:634:3: this_MobaServer_12= ruleMobaServer
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaServerParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaServer_12=ruleMobaServer();

                    state._fsp--;


                    			current = this_MobaServer_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalMoba.g:643:3: this_MobaPersistenceType_13= ruleMobaPersistenceType
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaPersistenceTypeParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaPersistenceType_13=ruleMobaPersistenceType();

                    state._fsp--;


                    			current = this_MobaPersistenceType_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalMoba.g:652:3: this_MobaCache_14= ruleMobaCache
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaCacheParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaCache_14=ruleMobaCache();

                    state._fsp--;


                    			current = this_MobaCache_14;
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


    // $ANTLR start "entryRuleMobaServer"
    // InternalMoba.g:664:1: entryRuleMobaServer returns [EObject current=null] : iv_ruleMobaServer= ruleMobaServer EOF ;
    public final EObject entryRuleMobaServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaServer = null;


        try {
            // InternalMoba.g:664:51: (iv_ruleMobaServer= ruleMobaServer EOF )
            // InternalMoba.g:665:2: iv_ruleMobaServer= ruleMobaServer EOF
            {
             newCompositeNode(grammarAccess.getMobaServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaServer=ruleMobaServer();

            state._fsp--;

             current =iv_ruleMobaServer; 
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
    // $ANTLR end "entryRuleMobaServer"


    // $ANTLR start "ruleMobaServer"
    // InternalMoba.g:671:1: ruleMobaServer returns [EObject current=null] : (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // InternalMoba.g:677:2: ( (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalMoba.g:678:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalMoba.g:678:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalMoba.g:679:3: otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaServerAccess().getServerKeyword_0());
            		
            // InternalMoba.g:683:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:684:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:684:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:685:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaServerAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaServerAccess().getUrlKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:709:3: ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_CONSTANT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoba.g:710:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:710:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    // InternalMoba.g:711:5: (lv_urlString_4_0= RULE_STRING )
                    {
                    // InternalMoba.g:711:5: (lv_urlString_4_0= RULE_STRING )
                    // InternalMoba.g:712:6: lv_urlString_4_0= RULE_STRING
                    {
                    lv_urlString_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_urlString_4_0, grammarAccess.getMobaServerAccess().getUrlStringSTRINGTerminalRuleCall_4_0_0());
                    					

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
                    break;
                case 2 :
                    // InternalMoba.g:729:4: ( (otherlv_5= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:729:4: ( (otherlv_5= RULE_CONSTANT ) )
                    // InternalMoba.g:730:5: (otherlv_5= RULE_CONSTANT )
                    {
                    // InternalMoba.g:730:5: (otherlv_5= RULE_CONSTANT )
                    // InternalMoba.g:731:6: otherlv_5= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaServerRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_CONSTANT,FOLLOW_17); 

                    						newLeafNode(otherlv_5, grammarAccess.getMobaServerAccess().getUrlConstMobaConstantCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:743:3: (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoba.g:744:4: otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaServerAccess().getExtendsKeyword_5_0());
                    			
                    // InternalMoba.g:748:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMoba.g:749:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMoba.g:749:5: (otherlv_7= RULE_ID )
                    // InternalMoba.g:750:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaServerRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_7, grammarAccess.getMobaServerAccess().getSuperTypeMobaServerCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaServerRule());
            			}
            			newCompositeNode(grammarAccess.getMobaServerAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_8;
            			afterParserOrEnumRuleCall();
            		
            otherlv_9=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getMobaServerAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMoba.g:777:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:778:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:778:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) )
            // InternalMoba.g:779:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());
            				
            // InternalMoba.g:782:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* )
            // InternalMoba.g:783:6: ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )*
            {
            // InternalMoba.g:783:6: ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMoba.g:784:4: ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:784:4: ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:785:5: {...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalMoba.g:785:107: ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:786:6: ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0);
            	    					
            	    // InternalMoba.g:789:9: ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:789:10: {...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:789:19: (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:789:20: otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) )
            	    {
            	    otherlv_11=(Token)match(input,33,FOLLOW_7); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaServerAccess().getAuthorizationKeyword_8_0_0());
            	    								
            	    otherlv_12=(Token)match(input,22,FOLLOW_19); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_8_0_1());
            	    								
            	    // InternalMoba.g:797:9: ( (otherlv_13= RULE_CONSTANT ) )
            	    // InternalMoba.g:798:10: (otherlv_13= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:798:10: (otherlv_13= RULE_CONSTANT )
            	    // InternalMoba.g:799:11: otherlv_13= RULE_CONSTANT
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaServerRule());
            	    											}
            	    										
            	    otherlv_13=(Token)match(input,RULE_CONSTANT,FOLLOW_18); 

            	    											newLeafNode(otherlv_13, grammarAccess.getMobaServerAccess().getAuthorizationMobaAuthorizationCrossReference_8_0_2_0());
            	    										

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
            	    // InternalMoba.g:816:4: ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:816:4: ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) )
            	    // InternalMoba.g:817:5: {...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalMoba.g:817:107: ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) )
            	    // InternalMoba.g:818:6: ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1);
            	    					
            	    // InternalMoba.g:821:9: ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) )
            	    // InternalMoba.g:821:10: {...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:821:19: (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )
            	    // InternalMoba.g:821:20: otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')'
            	    {
            	    otherlv_14=(Token)match(input,34,FOLLOW_7); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMobaServerAccess().getServicesKeyword_8_1_0());
            	    								
            	    otherlv_15=(Token)match(input,22,FOLLOW_20); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_8_1_1());
            	    								
            	    otherlv_16=(Token)match(input,35,FOLLOW_5); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMobaServerAccess().getLeftParenthesisKeyword_8_1_2());
            	    								
            	    // InternalMoba.g:833:9: ( (otherlv_17= RULE_ID ) )
            	    // InternalMoba.g:834:10: (otherlv_17= RULE_ID )
            	    {
            	    // InternalMoba.g:834:10: (otherlv_17= RULE_ID )
            	    // InternalMoba.g:835:11: otherlv_17= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaServerRule());
            	    											}
            	    										
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    											newLeafNode(otherlv_17, grammarAccess.getMobaServerAccess().getServicesMobaRESTCrossReference_8_1_3_0());
            	    										

            	    }


            	    }

            	    // InternalMoba.g:846:9: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==36) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMoba.g:847:10: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,36,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getMobaServerAccess().getCommaKeyword_8_1_4_0());
            	    	    									
            	    	    // InternalMoba.g:851:10: ( (otherlv_19= RULE_ID ) )
            	    	    // InternalMoba.g:852:11: (otherlv_19= RULE_ID )
            	    	    {
            	    	    // InternalMoba.g:852:11: (otherlv_19= RULE_ID )
            	    	    // InternalMoba.g:853:12: otherlv_19= RULE_ID
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getMobaServerRule());
            	    	    												}
            	    	    											
            	    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    	    												newLeafNode(otherlv_19, grammarAccess.getMobaServerAccess().getServicesMobaRESTCrossReference_8_1_4_1_0());
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,37,FOLLOW_18); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMobaServerAccess().getRightParenthesisKeyword_8_1_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());
            				

            }

            otherlv_21=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMobaServerAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleMobaServer"


    // $ANTLR start "entryRuleMobaTemplate"
    // InternalMoba.g:890:1: entryRuleMobaTemplate returns [EObject current=null] : iv_ruleMobaTemplate= ruleMobaTemplate EOF ;
    public final EObject entryRuleMobaTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTemplate = null;


        try {
            // InternalMoba.g:890:53: (iv_ruleMobaTemplate= ruleMobaTemplate EOF )
            // InternalMoba.g:891:2: iv_ruleMobaTemplate= ruleMobaTemplate EOF
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
    // InternalMoba.g:897:1: ruleMobaTemplate returns [EObject current=null] : (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) ;
    public final EObject ruleMobaTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_downloadTemplate_2_0=null;


        	enterRule();

        try {
            // InternalMoba.g:903:2: ( (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) )
            // InternalMoba.g:904:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            {
            // InternalMoba.g:904:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            // InternalMoba.g:905:3: otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0());
            		
            // InternalMoba.g:909:3: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_DOWNLOAD_TEMPLATE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoba.g:910:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:910:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:911:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:911:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:912:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaTemplateRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:924:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    {
                    // InternalMoba.g:924:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    // InternalMoba.g:925:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    {
                    // InternalMoba.g:925:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    // InternalMoba.g:926:6: lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE
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
    // InternalMoba.g:947:1: entryRuleMobaGenerator returns [EObject current=null] : iv_ruleMobaGenerator= ruleMobaGenerator EOF ;
    public final EObject entryRuleMobaGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGenerator = null;


        try {
            // InternalMoba.g:947:54: (iv_ruleMobaGenerator= ruleMobaGenerator EOF )
            // InternalMoba.g:948:2: iv_ruleMobaGenerator= ruleMobaGenerator EOF
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
    // InternalMoba.g:954:1: ruleMobaGenerator returns [EObject current=null] : ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) ;
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
            // InternalMoba.g:960:2: ( ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) )
            // InternalMoba.g:961:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            {
            // InternalMoba.g:961:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            // InternalMoba.g:962:3: ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}'
            {
            // InternalMoba.g:962:3: ( (lv_active_0_0= 'active' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoba.g:963:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:963:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:964:5: lv_active_0_0= 'active'
                    {
                    lv_active_0_0=(Token)match(input,39,FOLLOW_23); 

                    					newLeafNode(lv_active_0_0, grammarAccess.getMobaGeneratorAccess().getActiveActiveKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaGeneratorRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorAccess().getGeneratorKeyword_1());
            		
            // InternalMoba.g:980:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:981:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:981:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:982:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoba.g:1002:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMoba.g:1003:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    {
            	    // InternalMoba.g:1003:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    // InternalMoba.g:1004:5: lv_features_4_0= ruleMobaGeneratorFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaGeneratorAccess().getFeaturesMobaGeneratorFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMoba.g:1029:1: entryRuleMobaGeneratorFeature returns [EObject current=null] : iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF ;
    public final EObject entryRuleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorFeature = null;


        try {
            // InternalMoba.g:1029:61: (iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF )
            // InternalMoba.g:1030:2: iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF
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
    // InternalMoba.g:1036:1: ruleMobaGeneratorFeature returns [EObject current=null] : (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) ;
    public final EObject ruleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaGeneratorIDFeature_0 = null;

        EObject this_MobaGeneratorMixinFeature_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:1042:2: ( (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) )
            // InternalMoba.g:1043:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            {
            // InternalMoba.g:1043:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            else if ( (LA16_0==43) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoba.g:1044:3: this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature
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
                    // InternalMoba.g:1053:3: this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature
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
    // InternalMoba.g:1065:1: entryRuleMobaGeneratorIDFeature returns [EObject current=null] : iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF ;
    public final EObject entryRuleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorIDFeature = null;


        try {
            // InternalMoba.g:1065:63: (iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF )
            // InternalMoba.g:1066:2: iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF
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
    // InternalMoba.g:1072:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatorId_1_0=null;
        Token otherlv_2=null;
        Token lv_generatorVersion_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:1078:2: ( (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) )
            // InternalMoba.g:1079:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            {
            // InternalMoba.g:1079:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            // InternalMoba.g:1080:3: otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getExtensionPointKeyword_0());
            		
            // InternalMoba.g:1084:3: ( (lv_generatorId_1_0= RULE_FQN ) )
            // InternalMoba.g:1085:4: (lv_generatorId_1_0= RULE_FQN )
            {
            // InternalMoba.g:1085:4: (lv_generatorId_1_0= RULE_FQN )
            // InternalMoba.g:1086:5: lv_generatorId_1_0= RULE_FQN
            {
            lv_generatorId_1_0=(Token)match(input,RULE_FQN,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorIDFeatureAccess().getColonKeyword_2());
            		
            // InternalMoba.g:1106:3: ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            // InternalMoba.g:1107:4: (lv_generatorVersion_3_0= RULE_VERSION )
            {
            // InternalMoba.g:1107:4: (lv_generatorVersion_3_0= RULE_VERSION )
            // InternalMoba.g:1108:5: lv_generatorVersion_3_0= RULE_VERSION
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
    // InternalMoba.g:1128:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:1128:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:1129:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
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
    // InternalMoba.g:1135:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:1141:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMoba.g:1142:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMoba.g:1142:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            // InternalMoba.g:1143:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
            		
            // InternalMoba.g:1147:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1148:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1148:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1149:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleMobaAuthorization"
    // InternalMoba.g:1164:1: entryRuleMobaAuthorization returns [EObject current=null] : iv_ruleMobaAuthorization= ruleMobaAuthorization EOF ;
    public final EObject entryRuleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAuthorization = null;


        try {
            // InternalMoba.g:1164:58: (iv_ruleMobaAuthorization= ruleMobaAuthorization EOF )
            // InternalMoba.g:1165:2: iv_ruleMobaAuthorization= ruleMobaAuthorization EOF
            {
             newCompositeNode(grammarAccess.getMobaAuthorizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaAuthorization=ruleMobaAuthorization();

            state._fsp--;

             current =iv_ruleMobaAuthorization; 
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
    // $ANTLR end "entryRuleMobaAuthorization"


    // $ANTLR start "ruleMobaAuthorization"
    // InternalMoba.g:1171:1: ruleMobaAuthorization returns [EObject current=null] : (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1177:2: ( (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1178:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1178:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1179:3: otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaAuthorizationAccess().getAuthorizationKeyword_0());
            		
            // InternalMoba.g:1183:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1184:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1184:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1185:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaAuthorizationAccess().getNameCONSTANTTerminalRuleCall_1_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaAuthorizationRule());
            			}
            			newCompositeNode(grammarAccess.getMobaAuthorizationAccess().getMobaFriendsAbleParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_2=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaAuthorization"


    // $ANTLR start "entryRuleMobaTransportSerializationType"
    // InternalMoba.g:1216:1: entryRuleMobaTransportSerializationType returns [EObject current=null] : iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF ;
    public final EObject entryRuleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTransportSerializationType = null;


        try {
            // InternalMoba.g:1216:71: (iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF )
            // InternalMoba.g:1217:2: iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF
            {
             newCompositeNode(grammarAccess.getMobaTransportSerializationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaTransportSerializationType=ruleMobaTransportSerializationType();

            state._fsp--;

             current =iv_ruleMobaTransportSerializationType; 
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
    // $ANTLR end "entryRuleMobaTransportSerializationType"


    // $ANTLR start "ruleMobaTransportSerializationType"
    // InternalMoba.g:1223:1: ruleMobaTransportSerializationType returns [EObject current=null] : (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1229:2: ( (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1230:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1230:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1231:3: otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaTransportSerializationTypeAccess().getSerializationKeyword_0());
            		
            // InternalMoba.g:1235:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1236:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1236:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1237:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaTransportSerializationTypeAccess().getNameCONSTANTTerminalRuleCall_1_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaTransportSerializationTypeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaTransportSerializationTypeAccess().getMobaFriendsAbleParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_2=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaTransportSerializationType"


    // $ANTLR start "entryRuleMobaPersistenceType"
    // InternalMoba.g:1268:1: entryRuleMobaPersistenceType returns [EObject current=null] : iv_ruleMobaPersistenceType= ruleMobaPersistenceType EOF ;
    public final EObject entryRuleMobaPersistenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPersistenceType = null;


        try {
            // InternalMoba.g:1268:60: (iv_ruleMobaPersistenceType= ruleMobaPersistenceType EOF )
            // InternalMoba.g:1269:2: iv_ruleMobaPersistenceType= ruleMobaPersistenceType EOF
            {
             newCompositeNode(grammarAccess.getMobaPersistenceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPersistenceType=ruleMobaPersistenceType();

            state._fsp--;

             current =iv_ruleMobaPersistenceType; 
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
    // $ANTLR end "entryRuleMobaPersistenceType"


    // $ANTLR start "ruleMobaPersistenceType"
    // InternalMoba.g:1275:1: ruleMobaPersistenceType returns [EObject current=null] : (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaPersistenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1281:2: ( (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1282:2: (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1282:2: (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1283:3: otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPersistenceTypeAccess().getPersistenceKeyword_0());
            		
            // InternalMoba.g:1287:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1288:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1288:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1289:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaPersistenceTypeAccess().getNameCONSTANTTerminalRuleCall_1_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaPersistenceTypeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaPersistenceTypeAccess().getMobaFriendsAbleParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_2=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaPersistenceType"


    // $ANTLR start "entryRuleMobaDataType"
    // InternalMoba.g:1320:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:1320:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:1321:2: iv_ruleMobaDataType= ruleMobaDataType EOF
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
    // InternalMoba.g:1327:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:1333:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1334:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1334:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1335:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalMoba.g:1339:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1340:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1340:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1341:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            // InternalMoba.g:1357:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoba.g:1358:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1362:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1363:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1363:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1364:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDataTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDataTypeAccess().getSuperTypeMobaDataTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1376:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMoba.g:1377:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMoba.g:1377:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            // InternalMoba.g:1378:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				
            // InternalMoba.g:1381:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            // InternalMoba.g:1382:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?
            {
            // InternalMoba.g:1382:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt27=2;
                }
                else if ( ( LA27_0 >= 49 && LA27_0 <= 53 || LA27_0 >= 55 && LA27_0 <= 58 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoba.g:1383:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:1383:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:1384:5: {...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:1384:109: ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:1385:6: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoba.g:1388:9: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    // InternalMoba.g:1388:10: {...}? => ( (lv_array_5_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1388:19: ( (lv_array_5_0= 'isArray' ) )
            	    // InternalMoba.g:1388:20: (lv_array_5_0= 'isArray' )
            	    {
            	    // InternalMoba.g:1388:20: (lv_array_5_0= 'isArray' )
            	    // InternalMoba.g:1389:10: lv_array_5_0= 'isArray'
            	    {
            	    lv_array_5_0=(Token)match(input,47,FOLLOW_29); 

            	    										newLeafNode(lv_array_5_0, grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_3_0_0());
            	    									

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
            	case 2 :
            	    // InternalMoba.g:1406:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:1406:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:1407:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:1407:109: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:1408:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoba.g:1411:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:1411:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1411:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:1411:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_1_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_1_1());
            	    								
            	    // InternalMoba.g:1419:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:1420:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:1420:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:1421:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;


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

            	    // InternalMoba.g:1438:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==36) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalMoba.g:1439:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,36,FOLLOW_30); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_1_3_0());
            	    	    									
            	    	    // InternalMoba.g:1443:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:1444:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:1444:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:1445:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_21);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,37,FOLLOW_29); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:1473:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) )
            	    {
            	    // InternalMoba.g:1473:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) )
            	    // InternalMoba.g:1474:5: {...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:1474:109: ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) )
            	    // InternalMoba.g:1475:6: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoba.g:1478:9: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) )
            	    // InternalMoba.g:1478:10: {...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1478:19: ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) )
            	    int alt26=7;
            	    switch ( input.LA(1) ) {
            	    case 49:
            	    case 50:
            	    case 51:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt26=5;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt26=6;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt26=7;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalMoba.g:1478:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            {
            	            // InternalMoba.g:1478:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            // InternalMoba.g:1479:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            {
            	            // InternalMoba.g:1479:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) )
            	            int alt19=3;
            	            switch ( input.LA(1) ) {
            	            case 49:
            	                {
            	                alt19=1;
            	                }
            	                break;
            	            case 50:
            	                {
            	                alt19=2;
            	                }
            	                break;
            	            case 51:
            	                {
            	                alt19=3;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 19, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt19) {
            	                case 1 :
            	                    // InternalMoba.g:1480:11: ( (lv_date_12_0= 'isDate' ) )
            	                    {
            	                    // InternalMoba.g:1480:11: ( (lv_date_12_0= 'isDate' ) )
            	                    // InternalMoba.g:1481:12: (lv_date_12_0= 'isDate' )
            	                    {
            	                    // InternalMoba.g:1481:12: (lv_date_12_0= 'isDate' )
            	                    // InternalMoba.g:1482:13: lv_date_12_0= 'isDate'
            	                    {
            	                    lv_date_12_0=(Token)match(input,49,FOLLOW_31); 

            	                    													newLeafNode(lv_date_12_0, grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_3_2_0_0_0_0());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    													setWithLastConsumed(current, "date", true, "isDate");
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalMoba.g:1495:11: ( (lv_time_13_0= 'isTime' ) )
            	                    {
            	                    // InternalMoba.g:1495:11: ( (lv_time_13_0= 'isTime' ) )
            	                    // InternalMoba.g:1496:12: (lv_time_13_0= 'isTime' )
            	                    {
            	                    // InternalMoba.g:1496:12: (lv_time_13_0= 'isTime' )
            	                    // InternalMoba.g:1497:13: lv_time_13_0= 'isTime'
            	                    {
            	                    lv_time_13_0=(Token)match(input,50,FOLLOW_31); 

            	                    													newLeafNode(lv_time_13_0, grammarAccess.getMobaDataTypeAccess().getTimeIsTimeKeyword_3_2_0_0_1_0());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    													setWithLastConsumed(current, "time", true, "isTime");
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalMoba.g:1510:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    {
            	                    // InternalMoba.g:1510:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    // InternalMoba.g:1511:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    {
            	                    // InternalMoba.g:1511:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    // InternalMoba.g:1512:13: lv_timestamp_14_0= 'isTimestamp'
            	                    {
            	                    lv_timestamp_14_0=(Token)match(input,51,FOLLOW_31); 

            	                    													newLeafNode(lv_timestamp_14_0, grammarAccess.getMobaDataTypeAccess().getTimestampIsTimestampKeyword_3_2_0_0_2_0());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    													setWithLastConsumed(current, "timestamp", true, "isTimestamp");
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }

            	            // InternalMoba.g:1525:10: (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==35) ) {
            	                alt21=1;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // InternalMoba.g:1526:11: otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')'
            	                    {
            	                    otherlv_15=(Token)match(input,35,FOLLOW_16); 

            	                    											newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_0_1_0());
            	                    										
            	                    // InternalMoba.g:1530:11: ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) )
            	                    int alt20=2;
            	                    int LA20_0 = input.LA(1);

            	                    if ( (LA20_0==RULE_STRING) ) {
            	                        alt20=1;
            	                    }
            	                    else if ( (LA20_0==RULE_CONSTANT) ) {
            	                        alt20=2;
            	                    }
            	                    else {
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 20, 0, input);

            	                        throw nvae;
            	                    }
            	                    switch (alt20) {
            	                        case 1 :
            	                            // InternalMoba.g:1531:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            {
            	                            // InternalMoba.g:1531:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            // InternalMoba.g:1532:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            {
            	                            // InternalMoba.g:1532:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            // InternalMoba.g:1533:14: lv_dateFormatString_16_0= RULE_STRING
            	                            {
            	                            lv_dateFormatString_16_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	                            														newLeafNode(lv_dateFormatString_16_0, grammarAccess.getMobaDataTypeAccess().getDateFormatStringSTRINGTerminalRuleCall_3_2_0_1_1_0_0());
            	                            													

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
            	                            break;
            	                        case 2 :
            	                            // InternalMoba.g:1550:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            {
            	                            // InternalMoba.g:1550:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            // InternalMoba.g:1551:13: (otherlv_17= RULE_CONSTANT )
            	                            {
            	                            // InternalMoba.g:1551:13: (otherlv_17= RULE_CONSTANT )
            	                            // InternalMoba.g:1552:14: otherlv_17= RULE_CONSTANT
            	                            {

            	                            														if (current==null) {
            	                            															current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                            														}
            	                            													
            	                            otherlv_17=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

            	                            														newLeafNode(otherlv_17, grammarAccess.getMobaDataTypeAccess().getDateFormatConstMobaConstantCrossReference_3_2_0_1_1_1_0());
            	                            													

            	                            }


            	                            }


            	                            }
            	                            break;

            	                    }

            	                    otherlv_18=(Token)match(input,37,FOLLOW_29); 

            	                    											newLeafNode(otherlv_18, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_2_0_1_2());
            	                    										

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoba.g:1571:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            {
            	            // InternalMoba.g:1571:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            // InternalMoba.g:1572:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            {
            	            // InternalMoba.g:1572:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            // InternalMoba.g:1573:11: lv_enumAST_19_0= ruleMobaEnum
            	            {

            	            											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getEnumASTMobaEnumParserRuleCall_3_2_1_0());
            	            										
            	            pushFollow(FOLLOW_29);
            	            lv_enumAST_19_0=ruleMobaEnum();

            	            state._fsp--;


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
            	            break;
            	        case 3 :
            	            // InternalMoba.g:1591:9: ( (lv_predefined_20_0= 'isPredefined' ) )
            	            {
            	            // InternalMoba.g:1591:9: ( (lv_predefined_20_0= 'isPredefined' ) )
            	            // InternalMoba.g:1592:10: (lv_predefined_20_0= 'isPredefined' )
            	            {
            	            // InternalMoba.g:1592:10: (lv_predefined_20_0= 'isPredefined' )
            	            // InternalMoba.g:1593:11: lv_predefined_20_0= 'isPredefined'
            	            {
            	            lv_predefined_20_0=(Token)match(input,52,FOLLOW_29); 

            	            											newLeafNode(lv_predefined_20_0, grammarAccess.getMobaDataTypeAccess().getPredefinedIsPredefinedKeyword_3_2_2_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            											}
            	            											setWithLastConsumed(current, "predefined", true, "isPredefined");
            	            										

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalMoba.g:1606:9: ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1606:9: ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1607:10: ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1607:10: ( (lv_string_21_0= 'isString' ) )
            	            // InternalMoba.g:1608:11: (lv_string_21_0= 'isString' )
            	            {
            	            // InternalMoba.g:1608:11: (lv_string_21_0= 'isString' )
            	            // InternalMoba.g:1609:12: lv_string_21_0= 'isString'
            	            {
            	            lv_string_21_0=(Token)match(input,53,FOLLOW_33); 

            	            												newLeafNode(lv_string_21_0, grammarAccess.getMobaDataTypeAccess().getStringIsStringKeyword_3_2_3_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "string", true, "isString");
            	            											

            	            }


            	            }

            	            // InternalMoba.g:1621:10: ( (lv_primitive_22_0= 'isPrimitive' ) )?
            	            int alt22=2;
            	            int LA22_0 = input.LA(1);

            	            if ( (LA22_0==54) ) {
            	                alt22=1;
            	            }
            	            switch (alt22) {
            	                case 1 :
            	                    // InternalMoba.g:1622:11: (lv_primitive_22_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1622:11: (lv_primitive_22_0= 'isPrimitive' )
            	                    // InternalMoba.g:1623:12: lv_primitive_22_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_22_0=(Token)match(input,54,FOLLOW_29); 

            	                    												newLeafNode(lv_primitive_22_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_3_1_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    												}
            	                    												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                    											

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalMoba.g:1637:9: ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1637:9: ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1638:10: ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1638:10: ( (lv_bool_23_0= 'isBool' ) )
            	            // InternalMoba.g:1639:11: (lv_bool_23_0= 'isBool' )
            	            {
            	            // InternalMoba.g:1639:11: (lv_bool_23_0= 'isBool' )
            	            // InternalMoba.g:1640:12: lv_bool_23_0= 'isBool'
            	            {
            	            lv_bool_23_0=(Token)match(input,55,FOLLOW_33); 

            	            												newLeafNode(lv_bool_23_0, grammarAccess.getMobaDataTypeAccess().getBoolIsBoolKeyword_3_2_4_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "bool", true, "isBool");
            	            											

            	            }


            	            }

            	            // InternalMoba.g:1652:10: ( (lv_primitive_24_0= 'isPrimitive' ) )?
            	            int alt23=2;
            	            int LA23_0 = input.LA(1);

            	            if ( (LA23_0==54) ) {
            	                alt23=1;
            	            }
            	            switch (alt23) {
            	                case 1 :
            	                    // InternalMoba.g:1653:11: (lv_primitive_24_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1653:11: (lv_primitive_24_0= 'isPrimitive' )
            	                    // InternalMoba.g:1654:12: lv_primitive_24_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_24_0=(Token)match(input,54,FOLLOW_29); 

            	                    												newLeafNode(lv_primitive_24_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_4_1_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    												}
            	                    												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                    											

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalMoba.g:1668:9: ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1668:9: ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1669:10: ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1669:10: ( (lv_numeric_25_0= 'isNumeric' ) )
            	            // InternalMoba.g:1670:11: (lv_numeric_25_0= 'isNumeric' )
            	            {
            	            // InternalMoba.g:1670:11: (lv_numeric_25_0= 'isNumeric' )
            	            // InternalMoba.g:1671:12: lv_numeric_25_0= 'isNumeric'
            	            {
            	            lv_numeric_25_0=(Token)match(input,56,FOLLOW_33); 

            	            												newLeafNode(lv_numeric_25_0, grammarAccess.getMobaDataTypeAccess().getNumericIsNumericKeyword_3_2_5_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "numeric", true, "isNumeric");
            	            											

            	            }


            	            }

            	            // InternalMoba.g:1683:10: ( (lv_primitive_26_0= 'isPrimitive' ) )?
            	            int alt24=2;
            	            int LA24_0 = input.LA(1);

            	            if ( (LA24_0==54) ) {
            	                alt24=1;
            	            }
            	            switch (alt24) {
            	                case 1 :
            	                    // InternalMoba.g:1684:11: (lv_primitive_26_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1684:11: (lv_primitive_26_0= 'isPrimitive' )
            	                    // InternalMoba.g:1685:12: lv_primitive_26_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_26_0=(Token)match(input,54,FOLLOW_29); 

            	                    												newLeafNode(lv_primitive_26_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_5_1_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    												}
            	                    												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                    											

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 7 :
            	            // InternalMoba.g:1699:9: ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1699:9: ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1700:10: ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1700:10: ( (lv_decimal_27_0= 'isDecimal' ) )
            	            // InternalMoba.g:1701:11: (lv_decimal_27_0= 'isDecimal' )
            	            {
            	            // InternalMoba.g:1701:11: (lv_decimal_27_0= 'isDecimal' )
            	            // InternalMoba.g:1702:12: lv_decimal_27_0= 'isDecimal'
            	            {
            	            lv_decimal_27_0=(Token)match(input,57,FOLLOW_33); 

            	            												newLeafNode(lv_decimal_27_0, grammarAccess.getMobaDataTypeAccess().getDecimalIsDecimalKeyword_3_2_6_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "decimal", true, "isDecimal");
            	            											

            	            }


            	            }

            	            // InternalMoba.g:1714:10: ( (lv_primitive_28_0= 'isPrimitive' ) )?
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==54) ) {
            	                alt25=1;
            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // InternalMoba.g:1715:11: (lv_primitive_28_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1715:11: (lv_primitive_28_0= 'isPrimitive' )
            	                    // InternalMoba.g:1716:12: lv_primitive_28_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_28_0=(Token)match(input,54,FOLLOW_29); 

            	                    												newLeafNode(lv_primitive_28_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_6_1_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    												}
            	                    												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                    											

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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canLeave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDataTypeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDataTypeAccess().getMobaFriendsAbleParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_29=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_29;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalMoba.g:1758:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:1758:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:1759:2: iv_ruleMobaEnum= ruleMobaEnum EOF
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
    // InternalMoba.g:1765:1: ruleMobaEnum returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleMobaEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1771:2: ( ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) )
            // InternalMoba.g:1772:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            {
            // InternalMoba.g:1772:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            // InternalMoba.g:1773:3: () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}'
            {
            // InternalMoba.g:1773:3: ()
            // InternalMoba.g:1774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaEnumAccess().getMobaEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaEnumAccess().getEnumKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoba.g:1788:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==59) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoba.g:1789:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:1789:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:1790:5: lv_literals_3_0= ruleMobaEnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaEnumAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMoba.g:1815:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:1815:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:1816:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
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
    // InternalMoba.g:1822:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' ) ;
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
            // InternalMoba.g:1828:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' ) )
            // InternalMoba.g:1829:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' )
            {
            // InternalMoba.g:1829:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' )
            // InternalMoba.g:1830:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
            		
            // InternalMoba.g:1834:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1835:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1835:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1836:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEnumLiteralAccess().getNameCONSTANTTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMoba.g:1860:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:1861:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:1861:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:1862:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_literal_4_0, grammarAccess.getMobaEnumLiteralAccess().getLiteralSTRINGTerminalRuleCall_4_0());
            				

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

            otherlv_5=(Token)match(input,36,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
            		
            // InternalMoba.g:1882:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:1883:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:1883:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:1884:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            // InternalMoba.g:1900:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1901:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1901:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) )
            // InternalMoba.g:1902:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());
            				
            // InternalMoba.g:1905:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* )
            // InternalMoba.g:1906:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )*
            {
            // InternalMoba.g:1906:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )*
            loop29:
            do {
                int alt29=4;
                int LA29_0 = input.LA(1);

                if ( LA29_0 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) ) {
                    int LA29_2 = input.LA(2);

                    if ( LA29_2 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
                        alt29=2;
                    }
                    else if ( LA29_2 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
                        alt29=1;
                    }
                    else if ( LA29_2 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2) ) {
                        alt29=3;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalMoba.g:1907:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1907:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    // InternalMoba.g:1908:5: {...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:1908:112: ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    // InternalMoba.g:1909:6: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalMoba.g:1912:9: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    // InternalMoba.g:1912:10: {...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1912:19: (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    // InternalMoba.g:1912:20: otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) )
            	    {
            	    otherlv_8=(Token)match(input,36,FOLLOW_37); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_0_0());
            	    								
            	    // InternalMoba.g:1916:9: ( (lv_default_9_0= 'isDefault' ) )
            	    // InternalMoba.g:1917:10: (lv_default_9_0= 'isDefault' )
            	    {
            	    // InternalMoba.g:1917:10: (lv_default_9_0= 'isDefault' )
            	    // InternalMoba.g:1918:11: lv_default_9_0= 'isDefault'
            	    {
            	    lv_default_9_0=(Token)match(input,60,FOLLOW_21); 

            	    											newLeafNode(lv_default_9_0, grammarAccess.getMobaEnumLiteralAccess().getDefaultIsDefaultKeyword_7_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            	    											}
            	    											setWithLastConsumed(current, "default", true, "isDefault");
            	    										

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
            	    // InternalMoba.g:1936:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1936:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    // InternalMoba.g:1937:5: {...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:1937:112: ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    // InternalMoba.g:1938:6: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalMoba.g:1941:9: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    // InternalMoba.g:1941:10: {...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1941:19: (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    // InternalMoba.g:1941:20: otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) )
            	    {
            	    otherlv_10=(Token)match(input,36,FOLLOW_38); 

            	    									newLeafNode(otherlv_10, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_1_0());
            	    								
            	    // InternalMoba.g:1945:9: ( (lv_undefined_11_0= 'isUndefined' ) )
            	    // InternalMoba.g:1946:10: (lv_undefined_11_0= 'isUndefined' )
            	    {
            	    // InternalMoba.g:1946:10: (lv_undefined_11_0= 'isUndefined' )
            	    // InternalMoba.g:1947:11: lv_undefined_11_0= 'isUndefined'
            	    {
            	    lv_undefined_11_0=(Token)match(input,61,FOLLOW_21); 

            	    											newLeafNode(lv_undefined_11_0, grammarAccess.getMobaEnumLiteralAccess().getUndefinedIsUndefinedKeyword_7_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            	    											}
            	    											setWithLastConsumed(current, "undefined", true, "isUndefined");
            	    										

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
            	    // InternalMoba.g:1965:4: ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1965:4: ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) )
            	    // InternalMoba.g:1966:5: {...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalMoba.g:1966:112: ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) )
            	    // InternalMoba.g:1967:6: ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2);
            	    					
            	    // InternalMoba.g:1970:9: ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) )
            	    // InternalMoba.g:1970:10: {...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1970:19: (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) )
            	    // InternalMoba.g:1970:20: otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) )
            	    {
            	    otherlv_12=(Token)match(input,36,FOLLOW_39); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_2_0());
            	    								
            	    // InternalMoba.g:1974:9: ( (lv_hidden_13_0= 'isHidden' ) )
            	    // InternalMoba.g:1975:10: (lv_hidden_13_0= 'isHidden' )
            	    {
            	    // InternalMoba.g:1975:10: (lv_hidden_13_0= 'isHidden' )
            	    // InternalMoba.g:1976:11: lv_hidden_13_0= 'isHidden'
            	    {
            	    lv_hidden_13_0=(Token)match(input,62,FOLLOW_21); 

            	    											newLeafNode(lv_hidden_13_0, grammarAccess.getMobaEnumLiteralAccess().getHiddenIsHiddenKeyword_7_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            	    											}
            	    											setWithLastConsumed(current, "hidden", true, "isHidden");
            	    										

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
            	    break loop29;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());
            				

            }

            otherlv_14=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMobaEnumLiteralAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalMoba.g:2009:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:2009:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:2010:2: iv_ruleMobaConstant= ruleMobaConstant EOF
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
    // InternalMoba.g:2016:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:2022:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:2023:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:2023:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:2024:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,63,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
            		
            // InternalMoba.g:2028:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:2029:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:2029:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:2030:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaConstantAccess().getNameCONSTANTTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalMoba.g:2050:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:2051:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:2051:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:2052:5: lv_valueAST_3_0= ruleMobaConstantValue
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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaConstantRule());
            			}
            			newCompositeNode(grammarAccess.getMobaConstantAccess().getMobaFriendsAbleParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_4;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalMoba.g:2084:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:2084:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:2085:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
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
    // InternalMoba.g:2091:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) ;
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
            // InternalMoba.g:2097:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:2098:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:2098:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:2099:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:2099:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt31=1;
                }
                break;
            case RULE_INT:
                {
                alt31=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt31=3;
                }
                break;
            case RULE_CONSTANT:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMoba.g:2100:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2100:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2101:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2101:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:2102:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    						newLeafNode(lv_valueString_0_0, grammarAccess.getMobaConstantValueAccess().getValueStringSTRINGTerminalRuleCall_0_0_0());
                    					

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
                    break;
                case 2 :
                    // InternalMoba.g:2119:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    {
                    // InternalMoba.g:2119:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    // InternalMoba.g:2120:5: (lv_valueInt_1_0= RULE_INT )
                    {
                    // InternalMoba.g:2120:5: (lv_valueInt_1_0= RULE_INT )
                    // InternalMoba.g:2121:6: lv_valueInt_1_0= RULE_INT
                    {
                    lv_valueInt_1_0=(Token)match(input,RULE_INT,FOLLOW_41); 

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
                    // InternalMoba.g:2138:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:2138:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:2139:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:2139:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    // InternalMoba.g:2140:6: lv_valueDouble_2_0= RULE_DOUBLE
                    {
                    lv_valueDouble_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_41); 

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
                    // InternalMoba.g:2157:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    {
                    // InternalMoba.g:2157:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    // InternalMoba.g:2158:5: ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    {
                    // InternalMoba.g:2158:5: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:2159:6: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2159:6: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:2160:7: otherlv_3= RULE_CONSTANT
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_42); 

                    							newLeafNode(otherlv_3, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_3_0_0());
                    						

                    }


                    }

                    // InternalMoba.g:2171:5: (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==64) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMoba.g:2172:6: otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    {
                    	    otherlv_4=(Token)match(input,64,FOLLOW_43); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getMobaConstantValueAccess().getHyphenMinusGreaterThanSignKeyword_0_3_1_0());
                    	    					
                    	    // InternalMoba.g:2176:6: ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    // InternalMoba.g:2177:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    {
                    	    // InternalMoba.g:2177:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    // InternalMoba.g:2178:8: lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction
                    	    {

                    	    								newCompositeNode(grammarAccess.getMobaConstantValueAccess().getValueConstFunctionsMobaConstantValueFunctionEnumRuleCall_0_3_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_42);
                    	    lv_valueConstFunctions_5_0=ruleMobaConstantValueFunction();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalMoba.g:2198:3: (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==65) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMoba.g:2199:4: otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalMoba.g:2203:4: ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:2204:5: (lv_tail_7_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:2204:5: (lv_tail_7_0= ruleMobaConstantValue )
                    // InternalMoba.g:2205:6: lv_tail_7_0= ruleMobaConstantValue
                    {

                    						newCompositeNode(grammarAccess.getMobaConstantValueAccess().getTailMobaConstantValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tail_7_0=ruleMobaConstantValue();

                    state._fsp--;


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


    // $ANTLR start "ruleMobaFriendsAble"
    // InternalMoba.g:2228:1: ruleMobaFriendsAble[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) ;
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
            // InternalMoba.g:2234:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) )
            // InternalMoba.g:2235:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:2235:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            // InternalMoba.g:2236:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2236:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            // InternalMoba.g:2237:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            			
            // InternalMoba.g:2240:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            // InternalMoba.g:2241:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            {
            // InternalMoba.g:2241:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMoba.g:2242:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2242:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    // InternalMoba.g:2243:4: {...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMoba.g:2243:109: ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    // InternalMoba.g:2244:5: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMoba.g:2247:8: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    // InternalMoba.g:2247:9: {...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2247:18: (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    // InternalMoba.g:2247:19: otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')'
            	    {
            	    otherlv_1=(Token)match(input,66,FOLLOW_20); 

            	    								newLeafNode(otherlv_1, grammarAccess.getMobaFriendsAbleAccess().getFriendsKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,35,FOLLOW_16); 

            	    								newLeafNode(otherlv_2, grammarAccess.getMobaFriendsAbleAccess().getLeftParenthesisKeyword_0_1());
            	    							
            	    // InternalMoba.g:2255:8: ( (lv_friends_3_0= ruleMobaFriend ) )
            	    // InternalMoba.g:2256:9: (lv_friends_3_0= ruleMobaFriend )
            	    {
            	    // InternalMoba.g:2256:9: (lv_friends_3_0= ruleMobaFriend )
            	    // InternalMoba.g:2257:10: lv_friends_3_0= ruleMobaFriend
            	    {

            	    										newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getFriendsMobaFriendParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_21);
            	    lv_friends_3_0=ruleMobaFriend();

            	    state._fsp--;


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

            	    // InternalMoba.g:2274:8: (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==36) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalMoba.g:2275:9: otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,36,FOLLOW_16); 

            	    	    									newLeafNode(otherlv_4, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_0_3_0());
            	    	    								
            	    	    // InternalMoba.g:2279:9: ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    // InternalMoba.g:2280:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    {
            	    	    // InternalMoba.g:2280:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    // InternalMoba.g:2281:11: lv_friends_5_0= ruleMobaFriend
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getFriendsMobaFriendParserRuleCall_0_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_21);
            	    	    lv_friends_5_0=ruleMobaFriend();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,37,FOLLOW_44); 

            	    								newLeafNode(otherlv_6, grammarAccess.getMobaFriendsAbleAccess().getRightParenthesisKeyword_0_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2309:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalMoba.g:2309:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    // InternalMoba.g:2310:4: {...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMoba.g:2310:109: ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    // InternalMoba.g:2311:5: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMoba.g:2314:8: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    // InternalMoba.g:2314:9: {...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2314:18: (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    // InternalMoba.g:2314:19: otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']'
            	    {
            	    otherlv_7=(Token)match(input,67,FOLLOW_16); 

            	    								newLeafNode(otherlv_7, grammarAccess.getMobaFriendsAbleAccess().getLeftSquareBracketKeyword_1_0());
            	    							
            	    // InternalMoba.g:2318:8: ( (lv_properties_8_0= ruleMobaProperty ) )
            	    // InternalMoba.g:2319:9: (lv_properties_8_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:2319:9: (lv_properties_8_0= ruleMobaProperty )
            	    // InternalMoba.g:2320:10: lv_properties_8_0= ruleMobaProperty
            	    {

            	    										newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_45);
            	    lv_properties_8_0=ruleMobaProperty();

            	    state._fsp--;


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

            	    // InternalMoba.g:2337:8: (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==36) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalMoba.g:2338:9: otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,36,FOLLOW_16); 

            	    	    									newLeafNode(otherlv_9, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_1_2_0());
            	    	    								
            	    	    // InternalMoba.g:2342:9: ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    // InternalMoba.g:2343:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    {
            	    	    // InternalMoba.g:2343:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    // InternalMoba.g:2344:11: lv_properties_10_0= ruleMobaProperty
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_45);
            	    	    lv_properties_10_0=ruleMobaProperty();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,68,FOLLOW_44); 

            	    								newLeafNode(otherlv_11, grammarAccess.getMobaFriendsAbleAccess().getRightSquareBracketKeyword_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleMobaFriendsAble"


    // $ANTLR start "entryRuleMobaFriend"
    // InternalMoba.g:2382:1: entryRuleMobaFriend returns [EObject current=null] : iv_ruleMobaFriend= ruleMobaFriend EOF ;
    public final EObject entryRuleMobaFriend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaFriend = null;


        try {
            // InternalMoba.g:2382:51: (iv_ruleMobaFriend= ruleMobaFriend EOF )
            // InternalMoba.g:2383:2: iv_ruleMobaFriend= ruleMobaFriend EOF
            {
             newCompositeNode(grammarAccess.getMobaFriendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaFriend=ruleMobaFriend();

            state._fsp--;

             current =iv_ruleMobaFriend; 
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
    // $ANTLR end "entryRuleMobaFriend"


    // $ANTLR start "ruleMobaFriend"
    // InternalMoba.g:2389:1: ruleMobaFriend returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) ;
    public final EObject ruleMobaFriend() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:2395:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2396:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2396:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_CONSTANT) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoba.g:2397:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2397:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2398:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2398:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:2399:5: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_valueString_0_0, grammarAccess.getMobaFriendAccess().getValueStringSTRINGTerminalRuleCall_0_0());
                    				

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
                    break;
                case 2 :
                    // InternalMoba.g:2416:3: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2416:3: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2417:4: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2417:4: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2418:5: otherlv_1= RULE_CONSTANT
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaFriendRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getMobaFriendAccess().getValueConstMobaConstantCrossReference_1_0());
                    				

                    }


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
    // $ANTLR end "ruleMobaFriend"


    // $ANTLR start "entryRuleMobaProperty"
    // InternalMoba.g:2433:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:2433:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:2434:2: iv_ruleMobaProperty= ruleMobaProperty EOF
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
    // InternalMoba.g:2440:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:2446:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:2447:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:2447:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2448:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2448:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_CONSTANT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoba.g:2449:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2449:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2450:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2450:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:2451:6: lv_keyString_0_0= RULE_STRING
                    {
                    lv_keyString_0_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_keyString_0_0, grammarAccess.getMobaPropertyAccess().getKeyStringSTRINGTerminalRuleCall_0_0_0());
                    					

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
                    break;
                case 2 :
                    // InternalMoba.g:2468:4: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2468:4: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2469:5: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2469:5: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2470:6: otherlv_1= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_CONSTANT,FOLLOW_7); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:2486:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_CONSTANT) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:2487:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2487:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:2488:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:2488:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:2489:6: lv_valueString_3_0= RULE_STRING
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
                    							"org.mobadsl.grammar.Moba.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2506:4: ( (otherlv_4= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2506:4: ( (otherlv_4= RULE_CONSTANT ) )
                    // InternalMoba.g:2507:5: (otherlv_4= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2507:5: (otherlv_4= RULE_CONSTANT )
                    // InternalMoba.g:2508:6: otherlv_4= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

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
    // InternalMoba.g:2524:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:2524:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:2525:2: iv_ruleMobaData= ruleMobaData EOF
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
    // InternalMoba.g:2531:1: ruleMobaData returns [EObject current=null] : (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntity_0 = null;

        EObject this_MobaDto_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2537:2: ( (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:2538:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:2538:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt39=1;
                }
                break;
            case 77:
                {
                alt39=2;
                }
                break;
            case 79:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMoba.g:2539:3: this_MobaEntity_0= ruleMobaEntity
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
                    // InternalMoba.g:2548:3: this_MobaDto_1= ruleMobaDto
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
                    // InternalMoba.g:2557:3: this_MobaQueue_2= ruleMobaQueue
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
    // InternalMoba.g:2569:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:2569:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:2570:2: iv_ruleMobaSettings= ruleMobaSettings EOF
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
    // InternalMoba.g:2576:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
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
            // InternalMoba.g:2582:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:2583:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:2583:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:2584:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:2584:3: ()
            // InternalMoba.g:2585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
            					current);
            			

            }

            // InternalMoba.g:2591:3: ( (lv_active_1_0= 'active' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoba.g:2592:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:2592:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:2593:5: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,39,FOLLOW_46); 

                    					newLeafNode(lv_active_1_0, grammarAccess.getMobaSettingsAccess().getActiveActiveKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaSettingsRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,69,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_2());
            		
            // InternalMoba.g:2609:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:2610:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:2610:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:2611:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalMoba.g:2627:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoba.g:2628:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                    			
                    // InternalMoba.g:2632:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:2633:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:2633:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:2634:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaSettingsRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_5, grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaSettingsRule());
            			}
            			newCompositeNode(grammarAccess.getMobaSettingsAccess().getMobaFriendsAbleParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_6=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_6;
            			afterParserOrEnumRuleCall();
            		
            otherlv_7=(Token)match(input,23,FOLLOW_47); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMoba.g:2661:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==102||LA42_0==108) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMoba.g:2662:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:2662:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:2663:5: lv_features_8_0= ruleMobaSettingsFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_47);
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
            	    break loop42;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMoba.g:2688:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:2688:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:2689:2: iv_ruleMobaCache= ruleMobaCache EOF
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
    // InternalMoba.g:2695:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? ) ;
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
            // InternalMoba.g:2701:2: ( ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? ) )
            // InternalMoba.g:2702:2: ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? )
            {
            // InternalMoba.g:2702:2: ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? )
            // InternalMoba.g:2703:3: () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )?
            {
            // InternalMoba.g:2703:3: ()
            // InternalMoba.g:2704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
            		
            // InternalMoba.g:2714:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:2715:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:2715:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:2716:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaCacheAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalMoba.g:2732:3: (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoba.g:2733:4: otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_49); 

                    				newLeafNode(otherlv_3, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoba.g:2737:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalMoba.g:2738:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalMoba.g:2738:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) )
                    // InternalMoba.g:2739:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());
                    					
                    // InternalMoba.g:2742:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?)
                    // InternalMoba.g:2743:7: ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalMoba.g:2743:7: ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=5;
                        int LA46_0 = input.LA(1);

                        if ( LA46_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0) ) {
                            alt46=1;
                        }
                        else if ( LA46_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1) ) {
                            alt46=2;
                        }
                        else if ( LA46_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2) ) {
                            alt46=3;
                        }
                        else if ( LA46_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3) ) {
                            alt46=4;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalMoba.g:2744:5: ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2744:5: ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2745:6: {...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalMoba.g:2745:109: ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2746:7: ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0);
                    	    						
                    	    // InternalMoba.g:2749:10: ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2749:11: {...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2749:20: (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2749:21: otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_5=(Token)match(input,70,FOLLOW_7); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getTypeKeyword_3_1_0_0());
                    	    									
                    	    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_3_1_0_1());
                    	    									
                    	    // InternalMoba.g:2757:10: ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==RULE_STRING) ) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==RULE_CONSTANT) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // InternalMoba.g:2758:11: ( (lv_cacheTypeString_7_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2758:11: ( (lv_cacheTypeString_7_0= RULE_STRING ) )
                    	            // InternalMoba.g:2759:12: (lv_cacheTypeString_7_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2759:12: (lv_cacheTypeString_7_0= RULE_STRING )
                    	            // InternalMoba.g:2760:13: lv_cacheTypeString_7_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_7_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    	            													newLeafNode(lv_cacheTypeString_7_0, grammarAccess.getMobaCacheAccess().getCacheTypeStringSTRINGTerminalRuleCall_3_1_0_2_0_0());
                    	            												

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
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2777:11: ( (otherlv_8= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2777:11: ( (otherlv_8= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2778:12: (otherlv_8= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2778:12: (otherlv_8= RULE_CONSTANT )
                    	            // InternalMoba.g:2779:13: otherlv_8= RULE_CONSTANT
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_8=(Token)match(input,RULE_CONSTANT,FOLLOW_50); 

                    	            													newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantCrossReference_3_1_0_2_1_0());
                    	            												

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
                    	    // InternalMoba.g:2797:5: ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2797:5: ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2798:6: {...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalMoba.g:2798:109: ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2799:7: ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1);
                    	    						
                    	    // InternalMoba.g:2802:10: ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2802:11: {...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2802:20: (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2802:21: otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_9=(Token)match(input,71,FOLLOW_7); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getStrategyKeyword_3_1_1_0());
                    	    									
                    	    otherlv_10=(Token)match(input,22,FOLLOW_16); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_3_1_1_1());
                    	    									
                    	    // InternalMoba.g:2810:10: ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) )
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==RULE_STRING) ) {
                    	        alt44=1;
                    	    }
                    	    else if ( (LA44_0==RULE_CONSTANT) ) {
                    	        alt44=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 44, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt44) {
                    	        case 1 :
                    	            // InternalMoba.g:2811:11: ( (lv_cacheStrategyString_11_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2811:11: ( (lv_cacheStrategyString_11_0= RULE_STRING ) )
                    	            // InternalMoba.g:2812:12: (lv_cacheStrategyString_11_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2812:12: (lv_cacheStrategyString_11_0= RULE_STRING )
                    	            // InternalMoba.g:2813:13: lv_cacheStrategyString_11_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_11_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    	            													newLeafNode(lv_cacheStrategyString_11_0, grammarAccess.getMobaCacheAccess().getCacheStrategyStringSTRINGTerminalRuleCall_3_1_1_2_0_0());
                    	            												

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
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2830:11: ( (otherlv_12= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2830:11: ( (otherlv_12= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2831:12: (otherlv_12= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2831:12: (otherlv_12= RULE_CONSTANT )
                    	            // InternalMoba.g:2832:13: otherlv_12= RULE_CONSTANT
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_12=(Token)match(input,RULE_CONSTANT,FOLLOW_50); 

                    	            													newLeafNode(otherlv_12, grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantCrossReference_3_1_1_2_1_0());
                    	            												

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
                    	    // InternalMoba.g:2850:5: ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2850:5: ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2851:6: {...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalMoba.g:2851:109: ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2852:7: ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2);
                    	    						
                    	    // InternalMoba.g:2855:10: ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2855:11: {...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2855:20: (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2855:21: otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_13=(Token)match(input,72,FOLLOW_7); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getMobaCacheAccess().getIntervalKeyword_3_1_2_0());
                    	    									
                    	    otherlv_14=(Token)match(input,22,FOLLOW_51); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_3_1_2_1());
                    	    									
                    	    // InternalMoba.g:2863:10: ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) )
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==RULE_INT) ) {
                    	        alt45=1;
                    	    }
                    	    else if ( (LA45_0==RULE_CONSTANT) ) {
                    	        alt45=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 45, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // InternalMoba.g:2864:11: ( (lv_cacheIntervalInt_15_0= RULE_INT ) )
                    	            {
                    	            // InternalMoba.g:2864:11: ( (lv_cacheIntervalInt_15_0= RULE_INT ) )
                    	            // InternalMoba.g:2865:12: (lv_cacheIntervalInt_15_0= RULE_INT )
                    	            {
                    	            // InternalMoba.g:2865:12: (lv_cacheIntervalInt_15_0= RULE_INT )
                    	            // InternalMoba.g:2866:13: lv_cacheIntervalInt_15_0= RULE_INT
                    	            {
                    	            lv_cacheIntervalInt_15_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    	            													newLeafNode(lv_cacheIntervalInt_15_0, grammarAccess.getMobaCacheAccess().getCacheIntervalIntINTTerminalRuleCall_3_1_2_2_0_0());
                    	            												

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
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2883:11: ( (otherlv_16= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2883:11: ( (otherlv_16= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2884:12: (otherlv_16= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2884:12: (otherlv_16= RULE_CONSTANT )
                    	            // InternalMoba.g:2885:13: otherlv_16= RULE_CONSTANT
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_16=(Token)match(input,RULE_CONSTANT,FOLLOW_50); 

                    	            													newLeafNode(otherlv_16, grammarAccess.getMobaCacheAccess().getCacheIntervalConstMobaConstantCrossReference_3_1_2_2_1_0());
                    	            												

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
                    	    // InternalMoba.g:2903:5: ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2903:5: ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2904:6: {...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalMoba.g:2904:109: ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2905:7: ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3);
                    	    						
                    	    // InternalMoba.g:2908:10: ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2908:11: {...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2908:20: (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) )
                    	    // InternalMoba.g:2908:21: otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) )
                    	    {
                    	    otherlv_17=(Token)match(input,73,FOLLOW_19); 

                    	    										newLeafNode(otherlv_17, grammarAccess.getMobaCacheAccess().getUsingKeyword_3_1_3_0());
                    	    									
                    	    // InternalMoba.g:2912:10: ( (otherlv_18= RULE_CONSTANT ) )
                    	    // InternalMoba.g:2913:11: (otherlv_18= RULE_CONSTANT )
                    	    {
                    	    // InternalMoba.g:2913:11: (otherlv_18= RULE_CONSTANT )
                    	    // InternalMoba.g:2914:12: otherlv_18= RULE_CONSTANT
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getMobaCacheRule());
                    	    												}
                    	    											
                    	    otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_50); 

                    	    												newLeafNode(otherlv_18, grammarAccess.getMobaCacheAccess().getCachePersistenceMobaPersistenceTypeCrossReference_3_1_3_1_0());
                    	    											

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
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1()) ) {
                        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canLeave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());
                    					

                    }

                    otherlv_19=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // InternalMoba.g:2948:1: entryRuleMobaEntity returns [EObject current=null] : iv_ruleMobaEntity= ruleMobaEntity EOF ;
    public final EObject entryRuleMobaEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntity = null;


        try {
            // InternalMoba.g:2948:51: (iv_ruleMobaEntity= ruleMobaEntity EOF )
            // InternalMoba.g:2949:2: iv_ruleMobaEntity= ruleMobaEntity EOF
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
    // InternalMoba.g:2955:1: ruleMobaEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' ) ;
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
            // InternalMoba.g:2961:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' ) )
            // InternalMoba.g:2962:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' )
            {
            // InternalMoba.g:2962:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' )
            // InternalMoba.g:2963:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAccess().getEntityKeyword_0());
            		
            // InternalMoba.g:2967:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2968:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2968:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2969:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); 

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

            // InternalMoba.g:2985:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2986:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2986:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) )
            // InternalMoba.g:2987:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            				
            // InternalMoba.g:2990:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* )
            // InternalMoba.g:2991:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )*
            {
            // InternalMoba.g:2991:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMoba.g:2992:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:2992:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:2993:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:2993:107: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:2994:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoba.g:2997:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:2997:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2997:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:2997:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_5); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMobaEntityAccess().getExtendsKeyword_2_0_0());
            	    								
            	    // InternalMoba.g:3001:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:3002:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:3002:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:3003:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEntityRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_52); 

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
            	    // InternalMoba.g:3020:4: ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3020:4: ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:3021:5: {...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:3021:107: ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:3022:6: ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoba.g:3025:9: ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) )
            	    // InternalMoba.g:3025:10: {...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:3025:19: (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )
            	    // InternalMoba.g:3025:20: otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getMobaEntityAccess().getCacheKeyword_2_1_0());
            	    								
            	    otherlv_6=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAccess().getEqualsSignKeyword_2_1_1());
            	    								
            	    // InternalMoba.g:3033:9: ( (otherlv_7= RULE_ID ) )
            	    // InternalMoba.g:3034:10: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMoba.g:3034:10: (otherlv_7= RULE_ID )
            	    // InternalMoba.g:3035:11: otherlv_7= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEntityRule());
            	    											}
            	    										
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    											newLeafNode(otherlv_7, grammarAccess.getMobaEntityAccess().getCacheMobaCacheCrossReference_2_1_2_0());
            	    										

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
            	    break loop48;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            				

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityAccess().getMobaFriendsAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_8;
            			afterParserOrEnumRuleCall();
            		
            otherlv_9=(Token)match(input,23,FOLLOW_53); 

            			newLeafNode(otherlv_9, grammarAccess.getMobaEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:3074:3: ( (lv_features_10_0= ruleMobaEntityFeature ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==102||LA49_0==110||LA49_0==112) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMoba.g:3075:4: (lv_features_10_0= ruleMobaEntityFeature )
            	    {
            	    // InternalMoba.g:3075:4: (lv_features_10_0= ruleMobaEntityFeature )
            	    // InternalMoba.g:3076:5: lv_features_10_0= ruleMobaEntityFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaEntityAccess().getFeaturesMobaEntityFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_53);
            	    lv_features_10_0=ruleMobaEntityFeature();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalMoba.g:3093:3: ( (lv_indizes_11_0= ruleMobaEntityIndex ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=75 && LA50_0<=76)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMoba.g:3094:4: (lv_indizes_11_0= ruleMobaEntityIndex )
            	    {
            	    // InternalMoba.g:3094:4: (lv_indizes_11_0= ruleMobaEntityIndex )
            	    // InternalMoba.g:3095:5: lv_indizes_11_0= ruleMobaEntityIndex
            	    {

            	    					newCompositeNode(grammarAccess.getMobaEntityAccess().getIndizesMobaEntityIndexParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_indizes_11_0=ruleMobaEntityIndex();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_12=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMobaEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMoba.g:3120:1: entryRuleMobaEntityIndex returns [EObject current=null] : iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF ;
    public final EObject entryRuleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityIndex = null;


        try {
            // InternalMoba.g:3120:56: (iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF )
            // InternalMoba.g:3121:2: iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF
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
    // InternalMoba.g:3127:1: ruleMobaEntityIndex returns [EObject current=null] : ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) ;
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
            // InternalMoba.g:3133:2: ( ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) )
            // InternalMoba.g:3134:2: ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // InternalMoba.g:3134:2: ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            // InternalMoba.g:3135:3: ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
            {
            // InternalMoba.g:3135:3: ( (lv_unique_0_0= 'unique' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==75) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:3136:4: (lv_unique_0_0= 'unique' )
                    {
                    // InternalMoba.g:3136:4: (lv_unique_0_0= 'unique' )
                    // InternalMoba.g:3137:5: lv_unique_0_0= 'unique'
                    {
                    lv_unique_0_0=(Token)match(input,75,FOLLOW_55); 

                    					newLeafNode(lv_unique_0_0, grammarAccess.getMobaEntityIndexAccess().getUniqueUniqueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,76,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaEntityIndexAccess().getIndexKeyword_1());
            		
            // InternalMoba.g:3153:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:3154:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:3154:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:3155:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaEntityIndexAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaEntityIndexAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMoba.g:3175:3: ( (otherlv_4= RULE_ID ) )
            // InternalMoba.g:3176:4: (otherlv_4= RULE_ID )
            {
            // InternalMoba.g:3176:4: (otherlv_4= RULE_ID )
            // InternalMoba.g:3177:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_4_0());
            				

            }


            }

            // InternalMoba.g:3188:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==36) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMoba.g:3189:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMobaEntityIndexAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMoba.g:3193:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalMoba.g:3194:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMoba.g:3194:5: (otherlv_6= RULE_ID )
            	    // InternalMoba.g:3195:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(otherlv_6, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaEntityIndexAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalMoba.g:3215:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:3215:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:3216:2: iv_ruleMobaDto= ruleMobaDto EOF
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
    // InternalMoba.g:3222:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' ) ;
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
            // InternalMoba.g:3228:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:3229:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:3229:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:3230:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
            		
            // InternalMoba.g:3234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3235:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); 

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

            // InternalMoba.g:3252:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==32) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoba.g:3253:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:3257:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3258:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3258:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3259:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDtoRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_57); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3271:3: (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==78) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:3272:4: otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaDtoAccess().getWrapsKeyword_3_0());
                    			
                    // InternalMoba.g:3276:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:3277:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:3277:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:3278:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDtoRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_5, grammarAccess.getMobaDtoAccess().getWrappedEntityMobaEntityCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoAccess().getMobaFriendsAbleParserRuleCall_4());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_6=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_6;
            			afterParserOrEnumRuleCall();
            		
            otherlv_7=(Token)match(input,23,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMoba.g:3305:3: ( (lv_features_8_0= ruleMobaDtoFeature ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==102||LA55_0==110||LA55_0==112) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMoba.g:3306:4: (lv_features_8_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:3306:4: (lv_features_8_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:3307:5: lv_features_8_0= ruleMobaDtoFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_58);
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
            	    break loop55;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMoba.g:3332:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:3332:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:3333:2: iv_ruleMobaQueue= ruleMobaQueue EOF
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
    // InternalMoba.g:3339:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' ) ;
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
            // InternalMoba.g:3345:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' ) )
            // InternalMoba.g:3346:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' )
            {
            // InternalMoba.g:3346:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' )
            // InternalMoba.g:3347:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
            		
            // InternalMoba.g:3351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3352:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); 

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

            // InternalMoba.g:3369:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==32) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMoba.g:3370:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:3374:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3375:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3375:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3376:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaQueueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3388:3: (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoba.g:3389:4: otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaQueueAccess().getCacheKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMoba.g:3397:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMoba.g:3398:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMoba.g:3398:5: (otherlv_6= RULE_ID )
                    // InternalMoba.g:3399:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaQueueRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_6, grammarAccess.getMobaQueueAccess().getCacheMobaCacheCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaQueueRule());
            			}
            			newCompositeNode(grammarAccess.getMobaQueueAccess().getMobaFriendsAbleParserRuleCall_4());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_7=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_7;
            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,23,FOLLOW_59); 

            			newLeafNode(otherlv_8, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMoba.g:3426:3: ( (lv_features_9_0= ruleMobaQueueFeature ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==110) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMoba.g:3427:4: (lv_features_9_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:3427:4: (lv_features_9_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:3428:5: lv_features_9_0= ruleMobaQueueFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_59);
            	    lv_features_9_0=ruleMobaQueueFeature();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMobaQueueAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleMobaREST"
    // InternalMoba.g:3453:1: entryRuleMobaREST returns [EObject current=null] : iv_ruleMobaREST= ruleMobaREST EOF ;
    public final EObject entryRuleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaREST = null;


        try {
            // InternalMoba.g:3453:49: (iv_ruleMobaREST= ruleMobaREST EOF )
            // InternalMoba.g:3454:2: iv_ruleMobaREST= ruleMobaREST EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaREST=ruleMobaREST();

            state._fsp--;

             current =iv_ruleMobaREST; 
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
    // $ANTLR end "entryRuleMobaREST"


    // $ANTLR start "ruleMobaREST"
    // InternalMoba.g:3460:1: ruleMobaREST returns [EObject current=null] : (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) ;
    public final EObject ruleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRESTCustomService_0 = null;

        EObject this_MobaRESTCrud_1 = null;

        EObject this_MobaRESTWorkflow_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:3466:2: ( (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) )
            // InternalMoba.g:3467:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            {
            // InternalMoba.g:3467:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt59=1;
                }
                break;
            case 99:
                {
                alt59=2;
                }
                break;
            case 100:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalMoba.g:3468:3: this_MobaRESTCustomService_0= ruleMobaRESTCustomService
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAccess().getMobaRESTCustomServiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTCustomService_0=ruleMobaRESTCustomService();

                    state._fsp--;


                    			current = this_MobaRESTCustomService_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:3477:3: this_MobaRESTCrud_1= ruleMobaRESTCrud
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAccess().getMobaRESTCrudParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTCrud_1=ruleMobaRESTCrud();

                    state._fsp--;


                    			current = this_MobaRESTCrud_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:3486:3: this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAccess().getMobaRESTWorkflowParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTWorkflow_2=ruleMobaRESTWorkflow();

                    state._fsp--;


                    			current = this_MobaRESTWorkflow_2;
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
    // $ANTLR end "ruleMobaREST"


    // $ANTLR start "entryRuleMobaRESTCustomService"
    // InternalMoba.g:3498:1: entryRuleMobaRESTCustomService returns [EObject current=null] : iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF ;
    public final EObject entryRuleMobaRESTCustomService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCustomService = null;


        try {
            // InternalMoba.g:3498:62: (iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF )
            // InternalMoba.g:3499:2: iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTCustomServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTCustomService=ruleMobaRESTCustomService();

            state._fsp--;

             current =iv_ruleMobaRESTCustomService; 
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
    // $ANTLR end "entryRuleMobaRESTCustomService"


    // $ANTLR start "ruleMobaRESTCustomService"
    // InternalMoba.g:3505:1: ruleMobaRESTCustomService returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_41= '}' ) ;
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
        Token lv_path_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        EObject this_MobaFriendsAble_5 = null;

        EObject lv_headers_13_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_multipartParameters_21_0 = null;

        EObject lv_requestDto_28_0 = null;

        EObject lv_responseDto_31_0 = null;

        EObject lv_errorDto_34_0 = null;

        EObject lv_contextDto_37_0 = null;

        Enumerator lv_operation_40_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3511:2: ( (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_41= '}' ) )
            // InternalMoba.g:3512:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_41= '}' )
            {
            // InternalMoba.g:3512:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_41= '}' )
            // InternalMoba.g:3513:3: otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCustomServiceAccess().getRestKeyword_0());
            		
            // InternalMoba.g:3517:3: ( (lv_bigData_1_0= 'bigData' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==81) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoba.g:3518:4: (lv_bigData_1_0= 'bigData' )
                    {
                    // InternalMoba.g:3518:4: (lv_bigData_1_0= 'bigData' )
                    // InternalMoba.g:3519:5: lv_bigData_1_0= 'bigData'
                    {
                    lv_bigData_1_0=(Token)match(input,81,FOLLOW_5); 

                    					newLeafNode(lv_bigData_1_0, grammarAccess.getMobaRESTCustomServiceAccess().getBigDataBigDataKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
                    					}
                    					setWithLastConsumed(current, "bigData", true, "bigData");
                    				

                    }


                    }
                    break;

            }

            // InternalMoba.g:3531:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:3532:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:3532:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:3533:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaRESTCustomServiceAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalMoba.g:3549:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoba.g:3550:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMobaRESTCustomServiceAccess().getExtendsKeyword_3_0());
                    			
                    // InternalMoba.g:3554:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:3555:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:3555:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:3556:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_4, grammarAccess.getMobaRESTCustomServiceAccess().getSuperTypeMobaRESTCustomServiceCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getMobaFriendsAbleParserRuleCall_4());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_5;
            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,23,FOLLOW_61); 

            			newLeafNode(otherlv_6, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMoba.g:3583:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3584:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3584:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3585:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            				
            // InternalMoba.g:3588:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            // InternalMoba.g:3589:6: ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3589:6: ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            loop65:
            do {
                int alt65=11;
                alt65 = dfa65.predict(input);
                switch (alt65) {
            	case 1 :
            	    // InternalMoba.g:3590:4: ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3590:4: ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalMoba.g:3591:5: {...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalMoba.g:3591:118: ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) )
            	    // InternalMoba.g:3592:6: ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalMoba.g:3595:9: ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) )
            	    // InternalMoba.g:3595:10: {...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3595:19: (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) )
            	    // InternalMoba.g:3595:20: otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,82,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMobaRESTCustomServiceAccess().getPathKeyword_6_0_0());
            	    								
            	    otherlv_9=(Token)match(input,22,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_0_1());
            	    								
            	    // InternalMoba.g:3603:9: ( (lv_path_10_0= RULE_STRING ) )
            	    // InternalMoba.g:3604:10: (lv_path_10_0= RULE_STRING )
            	    {
            	    // InternalMoba.g:3604:10: (lv_path_10_0= RULE_STRING )
            	    // InternalMoba.g:3605:11: lv_path_10_0= RULE_STRING
            	    {
            	    lv_path_10_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

            	    											newLeafNode(lv_path_10_0, grammarAccess.getMobaRESTCustomServiceAccess().getPathSTRINGTerminalRuleCall_6_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"path",
            	    												lv_path_10_0,
            	    												"org.mobadsl.grammar.Moba.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:3627:4: ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3627:4: ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) )
            	    // InternalMoba.g:3628:5: {...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalMoba.g:3628:118: ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) )
            	    // InternalMoba.g:3629:6: ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalMoba.g:3632:9: ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) )
            	    // InternalMoba.g:3632:10: {...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3632:19: (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' )
            	    // InternalMoba.g:3632:20: otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}'
            	    {
            	    otherlv_11=(Token)match(input,83,FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaRESTCustomServiceAccess().getHeadersKeyword_6_1_0());
            	    								
            	    otherlv_12=(Token)match(input,23,FOLLOW_62); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_1_1());
            	    								
            	    // InternalMoba.g:3640:9: ( (lv_headers_13_0= ruleMobaRestHeader ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( ((LA62_0>=97 && LA62_0<=98)) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // InternalMoba.g:3641:10: (lv_headers_13_0= ruleMobaRestHeader )
            	    	    {
            	    	    // InternalMoba.g:3641:10: (lv_headers_13_0= ruleMobaRestHeader )
            	    	    // InternalMoba.g:3642:11: lv_headers_13_0= ruleMobaRestHeader
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getHeadersMobaRestHeaderParserRuleCall_6_1_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_62);
            	    	    lv_headers_13_0=ruleMobaRestHeader();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"headers",
            	    	    												lv_headers_13_0,
            	    	    												"org.mobadsl.grammar.Moba.MobaRestHeader");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop62;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,26,FOLLOW_61); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_6_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:3669:4: ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3669:4: ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) )
            	    // InternalMoba.g:3670:5: {...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalMoba.g:3670:118: ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) )
            	    // InternalMoba.g:3671:6: ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalMoba.g:3674:9: ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) )
            	    // InternalMoba.g:3674:10: {...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3674:19: (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' )
            	    // InternalMoba.g:3674:20: otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}'
            	    {
            	    otherlv_15=(Token)match(input,84,FOLLOW_10); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaRESTCustomServiceAccess().getParametersKeyword_6_2_0());
            	    								
            	    otherlv_16=(Token)match(input,23,FOLLOW_63); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_2_1());
            	    								
            	    // InternalMoba.g:3682:9: ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==93||LA63_0==95) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalMoba.g:3683:10: (lv_parameters_17_0= ruleMobaRESTAbstractAttribute )
            	    	    {
            	    	    // InternalMoba.g:3683:10: (lv_parameters_17_0= ruleMobaRESTAbstractAttribute )
            	    	    // InternalMoba.g:3684:11: lv_parameters_17_0= ruleMobaRESTAbstractAttribute
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getParametersMobaRESTAbstractAttributeParserRuleCall_6_2_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
            	    	    lv_parameters_17_0=ruleMobaRESTAbstractAttribute();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"parameters",
            	    	    												lv_parameters_17_0,
            	    	    												"org.mobadsl.grammar.Moba.MobaRESTAbstractAttribute");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop63;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,26,FOLLOW_61); 

            	    									newLeafNode(otherlv_18, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_6_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:3711:4: ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3711:4: ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) )
            	    // InternalMoba.g:3712:5: {...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalMoba.g:3712:118: ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) )
            	    // InternalMoba.g:3713:6: ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalMoba.g:3716:9: ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) )
            	    // InternalMoba.g:3716:10: {...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3716:19: (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' )
            	    // InternalMoba.g:3716:20: otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}'
            	    {
            	    otherlv_19=(Token)match(input,85,FOLLOW_10); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMobaRESTCustomServiceAccess().getMultipartKeyword_6_3_0());
            	    								
            	    otherlv_20=(Token)match(input,23,FOLLOW_63); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_3_1());
            	    								
            	    // InternalMoba.g:3724:9: ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )*
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==93||LA64_0==95) ) {
            	            alt64=1;
            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // InternalMoba.g:3725:10: (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute )
            	    	    {
            	    	    // InternalMoba.g:3725:10: (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute )
            	    	    // InternalMoba.g:3726:11: lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getMultipartParametersMobaRESTAbstractMultipartAttributeParserRuleCall_6_3_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
            	    	    lv_multipartParameters_21_0=ruleMobaRESTAbstractMultipartAttribute();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"multipartParameters",
            	    	    												lv_multipartParameters_21_0,
            	    	    												"org.mobadsl.grammar.Moba.MobaRESTAbstractMultipartAttribute");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop64;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,26,FOLLOW_61); 

            	    									newLeafNode(otherlv_22, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_6_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:3753:4: ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3753:4: ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:3754:5: {...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalMoba.g:3754:118: ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:3755:6: ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalMoba.g:3758:9: ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:3758:10: {...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3758:19: (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:3758:20: otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) )
            	    {
            	    otherlv_23=(Token)match(input,86,FOLLOW_7); 

            	    									newLeafNode(otherlv_23, grammarAccess.getMobaRESTCustomServiceAccess().getAutorizationKeyword_6_4_0());
            	    								
            	    otherlv_24=(Token)match(input,22,FOLLOW_19); 

            	    									newLeafNode(otherlv_24, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_4_1());
            	    								
            	    // InternalMoba.g:3766:9: ( (otherlv_25= RULE_CONSTANT ) )
            	    // InternalMoba.g:3767:10: (otherlv_25= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:3767:10: (otherlv_25= RULE_CONSTANT )
            	    // InternalMoba.g:3768:11: otherlv_25= RULE_CONSTANT
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    										
            	    otherlv_25=(Token)match(input,RULE_CONSTANT,FOLLOW_61); 

            	    											newLeafNode(otherlv_25, grammarAccess.getMobaRESTCustomServiceAccess().getAuthorizationMobaAuthorizationCrossReference_6_4_2_0());
            	    										

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
            	    // InternalMoba.g:3785:4: ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3785:4: ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3786:5: {...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalMoba.g:3786:118: ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3787:6: ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalMoba.g:3790:9: ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3790:10: {...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3790:19: (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3790:20: otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_26=(Token)match(input,87,FOLLOW_7); 

            	    									newLeafNode(otherlv_26, grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoKeyword_6_5_0());
            	    								
            	    otherlv_27=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_27, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_5_1());
            	    								
            	    // InternalMoba.g:3798:9: ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3799:10: (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3799:10: (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3800:11: lv_requestDto_28_0= ruleMobaRESTPayloadDefinition
            	    {

            	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoMobaRESTPayloadDefinitionParserRuleCall_6_5_2_0());
            	    										
            	    pushFollow(FOLLOW_61);
            	    lv_requestDto_28_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"requestDto",
            	    												lv_requestDto_28_0,
            	    												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalMoba.g:3823:4: ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3823:4: ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3824:5: {...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalMoba.g:3824:118: ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3825:6: ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalMoba.g:3828:9: ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3828:10: {...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3828:19: (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3828:20: otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_29=(Token)match(input,88,FOLLOW_7); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoKeyword_6_6_0());
            	    								
            	    otherlv_30=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_30, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_6_1());
            	    								
            	    // InternalMoba.g:3836:9: ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3837:10: (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3837:10: (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3838:11: lv_responseDto_31_0= ruleMobaRESTPayloadDefinition
            	    {

            	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoMobaRESTPayloadDefinitionParserRuleCall_6_6_2_0());
            	    										
            	    pushFollow(FOLLOW_61);
            	    lv_responseDto_31_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"responseDto",
            	    												lv_responseDto_31_0,
            	    												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMoba.g:3861:4: ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3861:4: ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3862:5: {...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalMoba.g:3862:118: ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3863:6: ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 7);
            	    					
            	    // InternalMoba.g:3866:9: ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3866:10: {...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3866:19: (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3866:20: otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_32=(Token)match(input,89,FOLLOW_7); 

            	    									newLeafNode(otherlv_32, grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoKeyword_6_7_0());
            	    								
            	    otherlv_33=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_33, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_7_1());
            	    								
            	    // InternalMoba.g:3874:9: ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3875:10: (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3875:10: (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3876:11: lv_errorDto_34_0= ruleMobaRESTPayloadDefinition
            	    {

            	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoMobaRESTPayloadDefinitionParserRuleCall_6_7_2_0());
            	    										
            	    pushFollow(FOLLOW_61);
            	    lv_errorDto_34_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"errorDto",
            	    												lv_errorDto_34_0,
            	    												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMoba.g:3899:4: ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3899:4: ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3900:5: {...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 8)");
            	    }
            	    // InternalMoba.g:3900:118: ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3901:6: ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 8);
            	    					
            	    // InternalMoba.g:3904:9: ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3904:10: {...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3904:19: (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3904:20: otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_35=(Token)match(input,90,FOLLOW_7); 

            	    									newLeafNode(otherlv_35, grammarAccess.getMobaRESTCustomServiceAccess().getContextDtoKeyword_6_8_0());
            	    								
            	    otherlv_36=(Token)match(input,22,FOLLOW_5); 

            	    									newLeafNode(otherlv_36, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_8_1());
            	    								
            	    // InternalMoba.g:3912:9: ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3913:10: (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3913:10: (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3914:11: lv_contextDto_37_0= ruleMobaRESTPayloadDefinition
            	    {

            	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getContextDtoMobaRESTPayloadDefinitionParserRuleCall_6_8_2_0());
            	    										
            	    pushFollow(FOLLOW_61);
            	    lv_contextDto_37_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"contextDto",
            	    												lv_contextDto_37_0,
            	    												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMoba.g:3937:4: ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3937:4: ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    // InternalMoba.g:3938:5: {...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 9)");
            	    }
            	    // InternalMoba.g:3938:118: ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) )
            	    // InternalMoba.g:3939:6: ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 9);
            	    					
            	    // InternalMoba.g:3942:9: ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) )
            	    // InternalMoba.g:3942:10: {...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3942:19: (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) )
            	    // InternalMoba.g:3942:20: otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) )
            	    {
            	    otherlv_38=(Token)match(input,91,FOLLOW_7); 

            	    									newLeafNode(otherlv_38, grammarAccess.getMobaRESTCustomServiceAccess().getMethodKeyword_6_9_0());
            	    								
            	    otherlv_39=(Token)match(input,22,FOLLOW_64); 

            	    									newLeafNode(otherlv_39, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_9_1());
            	    								
            	    // InternalMoba.g:3950:9: ( (lv_operation_40_0= ruleMobaRESTMethods ) )
            	    // InternalMoba.g:3951:10: (lv_operation_40_0= ruleMobaRESTMethods )
            	    {
            	    // InternalMoba.g:3951:10: (lv_operation_40_0= ruleMobaRESTMethods )
            	    // InternalMoba.g:3952:11: lv_operation_40_0= ruleMobaRESTMethods
            	    {

            	    											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getOperationMobaRESTMethodsEnumRuleCall_6_9_2_0());
            	    										
            	    pushFollow(FOLLOW_61);
            	    lv_operation_40_0=ruleMobaRESTMethods();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operation",
            	    												lv_operation_40_0,
            	    												"org.mobadsl.grammar.Moba.MobaRESTMethods");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    break loop65;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            				

            }

            otherlv_41=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMobaRESTCustomService"


    // $ANTLR start "entryRuleMobaRESTPayloadDefinition"
    // InternalMoba.g:3990:1: entryRuleMobaRESTPayloadDefinition returns [EObject current=null] : iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF ;
    public final EObject entryRuleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTPayloadDefinition = null;


        try {
            // InternalMoba.g:3990:66: (iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF )
            // InternalMoba.g:3991:2: iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTPayloadDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTPayloadDefinition=ruleMobaRESTPayloadDefinition();

            state._fsp--;

             current =iv_ruleMobaRESTPayloadDefinition; 
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
    // $ANTLR end "entryRuleMobaRESTPayloadDefinition"


    // $ANTLR start "ruleMobaRESTPayloadDefinition"
    // InternalMoba.g:3997:1: ruleMobaRESTPayloadDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:4003:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoba.g:4004:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoba.g:4004:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoba.g:4005:3: ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:4005:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoba.g:4006:4: (otherlv_0= RULE_ID )
            {
            // InternalMoba.g:4006:4: (otherlv_0= RULE_ID )
            // InternalMoba.g:4007:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_0, grammarAccess.getMobaRESTPayloadDefinitionAccess().getDtoMobaDtoCrossReference_0_0());
            				

            }


            }

            // InternalMoba.g:4018:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:4019:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:4019:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            // InternalMoba.g:4020:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:4023:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            // InternalMoba.g:4024:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            {
            // InternalMoba.g:4024:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( LA66_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                    alt66=1;
                }
                else if ( LA66_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalMoba.g:4025:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4025:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:4026:5: {...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4026:122: ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:4027:6: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:4030:9: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    // InternalMoba.g:4030:10: {...}? => ( (lv_array_2_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:4030:19: ( (lv_array_2_0= 'isArray' ) )
            	    // InternalMoba.g:4030:20: (lv_array_2_0= 'isArray' )
            	    {
            	    // InternalMoba.g:4030:20: (lv_array_2_0= 'isArray' )
            	    // InternalMoba.g:4031:10: lv_array_2_0= 'isArray'
            	    {
            	    lv_array_2_0=(Token)match(input,47,FOLLOW_65); 

            	    										newLeafNode(lv_array_2_0, grammarAccess.getMobaRESTPayloadDefinitionAccess().getArrayIsArrayKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            	    										}
            	    										setWithLastConsumed(current, "array", true, "isArray");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:4048:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:4048:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:4049:5: {...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4049:122: ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:4050:6: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:4053:9: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:4053:10: {...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:4053:19: (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:4053:20: otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) )
            	    {
            	    otherlv_3=(Token)match(input,92,FOLLOW_19); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMobaRESTPayloadDefinitionAccess().getAsKeyword_1_1_0());
            	    								
            	    // InternalMoba.g:4057:9: ( (otherlv_4= RULE_CONSTANT ) )
            	    // InternalMoba.g:4058:10: (otherlv_4= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:4058:10: (otherlv_4= RULE_CONSTANT )
            	    // InternalMoba.g:4059:11: otherlv_4= RULE_CONSTANT
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_65); 

            	    											newLeafNode(otherlv_4, grammarAccess.getMobaRESTPayloadDefinitionAccess().getSerializationTypeMobaTransportSerializationTypeCrossReference_1_1_1_0());
            	    										

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
            	    break loop66;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleMobaRESTPayloadDefinition"


    // $ANTLR start "entryRuleMobaRESTAbstractAttribute"
    // InternalMoba.g:4087:1: entryRuleMobaRESTAbstractAttribute returns [EObject current=null] : iv_ruleMobaRESTAbstractAttribute= ruleMobaRESTAbstractAttribute EOF ;
    public final EObject entryRuleMobaRESTAbstractAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTAbstractAttribute = null;


        try {
            // InternalMoba.g:4087:66: (iv_ruleMobaRESTAbstractAttribute= ruleMobaRESTAbstractAttribute EOF )
            // InternalMoba.g:4088:2: iv_ruleMobaRESTAbstractAttribute= ruleMobaRESTAbstractAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTAbstractAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTAbstractAttribute=ruleMobaRESTAbstractAttribute();

            state._fsp--;

             current =iv_ruleMobaRESTAbstractAttribute; 
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
    // $ANTLR end "entryRuleMobaRESTAbstractAttribute"


    // $ANTLR start "ruleMobaRESTAbstractAttribute"
    // InternalMoba.g:4094:1: ruleMobaRESTAbstractAttribute returns [EObject current=null] : (this_MobaRESTAttribute_0= ruleMobaRESTAttribute | this_MobaRESTDtoAttribute_1= ruleMobaRESTDtoAttribute ) ;
    public final EObject ruleMobaRESTAbstractAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRESTAttribute_0 = null;

        EObject this_MobaRESTDtoAttribute_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:4100:2: ( (this_MobaRESTAttribute_0= ruleMobaRESTAttribute | this_MobaRESTDtoAttribute_1= ruleMobaRESTDtoAttribute ) )
            // InternalMoba.g:4101:2: (this_MobaRESTAttribute_0= ruleMobaRESTAttribute | this_MobaRESTDtoAttribute_1= ruleMobaRESTDtoAttribute )
            {
            // InternalMoba.g:4101:2: (this_MobaRESTAttribute_0= ruleMobaRESTAttribute | this_MobaRESTDtoAttribute_1= ruleMobaRESTDtoAttribute )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==95) ) {
                alt67=1;
            }
            else if ( (LA67_0==93) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalMoba.g:4102:3: this_MobaRESTAttribute_0= ruleMobaRESTAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAbstractAttributeAccess().getMobaRESTAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTAttribute_0=ruleMobaRESTAttribute();

                    state._fsp--;


                    			current = this_MobaRESTAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:4111:3: this_MobaRESTDtoAttribute_1= ruleMobaRESTDtoAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAbstractAttributeAccess().getMobaRESTDtoAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTDtoAttribute_1=ruleMobaRESTDtoAttribute();

                    state._fsp--;


                    			current = this_MobaRESTDtoAttribute_1;
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
    // $ANTLR end "ruleMobaRESTAbstractAttribute"


    // $ANTLR start "entryRuleMobaRESTDtoAttribute"
    // InternalMoba.g:4123:1: entryRuleMobaRESTDtoAttribute returns [EObject current=null] : iv_ruleMobaRESTDtoAttribute= ruleMobaRESTDtoAttribute EOF ;
    public final EObject entryRuleMobaRESTDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTDtoAttribute = null;


        try {
            // InternalMoba.g:4123:61: (iv_ruleMobaRESTDtoAttribute= ruleMobaRESTDtoAttribute EOF )
            // InternalMoba.g:4124:2: iv_ruleMobaRESTDtoAttribute= ruleMobaRESTDtoAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTDtoAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTDtoAttribute=ruleMobaRESTDtoAttribute();

            state._fsp--;

             current =iv_ruleMobaRESTDtoAttribute; 
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
    // $ANTLR end "entryRuleMobaRESTDtoAttribute"


    // $ANTLR start "ruleMobaRESTDtoAttribute"
    // InternalMoba.g:4130:1: ruleMobaRESTDtoAttribute returns [EObject current=null] : (otherlv_0= 'refParam' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleMobaRESTDtoAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_aliasString_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMoba.g:4136:2: ( (otherlv_0= 'refParam' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')' )? ) )
            // InternalMoba.g:4137:2: (otherlv_0= 'refParam' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')' )? )
            {
            // InternalMoba.g:4137:2: (otherlv_0= 'refParam' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')' )? )
            // InternalMoba.g:4138:3: otherlv_0= 'refParam' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,93,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTDtoAttributeAccess().getRefParamKeyword_0());
            		
            // InternalMoba.g:4142:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:4143:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:4143:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:4144:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRESTDtoAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaRESTDtoAttributeAccess().getDtoFeatureMobaDtoFeatureCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:4155:3: (otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==94) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMoba.g:4156:4: otherlv_2= 'alias' otherlv_3= '(' ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,94,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaRESTDtoAttributeAccess().getAliasKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getMobaRESTDtoAttributeAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMoba.g:4164:4: ( ( (lv_aliasString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_STRING) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==RULE_CONSTANT) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalMoba.g:4165:5: ( (lv_aliasString_4_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4165:5: ( (lv_aliasString_4_0= RULE_STRING ) )
                            // InternalMoba.g:4166:6: (lv_aliasString_4_0= RULE_STRING )
                            {
                            // InternalMoba.g:4166:6: (lv_aliasString_4_0= RULE_STRING )
                            // InternalMoba.g:4167:7: lv_aliasString_4_0= RULE_STRING
                            {
                            lv_aliasString_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                            							newLeafNode(lv_aliasString_4_0, grammarAccess.getMobaRESTDtoAttributeAccess().getAliasStringSTRINGTerminalRuleCall_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTDtoAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"aliasString",
                            								lv_aliasString_4_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4184:5: ( (otherlv_5= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4184:5: ( (otherlv_5= RULE_CONSTANT ) )
                            // InternalMoba.g:4185:6: (otherlv_5= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4185:6: (otherlv_5= RULE_CONSTANT )
                            // InternalMoba.g:4186:7: otherlv_5= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTDtoAttributeRule());
                            							}
                            						
                            otherlv_5=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                            							newLeafNode(otherlv_5, grammarAccess.getMobaRESTDtoAttributeAccess().getAliasConstMobaConstantCrossReference_2_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaRESTDtoAttributeAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleMobaRESTDtoAttribute"


    // $ANTLR start "entryRuleMobaRESTAttribute"
    // InternalMoba.g:4207:1: entryRuleMobaRESTAttribute returns [EObject current=null] : iv_ruleMobaRESTAttribute= ruleMobaRESTAttribute EOF ;
    public final EObject entryRuleMobaRESTAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTAttribute = null;


        try {
            // InternalMoba.g:4207:58: (iv_ruleMobaRESTAttribute= ruleMobaRESTAttribute EOF )
            // InternalMoba.g:4208:2: iv_ruleMobaRESTAttribute= ruleMobaRESTAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTAttribute=ruleMobaRESTAttribute();

            state._fsp--;

             current =iv_ruleMobaRESTAttribute; 
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
    // $ANTLR end "entryRuleMobaRESTAttribute"


    // $ANTLR start "ruleMobaRESTAttribute"
    // InternalMoba.g:4214:1: ruleMobaRESTAttribute returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( (lv_keyString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')' )? (otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) ) )? ) ;
    public final EObject ruleMobaRESTAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_keyString_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_aliasString_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_valueString_10_0=null;
        Token lv_valueInt_11_0=null;
        Token lv_valueDouble_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMoba.g:4220:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( (lv_keyString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')' )? (otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:4221:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( (lv_keyString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')' )? (otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:4221:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( (lv_keyString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')' )? (otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:4222:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( (lv_keyString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')' )? (otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,95,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTAttributeAccess().getParamKeyword_0());
            		
            // InternalMoba.g:4226:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:4227:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:4227:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:4228:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_67); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaRESTAttributeAccess().getTypeMobaDataTypeCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:4239:3: ( ( (lv_keyString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_CONSTANT) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalMoba.g:4240:4: ( (lv_keyString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:4240:4: ( (lv_keyString_2_0= RULE_ID ) )
                    // InternalMoba.g:4241:5: (lv_keyString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:4241:5: (lv_keyString_2_0= RULE_ID )
                    // InternalMoba.g:4242:6: lv_keyString_2_0= RULE_ID
                    {
                    lv_keyString_2_0=(Token)match(input,RULE_ID,FOLLOW_68); 

                    						newLeafNode(lv_keyString_2_0, grammarAccess.getMobaRESTAttributeAccess().getKeyStringIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"keyString",
                    							lv_keyString_2_0,
                    							"org.mobadsl.grammar.Moba.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4259:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:4259:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:4260:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:4260:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:4261:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_68); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaRESTAttributeAccess().getKeyConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:4273:3: (otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==94) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMoba.g:4274:4: otherlv_4= 'alias' otherlv_5= '(' ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,94,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaRESTAttributeAccess().getAliasKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getMobaRESTAttributeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMoba.g:4282:4: ( ( (lv_aliasString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_STRING) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==RULE_CONSTANT) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalMoba.g:4283:5: ( (lv_aliasString_6_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4283:5: ( (lv_aliasString_6_0= RULE_STRING ) )
                            // InternalMoba.g:4284:6: (lv_aliasString_6_0= RULE_STRING )
                            {
                            // InternalMoba.g:4284:6: (lv_aliasString_6_0= RULE_STRING )
                            // InternalMoba.g:4285:7: lv_aliasString_6_0= RULE_STRING
                            {
                            lv_aliasString_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                            							newLeafNode(lv_aliasString_6_0, grammarAccess.getMobaRESTAttributeAccess().getAliasStringSTRINGTerminalRuleCall_3_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"aliasString",
                            								lv_aliasString_6_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4302:5: ( (otherlv_7= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4302:5: ( (otherlv_7= RULE_CONSTANT ) )
                            // InternalMoba.g:4303:6: (otherlv_7= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4303:6: (otherlv_7= RULE_CONSTANT )
                            // InternalMoba.g:4304:7: otherlv_7= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                            							newLeafNode(otherlv_7, grammarAccess.getMobaRESTAttributeAccess().getAliasConstMobaConstantCrossReference_3_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_69); 

                    				newLeafNode(otherlv_8, grammarAccess.getMobaRESTAttributeAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMoba.g:4321:3: (otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==22) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMoba.g:4322:4: otherlv_9= '=' ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getMobaRESTAttributeAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalMoba.g:4326:4: ( ( (lv_valueString_10_0= RULE_STRING ) ) | ( (lv_valueInt_11_0= RULE_INT ) ) | ( (lv_valueDouble_12_0= RULE_DOUBLE ) ) | ( (otherlv_13= RULE_CONSTANT ) ) )
                    int alt73=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt73=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt73=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt73=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt73=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // InternalMoba.g:4327:5: ( (lv_valueString_10_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4327:5: ( (lv_valueString_10_0= RULE_STRING ) )
                            // InternalMoba.g:4328:6: (lv_valueString_10_0= RULE_STRING )
                            {
                            // InternalMoba.g:4328:6: (lv_valueString_10_0= RULE_STRING )
                            // InternalMoba.g:4329:7: lv_valueString_10_0= RULE_STRING
                            {
                            lv_valueString_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_valueString_10_0, grammarAccess.getMobaRESTAttributeAccess().getValueStringSTRINGTerminalRuleCall_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueString",
                            								lv_valueString_10_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4346:5: ( (lv_valueInt_11_0= RULE_INT ) )
                            {
                            // InternalMoba.g:4346:5: ( (lv_valueInt_11_0= RULE_INT ) )
                            // InternalMoba.g:4347:6: (lv_valueInt_11_0= RULE_INT )
                            {
                            // InternalMoba.g:4347:6: (lv_valueInt_11_0= RULE_INT )
                            // InternalMoba.g:4348:7: lv_valueInt_11_0= RULE_INT
                            {
                            lv_valueInt_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_valueInt_11_0, grammarAccess.getMobaRESTAttributeAccess().getValueIntINTTerminalRuleCall_4_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueInt",
                            								lv_valueInt_11_0,
                            								"org.mobadsl.grammar.Moba.INT");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMoba.g:4365:5: ( (lv_valueDouble_12_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:4365:5: ( (lv_valueDouble_12_0= RULE_DOUBLE ) )
                            // InternalMoba.g:4366:6: (lv_valueDouble_12_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:4366:6: (lv_valueDouble_12_0= RULE_DOUBLE )
                            // InternalMoba.g:4367:7: lv_valueDouble_12_0= RULE_DOUBLE
                            {
                            lv_valueDouble_12_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                            							newLeafNode(lv_valueDouble_12_0, grammarAccess.getMobaRESTAttributeAccess().getValueDoubleDOUBLETerminalRuleCall_4_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueDouble",
                            								lv_valueDouble_12_0,
                            								"org.mobadsl.grammar.Moba.DOUBLE");
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMoba.g:4384:5: ( (otherlv_13= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4384:5: ( (otherlv_13= RULE_CONSTANT ) )
                            // InternalMoba.g:4385:6: (otherlv_13= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4385:6: (otherlv_13= RULE_CONSTANT )
                            // InternalMoba.g:4386:7: otherlv_13= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTAttributeRule());
                            							}
                            						
                            otherlv_13=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

                            							newLeafNode(otherlv_13, grammarAccess.getMobaRESTAttributeAccess().getValueConstMobaConstantCrossReference_4_1_3_0());
                            						

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
    // $ANTLR end "ruleMobaRESTAttribute"


    // $ANTLR start "entryRuleMobaRESTAbstractMultipartAttribute"
    // InternalMoba.g:4403:1: entryRuleMobaRESTAbstractMultipartAttribute returns [EObject current=null] : iv_ruleMobaRESTAbstractMultipartAttribute= ruleMobaRESTAbstractMultipartAttribute EOF ;
    public final EObject entryRuleMobaRESTAbstractMultipartAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTAbstractMultipartAttribute = null;


        try {
            // InternalMoba.g:4403:75: (iv_ruleMobaRESTAbstractMultipartAttribute= ruleMobaRESTAbstractMultipartAttribute EOF )
            // InternalMoba.g:4404:2: iv_ruleMobaRESTAbstractMultipartAttribute= ruleMobaRESTAbstractMultipartAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTAbstractMultipartAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTAbstractMultipartAttribute=ruleMobaRESTAbstractMultipartAttribute();

            state._fsp--;

             current =iv_ruleMobaRESTAbstractMultipartAttribute; 
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
    // $ANTLR end "entryRuleMobaRESTAbstractMultipartAttribute"


    // $ANTLR start "ruleMobaRESTAbstractMultipartAttribute"
    // InternalMoba.g:4410:1: ruleMobaRESTAbstractMultipartAttribute returns [EObject current=null] : (this_MobaRESTMultipartAttribute_0= ruleMobaRESTMultipartAttribute | this_MobaRESTMultipartDtoAttribute_1= ruleMobaRESTMultipartDtoAttribute ) ;
    public final EObject ruleMobaRESTAbstractMultipartAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRESTMultipartAttribute_0 = null;

        EObject this_MobaRESTMultipartDtoAttribute_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:4416:2: ( (this_MobaRESTMultipartAttribute_0= ruleMobaRESTMultipartAttribute | this_MobaRESTMultipartDtoAttribute_1= ruleMobaRESTMultipartDtoAttribute ) )
            // InternalMoba.g:4417:2: (this_MobaRESTMultipartAttribute_0= ruleMobaRESTMultipartAttribute | this_MobaRESTMultipartDtoAttribute_1= ruleMobaRESTMultipartDtoAttribute )
            {
            // InternalMoba.g:4417:2: (this_MobaRESTMultipartAttribute_0= ruleMobaRESTMultipartAttribute | this_MobaRESTMultipartDtoAttribute_1= ruleMobaRESTMultipartDtoAttribute )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==95) ) {
                alt75=1;
            }
            else if ( (LA75_0==93) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalMoba.g:4418:3: this_MobaRESTMultipartAttribute_0= ruleMobaRESTMultipartAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAbstractMultipartAttributeAccess().getMobaRESTMultipartAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTMultipartAttribute_0=ruleMobaRESTMultipartAttribute();

                    state._fsp--;


                    			current = this_MobaRESTMultipartAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:4427:3: this_MobaRESTMultipartDtoAttribute_1= ruleMobaRESTMultipartDtoAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaRESTAbstractMultipartAttributeAccess().getMobaRESTMultipartDtoAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRESTMultipartDtoAttribute_1=ruleMobaRESTMultipartDtoAttribute();

                    state._fsp--;


                    			current = this_MobaRESTMultipartDtoAttribute_1;
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
    // $ANTLR end "ruleMobaRESTAbstractMultipartAttribute"


    // $ANTLR start "entryRuleMobaRESTMultipartDtoAttribute"
    // InternalMoba.g:4439:1: entryRuleMobaRESTMultipartDtoAttribute returns [EObject current=null] : iv_ruleMobaRESTMultipartDtoAttribute= ruleMobaRESTMultipartDtoAttribute EOF ;
    public final EObject entryRuleMobaRESTMultipartDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTMultipartDtoAttribute = null;


        try {
            // InternalMoba.g:4439:70: (iv_ruleMobaRESTMultipartDtoAttribute= ruleMobaRESTMultipartDtoAttribute EOF )
            // InternalMoba.g:4440:2: iv_ruleMobaRESTMultipartDtoAttribute= ruleMobaRESTMultipartDtoAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTMultipartDtoAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTMultipartDtoAttribute=ruleMobaRESTMultipartDtoAttribute();

            state._fsp--;

             current =iv_ruleMobaRESTMultipartDtoAttribute; 
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
    // $ANTLR end "entryRuleMobaRESTMultipartDtoAttribute"


    // $ANTLR start "ruleMobaRESTMultipartDtoAttribute"
    // InternalMoba.g:4446:1: ruleMobaRESTMultipartDtoAttribute returns [EObject current=null] : (otherlv_0= 'refParam' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )? ) ;
    public final EObject ruleMobaRESTMultipartDtoAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attachment_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_aliasString_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMoba.g:4452:2: ( (otherlv_0= 'refParam' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )? ) )
            // InternalMoba.g:4453:2: (otherlv_0= 'refParam' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )? )
            {
            // InternalMoba.g:4453:2: (otherlv_0= 'refParam' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )? )
            // InternalMoba.g:4454:3: otherlv_0= 'refParam' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,93,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getRefParamKeyword_0());
            		
            // InternalMoba.g:4458:3: ( (lv_attachment_1_0= 'attachment' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==96) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMoba.g:4459:4: (lv_attachment_1_0= 'attachment' )
                    {
                    // InternalMoba.g:4459:4: (lv_attachment_1_0= 'attachment' )
                    // InternalMoba.g:4460:5: lv_attachment_1_0= 'attachment'
                    {
                    lv_attachment_1_0=(Token)match(input,96,FOLLOW_5); 

                    					newLeafNode(lv_attachment_1_0, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getAttachmentAttachmentKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaRESTMultipartDtoAttributeRule());
                    					}
                    					setWithLastConsumed(current, "attachment", true, "attachment");
                    				

                    }


                    }
                    break;

            }

            // InternalMoba.g:4472:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:4473:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:4473:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:4474:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRESTMultipartDtoAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(otherlv_2, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getDtoFeatureMobaDtoFeatureCrossReference_2_0());
            				

            }


            }

            // InternalMoba.g:4485:3: (otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==94) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMoba.g:4486:4: otherlv_3= 'alias' otherlv_4= '(' ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getAliasKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMoba.g:4494:4: ( ( (lv_aliasString_5_0= RULE_STRING ) ) | ( (otherlv_6= RULE_CONSTANT ) ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_STRING) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==RULE_CONSTANT) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalMoba.g:4495:5: ( (lv_aliasString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4495:5: ( (lv_aliasString_5_0= RULE_STRING ) )
                            // InternalMoba.g:4496:6: (lv_aliasString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:4496:6: (lv_aliasString_5_0= RULE_STRING )
                            // InternalMoba.g:4497:7: lv_aliasString_5_0= RULE_STRING
                            {
                            lv_aliasString_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                            							newLeafNode(lv_aliasString_5_0, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getAliasStringSTRINGTerminalRuleCall_3_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartDtoAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"aliasString",
                            								lv_aliasString_5_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4514:5: ( (otherlv_6= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4514:5: ( (otherlv_6= RULE_CONSTANT ) )
                            // InternalMoba.g:4515:6: (otherlv_6= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4515:6: (otherlv_6= RULE_CONSTANT )
                            // InternalMoba.g:4516:7: otherlv_6= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartDtoAttributeRule());
                            							}
                            						
                            otherlv_6=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                            							newLeafNode(otherlv_6, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getAliasConstMobaConstantCrossReference_3_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getMobaRESTMultipartDtoAttributeAccess().getRightParenthesisKeyword_3_3());
                    			

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
    // $ANTLR end "ruleMobaRESTMultipartDtoAttribute"


    // $ANTLR start "entryRuleMobaRESTMultipartAttribute"
    // InternalMoba.g:4537:1: entryRuleMobaRESTMultipartAttribute returns [EObject current=null] : iv_ruleMobaRESTMultipartAttribute= ruleMobaRESTMultipartAttribute EOF ;
    public final EObject entryRuleMobaRESTMultipartAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTMultipartAttribute = null;


        try {
            // InternalMoba.g:4537:67: (iv_ruleMobaRESTMultipartAttribute= ruleMobaRESTMultipartAttribute EOF )
            // InternalMoba.g:4538:2: iv_ruleMobaRESTMultipartAttribute= ruleMobaRESTMultipartAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTMultipartAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTMultipartAttribute=ruleMobaRESTMultipartAttribute();

            state._fsp--;

             current =iv_ruleMobaRESTMultipartAttribute; 
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
    // $ANTLR end "entryRuleMobaRESTMultipartAttribute"


    // $ANTLR start "ruleMobaRESTMultipartAttribute"
    // InternalMoba.g:4544:1: ruleMobaRESTMultipartAttribute returns [EObject current=null] : (otherlv_0= 'param' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_keyString_3_0= RULE_ID ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) (otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')' )? (otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) ) )? ) ;
    public final EObject ruleMobaRESTMultipartAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attachment_1_0=null;
        Token otherlv_2=null;
        Token lv_keyString_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_aliasString_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_valueString_11_0=null;
        Token lv_valueInt_12_0=null;
        Token lv_valueDouble_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMoba.g:4550:2: ( (otherlv_0= 'param' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_keyString_3_0= RULE_ID ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) (otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')' )? (otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:4551:2: (otherlv_0= 'param' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_keyString_3_0= RULE_ID ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) (otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')' )? (otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:4551:2: (otherlv_0= 'param' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_keyString_3_0= RULE_ID ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) (otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')' )? (otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:4552:3: otherlv_0= 'param' ( (lv_attachment_1_0= 'attachment' ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_keyString_3_0= RULE_ID ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) (otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')' )? (otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,95,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getParamKeyword_0());
            		
            // InternalMoba.g:4556:3: ( (lv_attachment_1_0= 'attachment' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==96) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalMoba.g:4557:4: (lv_attachment_1_0= 'attachment' )
                    {
                    // InternalMoba.g:4557:4: (lv_attachment_1_0= 'attachment' )
                    // InternalMoba.g:4558:5: lv_attachment_1_0= 'attachment'
                    {
                    lv_attachment_1_0=(Token)match(input,96,FOLLOW_5); 

                    					newLeafNode(lv_attachment_1_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getAttachmentAttachmentKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                    					}
                    					setWithLastConsumed(current, "attachment", true, "attachment");
                    				

                    }


                    }
                    break;

            }

            // InternalMoba.g:4570:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:4571:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:4571:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:4572:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_67); 

            					newLeafNode(otherlv_2, grammarAccess.getMobaRESTMultipartAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }

            // InternalMoba.g:4583:3: ( ( (lv_keyString_3_0= RULE_ID ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_CONSTANT) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalMoba.g:4584:4: ( (lv_keyString_3_0= RULE_ID ) )
                    {
                    // InternalMoba.g:4584:4: ( (lv_keyString_3_0= RULE_ID ) )
                    // InternalMoba.g:4585:5: (lv_keyString_3_0= RULE_ID )
                    {
                    // InternalMoba.g:4585:5: (lv_keyString_3_0= RULE_ID )
                    // InternalMoba.g:4586:6: lv_keyString_3_0= RULE_ID
                    {
                    lv_keyString_3_0=(Token)match(input,RULE_ID,FOLLOW_68); 

                    						newLeafNode(lv_keyString_3_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getKeyStringIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"keyString",
                    							lv_keyString_3_0,
                    							"org.mobadsl.grammar.Moba.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4603:4: ( (otherlv_4= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:4603:4: ( (otherlv_4= RULE_CONSTANT ) )
                    // InternalMoba.g:4604:5: (otherlv_4= RULE_CONSTANT )
                    {
                    // InternalMoba.g:4604:5: (otherlv_4= RULE_CONSTANT )
                    // InternalMoba.g:4605:6: otherlv_4= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_68); 

                    						newLeafNode(otherlv_4, grammarAccess.getMobaRESTMultipartAttributeAccess().getKeyConstMobaConstantCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:4617:3: (otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==94) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMoba.g:4618:4: otherlv_5= 'alias' otherlv_6= '(' ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getMobaRESTMultipartAttributeAccess().getAliasKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaRESTMultipartAttributeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMoba.g:4626:4: ( ( (lv_aliasString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_STRING) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_CONSTANT) ) {
                        alt81=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalMoba.g:4627:5: ( (lv_aliasString_7_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4627:5: ( (lv_aliasString_7_0= RULE_STRING ) )
                            // InternalMoba.g:4628:6: (lv_aliasString_7_0= RULE_STRING )
                            {
                            // InternalMoba.g:4628:6: (lv_aliasString_7_0= RULE_STRING )
                            // InternalMoba.g:4629:7: lv_aliasString_7_0= RULE_STRING
                            {
                            lv_aliasString_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                            							newLeafNode(lv_aliasString_7_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getAliasStringSTRINGTerminalRuleCall_4_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"aliasString",
                            								lv_aliasString_7_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4646:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4646:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:4647:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4647:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:4648:7: otherlv_8= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                            							}
                            						
                            otherlv_8=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                            							newLeafNode(otherlv_8, grammarAccess.getMobaRESTMultipartAttributeAccess().getAliasConstMobaConstantCrossReference_4_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_69); 

                    				newLeafNode(otherlv_9, grammarAccess.getMobaRESTMultipartAttributeAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMoba.g:4665:3: (otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==22) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMoba.g:4666:4: otherlv_10= '=' ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getMobaRESTMultipartAttributeAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalMoba.g:4670:4: ( ( (lv_valueString_11_0= RULE_STRING ) ) | ( (lv_valueInt_12_0= RULE_INT ) ) | ( (lv_valueDouble_13_0= RULE_DOUBLE ) ) | ( (otherlv_14= RULE_CONSTANT ) ) )
                    int alt83=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt83=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt83=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt83=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt83=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // InternalMoba.g:4671:5: ( (lv_valueString_11_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4671:5: ( (lv_valueString_11_0= RULE_STRING ) )
                            // InternalMoba.g:4672:6: (lv_valueString_11_0= RULE_STRING )
                            {
                            // InternalMoba.g:4672:6: (lv_valueString_11_0= RULE_STRING )
                            // InternalMoba.g:4673:7: lv_valueString_11_0= RULE_STRING
                            {
                            lv_valueString_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_valueString_11_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getValueStringSTRINGTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueString",
                            								lv_valueString_11_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4690:5: ( (lv_valueInt_12_0= RULE_INT ) )
                            {
                            // InternalMoba.g:4690:5: ( (lv_valueInt_12_0= RULE_INT ) )
                            // InternalMoba.g:4691:6: (lv_valueInt_12_0= RULE_INT )
                            {
                            // InternalMoba.g:4691:6: (lv_valueInt_12_0= RULE_INT )
                            // InternalMoba.g:4692:7: lv_valueInt_12_0= RULE_INT
                            {
                            lv_valueInt_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_valueInt_12_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getValueIntINTTerminalRuleCall_5_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueInt",
                            								lv_valueInt_12_0,
                            								"org.mobadsl.grammar.Moba.INT");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMoba.g:4709:5: ( (lv_valueDouble_13_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:4709:5: ( (lv_valueDouble_13_0= RULE_DOUBLE ) )
                            // InternalMoba.g:4710:6: (lv_valueDouble_13_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:4710:6: (lv_valueDouble_13_0= RULE_DOUBLE )
                            // InternalMoba.g:4711:7: lv_valueDouble_13_0= RULE_DOUBLE
                            {
                            lv_valueDouble_13_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                            							newLeafNode(lv_valueDouble_13_0, grammarAccess.getMobaRESTMultipartAttributeAccess().getValueDoubleDOUBLETerminalRuleCall_5_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueDouble",
                            								lv_valueDouble_13_0,
                            								"org.mobadsl.grammar.Moba.DOUBLE");
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMoba.g:4728:5: ( (otherlv_14= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4728:5: ( (otherlv_14= RULE_CONSTANT ) )
                            // InternalMoba.g:4729:6: (otherlv_14= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4729:6: (otherlv_14= RULE_CONSTANT )
                            // InternalMoba.g:4730:7: otherlv_14= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRESTMultipartAttributeRule());
                            							}
                            						
                            otherlv_14=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

                            							newLeafNode(otherlv_14, grammarAccess.getMobaRESTMultipartAttributeAccess().getValueConstMobaConstantCrossReference_5_1_3_0());
                            						

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
    // $ANTLR end "ruleMobaRESTMultipartAttribute"


    // $ANTLR start "entryRuleMobaRestHeader"
    // InternalMoba.g:4747:1: entryRuleMobaRestHeader returns [EObject current=null] : iv_ruleMobaRestHeader= ruleMobaRestHeader EOF ;
    public final EObject entryRuleMobaRestHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestHeader = null;


        try {
            // InternalMoba.g:4747:55: (iv_ruleMobaRestHeader= ruleMobaRestHeader EOF )
            // InternalMoba.g:4748:2: iv_ruleMobaRestHeader= ruleMobaRestHeader EOF
            {
             newCompositeNode(grammarAccess.getMobaRestHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRestHeader=ruleMobaRestHeader();

            state._fsp--;

             current =iv_ruleMobaRestHeader; 
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
    // $ANTLR end "entryRuleMobaRestHeader"


    // $ANTLR start "ruleMobaRestHeader"
    // InternalMoba.g:4754:1: ruleMobaRestHeader returns [EObject current=null] : ( ( ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) ) ) | ( ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ;
    public final EObject ruleMobaRestHeader() throws RecognitionException {
        EObject current = null;

        Token lv_contentTypeHeader_0_0=null;
        Token lv_keyString_1_0=null;
        Token otherlv_2=null;
        Token lv_rawHeader_3_0=null;
        Token lv_keyString_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_valueString_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMoba.g:4760:2: ( ( ( ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) ) ) | ( ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) )
            // InternalMoba.g:4761:2: ( ( ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) ) ) | ( ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) )
            {
            // InternalMoba.g:4761:2: ( ( ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) ) ) | ( ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==97) ) {
                alt88=1;
            }
            else if ( (LA88_0==98) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalMoba.g:4762:3: ( ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) ) )
                    {
                    // InternalMoba.g:4762:3: ( ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) ) )
                    // InternalMoba.g:4763:4: ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) ) ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) )
                    {
                    // InternalMoba.g:4763:4: ( (lv_contentTypeHeader_0_0= 'ContentTypeHeader' ) )
                    // InternalMoba.g:4764:5: (lv_contentTypeHeader_0_0= 'ContentTypeHeader' )
                    {
                    // InternalMoba.g:4764:5: (lv_contentTypeHeader_0_0= 'ContentTypeHeader' )
                    // InternalMoba.g:4765:6: lv_contentTypeHeader_0_0= 'ContentTypeHeader'
                    {
                    lv_contentTypeHeader_0_0=(Token)match(input,97,FOLLOW_16); 

                    						newLeafNode(lv_contentTypeHeader_0_0, grammarAccess.getMobaRestHeaderAccess().getContentTypeHeaderContentTypeHeaderKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                    						}
                    						setWithLastConsumed(current, "contentTypeHeader", true, "ContentTypeHeader");
                    					

                    }


                    }

                    // InternalMoba.g:4777:4: ( ( (lv_keyString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_CONSTANT ) ) )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_STRING) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==RULE_CONSTANT) ) {
                        alt85=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalMoba.g:4778:5: ( (lv_keyString_1_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4778:5: ( (lv_keyString_1_0= RULE_STRING ) )
                            // InternalMoba.g:4779:6: (lv_keyString_1_0= RULE_STRING )
                            {
                            // InternalMoba.g:4779:6: (lv_keyString_1_0= RULE_STRING )
                            // InternalMoba.g:4780:7: lv_keyString_1_0= RULE_STRING
                            {
                            lv_keyString_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_keyString_1_0, grammarAccess.getMobaRestHeaderAccess().getKeyStringSTRINGTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"keyString",
                            								lv_keyString_1_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4797:5: ( (otherlv_2= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4797:5: ( (otherlv_2= RULE_CONSTANT ) )
                            // InternalMoba.g:4798:6: (otherlv_2= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4798:6: (otherlv_2= RULE_CONSTANT )
                            // InternalMoba.g:4799:7: otherlv_2= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                            							}
                            						
                            otherlv_2=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

                            							newLeafNode(otherlv_2, grammarAccess.getMobaRestHeaderAccess().getKeyConstMobaConstantCrossReference_0_1_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4813:3: ( ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )
                    {
                    // InternalMoba.g:4813:3: ( ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )
                    // InternalMoba.g:4814:4: ( (lv_rawHeader_3_0= 'RawHeader' ) ) ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) otherlv_6= '=' ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    // InternalMoba.g:4814:4: ( (lv_rawHeader_3_0= 'RawHeader' ) )
                    // InternalMoba.g:4815:5: (lv_rawHeader_3_0= 'RawHeader' )
                    {
                    // InternalMoba.g:4815:5: (lv_rawHeader_3_0= 'RawHeader' )
                    // InternalMoba.g:4816:6: lv_rawHeader_3_0= 'RawHeader'
                    {
                    lv_rawHeader_3_0=(Token)match(input,98,FOLLOW_16); 

                    						newLeafNode(lv_rawHeader_3_0, grammarAccess.getMobaRestHeaderAccess().getRawHeaderRawHeaderKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                    						}
                    						setWithLastConsumed(current, "rawHeader", true, "RawHeader");
                    					

                    }


                    }

                    // InternalMoba.g:4828:4: ( ( (lv_keyString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_STRING) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==RULE_CONSTANT) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalMoba.g:4829:5: ( (lv_keyString_4_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4829:5: ( (lv_keyString_4_0= RULE_STRING ) )
                            // InternalMoba.g:4830:6: (lv_keyString_4_0= RULE_STRING )
                            {
                            // InternalMoba.g:4830:6: (lv_keyString_4_0= RULE_STRING )
                            // InternalMoba.g:4831:7: lv_keyString_4_0= RULE_STRING
                            {
                            lv_keyString_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_keyString_4_0, grammarAccess.getMobaRestHeaderAccess().getKeyStringSTRINGTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"keyString",
                            								lv_keyString_4_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4848:5: ( (otherlv_5= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4848:5: ( (otherlv_5= RULE_CONSTANT ) )
                            // InternalMoba.g:4849:6: (otherlv_5= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4849:6: (otherlv_5= RULE_CONSTANT )
                            // InternalMoba.g:4850:7: otherlv_5= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                            							}
                            						
                            otherlv_5=(Token)match(input,RULE_CONSTANT,FOLLOW_7); 

                            							newLeafNode(otherlv_5, grammarAccess.getMobaRestHeaderAccess().getKeyConstMobaConstantCrossReference_1_1_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaRestHeaderAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalMoba.g:4866:4: ( ( (lv_valueString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_STRING) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==RULE_CONSTANT) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalMoba.g:4867:5: ( (lv_valueString_7_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4867:5: ( (lv_valueString_7_0= RULE_STRING ) )
                            // InternalMoba.g:4868:6: (lv_valueString_7_0= RULE_STRING )
                            {
                            // InternalMoba.g:4868:6: (lv_valueString_7_0= RULE_STRING )
                            // InternalMoba.g:4869:7: lv_valueString_7_0= RULE_STRING
                            {
                            lv_valueString_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_valueString_7_0, grammarAccess.getMobaRestHeaderAccess().getValueStringSTRINGTerminalRuleCall_1_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueString",
                            								lv_valueString_7_0,
                            								"org.mobadsl.grammar.Moba.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4886:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4886:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:4887:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4887:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:4888:7: otherlv_8= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                            							}
                            						
                            otherlv_8=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

                            							newLeafNode(otherlv_8, grammarAccess.getMobaRestHeaderAccess().getValueConstMobaConstantCrossReference_1_3_1_0());
                            						

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
    // $ANTLR end "ruleMobaRestHeader"


    // $ANTLR start "entryRuleMobaRESTCrud"
    // InternalMoba.g:4905:1: entryRuleMobaRESTCrud returns [EObject current=null] : iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF ;
    public final EObject entryRuleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCrud = null;


        try {
            // InternalMoba.g:4905:53: (iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF )
            // InternalMoba.g:4906:2: iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTCrudRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTCrud=ruleMobaRESTCrud();

            state._fsp--;

             current =iv_ruleMobaRESTCrud; 
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
    // $ANTLR end "entryRuleMobaRESTCrud"


    // $ANTLR start "ruleMobaRESTCrud"
    // InternalMoba.g:4912:1: ruleMobaRESTCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:4918:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4919:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4919:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4920:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,99,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCrudAccess().getRestCrudKeyword_0());
            		
            // InternalMoba.g:4924:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:4925:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:4925:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:4926:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaRESTCrudAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMoba.g:4942:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==32) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalMoba.g:4943:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaRESTCrudAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:4947:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4948:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4948:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4949:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTCrudRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaRESTCrudAccess().getSuperTypeMobaRESTCrudCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaRESTCrudRule());
            			}
            			newCompositeNode(grammarAccess.getMobaRESTCrudAccess().getMobaFriendsAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_4;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaRESTCrud"


    // $ANTLR start "entryRuleMobaRESTWorkflow"
    // InternalMoba.g:4976:1: entryRuleMobaRESTWorkflow returns [EObject current=null] : iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF ;
    public final EObject entryRuleMobaRESTWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTWorkflow = null;


        try {
            // InternalMoba.g:4976:57: (iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF )
            // InternalMoba.g:4977:2: iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF
            {
             newCompositeNode(grammarAccess.getMobaRESTWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTWorkflow=ruleMobaRESTWorkflow();

            state._fsp--;

             current =iv_ruleMobaRESTWorkflow; 
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
    // $ANTLR end "entryRuleMobaRESTWorkflow"


    // $ANTLR start "ruleMobaRESTWorkflow"
    // InternalMoba.g:4983:1: ruleMobaRESTWorkflow returns [EObject current=null] : (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) ;
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
            // InternalMoba.g:4989:2: ( (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) )
            // InternalMoba.g:4990:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            {
            // InternalMoba.g:4990:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            // InternalMoba.g:4991:3: otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRESTWorkflowAccess().getRestWorkflowKeyword_0());
            		
            // InternalMoba.g:4995:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:4996:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:4996:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:4997:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaRESTWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMoba.g:5013:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==32) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMoba.g:5014:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaRESTWorkflowAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:5018:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:5019:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:5019:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:5020:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaRESTWorkflowAccess().getSuperTypeMobaRESTWorkflowCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
            			}
            			newCompositeNode(grammarAccess.getMobaRESTWorkflowAccess().getMobaFriendsAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_4;
            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,23,FOLLOW_72); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaRESTWorkflowAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:5047:3: (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==101) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalMoba.g:5048:4: otherlv_6= 'service' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,101,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getMobaRESTWorkflowAccess().getServiceKeyword_5_0());
            	    			
            	    // InternalMoba.g:5052:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalMoba.g:5053:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMoba.g:5053:5: (otherlv_7= RULE_ID )
            	    // InternalMoba.g:5054:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_72); 

            	    						newLeafNode(otherlv_7, grammarAccess.getMobaRESTWorkflowAccess().getServicesMobaRESTCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMobaRESTWorkflowAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMobaRESTWorkflow"


    // $ANTLR start "entryRuleMobaEntityFeature"
    // InternalMoba.g:5074:1: entryRuleMobaEntityFeature returns [EObject current=null] : iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF ;
    public final EObject entryRuleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityFeature = null;


        try {
            // InternalMoba.g:5074:58: (iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF )
            // InternalMoba.g:5075:2: iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF
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
    // InternalMoba.g:5081:1: ruleMobaEntityFeature returns [EObject current=null] : (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable ) ;
    public final EObject ruleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntityAttribute_0 = null;

        EObject this_MobaEntityReference_1 = null;

        EObject this_MobaEntityEmbeddable_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:5087:2: ( (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable ) )
            // InternalMoba.g:5088:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable )
            {
            // InternalMoba.g:5088:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt92=1;
                }
                break;
            case 110:
                {
                alt92=2;
                }
                break;
            case 112:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalMoba.g:5089:3: this_MobaEntityAttribute_0= ruleMobaEntityAttribute
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
                    // InternalMoba.g:5098:3: this_MobaEntityReference_1= ruleMobaEntityReference
                    {

                    			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaEntityReference_1=ruleMobaEntityReference();

                    state._fsp--;


                    			current = this_MobaEntityReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:5107:3: this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable
                    {

                    			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityEmbeddableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaEntityEmbeddable_2=ruleMobaEntityEmbeddable();

                    state._fsp--;


                    			current = this_MobaEntityEmbeddable_2;
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
    // InternalMoba.g:5119:1: entryRuleMobaEntityAttribute returns [EObject current=null] : iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF ;
    public final EObject entryRuleMobaEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityAttribute = null;


        try {
            // InternalMoba.g:5119:60: (iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF )
            // InternalMoba.g:5120:2: iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF
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
    // InternalMoba.g:5126:1: ruleMobaEntityAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5132:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5133:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5133:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5134:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,102,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:5138:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:5139:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:5139:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:5140:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:5143:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:5144:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:5144:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop94:
            do {
                int alt94=6;
                int LA94_0 = input.LA(1);

                if ( LA94_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt94=1;
                }
                else if ( LA94_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt94=2;
                }
                else if ( LA94_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt94=3;
                }
                else if ( LA94_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt94=4;
                }
                else if ( LA94_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt94=5;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalMoba.g:5145:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5145:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5146:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5146:116: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5147:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:5150:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:5150:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:5150:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:5150:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5150:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:5151:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,103,FOLLOW_73); 

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
            	    // InternalMoba.g:5168:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5168:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5169:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5169:116: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5170:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:5173:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:5173:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:5173:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:5173:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:5173:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:5174:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,104,FOLLOW_73); 

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
            	    // InternalMoba.g:5191:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5191:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:5192:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5192:116: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:5193:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:5196:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:5196:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:5196:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:5196:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:5196:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:5197:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,105,FOLLOW_73); 

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
            	    // InternalMoba.g:5214:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5214:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:5215:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:5215:116: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:5216:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:5219:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:5219:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:5219:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:5219:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:5219:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:5220:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,106,FOLLOW_73); 

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
            	    // InternalMoba.g:5237:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5237:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:5238:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:5238:116: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:5239:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:5242:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:5242:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:5242:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:5242:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:5250:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:5251:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:5251:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:5252:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
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

            	    // InternalMoba.g:5269:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop93:
            	    do {
            	        int alt93=2;
            	        int LA93_0 = input.LA(1);

            	        if ( (LA93_0==36) ) {
            	            alt93=1;
            	        }


            	        switch (alt93) {
            	    	case 1 :
            	    	    // InternalMoba.g:5270:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,36,FOLLOW_30); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaEntityAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:5274:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:5275:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:5275:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:5276:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_21);
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
            	    	    break loop93;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,37,FOLLOW_73); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaEntityAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:5311:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:5312:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:5312:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:5313:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaEntityAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:5335:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:5336:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:5336:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:5337:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_75); 

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

            // InternalMoba.g:5353:3: (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==107) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMoba.g:5354:4: otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,107,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getMobaEntityAttributeAccess().getFormatKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMoba.g:5362:4: ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==RULE_STRING) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==RULE_CONSTANT) ) {
                        alt95=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalMoba.g:5363:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:5363:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            // InternalMoba.g:5364:6: (lv_formatString_17_0= RULE_STRING )
                            {
                            // InternalMoba.g:5364:6: (lv_formatString_17_0= RULE_STRING )
                            // InternalMoba.g:5365:7: lv_formatString_17_0= RULE_STRING
                            {
                            lv_formatString_17_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                            							newLeafNode(lv_formatString_17_0, grammarAccess.getMobaEntityAttributeAccess().getFormatStringSTRINGTerminalRuleCall_5_2_0_0());
                            						

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
                            break;
                        case 2 :
                            // InternalMoba.g:5382:5: ( (otherlv_18= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:5382:5: ( (otherlv_18= RULE_CONSTANT ) )
                            // InternalMoba.g:5383:6: (otherlv_18= RULE_CONSTANT )
                            {
                            // InternalMoba.g:5383:6: (otherlv_18= RULE_CONSTANT )
                            // InternalMoba.g:5384:7: otherlv_18= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
                            							}
                            						
                            otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                            							newLeafNode(otherlv_18, grammarAccess.getMobaEntityAttributeAccess().getFormatConstMobaConstantCrossReference_5_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_19, grammarAccess.getMobaEntityAttributeAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_20=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_20;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalMoba.g:5416:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:5416:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:5417:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
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
    // InternalMoba.g:5423:1: ruleMobaSettingsFeature returns [EObject current=null] : (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference ) ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;

        EObject this_MobaSettingsEntityReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:5429:2: ( (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference ) )
            // InternalMoba.g:5430:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference )
            {
            // InternalMoba.g:5430:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==102) ) {
                alt97=1;
            }
            else if ( (LA97_0==108) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalMoba.g:5431:3: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaSettingsFeatureAccess().getMobaSettingsAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaSettingsAttribute_0=ruleMobaSettingsAttribute();

                    state._fsp--;


                    			current = this_MobaSettingsAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:5440:3: this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference
                    {

                    			newCompositeNode(grammarAccess.getMobaSettingsFeatureAccess().getMobaSettingsEntityReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaSettingsEntityReference_1=ruleMobaSettingsEntityReference();

                    state._fsp--;


                    			current = this_MobaSettingsEntityReference_1;
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
    // $ANTLR end "ruleMobaSettingsFeature"


    // $ANTLR start "entryRuleMobaSettingsAttribute"
    // InternalMoba.g:5452:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:5452:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:5453:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
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
    // InternalMoba.g:5459:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5465:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5466:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5466:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5467:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,102,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:5471:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:5472:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:5472:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:5473:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:5476:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:5477:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:5477:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop99:
            do {
                int alt99=6;
                int LA99_0 = input.LA(1);

                if ( LA99_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt99=1;
                }
                else if ( LA99_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt99=2;
                }
                else if ( LA99_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt99=3;
                }
                else if ( LA99_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt99=4;
                }
                else if ( LA99_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt99=5;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalMoba.g:5478:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5478:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5479:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5479:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5480:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:5483:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:5483:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:5483:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:5483:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5483:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:5484:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,103,FOLLOW_73); 

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
            	    // InternalMoba.g:5501:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5501:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5502:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5502:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5503:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:5506:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:5506:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:5506:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:5506:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:5506:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:5507:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,104,FOLLOW_73); 

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
            	    // InternalMoba.g:5524:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5524:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:5525:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5525:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:5526:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:5529:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:5529:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:5529:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:5529:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:5529:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:5530:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,105,FOLLOW_73); 

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
            	    // InternalMoba.g:5547:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5547:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:5548:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:5548:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:5549:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:5552:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:5552:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:5552:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:5552:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:5552:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:5553:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,106,FOLLOW_73); 

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
            	    // InternalMoba.g:5570:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5570:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:5571:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:5571:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:5572:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:5575:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:5575:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:5575:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:5575:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:5583:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:5584:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:5584:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:5585:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
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

            	    // InternalMoba.g:5602:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==36) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // InternalMoba.g:5603:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,36,FOLLOW_30); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:5607:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:5608:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:5608:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:5609:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_21);
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
            	    	    break loop98;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,37,FOLLOW_73); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:5644:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:5645:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:5645:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:5646:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaSettingsAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:5668:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:5669:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:5669:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:5670:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_75); 

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

            // InternalMoba.g:5686:3: (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==107) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalMoba.g:5687:4: otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,107,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getMobaSettingsAttributeAccess().getFormatKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMoba.g:5695:4: ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==RULE_STRING) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==RULE_CONSTANT) ) {
                        alt100=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalMoba.g:5696:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:5696:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            // InternalMoba.g:5697:6: (lv_formatString_17_0= RULE_STRING )
                            {
                            // InternalMoba.g:5697:6: (lv_formatString_17_0= RULE_STRING )
                            // InternalMoba.g:5698:7: lv_formatString_17_0= RULE_STRING
                            {
                            lv_formatString_17_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                            							newLeafNode(lv_formatString_17_0, grammarAccess.getMobaSettingsAttributeAccess().getFormatStringSTRINGTerminalRuleCall_5_2_0_0());
                            						

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
                            break;
                        case 2 :
                            // InternalMoba.g:5715:5: ( (otherlv_18= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:5715:5: ( (otherlv_18= RULE_CONSTANT ) )
                            // InternalMoba.g:5716:6: (otherlv_18= RULE_CONSTANT )
                            {
                            // InternalMoba.g:5716:6: (otherlv_18= RULE_CONSTANT )
                            // InternalMoba.g:5717:7: otherlv_18= RULE_CONSTANT
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
                            							}
                            						
                            otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                            							newLeafNode(otherlv_18, grammarAccess.getMobaSettingsAttributeAccess().getFormatConstMobaConstantCrossReference_5_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_19, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_20=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_20;
            			afterParserOrEnumRuleCall();
            		

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


    // $ANTLR start "entryRuleMobaSettingsEntityReference"
    // InternalMoba.g:5749:1: entryRuleMobaSettingsEntityReference returns [EObject current=null] : iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF ;
    public final EObject entryRuleMobaSettingsEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsEntityReference = null;


        try {
            // InternalMoba.g:5749:68: (iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF )
            // InternalMoba.g:5750:2: iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF
            {
             newCompositeNode(grammarAccess.getMobaSettingsEntityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettingsEntityReference=ruleMobaSettingsEntityReference();

            state._fsp--;

             current =iv_ruleMobaSettingsEntityReference; 
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
    // $ANTLR end "entryRuleMobaSettingsEntityReference"


    // $ANTLR start "ruleMobaSettingsEntityReference"
    // InternalMoba.g:5756:1: ruleMobaSettingsEntityReference returns [EObject current=null] : (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5762:2: ( (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5763:2: (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5763:2: (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5764:3: otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,108,FOLLOW_76); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getRefEntityKeyword_0());
            		
            // InternalMoba.g:5768:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5769:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5769:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5770:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:5773:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5774:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5774:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop102:
            do {
                int alt102=4;
                int LA102_0 = input.LA(1);

                if ( LA102_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt102=1;
                }
                else if ( LA102_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt102=2;
                }
                else if ( LA102_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt102=3;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalMoba.g:5775:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5775:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5776:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5776:124: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5777:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:5780:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5780:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:5780:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5780:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5780:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5781:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,109,FOLLOW_76); 

            	    										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "cascading", true, "cascading");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:5798:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5798:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5799:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5799:124: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5800:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:5803:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5803:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:5803:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5803:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5803:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5804:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,103,FOLLOW_76); 

            	    										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getLazyLazyKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:5821:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5821:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5822:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5822:124: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5823:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:5826:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5826:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:5826:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5826:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5826:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5827:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,104,FOLLOW_76); 

            	    										newLeafNode(lv_transient_4_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getTransientTransientKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:5851:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5852:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5852:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5853:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaSettingsEntityReferenceAccess().getTypeMobaEntityCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaSettingsEntityReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:5875:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5876:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5876:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5877:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaSettingsEntityReferenceAccess().getMobaFriendsAbleParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_8;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaSettingsEntityReference"


    // $ANTLR start "ruleMobaMultiplicityAble"
    // InternalMoba.g:5909:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:5915:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:5916:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:5916:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==67) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalMoba.g:5917:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:5917:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:5918:4: lv_multiplicity_0_0= ruleMobaMuliplicity
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
    // InternalMoba.g:5938:1: entryRuleMobaEntityReference returns [EObject current=null] : iv_ruleMobaEntityReference= ruleMobaEntityReference EOF ;
    public final EObject entryRuleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityReference = null;


        try {
            // InternalMoba.g:5938:60: (iv_ruleMobaEntityReference= ruleMobaEntityReference EOF )
            // InternalMoba.g:5939:2: iv_ruleMobaEntityReference= ruleMobaEntityReference EOF
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
    // InternalMoba.g:5945:1: ruleMobaEntityReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5951:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5952:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5952:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5953:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,110,FOLLOW_76); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:5957:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5958:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5958:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5959:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:5962:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5963:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5963:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop104:
            do {
                int alt104=4;
                int LA104_0 = input.LA(1);

                if ( LA104_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt104=1;
                }
                else if ( LA104_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt104=2;
                }
                else if ( LA104_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt104=3;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalMoba.g:5964:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5964:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5965:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5965:116: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5966:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:5969:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5969:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5969:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5969:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5969:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5970:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,109,FOLLOW_76); 

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
            	    // InternalMoba.g:5987:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5987:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5988:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5988:116: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5989:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:5992:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5992:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5992:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5992:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5992:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5993:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,103,FOLLOW_76); 

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
            	    // InternalMoba.g:6010:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6010:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:6011:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:6011:116: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:6012:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:6015:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:6015:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:6015:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:6015:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:6015:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:6016:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,104,FOLLOW_76); 

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
            	    break loop104;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:6040:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:6041:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:6041:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:6042:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaEntityReferenceAccess().getTypeMobaEntityCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:6064:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:6065:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:6065:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:6066:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_77); 

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

            // InternalMoba.g:6082:3: (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==111) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalMoba.g:6083:4: otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,111,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getMobaEntityReferenceAccess().getOppositeKeyword_5_0());
                    			
                    // InternalMoba.g:6087:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMoba.g:6088:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMoba.g:6088:5: (otherlv_9= RULE_ID )
                    // InternalMoba.g:6089:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_9, grammarAccess.getMobaEntityReferenceAccess().getOppositeMobaEntityReferenceCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_10=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_10;
            			afterParserOrEnumRuleCall();
            		

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


    // $ANTLR start "entryRuleMobaEntityEmbeddable"
    // InternalMoba.g:6116:1: entryRuleMobaEntityEmbeddable returns [EObject current=null] : iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF ;
    public final EObject entryRuleMobaEntityEmbeddable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityEmbeddable = null;


        try {
            // InternalMoba.g:6116:61: (iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF )
            // InternalMoba.g:6117:2: iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF
            {
             newCompositeNode(grammarAccess.getMobaEntityEmbeddableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityEmbeddable=ruleMobaEntityEmbeddable();

            state._fsp--;

             current =iv_ruleMobaEntityEmbeddable; 
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
    // $ANTLR end "entryRuleMobaEntityEmbeddable"


    // $ANTLR start "ruleMobaEntityEmbeddable"
    // InternalMoba.g:6123:1: ruleMobaEntityEmbeddable returns [EObject current=null] : (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6129:2: ( (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6130:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6130:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6131:3: otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,112,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityEmbeddableAccess().getEmbedKeyword_0());
            		
            // InternalMoba.g:6135:3: ( (lv_transient_1_0= 'transient' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==104) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMoba.g:6136:4: (lv_transient_1_0= 'transient' )
                    {
                    // InternalMoba.g:6136:4: (lv_transient_1_0= 'transient' )
                    // InternalMoba.g:6137:5: lv_transient_1_0= 'transient'
                    {
                    lv_transient_1_0=(Token)match(input,104,FOLLOW_5); 

                    					newLeafNode(lv_transient_1_0, grammarAccess.getMobaEntityEmbeddableAccess().getTransientTransientKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalMoba.g:6149:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:6150:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:6150:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:6151:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_2, grammarAccess.getMobaEntityEmbeddableAccess().getTypeMobaEntityCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityEmbeddableAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_3=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:6173:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMoba.g:6174:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMoba.g:6174:4: (lv_name_4_0= RULE_ID )
            // InternalMoba.g:6175:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMobaEntityEmbeddableAccess().getNameIDTerminalRuleCall_4_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityEmbeddableAccess().getMobaFriendsAbleParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_5;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaEntityEmbeddable"


    // $ANTLR start "entryRuleMobaDtoFeature"
    // InternalMoba.g:6206:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:6206:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:6207:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
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
    // InternalMoba.g:6213:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;

        EObject this_MobaDtoEmbeddable_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:6219:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable ) )
            // InternalMoba.g:6220:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable )
            {
            // InternalMoba.g:6220:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt107=1;
                }
                break;
            case 110:
                {
                alt107=2;
                }
                break;
            case 112:
                {
                alt107=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalMoba.g:6221:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
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
                    // InternalMoba.g:6230:3: this_MobaDtoReference_1= ruleMobaDtoReference
                    {

                    			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDtoReference_1=ruleMobaDtoReference();

                    state._fsp--;


                    			current = this_MobaDtoReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:6239:3: this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable
                    {

                    			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoEmbeddableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDtoEmbeddable_2=ruleMobaDtoEmbeddable();

                    state._fsp--;


                    			current = this_MobaDtoEmbeddable_2;
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
    // InternalMoba.g:6251:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:6251:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:6252:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
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
    // InternalMoba.g:6258:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6264:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6265:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6265:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6266:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,102,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:6270:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:6271:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:6271:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:6272:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:6275:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:6276:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:6276:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop109:
            do {
                int alt109=6;
                int LA109_0 = input.LA(1);

                if ( LA109_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt109=1;
                }
                else if ( LA109_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt109=2;
                }
                else if ( LA109_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt109=3;
                }
                else if ( LA109_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt109=4;
                }
                else if ( LA109_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt109=5;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalMoba.g:6277:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6277:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:6278:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:6278:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:6279:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:6282:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:6282:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6282:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:6282:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:6282:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:6283:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,103,FOLLOW_73); 

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
            	    // InternalMoba.g:6300:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6300:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:6301:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:6301:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:6302:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:6305:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:6305:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6305:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:6305:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:6305:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:6306:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,104,FOLLOW_73); 

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
            	    // InternalMoba.g:6323:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6323:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:6324:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:6324:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:6325:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:6328:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:6328:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6328:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:6328:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:6328:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:6329:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,105,FOLLOW_73); 

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
            	    // InternalMoba.g:6346:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6346:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:6347:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:6347:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:6348:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:6351:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:6351:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6351:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:6351:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:6351:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:6352:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,106,FOLLOW_73); 

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
            	    // InternalMoba.g:6369:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:6369:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:6370:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:6370:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:6371:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:6374:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:6374:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6374:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:6374:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:6382:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:6383:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:6383:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:6384:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
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

            	    // InternalMoba.g:6401:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop108:
            	    do {
            	        int alt108=2;
            	        int LA108_0 = input.LA(1);

            	        if ( (LA108_0==36) ) {
            	            alt108=1;
            	        }


            	        switch (alt108) {
            	    	case 1 :
            	    	    // InternalMoba.g:6402:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,36,FOLLOW_30); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:6406:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:6407:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:6407:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:6408:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_21);
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
            	    	    break loop108;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,37,FOLLOW_73); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:6443:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:6444:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:6444:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:6445:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:6467:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:6468:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:6468:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:6469:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_79); 

            					newLeafNode(lv_name_14_0, grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

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

            // InternalMoba.g:6485:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:6486:4: ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:6486:4: ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) )
            // InternalMoba.g:6487:5: ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());
            				
            // InternalMoba.g:6490:5: ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* )
            // InternalMoba.g:6491:6: ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )*
            {
            // InternalMoba.g:6491:6: ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )*
            loop111:
            do {
                int alt111=3;
                int LA111_0 = input.LA(1);

                if ( LA111_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0) ) {
                    alt111=1;
                }
                else if ( LA111_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1) ) {
                    alt111=2;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalMoba.g:6492:4: ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:6492:4: ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:6493:5: {...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalMoba.g:6493:113: ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) )
            	    // InternalMoba.g:6494:6: ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalMoba.g:6497:9: ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) )
            	    // InternalMoba.g:6497:10: {...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6497:19: (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' )
            	    // InternalMoba.g:6497:20: otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')'
            	    {
            	    otherlv_16=(Token)match(input,94,FOLLOW_20); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMobaDtoAttributeAccess().getAliasKeyword_5_0_0());
            	    								
            	    otherlv_17=(Token)match(input,35,FOLLOW_5); 

            	    									newLeafNode(otherlv_17, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_5_0_1());
            	    								
            	    // InternalMoba.g:6505:9: ( (lv_alias_18_0= RULE_ID ) )
            	    // InternalMoba.g:6506:10: (lv_alias_18_0= RULE_ID )
            	    {
            	    // InternalMoba.g:6506:10: (lv_alias_18_0= RULE_ID )
            	    // InternalMoba.g:6507:11: lv_alias_18_0= RULE_ID
            	    {
            	    lv_alias_18_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    											newLeafNode(lv_alias_18_0, grammarAccess.getMobaDtoAttributeAccess().getAliasIDTerminalRuleCall_5_0_2_0());
            	    										

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

            	    otherlv_19=(Token)match(input,37,FOLLOW_79); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_5_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:6533:4: ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:6533:4: ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) )
            	    // InternalMoba.g:6534:5: {...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalMoba.g:6534:113: ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) )
            	    // InternalMoba.g:6535:6: ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalMoba.g:6538:9: ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) )
            	    // InternalMoba.g:6538:10: {...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:6538:19: (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' )
            	    // InternalMoba.g:6538:20: otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')'
            	    {
            	    otherlv_20=(Token)match(input,107,FOLLOW_20); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMobaDtoAttributeAccess().getFormatKeyword_5_1_0());
            	    								
            	    otherlv_21=(Token)match(input,35,FOLLOW_16); 

            	    									newLeafNode(otherlv_21, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_5_1_1());
            	    								
            	    // InternalMoba.g:6546:9: ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) )
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==RULE_STRING) ) {
            	        alt110=1;
            	    }
            	    else if ( (LA110_0==RULE_CONSTANT) ) {
            	        alt110=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 110, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // InternalMoba.g:6547:10: ( (lv_formatString_22_0= RULE_STRING ) )
            	            {
            	            // InternalMoba.g:6547:10: ( (lv_formatString_22_0= RULE_STRING ) )
            	            // InternalMoba.g:6548:11: (lv_formatString_22_0= RULE_STRING )
            	            {
            	            // InternalMoba.g:6548:11: (lv_formatString_22_0= RULE_STRING )
            	            // InternalMoba.g:6549:12: lv_formatString_22_0= RULE_STRING
            	            {
            	            lv_formatString_22_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	            												newLeafNode(lv_formatString_22_0, grammarAccess.getMobaDtoAttributeAccess().getFormatStringSTRINGTerminalRuleCall_5_1_2_0_0());
            	            											

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
            	            break;
            	        case 2 :
            	            // InternalMoba.g:6566:10: ( (otherlv_23= RULE_CONSTANT ) )
            	            {
            	            // InternalMoba.g:6566:10: ( (otherlv_23= RULE_CONSTANT ) )
            	            // InternalMoba.g:6567:11: (otherlv_23= RULE_CONSTANT )
            	            {
            	            // InternalMoba.g:6567:11: (otherlv_23= RULE_CONSTANT )
            	            // InternalMoba.g:6568:12: otherlv_23= RULE_CONSTANT
            	            {

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	            												}
            	            											
            	            otherlv_23=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

            	            												newLeafNode(otherlv_23, grammarAccess.getMobaDtoAttributeAccess().getFormatConstMobaConstantCrossReference_5_1_2_1_0());
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_24=(Token)match(input,37,FOLLOW_79); 

            	    									newLeafNode(otherlv_24, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_5_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());
            				

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_25=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_25;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalMoba.g:6612:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:6612:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:6613:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
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
    // InternalMoba.g:6619:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6625:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6626:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6626:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6627:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,110,FOLLOW_76); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:6631:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:6632:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:6632:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:6633:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:6636:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:6637:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:6637:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop112:
            do {
                int alt112=4;
                int LA112_0 = input.LA(1);

                if ( LA112_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt112=1;
                }
                else if ( LA112_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt112=2;
                }
                else if ( LA112_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt112=3;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalMoba.g:6638:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6638:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:6639:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:6639:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:6640:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:6643:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:6643:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:6643:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:6643:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:6643:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:6644:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,109,FOLLOW_76); 

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
            	    // InternalMoba.g:6661:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6661:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:6662:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:6662:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:6663:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:6666:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:6666:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:6666:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:6666:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:6666:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:6667:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,103,FOLLOW_76); 

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
            	    // InternalMoba.g:6684:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6684:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:6685:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:6685:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:6686:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:6689:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:6689:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:6689:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:6689:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:6689:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:6690:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,104,FOLLOW_76); 

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
            	    break loop112;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:6714:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:6715:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:6715:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:6716:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:6738:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:6739:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:6739:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:6740:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_80); 

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

            // InternalMoba.g:6756:3: (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==94) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalMoba.g:6757:4: otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,94,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getMobaDtoReferenceAccess().getAliasKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getMobaDtoReferenceAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMoba.g:6765:4: ( (lv_alias_10_0= RULE_ID ) )
                    // InternalMoba.g:6766:5: (lv_alias_10_0= RULE_ID )
                    {
                    // InternalMoba.g:6766:5: (lv_alias_10_0= RULE_ID )
                    // InternalMoba.g:6767:6: lv_alias_10_0= RULE_ID
                    {
                    lv_alias_10_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_alias_10_0, grammarAccess.getMobaDtoReferenceAccess().getAliasIDTerminalRuleCall_5_2_0());
                    					

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

                    otherlv_11=(Token)match(input,37,FOLLOW_77); 

                    				newLeafNode(otherlv_11, grammarAccess.getMobaDtoReferenceAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalMoba.g:6788:3: (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==111) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalMoba.g:6789:4: otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,111,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getMobaDtoReferenceAccess().getOppositeKeyword_6_0());
                    			
                    // InternalMoba.g:6793:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMoba.g:6794:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMoba.g:6794:5: (otherlv_13= RULE_ID )
                    // InternalMoba.g:6795:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_13, grammarAccess.getMobaDtoReferenceAccess().getOppositeMobaDtoReferenceCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaFriendsAbleParserRuleCall_7());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_14=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_14;
            			afterParserOrEnumRuleCall();
            		

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


    // $ANTLR start "entryRuleMobaDtoEmbeddable"
    // InternalMoba.g:6822:1: entryRuleMobaDtoEmbeddable returns [EObject current=null] : iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF ;
    public final EObject entryRuleMobaDtoEmbeddable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoEmbeddable = null;


        try {
            // InternalMoba.g:6822:58: (iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF )
            // InternalMoba.g:6823:2: iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF
            {
             newCompositeNode(grammarAccess.getMobaDtoEmbeddableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoEmbeddable=ruleMobaDtoEmbeddable();

            state._fsp--;

             current =iv_ruleMobaDtoEmbeddable; 
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
    // $ANTLR end "entryRuleMobaDtoEmbeddable"


    // $ANTLR start "ruleMobaDtoEmbeddable"
    // InternalMoba.g:6829:1: ruleMobaDtoEmbeddable returns [EObject current=null] : (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6835:2: ( (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6836:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6836:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6837:3: otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,112,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoEmbeddableAccess().getEmbedKeyword_0());
            		
            // InternalMoba.g:6841:3: ( (lv_transient_1_0= 'transient' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==104) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalMoba.g:6842:4: (lv_transient_1_0= 'transient' )
                    {
                    // InternalMoba.g:6842:4: (lv_transient_1_0= 'transient' )
                    // InternalMoba.g:6843:5: lv_transient_1_0= 'transient'
                    {
                    lv_transient_1_0=(Token)match(input,104,FOLLOW_5); 

                    					newLeafNode(lv_transient_1_0, grammarAccess.getMobaDtoEmbeddableAccess().getTransientTransientKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalMoba.g:6855:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:6856:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:6856:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:6857:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(otherlv_2, grammarAccess.getMobaDtoEmbeddableAccess().getTypeMobaDtoCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoEmbeddableAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_MobaMultiplicityAble_3=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:6879:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMoba.g:6880:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMoba.g:6880:4: (lv_name_4_0= RULE_ID )
            // InternalMoba.g:6881:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_81); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMobaDtoEmbeddableAccess().getNameIDTerminalRuleCall_4_0());
            				

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

            // InternalMoba.g:6897:3: (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==94) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalMoba.g:6898:4: otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getMobaDtoEmbeddableAccess().getAliasKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMobaDtoEmbeddableAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMoba.g:6906:4: ( (lv_alias_7_0= RULE_ID ) )
                    // InternalMoba.g:6907:5: (lv_alias_7_0= RULE_ID )
                    {
                    // InternalMoba.g:6907:5: (lv_alias_7_0= RULE_ID )
                    // InternalMoba.g:6908:6: lv_alias_7_0= RULE_ID
                    {
                    lv_alias_7_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_alias_7_0, grammarAccess.getMobaDtoEmbeddableAccess().getAliasIDTerminalRuleCall_5_2_0());
                    					

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

                    otherlv_8=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getMobaDtoEmbeddableAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoEmbeddableAccess().getMobaFriendsAbleParserRuleCall_6());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_9=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_9;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaDtoEmbeddable"


    // $ANTLR start "entryRuleMobaQueueFeature"
    // InternalMoba.g:6944:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:6944:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:6945:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
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
    // InternalMoba.g:6951:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6957:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:6958:2: this_MobaQueueReference_0= ruleMobaQueueReference
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
    // InternalMoba.g:6969:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:6969:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:6970:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
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
    // InternalMoba.g:6976:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) this_MobaFriendsAble_3= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject this_MobaFriendsAble_3 = null;



        	enterRule();

        try {
            // InternalMoba.g:6982:2: ( (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) this_MobaFriendsAble_3= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6983:2: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) this_MobaFriendsAble_3= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6983:2: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) this_MobaFriendsAble_3= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6984:3: otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) this_MobaFriendsAble_3= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,110,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:6988:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:6989:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:6989:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:6990:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaQueueReferenceAccess().getRestServiceMobaRESTCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:7001:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:7002:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:7002:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:7003:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaQueueReferenceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaQueueReferenceAccess().getMobaFriendsAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_3=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_3;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalMoba.g:7034:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:7034:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:7035:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
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
    // InternalMoba.g:7041:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:7047:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:7048:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:7048:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:7049:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_82); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:7053:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:7054:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:7054:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:7055:5: lv_lower_1_0= ruleMobaLowerBound
            {

            					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_83);
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

            // InternalMoba.g:7072:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==113) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalMoba.g:7073:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,113,FOLLOW_84); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalMoba.g:7077:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:7078:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:7078:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:7079:6: lv_upper_3_0= ruleMobaUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_85);
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

            otherlv_4=(Token)match(input,68,FOLLOW_2); 

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
    // InternalMoba.g:7105:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:7105:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:7106:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
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
    // InternalMoba.g:7112:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:7118:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:7119:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:7119:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt118=8;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt118=1;
                }
                break;
            case 115:
                {
                alt118=2;
                }
                break;
            case 116:
                {
                alt118=3;
                }
                break;
            case 117:
                {
                alt118=4;
                }
                break;
            case 118:
                {
                alt118=5;
                }
                break;
            case 119:
                {
                alt118=6;
                }
                break;
            case 120:
                {
                alt118=7;
                }
                break;
            case 121:
                {
                alt118=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalMoba.g:7120:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
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
                    // InternalMoba.g:7129:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
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
                    // InternalMoba.g:7138:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
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
                    // InternalMoba.g:7147:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
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
                    // InternalMoba.g:7156:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
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
                    // InternalMoba.g:7165:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
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
                    // InternalMoba.g:7174:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
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
                    // InternalMoba.g:7183:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
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
    // InternalMoba.g:7195:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:7195:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:7196:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
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
    // InternalMoba.g:7202:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7208:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:7209:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:7209:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:7210:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:7218:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_STRING) ) {
                alt119=1;
            }
            else if ( (LA119_0==RULE_CONSTANT) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalMoba.g:7219:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:7219:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:7220:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:7220:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:7221:6: lv_filterString_2_0= RULE_STRING
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
                    							"org.mobadsl.grammar.Moba.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7238:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7238:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:7239:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7239:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:7240:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRegexpConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

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
    // InternalMoba.g:7256:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:7256:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:7257:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
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
    // InternalMoba.g:7263:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7269:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:7270:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:7270:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:7271:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_86); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:7279:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_DOUBLE) ) {
                alt120=1;
            }
            else if ( (LA120_0==RULE_CONSTANT) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalMoba.g:7280:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:7280:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:7281:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:7281:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:7282:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:7299:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7299:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:7300:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7300:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:7301:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

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
    // InternalMoba.g:7317:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:7317:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:7318:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
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
    // InternalMoba.g:7324:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7330:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:7331:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:7331:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:7332:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,116,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_86); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:7340:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_DOUBLE) ) {
                alt121=1;
            }
            else if ( (LA121_0==RULE_CONSTANT) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalMoba.g:7341:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:7341:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:7342:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:7342:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:7343:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:7360:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7360:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:7361:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7361:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:7362:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

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
    // InternalMoba.g:7378:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:7378:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:7379:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
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
    // InternalMoba.g:7385:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7391:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:7392:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:7392:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:7393:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,117,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:7401:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_INT) ) {
                alt122=1;
            }
            else if ( (LA122_0==RULE_CONSTANT) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalMoba.g:7402:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:7402:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:7403:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:7403:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:7404:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:7421:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7421:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:7422:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7422:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:7423:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinLengthConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

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
    // InternalMoba.g:7439:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:7439:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:7440:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
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
    // InternalMoba.g:7446:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7452:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:7453:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:7453:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:7454:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,118,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:7462:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_INT) ) {
                alt123=1;
            }
            else if ( (LA123_0==RULE_CONSTANT) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalMoba.g:7463:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:7463:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:7464:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:7464:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:7465:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:7482:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7482:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:7483:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7483:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:7484:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxLengthConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); 

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
    // InternalMoba.g:7500:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:7500:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:7501:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
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
    // InternalMoba.g:7507:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:7513:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:7514:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:7514:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            // InternalMoba.g:7515:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoba.g:7523:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_INT) ) {
                alt124=1;
            }
            else if ( (LA124_0==RULE_CONSTANT) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalMoba.g:7524:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:7524:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:7525:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:7525:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:7526:6: lv_filterIntegerValue_2_0= RULE_INT
                    {
                    lv_filterIntegerValue_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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
                    // InternalMoba.g:7543:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7543:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:7544:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7544:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:7545:6: otherlv_3= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_35); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_51); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
            		
            // InternalMoba.g:7561:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_INT) ) {
                alt125=1;
            }
            else if ( (LA125_0==RULE_CONSTANT) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalMoba.g:7562:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:7562:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:7563:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:7563:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:7564:6: lv_filterFractionValue_5_0= RULE_INT
                    {
                    lv_filterFractionValue_5_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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
                    // InternalMoba.g:7581:4: ( (otherlv_6= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:7581:4: ( (otherlv_6= RULE_CONSTANT ) )
                    // InternalMoba.g:7582:5: (otherlv_6= RULE_CONSTANT )
                    {
                    // InternalMoba.g:7582:5: (otherlv_6= RULE_CONSTANT )
                    // InternalMoba.g:7583:6: otherlv_6= RULE_CONSTANT
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_CONSTANT,FOLLOW_32); 

                    						newLeafNode(otherlv_6, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstMobaConstantCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,37,FOLLOW_2); 

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
    // InternalMoba.g:7603:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:7603:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:7604:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
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
    // InternalMoba.g:7610:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7616:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:7617:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:7617:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:7618:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:7618:3: ()
            // InternalMoba.g:7619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_2); 

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
    // InternalMoba.g:7633:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:7633:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:7634:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
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
    // InternalMoba.g:7640:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7646:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:7647:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:7647:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:7648:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:7648:3: ()
            // InternalMoba.g:7649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,121,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMobaGeneratorSlot"
    // InternalMoba.g:7663:1: entryRuleMobaGeneratorSlot returns [EObject current=null] : iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF ;
    public final EObject entryRuleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorSlot = null;


        try {
            // InternalMoba.g:7663:58: (iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF )
            // InternalMoba.g:7664:2: iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF
            {
             newCompositeNode(grammarAccess.getMobaGeneratorSlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorSlot=ruleMobaGeneratorSlot();

            state._fsp--;

             current =iv_ruleMobaGeneratorSlot; 
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
    // $ANTLR end "entryRuleMobaGeneratorSlot"


    // $ANTLR start "ruleMobaGeneratorSlot"
    // InternalMoba.g:7670:1: ruleMobaGeneratorSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7676:2: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) )
            // InternalMoba.g:7677:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            {
            // InternalMoba.g:7677:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            // InternalMoba.g:7678:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,122,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorSlotAccess().getSlotKeyword_0());
            		
            // InternalMoba.g:7682:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7683:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7683:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7684:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaGeneratorSlotAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMoba.g:7700:3: (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==70) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMoba.g:7701:4: otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorSlotAccess().getTypeKeyword_2_0());
                    			
                    // InternalMoba.g:7705:4: ( (lv_type_3_0= RULE_STRING ) )
                    // InternalMoba.g:7706:5: (lv_type_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:7706:5: (lv_type_3_0= RULE_STRING )
                    // InternalMoba.g:7707:6: lv_type_3_0= RULE_STRING
                    {
                    lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getMobaGeneratorSlotAccess().getTypeSTRINGTerminalRuleCall_2_1_0());
                    					

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
    // $ANTLR end "ruleMobaGeneratorSlot"


    // $ANTLR start "entryRuleMobaTrigger"
    // InternalMoba.g:7728:1: entryRuleMobaTrigger returns [EObject current=null] : iv_ruleMobaTrigger= ruleMobaTrigger EOF ;
    public final EObject entryRuleMobaTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTrigger = null;


        try {
            // InternalMoba.g:7728:52: (iv_ruleMobaTrigger= ruleMobaTrigger EOF )
            // InternalMoba.g:7729:2: iv_ruleMobaTrigger= ruleMobaTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaTrigger=ruleMobaTrigger();

            state._fsp--;

             current =iv_ruleMobaTrigger; 
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
    // $ANTLR end "entryRuleMobaTrigger"


    // $ANTLR start "ruleMobaTrigger"
    // InternalMoba.g:7735:1: ruleMobaTrigger returns [EObject current=null] : (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) ;
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
            // InternalMoba.g:7741:2: ( (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) )
            // InternalMoba.g:7742:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            {
            // InternalMoba.g:7742:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            int alt127=7;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt127=1;
                }
                break;
            case 124:
                {
                alt127=2;
                }
                break;
            case 125:
                {
                alt127=3;
                }
                break;
            case 126:
                {
                alt127=4;
                }
                break;
            case 127:
                {
                alt127=5;
                }
                break;
            case 128:
                {
                alt127=6;
                }
                break;
            case 129:
                {
                alt127=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalMoba.g:7743:3: this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaAppInstallTriggerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaAppInstallTrigger_0=ruleMobaAppInstallTrigger();

                    state._fsp--;


                    			current = this_MobaAppInstallTrigger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:7752:3: this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaAppUpdateTriggerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaAppUpdateTrigger_1=ruleMobaAppUpdateTrigger();

                    state._fsp--;


                    			current = this_MobaAppUpdateTrigger_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:7761:3: this_MobaEmailTrigger_2= ruleMobaEmailTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaEmailTriggerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaEmailTrigger_2=ruleMobaEmailTrigger();

                    state._fsp--;


                    			current = this_MobaEmailTrigger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoba.g:7770:3: this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaDeviceStartupTriggerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDeviceStartupTrigger_3=ruleMobaDeviceStartupTrigger();

                    state._fsp--;


                    			current = this_MobaDeviceStartupTrigger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoba.g:7779:3: this_MobaSMSTrigger_4= ruleMobaSMSTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaSMSTriggerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaSMSTrigger_4=ruleMobaSMSTrigger();

                    state._fsp--;


                    			current = this_MobaSMSTrigger_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMoba.g:7788:3: this_MobaPushTrigger_5= ruleMobaPushTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaPushTriggerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaPushTrigger_5=ruleMobaPushTrigger();

                    state._fsp--;


                    			current = this_MobaPushTrigger_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMoba.g:7797:3: this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger
                    {

                    			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaGeofenceTriggerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaGeofenceTrigger_6=ruleMobaGeofenceTrigger();

                    state._fsp--;


                    			current = this_MobaGeofenceTrigger_6;
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
    // $ANTLR end "ruleMobaTrigger"


    // $ANTLR start "entryRuleMobaAppInstallTrigger"
    // InternalMoba.g:7809:1: entryRuleMobaAppInstallTrigger returns [EObject current=null] : iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF ;
    public final EObject entryRuleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppInstallTrigger = null;


        try {
            // InternalMoba.g:7809:62: (iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF )
            // InternalMoba.g:7810:2: iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaAppInstallTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaAppInstallTrigger=ruleMobaAppInstallTrigger();

            state._fsp--;

             current =iv_ruleMobaAppInstallTrigger; 
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
    // $ANTLR end "entryRuleMobaAppInstallTrigger"


    // $ANTLR start "ruleMobaAppInstallTrigger"
    // InternalMoba.g:7816:1: ruleMobaAppInstallTrigger returns [EObject current=null] : (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7822:2: ( (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7823:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7823:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7824:3: otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,123,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaAppInstallTriggerAccess().getTriggerAppInstallKeyword_0());
            		
            // InternalMoba.g:7828:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7829:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7829:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7830:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaAppInstallTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMobaAppInstallTrigger"


    // $ANTLR start "entryRuleMobaAppUpdateTrigger"
    // InternalMoba.g:7850:1: entryRuleMobaAppUpdateTrigger returns [EObject current=null] : iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF ;
    public final EObject entryRuleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppUpdateTrigger = null;


        try {
            // InternalMoba.g:7850:61: (iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF )
            // InternalMoba.g:7851:2: iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaAppUpdateTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaAppUpdateTrigger=ruleMobaAppUpdateTrigger();

            state._fsp--;

             current =iv_ruleMobaAppUpdateTrigger; 
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
    // $ANTLR end "entryRuleMobaAppUpdateTrigger"


    // $ANTLR start "ruleMobaAppUpdateTrigger"
    // InternalMoba.g:7857:1: ruleMobaAppUpdateTrigger returns [EObject current=null] : (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7863:2: ( (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7864:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7864:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7865:3: otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaAppUpdateTriggerAccess().getTriggerAppUpdateKeyword_0());
            		
            // InternalMoba.g:7869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7870:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7871:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaAppUpdateTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMobaAppUpdateTrigger"


    // $ANTLR start "entryRuleMobaEmailTrigger"
    // InternalMoba.g:7891:1: entryRuleMobaEmailTrigger returns [EObject current=null] : iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF ;
    public final EObject entryRuleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEmailTrigger = null;


        try {
            // InternalMoba.g:7891:57: (iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF )
            // InternalMoba.g:7892:2: iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaEmailTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEmailTrigger=ruleMobaEmailTrigger();

            state._fsp--;

             current =iv_ruleMobaEmailTrigger; 
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
    // $ANTLR end "entryRuleMobaEmailTrigger"


    // $ANTLR start "ruleMobaEmailTrigger"
    // InternalMoba.g:7898:1: ruleMobaEmailTrigger returns [EObject current=null] : (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7904:2: ( (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7905:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7905:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7906:3: otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEmailTriggerAccess().getTriggerEmailKeyword_0());
            		
            // InternalMoba.g:7910:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7911:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7911:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7912:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEmailTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMobaEmailTrigger"


    // $ANTLR start "entryRuleMobaDeviceStartupTrigger"
    // InternalMoba.g:7932:1: entryRuleMobaDeviceStartupTrigger returns [EObject current=null] : iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF ;
    public final EObject entryRuleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDeviceStartupTrigger = null;


        try {
            // InternalMoba.g:7932:65: (iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF )
            // InternalMoba.g:7933:2: iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaDeviceStartupTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDeviceStartupTrigger=ruleMobaDeviceStartupTrigger();

            state._fsp--;

             current =iv_ruleMobaDeviceStartupTrigger; 
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
    // $ANTLR end "entryRuleMobaDeviceStartupTrigger"


    // $ANTLR start "ruleMobaDeviceStartupTrigger"
    // InternalMoba.g:7939:1: ruleMobaDeviceStartupTrigger returns [EObject current=null] : (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7945:2: ( (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7946:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7946:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7947:3: otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,126,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDeviceStartupTriggerAccess().getTriggerDeviceStartKeyword_0());
            		
            // InternalMoba.g:7951:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7952:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7952:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7953:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaDeviceStartupTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMobaDeviceStartupTrigger"


    // $ANTLR start "entryRuleMobaSMSTrigger"
    // InternalMoba.g:7973:1: entryRuleMobaSMSTrigger returns [EObject current=null] : iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF ;
    public final EObject entryRuleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSMSTrigger = null;


        try {
            // InternalMoba.g:7973:55: (iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF )
            // InternalMoba.g:7974:2: iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaSMSTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaSMSTrigger=ruleMobaSMSTrigger();

            state._fsp--;

             current =iv_ruleMobaSMSTrigger; 
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
    // $ANTLR end "entryRuleMobaSMSTrigger"


    // $ANTLR start "ruleMobaSMSTrigger"
    // InternalMoba.g:7980:1: ruleMobaSMSTrigger returns [EObject current=null] : (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7986:2: ( (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7987:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7987:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7988:3: otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSMSTriggerAccess().getTriggerSmsKeyword_0());
            		
            // InternalMoba.g:7992:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7993:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7993:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7994:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaSMSTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMobaSMSTrigger"


    // $ANTLR start "entryRuleMobaPushTrigger"
    // InternalMoba.g:8014:1: entryRuleMobaPushTrigger returns [EObject current=null] : iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF ;
    public final EObject entryRuleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushTrigger = null;


        try {
            // InternalMoba.g:8014:56: (iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF )
            // InternalMoba.g:8015:2: iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaPushTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPushTrigger=ruleMobaPushTrigger();

            state._fsp--;

             current =iv_ruleMobaPushTrigger; 
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
    // $ANTLR end "entryRuleMobaPushTrigger"


    // $ANTLR start "ruleMobaPushTrigger"
    // InternalMoba.g:8021:1: ruleMobaPushTrigger returns [EObject current=null] : (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:8027:2: ( (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:8028:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:8028:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:8029:3: otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,128,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPushTriggerAccess().getTriggerPushKeyword_0());
            		
            // InternalMoba.g:8033:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:8034:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:8034:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:8035:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaPushTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMobaPushTrigger"


    // $ANTLR start "entryRuleMobaGeofenceTrigger"
    // InternalMoba.g:8055:1: entryRuleMobaGeofenceTrigger returns [EObject current=null] : iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF ;
    public final EObject entryRuleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeofenceTrigger = null;


        try {
            // InternalMoba.g:8055:60: (iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF )
            // InternalMoba.g:8056:2: iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF
            {
             newCompositeNode(grammarAccess.getMobaGeofenceTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeofenceTrigger=ruleMobaGeofenceTrigger();

            state._fsp--;

             current =iv_ruleMobaGeofenceTrigger; 
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
    // $ANTLR end "entryRuleMobaGeofenceTrigger"


    // $ANTLR start "ruleMobaGeofenceTrigger"
    // InternalMoba.g:8062:1: ruleMobaGeofenceTrigger returns [EObject current=null] : (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) ;
    public final EObject ruleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_eventType_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:8068:2: ( (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) )
            // InternalMoba.g:8069:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            {
            // InternalMoba.g:8069:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            // InternalMoba.g:8070:3: otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            {
            otherlv_0=(Token)match(input,129,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeofenceTriggerAccess().getTriggerGeofenceKeyword_0());
            		
            // InternalMoba.g:8074:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:8075:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:8075:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:8076:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_88); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaGeofenceTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,130,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaGeofenceTriggerAccess().getEventKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_89); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaGeofenceTriggerAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:8100:3: ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            // InternalMoba.g:8101:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            {
            // InternalMoba.g:8101:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            // InternalMoba.g:8102:5: lv_eventType_4_0= ruleMobaGeofenceEvent
            {

            					newCompositeNode(grammarAccess.getMobaGeofenceTriggerAccess().getEventTypeMobaGeofenceEventEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_eventType_4_0=ruleMobaGeofenceEvent();

            state._fsp--;


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
    // $ANTLR end "ruleMobaGeofenceTrigger"


    // $ANTLR start "entryRuleMobaExternalModule"
    // InternalMoba.g:8123:1: entryRuleMobaExternalModule returns [EObject current=null] : iv_ruleMobaExternalModule= ruleMobaExternalModule EOF ;
    public final EObject entryRuleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaExternalModule = null;


        try {
            // InternalMoba.g:8123:59: (iv_ruleMobaExternalModule= ruleMobaExternalModule EOF )
            // InternalMoba.g:8124:2: iv_ruleMobaExternalModule= ruleMobaExternalModule EOF
            {
             newCompositeNode(grammarAccess.getMobaExternalModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaExternalModule=ruleMobaExternalModule();

            state._fsp--;

             current =iv_ruleMobaExternalModule; 
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
    // $ANTLR end "entryRuleMobaExternalModule"


    // $ANTLR start "ruleMobaExternalModule"
    // InternalMoba.g:8130:1: ruleMobaExternalModule returns [EObject current=null] : (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) ;
    public final EObject ruleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject this_MobaBluetoothModule_0 = null;

        EObject this_MobaPushModule_1 = null;

        EObject this_MobaNFCModule_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:8136:2: ( (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) )
            // InternalMoba.g:8137:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            {
            // InternalMoba.g:8137:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            int alt128=3;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt128=1;
                }
                break;
            case 132:
                {
                alt128=2;
                }
                break;
            case 133:
                {
                alt128=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // InternalMoba.g:8138:3: this_MobaBluetoothModule_0= ruleMobaBluetoothModule
                    {

                    			newCompositeNode(grammarAccess.getMobaExternalModuleAccess().getMobaBluetoothModuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaBluetoothModule_0=ruleMobaBluetoothModule();

                    state._fsp--;


                    			current = this_MobaBluetoothModule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:8147:3: this_MobaPushModule_1= ruleMobaPushModule
                    {

                    			newCompositeNode(grammarAccess.getMobaExternalModuleAccess().getMobaPushModuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaPushModule_1=ruleMobaPushModule();

                    state._fsp--;


                    			current = this_MobaPushModule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:8156:3: this_MobaNFCModule_2= ruleMobaNFCModule
                    {

                    			newCompositeNode(grammarAccess.getMobaExternalModuleAccess().getMobaNFCModuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaNFCModule_2=ruleMobaNFCModule();

                    state._fsp--;


                    			current = this_MobaNFCModule_2;
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
    // $ANTLR end "ruleMobaExternalModule"


    // $ANTLR start "entryRuleMobaBluetoothModule"
    // InternalMoba.g:8168:1: entryRuleMobaBluetoothModule returns [EObject current=null] : iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF ;
    public final EObject entryRuleMobaBluetoothModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBluetoothModule = null;


        try {
            // InternalMoba.g:8168:60: (iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF )
            // InternalMoba.g:8169:2: iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF
            {
             newCompositeNode(grammarAccess.getMobaBluetoothModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaBluetoothModule=ruleMobaBluetoothModule();

            state._fsp--;

             current =iv_ruleMobaBluetoothModule; 
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
    // $ANTLR end "entryRuleMobaBluetoothModule"


    // $ANTLR start "ruleMobaBluetoothModule"
    // InternalMoba.g:8175:1: ruleMobaBluetoothModule returns [EObject current=null] : (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:8181:2: ( (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:8182:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:8182:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:8183:3: otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,131,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaBluetoothModuleAccess().getModuleBluetoothKeyword_0());
            		
            // InternalMoba.g:8187:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:8188:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:8188:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:8189:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_90); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaBluetoothModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,70,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaBluetoothModuleAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_91); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaBluetoothModuleAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:8213:3: ( (lv_type_4_0= ruleMobaBlueToothModuleType ) )
            // InternalMoba.g:8214:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            {
            // InternalMoba.g:8214:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            // InternalMoba.g:8215:5: lv_type_4_0= ruleMobaBlueToothModuleType
            {

            					newCompositeNode(grammarAccess.getMobaBluetoothModuleAccess().getTypeMobaBlueToothModuleTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_type_4_0=ruleMobaBlueToothModuleType();

            state._fsp--;


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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaBluetoothModuleRule());
            			}
            			newCompositeNode(grammarAccess.getMobaBluetoothModuleAccess().getMobaFriendsAbleParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_5;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaBluetoothModule"


    // $ANTLR start "entryRuleMobaPushModule"
    // InternalMoba.g:8247:1: entryRuleMobaPushModule returns [EObject current=null] : iv_ruleMobaPushModule= ruleMobaPushModule EOF ;
    public final EObject entryRuleMobaPushModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushModule = null;


        try {
            // InternalMoba.g:8247:55: (iv_ruleMobaPushModule= ruleMobaPushModule EOF )
            // InternalMoba.g:8248:2: iv_ruleMobaPushModule= ruleMobaPushModule EOF
            {
             newCompositeNode(grammarAccess.getMobaPushModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPushModule=ruleMobaPushModule();

            state._fsp--;

             current =iv_ruleMobaPushModule; 
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
    // $ANTLR end "entryRuleMobaPushModule"


    // $ANTLR start "ruleMobaPushModule"
    // InternalMoba.g:8254:1: ruleMobaPushModule returns [EObject current=null] : (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaPushModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:8260:2: ( (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:8261:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:8261:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:8262:3: otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,132,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPushModuleAccess().getModulePushKeyword_0());
            		
            // InternalMoba.g:8266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:8267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:8267:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:8268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaPushModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaPushModuleRule());
            			}
            			newCompositeNode(grammarAccess.getMobaPushModuleAccess().getMobaFriendsAbleParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_2=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaPushModule"


    // $ANTLR start "entryRuleMobaNFCModule"
    // InternalMoba.g:8299:1: entryRuleMobaNFCModule returns [EObject current=null] : iv_ruleMobaNFCModule= ruleMobaNFCModule EOF ;
    public final EObject entryRuleMobaNFCModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNFCModule = null;


        try {
            // InternalMoba.g:8299:54: (iv_ruleMobaNFCModule= ruleMobaNFCModule EOF )
            // InternalMoba.g:8300:2: iv_ruleMobaNFCModule= ruleMobaNFCModule EOF
            {
             newCompositeNode(grammarAccess.getMobaNFCModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaNFCModule=ruleMobaNFCModule();

            state._fsp--;

             current =iv_ruleMobaNFCModule; 
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
    // $ANTLR end "entryRuleMobaNFCModule"


    // $ANTLR start "ruleMobaNFCModule"
    // InternalMoba.g:8306:1: ruleMobaNFCModule returns [EObject current=null] : (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:8312:2: ( (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:8313:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:8313:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:8314:3: otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,133,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaNFCModuleAccess().getModuleNFCKeyword_0());
            		
            // InternalMoba.g:8318:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:8319:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:8319:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:8320:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_90); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaNFCModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,70,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaNFCModuleAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaNFCModuleAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:8344:3: ( (lv_type_4_0= ruleMobaNFCModuleType ) )
            // InternalMoba.g:8345:4: (lv_type_4_0= ruleMobaNFCModuleType )
            {
            // InternalMoba.g:8345:4: (lv_type_4_0= ruleMobaNFCModuleType )
            // InternalMoba.g:8346:5: lv_type_4_0= ruleMobaNFCModuleType
            {

            					newCompositeNode(grammarAccess.getMobaNFCModuleAccess().getTypeMobaNFCModuleTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_type_4_0=ruleMobaNFCModuleType();

            state._fsp--;


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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaNFCModuleRule());
            			}
            			newCompositeNode(grammarAccess.getMobaNFCModuleAccess().getMobaFriendsAbleParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;


            			current = this_MobaFriendsAble_5;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleMobaNFCModule"


    // $ANTLR start "ruleMobaConstantValueFunction"
    // InternalMoba.g:8378:1: ruleMobaConstantValueFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) ;
    public final Enumerator ruleMobaConstantValueFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:8384:2: ( ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) )
            // InternalMoba.g:8385:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            {
            // InternalMoba.g:8385:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            int alt129=4;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt129=1;
                }
                break;
            case 135:
                {
                alt129=2;
                }
                break;
            case 136:
                {
                alt129=3;
                }
                break;
            case 137:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // InternalMoba.g:8386:3: (enumLiteral_0= 'toFirstLower' )
                    {
                    // InternalMoba.g:8386:3: (enumLiteral_0= 'toFirstLower' )
                    // InternalMoba.g:8387:4: enumLiteral_0= 'toFirstLower'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8394:3: (enumLiteral_1= 'toFirstUpper' )
                    {
                    // InternalMoba.g:8394:3: (enumLiteral_1= 'toFirstUpper' )
                    // InternalMoba.g:8395:4: enumLiteral_1= 'toFirstUpper'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:8402:3: (enumLiteral_2= 'toLowerCase' )
                    {
                    // InternalMoba.g:8402:3: (enumLiteral_2= 'toLowerCase' )
                    // InternalMoba.g:8403:4: enumLiteral_2= 'toLowerCase'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:8410:3: (enumLiteral_3= 'toUpperCase' )
                    {
                    // InternalMoba.g:8410:3: (enumLiteral_3= 'toUpperCase' )
                    // InternalMoba.g:8411:4: enumLiteral_3= 'toUpperCase'
                    {
                    enumLiteral_3=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_UPPER_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaConstantValueFunctionAccess().getTO_UPPER_CASEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleMobaConstantValueFunction"


    // $ANTLR start "ruleMobaGeofenceEvent"
    // InternalMoba.g:8421:1: ruleMobaGeofenceEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) ;
    public final Enumerator ruleMobaGeofenceEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:8427:2: ( ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) )
            // InternalMoba.g:8428:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            {
            // InternalMoba.g:8428:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==138) ) {
                alt130=1;
            }
            else if ( (LA130_0==139) ) {
                alt130=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalMoba.g:8429:3: (enumLiteral_0= 'enter' )
                    {
                    // InternalMoba.g:8429:3: (enumLiteral_0= 'enter' )
                    // InternalMoba.g:8430:4: enumLiteral_0= 'enter'
                    {
                    enumLiteral_0=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8437:3: (enumLiteral_1= 'leave' )
                    {
                    // InternalMoba.g:8437:3: (enumLiteral_1= 'leave' )
                    // InternalMoba.g:8438:4: enumLiteral_1= 'leave'
                    {
                    enumLiteral_1=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getMobaGeofenceEventAccess().getLEAVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaGeofenceEventAccess().getLEAVEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMobaGeofenceEvent"


    // $ANTLR start "ruleMobaBlueToothModuleType"
    // InternalMoba.g:8448:1: ruleMobaBlueToothModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) ;
    public final Enumerator ruleMobaBlueToothModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:8454:2: ( ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) )
            // InternalMoba.g:8455:2: ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            {
            // InternalMoba.g:8455:2: ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            int alt131=3;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt131=1;
                }
                break;
            case 141:
                {
                alt131=2;
                }
                break;
            case 142:
                {
                alt131=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalMoba.g:8456:3: (enumLiteral_0= 'lowEnergy' )
                    {
                    // InternalMoba.g:8456:3: (enumLiteral_0= 'lowEnergy' )
                    // InternalMoba.g:8457:4: enumLiteral_0= 'lowEnergy'
                    {
                    enumLiteral_0=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8464:3: (enumLiteral_1= 'spp' )
                    {
                    // InternalMoba.g:8464:3: (enumLiteral_1= 'spp' )
                    // InternalMoba.g:8465:4: enumLiteral_1= 'spp'
                    {
                    enumLiteral_1=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:8472:3: (enumLiteral_2= 'beacon' )
                    {
                    // InternalMoba.g:8472:3: (enumLiteral_2= 'beacon' )
                    // InternalMoba.g:8473:4: enumLiteral_2= 'beacon'
                    {
                    enumLiteral_2=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getBEACONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaBlueToothModuleTypeAccess().getBEACONEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMobaBlueToothModuleType"


    // $ANTLR start "ruleMobaNFCModuleType"
    // InternalMoba.g:8483:1: ruleMobaNFCModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) ;
    public final Enumerator ruleMobaNFCModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:8489:2: ( ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) )
            // InternalMoba.g:8490:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            {
            // InternalMoba.g:8490:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            int alt132=3;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt132=1;
                }
                break;
            case 144:
                {
                alt132=2;
                }
                break;
            case 145:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalMoba.g:8491:3: (enumLiteral_0= 'id' )
                    {
                    // InternalMoba.g:8491:3: (enumLiteral_0= 'id' )
                    // InternalMoba.g:8492:4: enumLiteral_0= 'id'
                    {
                    enumLiteral_0=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8499:3: (enumLiteral_1= 'custom' )
                    {
                    // InternalMoba.g:8499:3: (enumLiteral_1= 'custom' )
                    // InternalMoba.g:8500:4: enumLiteral_1= 'custom'
                    {
                    enumLiteral_1=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:8507:3: (enumLiteral_2= 'text' )
                    {
                    // InternalMoba.g:8507:3: (enumLiteral_2= 'text' )
                    // InternalMoba.g:8508:4: enumLiteral_2= 'text'
                    {
                    enumLiteral_2=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getMobaNFCModuleTypeAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaNFCModuleTypeAccess().getTEXTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMobaNFCModuleType"


    // $ANTLR start "ruleMobaLowerBound"
    // InternalMoba.g:8518:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:8524:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:8525:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:8525:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt133=5;
            switch ( input.LA(1) ) {
            case 146:
                {
                alt133=1;
                }
                break;
            case 147:
                {
                alt133=2;
                }
                break;
            case 148:
                {
                alt133=3;
                }
                break;
            case 65:
                {
                alt133=4;
                }
                break;
            case 149:
                {
                alt133=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // InternalMoba.g:8526:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:8526:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:8527:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8534:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:8534:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:8535:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:8542:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:8542:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:8543:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:8550:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:8550:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:8551:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:8558:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:8558:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:8559:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,149,FOLLOW_2); 

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
    // InternalMoba.g:8569:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:8575:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:8576:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:8576:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==146) ) {
                alt134=1;
            }
            else if ( (LA134_0==149) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // InternalMoba.g:8577:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:8577:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:8578:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8585:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:8585:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:8586:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,149,FOLLOW_2); 

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


    // $ANTLR start "ruleMobaRESTMethods"
    // InternalMoba.g:8596:1: ruleMobaRESTMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMobaRESTMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:8602:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMoba.g:8603:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMoba.g:8603:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt135=4;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt135=1;
                }
                break;
            case 151:
                {
                alt135=2;
                }
                break;
            case 152:
                {
                alt135=3;
                }
                break;
            case 153:
                {
                alt135=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalMoba.g:8604:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMoba.g:8604:3: (enumLiteral_0= 'GET' )
                    // InternalMoba.g:8605:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:8612:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMoba.g:8612:3: (enumLiteral_1= 'POST' )
                    // InternalMoba.g:8613:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:8620:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMoba.g:8620:3: (enumLiteral_2= 'PUT' )
                    // InternalMoba.g:8621:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:8628:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMoba.g:8628:3: (enumLiteral_3= 'DELETE' )
                    // InternalMoba.g:8629:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,153,FOLLOW_2); 

                    				current = grammarAccess.getMobaRESTMethodsAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaRESTMethodsAccess().getDELETEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleMobaRESTMethods"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\32\1\uffff\34\0\1\uffff";
    static final String dfa_3s = "\1\u0085\1\uffff\34\0\1\uffff";
    static final String dfa_4s = "\1\uffff\1\2\34\uffff\1\1";
    static final String dfa_5s = "\2\uffff\1\17\1\20\1\15\1\7\1\2\1\11\1\12\1\13\1\31\1\16\1\10\1\23\1\32\1\24\1\33\1\25\1\21\1\3\1\26\1\4\1\27\1\5\1\30\1\6\1\0\1\1\1\22\1\14\1\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\35\1\1\1\33\2\uffff\1\16\4\uffff\1\3\1\5\1\15\3\uffff\1\17\1\34\1\2\20\uffff\1\4\5\uffff\1\6\4\uffff\1\7\2\uffff\1\10\1\uffff\1\11\1\12\22\uffff\1\13\1\14\25\uffff\1\32\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\uffff\1\20\1\21\1\22",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()+ loopback of 473:9: ({...}? => ( (lv_features_13_0= ruleMobaApplicationFeature ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_26 = input.LA(1);

                         
                        int index6_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_26);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_27 = input.LA(1);

                         
                        int index6_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_27);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_19 = input.LA(1);

                         
                        int index6_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_21 = input.LA(1);

                         
                        int index6_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_23 = input.LA(1);

                         
                        int index6_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_25 = input.LA(1);

                         
                        int index6_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA6_29 = input.LA(1);

                         
                        int index6_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA6_18 = input.LA(1);

                         
                        int index6_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA6_28 = input.LA(1);

                         
                        int index6_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_28);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA6_13 = input.LA(1);

                         
                        int index6_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_13);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA6_15 = input.LA(1);

                         
                        int index6_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_15);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA6_17 = input.LA(1);

                         
                        int index6_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_17);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA6_20 = input.LA(1);

                         
                        int index6_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_20);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA6_22 = input.LA(1);

                         
                        int index6_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_22);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA6_24 = input.LA(1);

                         
                        int index6_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_24);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA6_14 = input.LA(1);

                         
                        int index6_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_14);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA6_16 = input.LA(1);

                         
                        int index6_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_16);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\34\3\uffff\1\50\14\uffff";
    static final String dfa_9s = "\1\u0085\3\uffff\1\105\14\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\20\1\uffff\1\16\2\uffff\1\11\4\uffff\1\2\1\4\1\10\3\uffff\1\12\1\17\1\1\20\uffff\1\3\5\uffff\1\5\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\7\22\uffff\2\7\25\uffff\1\15\7\14\1\uffff\3\13",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "525:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache )";
        }
    }
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\32\13\uffff";
    static final String dfa_15s = "\1\133\13\uffff";
    static final String dfa_16s = "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_17s = "\1\0\13\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\67\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 3589:6: ( ({...}? => ( ({...}? => (otherlv_8= 'path' otherlv_9= '=' ( (lv_path_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'headers' otherlv_12= '{' ( (lv_headers_13_0= ruleMobaRestHeader ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameters' otherlv_16= '{' ( (lv_parameters_17_0= ruleMobaRESTAbstractAttribute ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'multipart' otherlv_20= '{' ( (lv_multipartParameters_21_0= ruleMobaRESTAbstractMultipartAttribute ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'autorization' otherlv_24= '=' ( (otherlv_25= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'requestDto' otherlv_27= '=' ( (lv_requestDto_28_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'responseDto' otherlv_30= '=' ( (lv_responseDto_31_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'errorDto' otherlv_33= '=' ( (lv_errorDto_34_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'contextDto' otherlv_36= '=' ( (lv_contextDto_37_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'method' otherlv_39= '=' ( (lv_operation_40_0= ruleMobaRESTMethods ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==26) ) {s = 1;}

                        else if ( LA65_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {s = 2;}

                        else if ( LA65_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {s = 3;}

                        else if ( LA65_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {s = 4;}

                        else if ( LA65_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {s = 5;}

                        else if ( LA65_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {s = 6;}

                        else if ( LA65_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {s = 7;}

                        else if ( LA65_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6) ) {s = 8;}

                        else if ( LA65_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 7) ) {s = 9;}

                        else if ( LA65_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 8) ) {s = 10;}

                        else if ( LA65_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 9) ) {s = 11;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010800000L,0x000000000000000CL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x800071C274000000L,0xFC0000180001A420L,0x000000000000003BL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100800000L,0x000000000000000CL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000604000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000A0004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x07BF800100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x07BF800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x07BF800000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x03FC000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x07BF800800000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x07FF800000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000D10L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000004000000L,0x0000104000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000110800000L,0x000000000000000CL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000004000000L,0x0001404000001800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000004000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000100800000L,0x000000000000400CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000800000L,0x000000000000400CL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L,0x0001404000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000004000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000020L,0x0000000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000004000000L,0x000000000FFC0000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000004000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000004000000L,0x00000000A0000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000800000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000400002L,0x0000000040000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000020L,0x0000000100000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000100000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000004000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0001000000000020L,0x0000078000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000008L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x000008000000000CL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000020L,0x0000218000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x000080000000000CL});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000020L,0x0000010000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x000008004000000CL});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x000080004000000CL});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x000000004000000CL});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000010L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000240000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000038000L});

}
