// $ANTLR 3.4 src/com/riis/decompiler/DexToSourceWordpress.g 2012-09-20 16:27:40

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToSourceWordpressLexer extends Lexer {
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
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int ANYCHAR=4;
    public static final int COMMENT=5;
    public static final int CONST_STRING=6;
    public static final int HEX_DIGIT=7;
    public static final int IDENT=8;
    public static final int IF_NEZ=9;
    public static final int INIT=10;
    public static final int INVOKE_DIRECT=11;
    public static final int INVOKE_SUPER=12;
    public static final int INVOKE_VIRTUAL=13;
    public static final int LIMIT=14;
    public static final int LINE=15;
    public static final int METHODEND=16;
    public static final int METHODSTRT=17;
    public static final int NEW_INSTANCE=18;
    public static final int REGISTERS=19;
    public static final int RETURN_VOID=20;
    public static final int SGET=21;
    public static final int SOURCE=22;
    public static final int SUPER=23;
    public static final int THROW=24;
    public static final int THROWS=25;
    public static final int WS=26;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DexToSourceWordpressLexer() {} 
    public DexToSourceWordpressLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToSourceWordpressLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToSourceWordpress.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:11:7: ( '\"' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:11:9: '\"'
            {
            match('\"'); 

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
            // src/com/riis/decompiler/DexToSourceWordpress.g:12:7: ( '(' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:12:9: '('
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:13:7: ( ')' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:13:9: ')'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:14:7: ( ',' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:14:9: ','
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:15:7: ( '.' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:15:9: '.'
            {
            match('.'); 

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
            // src/com/riis/decompiler/DexToSourceWordpress.g:16:7: ( '/' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:16:9: '/'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:17:7: ( ':' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:17:9: ':'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:18:7: ( ';' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:18:9: ';'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:19:7: ( 'L' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:19:9: 'L'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:20:7: ( 'V' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:20:9: 'V'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:21:7: ( ']' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:21:9: ']'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:22:7: ( 'goto' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:22:9: 'goto'
            {
            match("goto"); 



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
            // src/com/riis/decompiler/DexToSourceWordpress.g:23:7: ( 'l' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:23:9: 'l'
            {
            match('l'); 

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
            // src/com/riis/decompiler/DexToSourceWordpress.g:24:7: ( 'parameter[' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:24:9: 'parameter['
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:25:7: ( 'public' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:25:9: 'public'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:26:7: ( 'static' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:26:9: 'static'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:27:7: ( 'this:' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:27:9: 'this:'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:28:7: ( 'v' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:28:9: 'v'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:29:7: ( '{' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:29:9: '{'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:30:7: ( '}' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:30:9: '}'
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
    // $ANTLR end "T__46"

    // $ANTLR start "THROWS"
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:174:7: ( '.throws' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:174:12: '.throws'
            {
            match(".throws"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROWS"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:175:6: ( '.super' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:175:11: '.super'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:176:7: ( '.source' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:176:12: '.source'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:177:11: ( '.method' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:177:15: '.method'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:178:10: ( '.end method' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:178:14: '.end method'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:179:5: ( '<init>' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:179:10: '<init>'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:180:6: ( '.limit' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:180:11: '.limit'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:181:10: ( 'registers' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:181:14: 'registers'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:182:5: ( '.line' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:182:10: '.line'
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

    // $ANTLR start "CONST_STRING"
    public final void mCONST_STRING() throws RecognitionException {
        try {
            int _type = CONST_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:184:13: ( 'const-string' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:184:16: 'const-string'
            {
            match("const-string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_STRING"

    // $ANTLR start "IF_NEZ"
    public final void mIF_NEZ() throws RecognitionException {
        try {
            int _type = IF_NEZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:185:7: ( 'if-nez' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:185:12: 'if-nez'
            {
            match("if-nez"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_NEZ"

    // $ANTLR start "INVOKE_DIRECT"
    public final void mINVOKE_DIRECT() throws RecognitionException {
        try {
            int _type = INVOKE_DIRECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:186:14: ( 'invoke-direct' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:186:17: 'invoke-direct'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:187:13: ( 'invoke-super' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:187:16: 'invoke-super'
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:188:15: ( 'invoke-virtual' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:188:18: 'invoke-virtual'
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

    // $ANTLR start "NEW_INSTANCE"
    public final void mNEW_INSTANCE() throws RecognitionException {
        try {
            int _type = NEW_INSTANCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:189:13: ( 'new-instance' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:189:16: 'new-instance'
            {
            match("new-instance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW_INSTANCE"

    // $ANTLR start "RETURN_VOID"
    public final void mRETURN_VOID() throws RecognitionException {
        try {
            int _type = RETURN_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:190:12: ( 'return-void' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:190:15: 'return-void'
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

    // $ANTLR start "SGET"
    public final void mSGET() throws RecognitionException {
        try {
            int _type = SGET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:191:5: ( 'sget-object' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:191:10: 'sget-object'
            {
            match("sget-object"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SGET"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:192:6: ( 'throw' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:192:11: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            int _type = HEX_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:193:10: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:193:14: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            {
            // src/com/riis/decompiler/DexToSourceWordpress.g:193:14: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:194:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:194:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // src/com/riis/decompiler/DexToSourceWordpress.g:194:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:196:8: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // src/com/riis/decompiler/DexToSourceWordpress.g:196:12: '//' (~ ( '\\r' | '\\n' ) )*
            {
            match("//"); 



            // src/com/riis/decompiler/DexToSourceWordpress.g:196:17: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:
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
            // src/com/riis/decompiler/DexToSourceWordpress.g:197:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:197:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+
            {
            // src/com/riis/decompiler/DexToSourceWordpress.g:197:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+
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
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:
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

    // $ANTLR start "ANYCHAR"
    public final void mANYCHAR() throws RecognitionException {
        try {
            int _type = ANYCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceWordpress.g:199:8: ( . )
            // src/com/riis/decompiler/DexToSourceWordpress.g:199:12: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANYCHAR"

    public void mTokens() throws RecognitionException {
        // src/com/riis/decompiler/DexToSourceWordpress.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | THROWS | SUPER | SOURCE | METHODSTRT | METHODEND | INIT | LIMIT | REGISTERS | LINE | CONST_STRING | IF_NEZ | INVOKE_DIRECT | INVOKE_SUPER | INVOKE_VIRTUAL | NEW_INSTANCE | RETURN_VOID | SGET | THROW | HEX_DIGIT | IDENT | COMMENT | WS | ANYCHAR )
        int alt5=43;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:40: T__32
                {
                mT__32(); 


                }
                break;
            case 7 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:46: T__33
                {
                mT__33(); 


                }
                break;
            case 8 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:52: T__34
                {
                mT__34(); 


                }
                break;
            case 9 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:58: T__35
                {
                mT__35(); 


                }
                break;
            case 10 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:64: T__36
                {
                mT__36(); 


                }
                break;
            case 11 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:70: T__37
                {
                mT__37(); 


                }
                break;
            case 12 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:76: T__38
                {
                mT__38(); 


                }
                break;
            case 13 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:82: T__39
                {
                mT__39(); 


                }
                break;
            case 14 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:88: T__40
                {
                mT__40(); 


                }
                break;
            case 15 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:94: T__41
                {
                mT__41(); 


                }
                break;
            case 16 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:100: T__42
                {
                mT__42(); 


                }
                break;
            case 17 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:106: T__43
                {
                mT__43(); 


                }
                break;
            case 18 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:112: T__44
                {
                mT__44(); 


                }
                break;
            case 19 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:118: T__45
                {
                mT__45(); 


                }
                break;
            case 20 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:124: T__46
                {
                mT__46(); 


                }
                break;
            case 21 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:130: THROWS
                {
                mTHROWS(); 


                }
                break;
            case 22 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:137: SUPER
                {
                mSUPER(); 


                }
                break;
            case 23 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:143: SOURCE
                {
                mSOURCE(); 


                }
                break;
            case 24 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:150: METHODSTRT
                {
                mMETHODSTRT(); 


                }
                break;
            case 25 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:161: METHODEND
                {
                mMETHODEND(); 


                }
                break;
            case 26 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:171: INIT
                {
                mINIT(); 


                }
                break;
            case 27 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:176: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 28 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:182: REGISTERS
                {
                mREGISTERS(); 


                }
                break;
            case 29 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:192: LINE
                {
                mLINE(); 


                }
                break;
            case 30 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:197: CONST_STRING
                {
                mCONST_STRING(); 


                }
                break;
            case 31 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:210: IF_NEZ
                {
                mIF_NEZ(); 


                }
                break;
            case 32 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:217: INVOKE_DIRECT
                {
                mINVOKE_DIRECT(); 


                }
                break;
            case 33 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:231: INVOKE_SUPER
                {
                mINVOKE_SUPER(); 


                }
                break;
            case 34 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:244: INVOKE_VIRTUAL
                {
                mINVOKE_VIRTUAL(); 


                }
                break;
            case 35 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:259: NEW_INSTANCE
                {
                mNEW_INSTANCE(); 


                }
                break;
            case 36 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:272: RETURN_VOID
                {
                mRETURN_VOID(); 


                }
                break;
            case 37 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:284: SGET
                {
                mSGET(); 


                }
                break;
            case 38 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:289: THROW
                {
                mTHROW(); 


                }
                break;
            case 39 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:295: HEX_DIGIT
                {
                mHEX_DIGIT(); 


                }
                break;
            case 40 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:305: IDENT
                {
                mIDENT(); 


                }
                break;
            case 41 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:311: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 42 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:319: WS
                {
                mWS(); 


                }
                break;
            case 43 :
                // src/com/riis/decompiler/DexToSourceWordpress.g:1:322: ANYCHAR
                {
                mANYCHAR(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\1\41\1\50\1\52\2\uffff\1\55\1\57\1\uffff\1\56\1\62\3\56"+
        "\1\70\2\uffff\1\35\1\56\1\76\2\56\1\76\27\uffff\1\56\1\uffff\5\56"+
        "\4\uffff\2\56\1\uffff\1\76\3\56\3\uffff\12\56\1\uffff\2\56\2\uffff"+
        "\1\141\12\56\2\uffff\3\56\2\uffff\1\157\5\56\1\165\1\166\1\uffff"+
        "\2\56\1\uffff\2\56\2\uffff\1\56\2\uffff\2\56\3\uffff\1\56\1\u0082"+
        "\2\uffff";
    static final String DFA5_eofS =
        "\u0083\uffff";
    static final String DFA5_minS =
        "\1\0\3\uffff\1\11\1\145\1\57\2\uffff\2\101\1\uffff\1\157\1\101\1"+
        "\141\1\147\1\150\1\101\2\uffff\1\151\1\145\1\101\1\146\1\145\1\101"+
        "\12\uffff\1\157\2\uffff\1\151\11\uffff\1\164\1\uffff\1\162\1\142"+
        "\1\141\1\145\1\151\4\uffff\1\147\1\156\1\uffff\1\101\1\55\1\166"+
        "\1\167\2\uffff\1\155\1\157\1\141\1\154\2\164\1\163\1\157\1\151\1"+
        "\165\1\163\1\uffff\1\157\1\55\2\uffff\1\101\1\155\2\151\1\55\1\72"+
        "\1\167\1\163\1\162\1\164\1\153\2\uffff\1\145\2\143\2\uffff\1\101"+
        "\1\164\1\156\1\55\1\145\1\164\2\101\1\uffff\1\145\1\55\1\uffff\1"+
        "\55\1\145\2\uffff\1\162\1\uffff\1\144\1\162\1\163\3\uffff\1\133"+
        "\1\101\2\uffff";
    static final String DFA5_maxS =
        "\1\uffff\3\uffff\1\54\1\164\1\57\2\uffff\2\172\1\uffff\1\157\1\172"+
        "\1\165\1\164\1\150\1\172\2\uffff\1\151\1\145\1\172\1\156\1\145\1"+
        "\172\12\uffff\1\165\2\uffff\1\151\11\uffff\1\164\1\uffff\1\162\1"+
        "\142\1\141\1\145\1\162\4\uffff\1\164\1\156\1\uffff\1\172\1\55\1"+
        "\166\1\167\2\uffff\1\156\1\157\1\141\1\154\2\164\1\163\1\157\1\151"+
        "\1\165\1\163\1\uffff\1\157\1\55\2\uffff\1\172\1\155\2\151\1\55\1"+
        "\72\1\167\1\163\1\162\1\164\1\153\2\uffff\1\145\2\143\2\uffff\1"+
        "\172\1\164\1\156\1\55\1\145\1\164\2\172\1\uffff\1\145\1\55\1\uffff"+
        "\1\55\1\145\2\uffff\1\162\1\uffff\1\166\1\162\1\163\3\uffff\1\133"+
        "\1\172\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\1\10\2\uffff\1\13\6\uffff\1\23"+
        "\1\24\6\uffff\1\47\1\50\1\52\1\53\1\1\1\2\1\3\1\4\1\52\1\25\1\uffff"+
        "\1\30\1\31\1\uffff\1\5\1\51\1\6\1\7\1\10\1\11\1\50\1\12\1\13\1\uffff"+
        "\1\15\5\uffff\1\22\1\23\1\24\1\32\2\uffff\1\47\4\uffff\1\26\1\27"+
        "\13\uffff\1\37\2\uffff\1\33\1\35\13\uffff\1\43\1\14\3\uffff\1\45"+
        "\1\21\10\uffff\1\46\2\uffff\1\36\2\uffff\1\17\1\20\1\uffff\1\44"+
        "\3\uffff\1\40\1\41\1\42\2\uffff\1\16\1\34";
    static final String DFA5_specialS =
        "\1\0\u0082\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\35\2\34\1\35\2\34\22\35\1\34\1\35\1\1\5\35\1\2\1\3\2\35"+
            "\1\4\1\35\1\5\1\6\12\32\1\7\1\10\1\24\4\35\6\31\5\33\1\11\11"+
            "\33\1\12\4\33\2\35\1\13\1\35\1\33\1\35\2\31\1\26\3\31\1\14\1"+
            "\33\1\27\2\33\1\15\1\33\1\30\1\33\1\16\1\33\1\25\1\17\1\20\1"+
            "\33\1\21\4\33\1\22\1\35\1\23\uff82\35",
            "",
            "",
            "",
            "\2\42\1\uffff\2\42\22\uffff\1\42\13\uffff\1\42",
            "\1\46\6\uffff\1\47\1\45\5\uffff\1\44\1\43",
            "\1\51",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\61",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\63\23\uffff\1\64",
            "\1\66\14\uffff\1\65",
            "\1\67",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\73",
            "\1\74",
            "\6\77\24\56\4\uffff\1\56\1\uffff\6\77\10\56\1\75\13\56",
            "\1\100\7\uffff\1\101",
            "\1\102",
            "\6\77\24\56\4\uffff\1\56\1\uffff\6\77\24\56",
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
            "\1\104\5\uffff\1\103",
            "",
            "",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\10\uffff\1\114",
            "",
            "",
            "",
            "",
            "\1\115\14\uffff\1\116",
            "\1\117",
            "",
            "\6\77\24\56\4\uffff\1\56\1\uffff\6\77\24\56",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\123\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "",
            "\1\174\16\uffff\1\175\2\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "\1\u0081",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | THROWS | SUPER | SOURCE | METHODSTRT | METHODEND | INIT | LIMIT | REGISTERS | LINE | CONST_STRING | IF_NEZ | INVOKE_DIRECT | INVOKE_SUPER | INVOKE_VIRTUAL | NEW_INSTANCE | RETURN_VOID | SGET | THROW | HEX_DIGIT | IDENT | COMMENT | WS | ANYCHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='\"') ) {s = 1;}

                        else if ( (LA5_0=='(') ) {s = 2;}

                        else if ( (LA5_0==')') ) {s = 3;}

                        else if ( (LA5_0==',') ) {s = 4;}

                        else if ( (LA5_0=='.') ) {s = 5;}

                        else if ( (LA5_0=='/') ) {s = 6;}

                        else if ( (LA5_0==':') ) {s = 7;}

                        else if ( (LA5_0==';') ) {s = 8;}

                        else if ( (LA5_0=='L') ) {s = 9;}

                        else if ( (LA5_0=='V') ) {s = 10;}

                        else if ( (LA5_0==']') ) {s = 11;}

                        else if ( (LA5_0=='g') ) {s = 12;}

                        else if ( (LA5_0=='l') ) {s = 13;}

                        else if ( (LA5_0=='p') ) {s = 14;}

                        else if ( (LA5_0=='s') ) {s = 15;}

                        else if ( (LA5_0=='t') ) {s = 16;}

                        else if ( (LA5_0=='v') ) {s = 17;}

                        else if ( (LA5_0=='{') ) {s = 18;}

                        else if ( (LA5_0=='}') ) {s = 19;}

                        else if ( (LA5_0=='<') ) {s = 20;}

                        else if ( (LA5_0=='r') ) {s = 21;}

                        else if ( (LA5_0=='c') ) {s = 22;}

                        else if ( (LA5_0=='i') ) {s = 23;}

                        else if ( (LA5_0=='n') ) {s = 24;}

                        else if ( ((LA5_0 >= 'A' && LA5_0 <= 'F')||(LA5_0 >= 'a' && LA5_0 <= 'b')||(LA5_0 >= 'd' && LA5_0 <= 'f')) ) {s = 25;}

                        else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {s = 26;}

                        else if ( ((LA5_0 >= 'G' && LA5_0 <= 'K')||(LA5_0 >= 'M' && LA5_0 <= 'U')||(LA5_0 >= 'W' && LA5_0 <= 'Z')||LA5_0=='_'||LA5_0=='h'||(LA5_0 >= 'j' && LA5_0 <= 'k')||LA5_0=='m'||LA5_0=='o'||LA5_0=='q'||LA5_0=='u'||(LA5_0 >= 'w' && LA5_0 <= 'z')) ) {s = 27;}

                        else if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {s = 28;}

                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||LA5_0=='\u000B'||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||LA5_0=='!'||(LA5_0 >= '#' && LA5_0 <= '\'')||(LA5_0 >= '*' && LA5_0 <= '+')||LA5_0=='-'||(LA5_0 >= '=' && LA5_0 <= '@')||(LA5_0 >= '[' && LA5_0 <= '\\')||LA5_0=='^'||LA5_0=='`'||LA5_0=='|'||(LA5_0 >= '~' && LA5_0 <= '\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}