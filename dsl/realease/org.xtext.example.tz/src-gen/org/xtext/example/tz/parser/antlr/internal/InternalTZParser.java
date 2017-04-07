package org.xtext.example.tz.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.tz.services.TZGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTZParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TZVISOR'", "'{'", "'}'", "'SBOOT'", "'IPC'", "'DFI'", "'CFI'", "'HM'", "':'", "';'", "'CONST'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTZParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTZParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTZParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTZ.g"; }



     	private TZGrammarAccess grammarAccess;

        public InternalTZParser(TokenStream input, TZGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TZGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTZ.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTZ.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTZ.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTZ.g:71:1: ruleModel returns [EObject current=null] : ( ( ( (lv_module_0_0= ruleMODULE ) ) | ( (lv_constant_1_0= ruleCONSTANT ) ) )* ( (lv_tzvisor_2_0= ruleTZVISOR ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_tzvisor_2_0 = null;



        	enterRule();

        try {
            // InternalTZ.g:77:2: ( ( ( ( (lv_module_0_0= ruleMODULE ) ) | ( (lv_constant_1_0= ruleCONSTANT ) ) )* ( (lv_tzvisor_2_0= ruleTZVISOR ) )+ ) )
            // InternalTZ.g:78:2: ( ( ( (lv_module_0_0= ruleMODULE ) ) | ( (lv_constant_1_0= ruleCONSTANT ) ) )* ( (lv_tzvisor_2_0= ruleTZVISOR ) )+ )
            {
            // InternalTZ.g:78:2: ( ( ( (lv_module_0_0= ruleMODULE ) ) | ( (lv_constant_1_0= ruleCONSTANT ) ) )* ( (lv_tzvisor_2_0= ruleTZVISOR ) )+ )
            // InternalTZ.g:79:3: ( ( (lv_module_0_0= ruleMODULE ) ) | ( (lv_constant_1_0= ruleCONSTANT ) ) )* ( (lv_tzvisor_2_0= ruleTZVISOR ) )+
            {
            // InternalTZ.g:79:3: ( ( (lv_module_0_0= ruleMODULE ) ) | ( (lv_constant_1_0= ruleCONSTANT ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=18)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==21) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTZ.g:80:4: ( (lv_module_0_0= ruleMODULE ) )
            	    {
            	    // InternalTZ.g:80:4: ( (lv_module_0_0= ruleMODULE ) )
            	    // InternalTZ.g:81:5: (lv_module_0_0= ruleMODULE )
            	    {
            	    // InternalTZ.g:81:5: (lv_module_0_0= ruleMODULE )
            	    // InternalTZ.g:82:6: lv_module_0_0= ruleMODULE
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getModuleMODULEParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_module_0_0=ruleMODULE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"module",
            	    							lv_module_0_0,
            	    							"org.xtext.example.tz.TZ.MODULE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTZ.g:100:4: ( (lv_constant_1_0= ruleCONSTANT ) )
            	    {
            	    // InternalTZ.g:100:4: ( (lv_constant_1_0= ruleCONSTANT ) )
            	    // InternalTZ.g:101:5: (lv_constant_1_0= ruleCONSTANT )
            	    {
            	    // InternalTZ.g:101:5: (lv_constant_1_0= ruleCONSTANT )
            	    // InternalTZ.g:102:6: lv_constant_1_0= ruleCONSTANT
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getConstantCONSTANTParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_constant_1_0=ruleCONSTANT();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constant",
            	    							lv_constant_1_0,
            	    							"org.xtext.example.tz.TZ.CONSTANT");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTZ.g:120:3: ( (lv_tzvisor_2_0= ruleTZVISOR ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTZ.g:121:4: (lv_tzvisor_2_0= ruleTZVISOR )
            	    {
            	    // InternalTZ.g:121:4: (lv_tzvisor_2_0= ruleTZVISOR )
            	    // InternalTZ.g:122:5: lv_tzvisor_2_0= ruleTZVISOR
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTzvisorTZVISORParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tzvisor_2_0=ruleTZVISOR();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tzvisor",
            	    						lv_tzvisor_2_0,
            	    						"org.xtext.example.tz.TZ.TZVISOR");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTZVISOR"
    // InternalTZ.g:143:1: entryRuleTZVISOR returns [EObject current=null] : iv_ruleTZVISOR= ruleTZVISOR EOF ;
    public final EObject entryRuleTZVISOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTZVISOR = null;


        try {
            // InternalTZ.g:143:48: (iv_ruleTZVISOR= ruleTZVISOR EOF )
            // InternalTZ.g:144:2: iv_ruleTZVISOR= ruleTZVISOR EOF
            {
             newCompositeNode(grammarAccess.getTZVISORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTZVISOR=ruleTZVISOR();

            state._fsp--;

             current =iv_ruleTZVISOR; 
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
    // $ANTLR end "entryRuleTZVISOR"


    // $ANTLR start "ruleTZVISOR"
    // InternalTZ.g:150:1: ruleTZVISOR returns [EObject current=null] : (otherlv_0= 'TZVISOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVARIABLES ) ) | ( (lv_constant_4_0= ruleCONSTANT ) ) | ( (lv_module_5_0= ruleMODULE ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleTZVISOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_variables_3_0 = null;

        EObject lv_constant_4_0 = null;

        EObject lv_module_5_0 = null;



        	enterRule();

        try {
            // InternalTZ.g:156:2: ( (otherlv_0= 'TZVISOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVARIABLES ) ) | ( (lv_constant_4_0= ruleCONSTANT ) ) | ( (lv_module_5_0= ruleMODULE ) ) )+ otherlv_6= '}' ) )
            // InternalTZ.g:157:2: (otherlv_0= 'TZVISOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVARIABLES ) ) | ( (lv_constant_4_0= ruleCONSTANT ) ) | ( (lv_module_5_0= ruleMODULE ) ) )+ otherlv_6= '}' )
            {
            // InternalTZ.g:157:2: (otherlv_0= 'TZVISOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVARIABLES ) ) | ( (lv_constant_4_0= ruleCONSTANT ) ) | ( (lv_module_5_0= ruleMODULE ) ) )+ otherlv_6= '}' )
            // InternalTZ.g:158:3: otherlv_0= 'TZVISOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVARIABLES ) ) | ( (lv_constant_4_0= ruleCONSTANT ) ) | ( (lv_module_5_0= ruleMODULE ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTZVISORAccess().getTZVISORKeyword_0());
            		
            // InternalTZ.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTZ.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTZ.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalTZ.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTZVISORAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTZVISORRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTZVISORAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTZ.g:184:3: ( ( (lv_variables_3_0= ruleVARIABLES ) ) | ( (lv_constant_4_0= ruleCONSTANT ) ) | ( (lv_module_5_0= ruleMODULE ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt3=1;
                    }
                    break;
                case 21:
                    {
                    alt3=2;
                    }
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalTZ.g:185:4: ( (lv_variables_3_0= ruleVARIABLES ) )
            	    {
            	    // InternalTZ.g:185:4: ( (lv_variables_3_0= ruleVARIABLES ) )
            	    // InternalTZ.g:186:5: (lv_variables_3_0= ruleVARIABLES )
            	    {
            	    // InternalTZ.g:186:5: (lv_variables_3_0= ruleVARIABLES )
            	    // InternalTZ.g:187:6: lv_variables_3_0= ruleVARIABLES
            	    {

            	    						newCompositeNode(grammarAccess.getTZVISORAccess().getVariablesVARIABLESParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_variables_3_0=ruleVARIABLES();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTZVISORRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"org.xtext.example.tz.TZ.VARIABLES");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTZ.g:205:4: ( (lv_constant_4_0= ruleCONSTANT ) )
            	    {
            	    // InternalTZ.g:205:4: ( (lv_constant_4_0= ruleCONSTANT ) )
            	    // InternalTZ.g:206:5: (lv_constant_4_0= ruleCONSTANT )
            	    {
            	    // InternalTZ.g:206:5: (lv_constant_4_0= ruleCONSTANT )
            	    // InternalTZ.g:207:6: lv_constant_4_0= ruleCONSTANT
            	    {

            	    						newCompositeNode(grammarAccess.getTZVISORAccess().getConstantCONSTANTParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_constant_4_0=ruleCONSTANT();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTZVISORRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constant",
            	    							lv_constant_4_0,
            	    							"org.xtext.example.tz.TZ.CONSTANT");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTZ.g:225:4: ( (lv_module_5_0= ruleMODULE ) )
            	    {
            	    // InternalTZ.g:225:4: ( (lv_module_5_0= ruleMODULE ) )
            	    // InternalTZ.g:226:5: (lv_module_5_0= ruleMODULE )
            	    {
            	    // InternalTZ.g:226:5: (lv_module_5_0= ruleMODULE )
            	    // InternalTZ.g:227:6: lv_module_5_0= ruleMODULE
            	    {

            	    						newCompositeNode(grammarAccess.getTZVISORAccess().getModuleMODULEParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_module_5_0=ruleMODULE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTZVISORRule());
            	    						}
            	    						add(
            	    							current,
            	    							"module",
            	    							lv_module_5_0,
            	    							"org.xtext.example.tz.TZ.MODULE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTZVISORAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTZVISOR"


    // $ANTLR start "entryRuleMODULE"
    // InternalTZ.g:253:1: entryRuleMODULE returns [EObject current=null] : iv_ruleMODULE= ruleMODULE EOF ;
    public final EObject entryRuleMODULE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE = null;


        try {
            // InternalTZ.g:253:47: (iv_ruleMODULE= ruleMODULE EOF )
            // InternalTZ.g:254:2: iv_ruleMODULE= ruleMODULE EOF
            {
             newCompositeNode(grammarAccess.getMODULERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODULE=ruleMODULE();

            state._fsp--;

             current =iv_ruleMODULE; 
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
    // $ANTLR end "entryRuleMODULE"


    // $ANTLR start "ruleMODULE"
    // InternalTZ.g:260:1: ruleMODULE returns [EObject current=null] : ( (otherlv_0= 'SBOOT' | otherlv_1= 'IPC' | otherlv_2= 'DFI' | otherlv_3= 'CFI' | otherlv_4= 'HM' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_label_7_0= ruleLABEL ) )* | ( (otherlv_8= RULE_ID ) )* ) otherlv_9= '}' ) ;
    public final EObject ruleMODULE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_label_7_0 = null;



        	enterRule();

        try {
            // InternalTZ.g:266:2: ( ( (otherlv_0= 'SBOOT' | otherlv_1= 'IPC' | otherlv_2= 'DFI' | otherlv_3= 'CFI' | otherlv_4= 'HM' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_label_7_0= ruleLABEL ) )* | ( (otherlv_8= RULE_ID ) )* ) otherlv_9= '}' ) )
            // InternalTZ.g:267:2: ( (otherlv_0= 'SBOOT' | otherlv_1= 'IPC' | otherlv_2= 'DFI' | otherlv_3= 'CFI' | otherlv_4= 'HM' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_label_7_0= ruleLABEL ) )* | ( (otherlv_8= RULE_ID ) )* ) otherlv_9= '}' )
            {
            // InternalTZ.g:267:2: ( (otherlv_0= 'SBOOT' | otherlv_1= 'IPC' | otherlv_2= 'DFI' | otherlv_3= 'CFI' | otherlv_4= 'HM' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_label_7_0= ruleLABEL ) )* | ( (otherlv_8= RULE_ID ) )* ) otherlv_9= '}' )
            // InternalTZ.g:268:3: (otherlv_0= 'SBOOT' | otherlv_1= 'IPC' | otherlv_2= 'DFI' | otherlv_3= 'CFI' | otherlv_4= 'HM' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( ( (lv_label_7_0= ruleLABEL ) )* | ( (otherlv_8= RULE_ID ) )* ) otherlv_9= '}'
            {
            // InternalTZ.g:268:3: (otherlv_0= 'SBOOT' | otherlv_1= 'IPC' | otherlv_2= 'DFI' | otherlv_3= 'CFI' | otherlv_4= 'HM' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTZ.g:269:4: otherlv_0= 'SBOOT'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getMODULEAccess().getSBOOTKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTZ.g:274:4: otherlv_1= 'IPC'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getMODULEAccess().getIPCKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTZ.g:279:4: otherlv_2= 'DFI'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMODULEAccess().getDFIKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalTZ.g:284:4: otherlv_3= 'CFI'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMODULEAccess().getCFIKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalTZ.g:289:4: otherlv_4= 'HM'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMODULEAccess().getHMKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalTZ.g:294:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTZ.g:295:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTZ.g:295:4: (lv_name_5_0= RULE_ID )
            // InternalTZ.g:296:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_5_0, grammarAccess.getMODULEAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODULERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMODULEAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTZ.g:316:3: ( ( (lv_label_7_0= ruleLABEL ) )* | ( (otherlv_8= RULE_ID ) )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==19) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_ID||LA7_1==13) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==13) ) {
                alt7=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTZ.g:317:4: ( (lv_label_7_0= ruleLABEL ) )*
                    {
                    // InternalTZ.g:317:4: ( (lv_label_7_0= ruleLABEL ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTZ.g:318:5: (lv_label_7_0= ruleLABEL )
                    	    {
                    	    // InternalTZ.g:318:5: (lv_label_7_0= ruleLABEL )
                    	    // InternalTZ.g:319:6: lv_label_7_0= ruleLABEL
                    	    {

                    	    						newCompositeNode(grammarAccess.getMODULEAccess().getLabelLABELParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_label_7_0=ruleLABEL();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMODULERule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"label",
                    	    							lv_label_7_0,
                    	    							"org.xtext.example.tz.TZ.LABEL");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalTZ.g:337:4: ( (otherlv_8= RULE_ID ) )*
                    {
                    // InternalTZ.g:337:4: ( (otherlv_8= RULE_ID ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTZ.g:338:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalTZ.g:338:5: (otherlv_8= RULE_ID )
                    	    // InternalTZ.g:339:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMODULERule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getMODULEAccess().getSuperTypeLABELCrossReference_3_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMODULEAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODULE"


    // $ANTLR start "entryRuleLABEL"
    // InternalTZ.g:359:1: entryRuleLABEL returns [EObject current=null] : iv_ruleLABEL= ruleLABEL EOF ;
    public final EObject entryRuleLABEL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLABEL = null;


        try {
            // InternalTZ.g:359:46: (iv_ruleLABEL= ruleLABEL EOF )
            // InternalTZ.g:360:2: iv_ruleLABEL= ruleLABEL EOF
            {
             newCompositeNode(grammarAccess.getLABELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLABEL=ruleLABEL();

            state._fsp--;

             current =iv_ruleLABEL; 
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
    // $ANTLR end "entryRuleLABEL"


    // $ANTLR start "ruleLABEL"
    // InternalTZ.g:366:1: ruleLABEL returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_INT_2= RULE_INT | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleLABEL() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTZ.g:372:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_INT_2= RULE_INT | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' ) )
            // InternalTZ.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_INT_2= RULE_INT | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' )
            {
            // InternalTZ.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_INT_2= RULE_INT | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';' )
            // InternalTZ.g:374:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_INT_2= RULE_INT | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ';'
            {
            // InternalTZ.g:374:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTZ.g:375:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTZ.g:375:4: (lv_name_0_0= RULE_ID )
            // InternalTZ.g:376:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLABELAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLABELRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLABELAccess().getColonKeyword_1());
            		
            // InternalTZ.g:396:3: (this_INT_2= RULE_INT | ( (otherlv_3= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTZ.g:397:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_12); 

                    				newLeafNode(this_INT_2, grammarAccess.getLABELAccess().getINTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTZ.g:402:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalTZ.g:402:4: ( (otherlv_3= RULE_ID ) )
                    // InternalTZ.g:403:5: (otherlv_3= RULE_ID )
                    {
                    // InternalTZ.g:403:5: (otherlv_3= RULE_ID )
                    // InternalTZ.g:404:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLABELRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getLABELAccess().getSuperTypeCONSTANTCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLABELAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLABEL"


    // $ANTLR start "entryRuleCONSTANT"
    // InternalTZ.g:424:1: entryRuleCONSTANT returns [EObject current=null] : iv_ruleCONSTANT= ruleCONSTANT EOF ;
    public final EObject entryRuleCONSTANT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONSTANT = null;


        try {
            // InternalTZ.g:424:49: (iv_ruleCONSTANT= ruleCONSTANT EOF )
            // InternalTZ.g:425:2: iv_ruleCONSTANT= ruleCONSTANT EOF
            {
             newCompositeNode(grammarAccess.getCONSTANTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONSTANT=ruleCONSTANT();

            state._fsp--;

             current =iv_ruleCONSTANT; 
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
    // $ANTLR end "entryRuleCONSTANT"


    // $ANTLR start "ruleCONSTANT"
    // InternalTZ.g:431:1: ruleCONSTANT returns [EObject current=null] : (otherlv_0= 'CONST' ( (lv_name_1_0= RULE_ID ) ) this_INT_2= RULE_INT otherlv_3= ';' ) ;
    public final EObject ruleCONSTANT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_INT_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTZ.g:437:2: ( (otherlv_0= 'CONST' ( (lv_name_1_0= RULE_ID ) ) this_INT_2= RULE_INT otherlv_3= ';' ) )
            // InternalTZ.g:438:2: (otherlv_0= 'CONST' ( (lv_name_1_0= RULE_ID ) ) this_INT_2= RULE_INT otherlv_3= ';' )
            {
            // InternalTZ.g:438:2: (otherlv_0= 'CONST' ( (lv_name_1_0= RULE_ID ) ) this_INT_2= RULE_INT otherlv_3= ';' )
            // InternalTZ.g:439:3: otherlv_0= 'CONST' ( (lv_name_1_0= RULE_ID ) ) this_INT_2= RULE_INT otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCONSTANTAccess().getCONSTKeyword_0());
            		
            // InternalTZ.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTZ.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTZ.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalTZ.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCONSTANTAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCONSTANTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_12); 

            			newLeafNode(this_INT_2, grammarAccess.getCONSTANTAccess().getINTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCONSTANTAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONSTANT"


    // $ANTLR start "entryRuleVARIABLES"
    // InternalTZ.g:473:1: entryRuleVARIABLES returns [EObject current=null] : iv_ruleVARIABLES= ruleVARIABLES EOF ;
    public final EObject entryRuleVARIABLES() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVARIABLES = null;


        try {
            // InternalTZ.g:473:50: (iv_ruleVARIABLES= ruleVARIABLES EOF )
            // InternalTZ.g:474:2: iv_ruleVARIABLES= ruleVARIABLES EOF
            {
             newCompositeNode(grammarAccess.getVARIABLESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVARIABLES=ruleVARIABLES();

            state._fsp--;

             current =iv_ruleVARIABLES; 
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
    // $ANTLR end "entryRuleVARIABLES"


    // $ANTLR start "ruleVARIABLES"
    // InternalTZ.g:480:1: ruleVARIABLES returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ) ;
    public final EObject ruleVARIABLES() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTZ.g:486:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ) )
            // InternalTZ.g:487:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            {
            // InternalTZ.g:487:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==20) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_ID||(LA9_1>=13 && LA9_1<=18)||LA9_1==21) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTZ.g:488:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalTZ.g:488:3: ( (otherlv_0= RULE_ID ) )
                    // InternalTZ.g:489:4: (otherlv_0= RULE_ID )
                    {
                    // InternalTZ.g:489:4: (otherlv_0= RULE_ID )
                    // InternalTZ.g:490:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVARIABLESRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getVARIABLESAccess().getSuperTypeCONSTANTCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTZ.g:502:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
                    {
                    // InternalTZ.g:502:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
                    // InternalTZ.g:503:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
                    {
                    // InternalTZ.g:503:4: ( (otherlv_1= RULE_ID ) )
                    // InternalTZ.g:504:5: (otherlv_1= RULE_ID )
                    {
                    // InternalTZ.g:504:5: (otherlv_1= RULE_ID )
                    // InternalTZ.g:505:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVARIABLESRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_1, grammarAccess.getVARIABLESAccess().getSuperTypeMODULECrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getVARIABLESAccess().getSemicolonKeyword_1_1());
                    			

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
    // $ANTLR end "ruleVARIABLES"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000027C800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000027C810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000027E810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}