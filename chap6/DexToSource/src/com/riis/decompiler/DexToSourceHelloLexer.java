// $ANTLR 3.4 src/com/riis/decompiler/DexToSourceHello.g 2012-09-20 16:27:38

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToSourceHelloLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int CLASS=4;
    public static final int COMMENT=5;
    public static final int CONST_16=6;
    public static final int CONST_4=7;
    public static final int CONST_HIGH_16=8;
    public static final int DIGIT=9;
    public static final int FINAL=10;
    public static final int IDENT=11;
    public static final int INIT=12;
    public static final int INVOKE_DIRECT=13;
    public static final int INVOKE_SUPER=14;
    public static final int INVOKE_VIRTUAL=15;
    public static final int LIMIT=16;
    public static final int LINE=17;
    public static final int METHODEND=18;
    public static final int METHODSTRT=19;
    public static final int PUBLIC=20;
    public static final int REGISTERS=21;
    public static final int RETURN_VOID=22;
    public static final int SOURCE=23;
    public static final int STATIC=24;
    public static final int SUPER=25;
    public static final int WS=26;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DexToSourceHelloLexer() {} 
    public DexToSourceHelloLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToSourceHelloLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToSourceHello.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:11:7: ( '(' )
            // src/com/riis/decompiler/DexToSourceHello.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:12:7: ( ')' )
            // src/com/riis/decompiler/DexToSourceHello.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:13:7: ( ',' )
            // src/com/riis/decompiler/DexToSourceHello.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:14:7: ( '.java' )
            // src/com/riis/decompiler/DexToSourceHello.g:14:9: '.java'
            {
            match(".java"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:15:7: ( '/' )
            // src/com/riis/decompiler/DexToSourceHello.g:15:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:16:7: ( ':' )
            // src/com/riis/decompiler/DexToSourceHello.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:17:7: ( ';' )
            // src/com/riis/decompiler/DexToSourceHello.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:18:7: ( 'L' )
            // src/com/riis/decompiler/DexToSourceHello.g:18:9: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:19:7: ( 'V' )
            // src/com/riis/decompiler/DexToSourceHello.g:19:9: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:20:7: ( ']' )
            // src/com/riis/decompiler/DexToSourceHello.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:21:7: ( 'parameter[' )
            // src/com/riis/decompiler/DexToSourceHello.g:21:9: 'parameter['
            {
            match("parameter["); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:22:7: ( 'this:' )
            // src/com/riis/decompiler/DexToSourceHello.g:22:9: 'this:'
            {
            match("this:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:23:7: ( 'v' )
            // src/com/riis/decompiler/DexToSourceHello.g:23:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:24:7: ( '{' )
            // src/com/riis/decompiler/DexToSourceHello.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:25:7: ( '}' )
            // src/com/riis/decompiler/DexToSourceHello.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:145:6: ( '.class' )
            // src/com/riis/decompiler/DexToSourceHello.g:145:11: '.class'
            {
            match(".class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:146:7: ( 'public' )
            // src/com/riis/decompiler/DexToSourceHello.g:146:12: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:147:7: ( 'static' )
            // src/com/riis/decompiler/DexToSourceHello.g:147:12: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:148:6: ( 'final' )
            // src/com/riis/decompiler/DexToSourceHello.g:148:11: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:149:6: ( '.super' )
            // src/com/riis/decompiler/DexToSourceHello.g:149:11: '.super'
            {
            match(".super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:150:7: ( '.source' )
            // src/com/riis/decompiler/DexToSourceHello.g:150:12: '.source'
            {
            match(".source"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "METHODSTRT"
    public final void mMETHODSTRT() throws RecognitionException {
        try {
            int _type = METHODSTRT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:151:11: ( '.method' )
            // src/com/riis/decompiler/DexToSourceHello.g:151:15: '.method'
            {
            match(".method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METHODSTRT"

    // $ANTLR start "METHODEND"
    public final void mMETHODEND() throws RecognitionException {
        try {
            int _type = METHODEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:152:10: ( '.end method' )
            // src/com/riis/decompiler/DexToSourceHello.g:152:14: '.end method'
            {
            match(".end method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METHODEND"

    // $ANTLR start "INIT"
    public final void mINIT() throws RecognitionException {
        try {
            int _type = INIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:153:5: ( '<init>' )
            // src/com/riis/decompiler/DexToSourceHello.g:153:10: '<init>'
            {
            match("<init>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INIT"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:154:6: ( '.limit' )
            // src/com/riis/decompiler/DexToSourceHello.g:154:11: '.limit'
            {
            match(".limit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "REGISTERS"
    public final void mREGISTERS() throws RecognitionException {
        try {
            int _type = REGISTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:155:10: ( 'registers' )
            // src/com/riis/decompiler/DexToSourceHello.g:155:14: 'registers'
            {
            match("registers"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGISTERS"

    // $ANTLR start "LINE"
    public final void mLINE() throws RecognitionException {
        try {
            int _type = LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:156:5: ( '.line' )
            // src/com/riis/decompiler/DexToSourceHello.g:156:10: '.line'
            {
            match(".line"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE"

    // $ANTLR start "INVOKE_DIRECT"
    public final void mINVOKE_DIRECT() throws RecognitionException {
        try {
            int _type = INVOKE_DIRECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:158:14: ( 'invoke-direct' )
            // src/com/riis/decompiler/DexToSourceHello.g:158:17: 'invoke-direct'
            {
            match("invoke-direct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVOKE_DIRECT"

    // $ANTLR start "INVOKE_SUPER"
    public final void mINVOKE_SUPER() throws RecognitionException {
        try {
            int _type = INVOKE_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:159:13: ( 'invoke-super' )
            // src/com/riis/decompiler/DexToSourceHello.g:159:16: 'invoke-super'
            {
            match("invoke-super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVOKE_SUPER"

    // $ANTLR start "INVOKE_VIRTUAL"
    public final void mINVOKE_VIRTUAL() throws RecognitionException {
        try {
            int _type = INVOKE_VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:160:15: ( 'invoke-virtual' )
            // src/com/riis/decompiler/DexToSourceHello.g:160:18: 'invoke-virtual'
            {
            match("invoke-virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVOKE_VIRTUAL"

    // $ANTLR start "RETURN_VOID"
    public final void mRETURN_VOID() throws RecognitionException {
        try {
            int _type = RETURN_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:161:12: ( 'return-void' )
            // src/com/riis/decompiler/DexToSourceHello.g:161:15: 'return-void'
            {
            match("return-void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN_VOID"

    // $ANTLR start "CONST_4"
    public final void mCONST_4() throws RecognitionException {
        try {
            int _type = CONST_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:162:8: ( 'const/4' )
            // src/com/riis/decompiler/DexToSourceHello.g:162:12: 'const/4'
            {
            match("const/4"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_4"

    // $ANTLR start "CONST_16"
    public final void mCONST_16() throws RecognitionException {
        try {
            int _type = CONST_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:163:9: ( 'const/16' )
            // src/com/riis/decompiler/DexToSourceHello.g:163:13: 'const/16'
            {
            match("const/16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_16"

    // $ANTLR start "CONST_HIGH_16"
    public final void mCONST_HIGH_16() throws RecognitionException {
        try {
            int _type = CONST_HIGH_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:164:14: ( 'const/high16' )
            // src/com/riis/decompiler/DexToSourceHello.g:164:17: 'const/high16'
            {
            match("const/high16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_HIGH_16"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:165:6: ( ( '0' .. '9' )+ )
            // src/com/riis/decompiler/DexToSourceHello.g:165:11: ( '0' .. '9' )+
            {
            // src/com/riis/decompiler/DexToSourceHello.g:165:11: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:166:6: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // src/com/riis/decompiler/DexToSourceHello.g:166:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // src/com/riis/decompiler/DexToSourceHello.g:166:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:168:8: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // src/com/riis/decompiler/DexToSourceHello.g:168:12: '//' (~ ( '\\r' | '\\n' ) )*
            {
            match("//"); 



            // src/com/riis/decompiler/DexToSourceHello.g:168:17: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceHello.g:169:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+ )
            // src/com/riis/decompiler/DexToSourceHello.g:169:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+
            {
            // src/com/riis/decompiler/DexToSourceHello.g:169:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' '||LA4_0==',') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)==',' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src/com/riis/decompiler/DexToSourceHello.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | CLASS | PUBLIC | STATIC | FINAL | SUPER | SOURCE | METHODSTRT | METHODEND | INIT | LIMIT | REGISTERS | LINE | INVOKE_DIRECT | INVOKE_SUPER | INVOKE_VIRTUAL | RETURN_VOID | CONST_4 | CONST_16 | CONST_HIGH_16 | DIGIT | IDENT | COMMENT | WS )
        int alt5=38;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:40: T__32
                {
                mT__32(); 


                }
                break;
            case 7 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:46: T__33
                {
                mT__33(); 


                }
                break;
            case 8 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:52: T__34
                {
                mT__34(); 


                }
                break;
            case 9 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:58: T__35
                {
                mT__35(); 


                }
                break;
            case 10 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:64: T__36
                {
                mT__36(); 


                }
                break;
            case 11 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:70: T__37
                {
                mT__37(); 


                }
                break;
            case 12 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:76: T__38
                {
                mT__38(); 


                }
                break;
            case 13 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:82: T__39
                {
                mT__39(); 


                }
                break;
            case 14 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:88: T__40
                {
                mT__40(); 


                }
                break;
            case 15 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:94: T__41
                {
                mT__41(); 


                }
                break;
            case 16 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:100: CLASS
                {
                mCLASS(); 


                }
                break;
            case 17 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:106: PUBLIC
                {
                mPUBLIC(); 


                }
                break;
            case 18 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:113: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 19 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:120: FINAL
                {
                mFINAL(); 


                }
                break;
            case 20 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:126: SUPER
                {
                mSUPER(); 


                }
                break;
            case 21 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:132: SOURCE
                {
                mSOURCE(); 


                }
                break;
            case 22 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:139: METHODSTRT
                {
                mMETHODSTRT(); 


                }
                break;
            case 23 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:150: METHODEND
                {
                mMETHODEND(); 


                }
                break;
            case 24 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:160: INIT
                {
                mINIT(); 


                }
                break;
            case 25 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:165: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 26 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:171: REGISTERS
                {
                mREGISTERS(); 


                }
                break;
            case 27 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:181: LINE
                {
                mLINE(); 


                }
                break;
            case 28 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:186: INVOKE_DIRECT
                {
                mINVOKE_DIRECT(); 


                }
                break;
            case 29 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:200: INVOKE_SUPER
                {
                mINVOKE_SUPER(); 


                }
                break;
            case 30 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:213: INVOKE_VIRTUAL
                {
                mINVOKE_VIRTUAL(); 


                }
                break;
            case 31 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:228: RETURN_VOID
                {
                mRETURN_VOID(); 


                }
                break;
            case 32 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:240: CONST_4
                {
                mCONST_4(); 


                }
                break;
            case 33 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:248: CONST_16
                {
                mCONST_16(); 


                }
                break;
            case 34 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:257: CONST_HIGH_16
                {
                mCONST_HIGH_16(); 


                }
                break;
            case 35 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:271: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 36 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:277: IDENT
                {
                mIDENT(); 


                }
                break;
            case 37 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:283: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 38 :
                // src/com/riis/decompiler/DexToSourceHello.g:1:291: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\3\uffff\1\31\1\uffff\1\41\2\uffff\1\42\1\43\1\uffff\2\27\1\47\2"+
        "\uffff\2\27\1\uffff\3\27\16\uffff\3\27\1\uffff\5\27\3\uffff\11\27"+
        "\2\uffff\13\27\1\uffff\1\27\1\120\5\27\1\126\1\127\1\uffff\3\27"+
        "\1\uffff\1\27\2\uffff\1\27\5\uffff\2\27\3\uffff\1\27\1\146\2\uffff";
    static final String DFA5_eofS =
        "\147\uffff";
    static final String DFA5_minS =
        "\1\11\2\uffff\1\11\1\143\1\57\2\uffff\2\101\1\uffff\1\141\1\150"+
        "\1\101\2\uffff\1\164\1\151\1\uffff\1\145\1\156\1\157\6\uffff\1\157"+
        "\2\uffff\1\151\4\uffff\1\162\1\142\1\151\1\uffff\1\141\1\156\1\147"+
        "\1\166\1\156\2\uffff\1\155\1\141\1\154\1\163\1\164\1\141\1\151\1"+
        "\165\1\157\1\163\2\uffff\1\155\1\151\1\72\1\151\1\154\1\163\1\162"+
        "\1\153\1\164\1\145\1\143\1\uffff\1\143\1\101\1\164\1\156\1\145\1"+
        "\57\1\164\2\101\1\uffff\1\145\2\55\1\61\1\145\2\uffff\1\162\1\uffff"+
        "\1\144\3\uffff\1\162\1\163\3\uffff\1\133\1\101\2\uffff";
    static final String DFA5_maxS =
        "\1\175\2\uffff\1\54\1\163\1\57\2\uffff\2\172\1\uffff\1\165\1\150"+
        "\1\172\2\uffff\1\164\1\151\1\uffff\1\145\1\156\1\157\6\uffff\1\165"+
        "\2\uffff\1\151\4\uffff\1\162\1\142\1\151\1\uffff\1\141\1\156\1\164"+
        "\1\166\1\156\2\uffff\1\156\1\141\1\154\1\163\1\164\1\141\1\151\1"+
        "\165\1\157\1\163\2\uffff\1\155\1\151\1\72\1\151\1\154\1\163\1\162"+
        "\1\153\1\164\1\145\1\143\1\uffff\1\143\1\172\1\164\1\156\1\145\1"+
        "\57\1\164\2\172\1\uffff\1\145\2\55\1\150\1\145\2\uffff\1\162\1\uffff"+
        "\1\166\3\uffff\1\162\1\163\3\uffff\1\133\1\172\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\7\2\uffff\1\12\3\uffff\1\16\1\17"+
        "\2\uffff\1\30\3\uffff\1\43\1\44\1\46\1\3\1\4\1\20\1\uffff\1\26\1"+
        "\27\1\uffff\1\45\1\5\1\10\1\11\3\uffff\1\15\5\uffff\1\24\1\25\12"+
        "\uffff\1\31\1\33\13\uffff\1\14\11\uffff\1\23\5\uffff\1\21\1\22\1"+
        "\uffff\1\37\1\uffff\1\40\1\41\1\42\2\uffff\1\34\1\35\1\36\2\uffff"+
        "\1\13\1\32";
    static final String DFA5_specialS =
        "\147\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\30\1\uffff\2\30\22\uffff\1\30\7\uffff\1\1\1\2\2\uffff\1\3"+
            "\1\uffff\1\4\1\5\12\26\1\6\1\7\1\22\4\uffff\13\27\1\10\11\27"+
            "\1\11\4\27\2\uffff\1\12\3\uffff\2\27\1\25\2\27\1\21\2\27\1\24"+
            "\6\27\1\13\1\27\1\23\1\20\1\14\1\27\1\15\4\27\1\16\1\uffff\1"+
            "\17",
            "",
            "",
            "\2\30\1\uffff\2\30\22\uffff\1\30\13\uffff\1\30",
            "\1\33\1\uffff\1\36\4\uffff\1\32\1\uffff\1\37\1\35\5\uffff\1"+
            "\34",
            "\1\40",
            "",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "",
            "\1\44\23\uffff\1\45",
            "\1\46",
            "\32\27\6\uffff\32\27",
            "",
            "",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\5\uffff\1\55",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65\14\uffff\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\32\27\6\uffff\32\27",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134\2\uffff\1\133\63\uffff\1\135",
            "\1\136",
            "",
            "",
            "\1\137",
            "",
            "\1\140\16\uffff\1\141\2\uffff\1\142",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "\1\145",
            "\32\27\6\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | CLASS | PUBLIC | STATIC | FINAL | SUPER | SOURCE | METHODSTRT | METHODEND | INIT | LIMIT | REGISTERS | LINE | INVOKE_DIRECT | INVOKE_SUPER | INVOKE_VIRTUAL | RETURN_VOID | CONST_4 | CONST_16 | CONST_HIGH_16 | DIGIT | IDENT | COMMENT | WS );";
        }
    }
 

}