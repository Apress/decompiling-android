// $ANTLR 3.4 src/com/riis/decompiler/DexToSourceWordpress.g 2012-09-20 16:27:39

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToSourceWordpressParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANYCHAR", "COMMENT", "CONST_STRING", "HEX_DIGIT", "IDENT", "IF_NEZ", "INIT", "INVOKE_DIRECT", "INVOKE_SUPER", "INVOKE_VIRTUAL", "LIMIT", "LINE", "METHODEND", "METHODSTRT", "NEW_INSTANCE", "REGISTERS", "RETURN_VOID", "SGET", "SOURCE", "SUPER", "THROW", "THROWS", "WS", "'\"'", "'('", "')'", "','", "'.'", "'/'", "':'", "';'", "'L'", "'V'", "']'", "'goto'", "'l'", "'parameter['", "'public'", "'static'", "'this:'", "'v'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DexToSourceWordpressParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToSourceWordpressParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DexToSourceWordpressParser.tokenNames; }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToSourceWordpress.g"; }


    	JavaOutput fout = DexToSource.fout;



    // $ANTLR start "rule"
    // src/com/riis/decompiler/DexToSourceWordpress.g:19:1: rule : method ;
    public final void rule() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:22:2: ( method )
            // src/com/riis/decompiler/DexToSourceWordpress.g:22:4: method
            {
            pushFollow(FOLLOW_method_in_rule54);
            method();

            state._fsp--;


            }

            fout.close();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"



    // $ANTLR start "method"
    // src/com/riis/decompiler/DexToSourceWordpress.g:25:1: method : method_start ( scrap )* ( if_stmt ( scrap )* )+ method_end ;
    public final void method() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:26:2: ( method_start ( scrap )* ( if_stmt ( scrap )* )+ method_end )
            // src/com/riis/decompiler/DexToSourceWordpress.g:26:4: method_start ( scrap )* ( if_stmt ( scrap )* )+ method_end
            {
            pushFollow(FOLLOW_method_start_in_method66);
            method_start();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceWordpress.g:26:17: ( scrap )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= LIMIT && LA1_0 <= LINE)||LA1_0==THROWS||LA1_0==34||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:26:17: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_method68);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // src/com/riis/decompiler/DexToSourceWordpress.g:26:24: ( if_stmt ( scrap )* )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IF_NEZ) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:26:25: if_stmt ( scrap )*
            	    {
            	    pushFollow(FOLLOW_if_stmt_in_method72);
            	    if_stmt();

            	    state._fsp--;


            	    // src/com/riis/decompiler/DexToSourceWordpress.g:26:33: ( scrap )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0 >= LIMIT && LA2_0 <= LINE)||LA2_0==THROWS||LA2_0==34||LA2_0==39) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // src/com/riis/decompiler/DexToSourceWordpress.g:26:33: scrap
            	    	    {
            	    	    pushFollow(FOLLOW_scrap_in_method74);
            	    	    scrap();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


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


            pushFollow(FOLLOW_method_end_in_method79);
            method_end();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method"



    // $ANTLR start "method_start"
    // src/com/riis/decompiler/DexToSourceWordpress.g:29:1: method_start : METHODSTRT f1= flags id1= IDENT p1= params r1= return_ ;
    public final void method_start() throws RecognitionException {
        Token id1=null;
        DexToSourceWordpressParser.flags_return f1 =null;

        String p1 =null;

        String r1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:30:2: ( METHODSTRT f1= flags id1= IDENT p1= params r1= return_ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:30:4: METHODSTRT f1= flags id1= IDENT p1= params r1= return_
            {
            match(input,METHODSTRT,FOLLOW_METHODSTRT_in_method_start91); 

            pushFollow(FOLLOW_flags_in_method_start95);
            f1=flags();

            state._fsp--;


            id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_method_start99); 

            pushFollow(FOLLOW_params_in_method_start103);
            p1=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_method_start107);
            r1=return_();

            state._fsp--;


            fout.print((f1!=null?input.toString(f1.start,f1.stop):null) + " " + r1 + " " + (id1!=null?id1.getText():null) + "(");
            		
            		String[] args = p1.split(";");
            		for(int i = 0; i < args.length; i++) {
            			fout.print(args[i] + " " + args[i].substring(args[i].lastIndexOf('.')+1, args[i].length()).toLowerCase());
            			if(i != args.length-1) { fout.print(", "); }
            		}
            		
            		fout.printJava(") {");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method_start"


    public static class flags_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "flags"
    // src/com/riis/decompiler/DexToSourceWordpress.g:42:1: flags : ( flag )+ ;
    public final DexToSourceWordpressParser.flags_return flags() throws RecognitionException {
        DexToSourceWordpressParser.flags_return retval = new DexToSourceWordpressParser.flags_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:43:2: ( ( flag )+ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:43:4: ( flag )+
            {
            // src/com/riis/decompiler/DexToSourceWordpress.g:43:4: ( flag )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 41 && LA4_0 <= 42)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:43:4: flag
            	    {
            	    pushFollow(FOLLOW_flag_in_flags123);
            	    flag();

            	    state._fsp--;


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


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flags"



    // $ANTLR start "flag"
    // src/com/riis/decompiler/DexToSourceWordpress.g:46:1: flag returns [String flag_result] : (f1= 'public' |f1= 'static' );
    public final String flag() throws RecognitionException {
        String flag_result = null;


        Token f1=null;

        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:47:2: (f1= 'public' |f1= 'static' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:47:4: f1= 'public'
                    {
                    f1=(Token)match(input,41,FOLLOW_41_in_flag142); 

                    flag_result += (f1!=null?f1.getText():null);

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:49:4: f1= 'static'
                    {
                    f1=(Token)match(input,42,FOLLOW_42_in_flag153); 

                    flag_result += (f1!=null?f1.getText():null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return flag_result;
    }
    // $ANTLR end "flag"



    // $ANTLR start "params"
    // src/com/riis/decompiler/DexToSourceWordpress.g:53:1: params returns [String result] : '(' (id1= package_ )* ')' ;
    public final String params() throws RecognitionException {
        String result = null;


        String id1 =null;


        result = "";
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:55:2: ( '(' (id1= package_ )* ')' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:55:4: '(' (id1= package_ )* ')'
            {
            match(input,28,FOLLOW_28_in_params179); 

            // src/com/riis/decompiler/DexToSourceWordpress.g:55:8: (id1= package_ )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:55:9: id1= package_
            	    {
            	    pushFollow(FOLLOW_package__in_params184);
            	    id1=package_();

            	    state._fsp--;


            	    result += id1;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,29,FOLLOW_29_in_params190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "params"



    // $ANTLR start "package_"
    // src/com/riis/decompiler/DexToSourceWordpress.g:58:1: package_ returns [String result] : id1= package_internal ;
    public final String package_() throws RecognitionException {
        String result = null;


        DexToSourceWordpressParser.package_internal_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:59:2: (id1= package_internal )
            // src/com/riis/decompiler/DexToSourceWordpress.g:59:4: id1= package_internal
            {
            pushFollow(FOLLOW_package_internal_in_package_208);
            id1=package_internal();

            state._fsp--;


            result = (id1!=null?input.toString(id1.start,id1.stop):null).replace("/", ".");
            		 if(result.startsWith("L")) { 
            		 	result = result.substring(1, result.length());
            		 }
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "package_"


    public static class package_internal_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "package_internal"
    // src/com/riis/decompiler/DexToSourceWordpress.g:67:1: package_internal : ( 'L' )? IDENT ( ( '/' | '.' ) ( IDENT | HEX_DIGIT )+ )* ( '/' '<init>' )? ( ';' )? ;
    public final DexToSourceWordpressParser.package_internal_return package_internal() throws RecognitionException {
        DexToSourceWordpressParser.package_internal_return retval = new DexToSourceWordpressParser.package_internal_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:68:2: ( ( 'L' )? IDENT ( ( '/' | '.' ) ( IDENT | HEX_DIGIT )+ )* ( '/' '<init>' )? ( ';' )? )
            // src/com/riis/decompiler/DexToSourceWordpress.g:68:4: ( 'L' )? IDENT ( ( '/' | '.' ) ( IDENT | HEX_DIGIT )+ )* ( '/' '<init>' )? ( ';' )?
            {
            // src/com/riis/decompiler/DexToSourceWordpress.g:68:4: ( 'L' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:68:4: 'L'
                    {
                    match(input,35,FOLLOW_35_in_package_internal224); 

                    }
                    break;

            }


            match(input,IDENT,FOLLOW_IDENT_in_package_internal227); 

            // src/com/riis/decompiler/DexToSourceWordpress.g:68:15: ( ( '/' | '.' ) ( IDENT | HEX_DIGIT )+ )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    int LA9_1 = input.LA(2);

                    if ( ((LA9_1 >= HEX_DIGIT && LA9_1 <= IDENT)) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:68:16: ( '/' | '.' ) ( IDENT | HEX_DIGIT )+
            	    {
            	    if ( (input.LA(1) >= 31 && input.LA(1) <= 32) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // src/com/riis/decompiler/DexToSourceWordpress.g:68:26: ( IDENT | HEX_DIGIT )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0 >= HEX_DIGIT && LA8_0 <= IDENT)) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // src/com/riis/decompiler/DexToSourceWordpress.g:
            	    	    {
            	    	    if ( (input.LA(1) >= HEX_DIGIT && input.LA(1) <= IDENT) ) {
            	    	        input.consume();
            	    	        state.errorRecovery=false;
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // src/com/riis/decompiler/DexToSourceWordpress.g:68:47: ( '/' '<init>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:68:48: '/' '<init>'
                    {
                    match(input,32,FOLLOW_32_in_package_internal246); 

                    match(input,INIT,FOLLOW_INIT_in_package_internal248); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToSourceWordpress.g:68:63: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==IDENT) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==IDENT||LA11_3==29||(LA11_3 >= 31 && LA11_3 <= 32)||(LA11_3 >= 34 && LA11_3 <= 35)) ) {
                        alt11=1;
                    }
                }
                else if ( (LA11_1==CONST_STRING||LA11_1==IF_NEZ||(LA11_1 >= INVOKE_VIRTUAL && LA11_1 <= METHODEND)||LA11_1==NEW_INSTANCE||(LA11_1 >= RETURN_VOID && LA11_1 <= SGET)||(LA11_1 >= THROW && LA11_1 <= THROWS)||LA11_1==29||(LA11_1 >= 34 && LA11_1 <= 35)||LA11_1==39) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:68:63: ';'
                    {
                    match(input,34,FOLLOW_34_in_package_internal252); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "package_internal"



    // $ANTLR start "return_"
    // src/com/riis/decompiler/DexToSourceWordpress.g:71:1: return_ returns [String result] : 'V' ;
    public final String return_() throws RecognitionException {
        String result = null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:72:2: ( 'V' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:72:4: 'V'
            {
            match(input,36,FOLLOW_36_in_return_269); 

            result = "void";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "return_"



    // $ANTLR start "if_stmt"
    // src/com/riis/decompiler/DexToSourceWordpress.g:75:1: if_stmt : ( if_ ( scrap )* id1= new_instance id2= const_string invoke_direct ( scrap )* throw_ | if_ ( scrap )* RETURN_VOID ( scrap )* goto_stmt );
    public final void if_stmt() throws RecognitionException {
        String id1 =null;

        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:76:2: ( if_ ( scrap )* id1= new_instance id2= const_string invoke_direct ( scrap )* throw_ | if_ ( scrap )* RETURN_VOID ( scrap )* goto_stmt )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:76:4: if_ ( scrap )* id1= new_instance id2= const_string invoke_direct ( scrap )* throw_
                    {
                    pushFollow(FOLLOW_if__in_if_stmt283);
                    if_();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToSourceWordpress.g:76:8: ( scrap )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= LIMIT && LA12_0 <= LINE)||LA12_0==THROWS||LA12_0==34||LA12_0==39) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceWordpress.g:76:8: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_if_stmt285);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    pushFollow(FOLLOW_new_instance_in_if_stmt290);
                    id1=new_instance();

                    state._fsp--;


                    pushFollow(FOLLOW_const_string_in_if_stmt294);
                    id2=const_string();

                    state._fsp--;


                    pushFollow(FOLLOW_invoke_direct_in_if_stmt296);
                    invoke_direct();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToSourceWordpress.g:76:63: ( scrap )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= LIMIT && LA13_0 <= LINE)||LA13_0==THROWS||LA13_0==34||LA13_0==39) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceWordpress.g:76:63: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_if_stmt298);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    pushFollow(FOLLOW_throw__in_if_stmt301);
                    throw_();

                    state._fsp--;


                    fout.printJava("throw new " + id1 + "(" + id2 + ");\n}");

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:78:4: if_ ( scrap )* RETURN_VOID ( scrap )* goto_stmt
                    {
                    pushFollow(FOLLOW_if__in_if_stmt310);
                    if_();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToSourceWordpress.g:78:8: ( scrap )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= LIMIT && LA14_0 <= LINE)||LA14_0==THROWS||LA14_0==34||LA14_0==39) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceWordpress.g:78:8: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_if_stmt312);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    match(input,RETURN_VOID,FOLLOW_RETURN_VOID_in_if_stmt315); 

                    // src/com/riis/decompiler/DexToSourceWordpress.g:78:27: ( scrap )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= LIMIT && LA15_0 <= LINE)||LA15_0==THROWS||LA15_0==34||LA15_0==39) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceWordpress.g:78:27: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_if_stmt317);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    fout.printJava("return;\n}");

                    pushFollow(FOLLOW_goto_stmt_in_if_stmt322);
                    goto_stmt();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "if_stmt"



    // $ANTLR start "if_"
    // src/com/riis/decompiler/DexToSourceWordpress.g:81:1: if_ : IF_NEZ id1= reg ',' 'l' HEX_DIGIT ;
    public final void if_() throws RecognitionException {
        DexToSourceWordpressParser.reg_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:82:2: ( IF_NEZ id1= reg ',' 'l' HEX_DIGIT )
            // src/com/riis/decompiler/DexToSourceWordpress.g:82:4: IF_NEZ id1= reg ',' 'l' HEX_DIGIT
            {
            match(input,IF_NEZ,FOLLOW_IF_NEZ_in_if_333); 

            pushFollow(FOLLOW_reg_in_if_337);
            id1=reg();

            state._fsp--;


            match(input,30,FOLLOW_30_in_if_339); 

            match(input,39,FOLLOW_39_in_if_341); 

            match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_if_343); 

            fout.print("if(");
            		 if((id1!=null?input.toString(id1.start,id1.stop):null).equals("v2")) {
            		 	fout.printJava("writer == null ) {");
            		 } else {
            		 	fout.printJava("string == null ) {");
            		 }
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "if_"


    public static class reg_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "reg"
    // src/com/riis/decompiler/DexToSourceWordpress.g:92:1: reg : 'v' HEX_DIGIT ;
    public final DexToSourceWordpressParser.reg_return reg() throws RecognitionException {
        DexToSourceWordpressParser.reg_return retval = new DexToSourceWordpressParser.reg_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:93:2: ( 'v' HEX_DIGIT )
            // src/com/riis/decompiler/DexToSourceWordpress.g:93:4: 'v' HEX_DIGIT
            {
            match(input,44,FOLLOW_44_in_reg359); 

            match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_reg361); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reg"



    // $ANTLR start "new_instance"
    // src/com/riis/decompiler/DexToSourceWordpress.g:96:1: new_instance returns [String result] : NEW_INSTANCE reg ',' id1= package_ ;
    public final String new_instance() throws RecognitionException {
        String result = null;


        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:97:2: ( NEW_INSTANCE reg ',' id1= package_ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:97:4: NEW_INSTANCE reg ',' id1= package_
            {
            match(input,NEW_INSTANCE,FOLLOW_NEW_INSTANCE_in_new_instance376); 

            pushFollow(FOLLOW_reg_in_new_instance378);
            reg();

            state._fsp--;


            match(input,30,FOLLOW_30_in_new_instance380); 

            pushFollow(FOLLOW_package__in_new_instance384);
            id1=package_();

            state._fsp--;


            result = id1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "new_instance"



    // $ANTLR start "const_string"
    // src/com/riis/decompiler/DexToSourceWordpress.g:101:1: const_string returns [String result] : CONST_STRING reg ',' id1= quoted_string ;
    public final String const_string() throws RecognitionException {
        String result = null;


        DexToSourceWordpressParser.quoted_string_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:102:2: ( CONST_STRING reg ',' id1= quoted_string )
            // src/com/riis/decompiler/DexToSourceWordpress.g:102:4: CONST_STRING reg ',' id1= quoted_string
            {
            match(input,CONST_STRING,FOLLOW_CONST_STRING_in_const_string404); 

            pushFollow(FOLLOW_reg_in_const_string406);
            reg();

            state._fsp--;


            match(input,30,FOLLOW_30_in_const_string408); 

            pushFollow(FOLLOW_quoted_string_in_const_string412);
            id1=quoted_string();

            state._fsp--;


            result = (id1!=null?input.toString(id1.start,id1.stop):null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "const_string"


    public static class quoted_string_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "quoted_string"
    // src/com/riis/decompiler/DexToSourceWordpress.g:106:1: quoted_string : '\"' (~ '\"' )* '\"' ;
    public final DexToSourceWordpressParser.quoted_string_return quoted_string() throws RecognitionException {
        DexToSourceWordpressParser.quoted_string_return retval = new DexToSourceWordpressParser.quoted_string_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:107:2: ( '\"' (~ '\"' )* '\"' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:107:4: '\"' (~ '\"' )* '\"'
            {
            match(input,27,FOLLOW_27_in_quoted_string428); 

            // src/com/riis/decompiler/DexToSourceWordpress.g:107:8: (~ '\"' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= ANYCHAR && LA17_0 <= WS)||(LA17_0 >= 28 && LA17_0 <= 46)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:
            	    {
            	    if ( (input.LA(1) >= ANYCHAR && input.LA(1) <= WS)||(input.LA(1) >= 28 && input.LA(1) <= 46) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input,27,FOLLOW_27_in_quoted_string436); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quoted_string"



    // $ANTLR start "invoke_direct"
    // src/com/riis/decompiler/DexToSourceWordpress.g:110:1: invoke_direct : INVOKE_DIRECT regs ',' package_ ;
    public final void invoke_direct() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:111:2: ( INVOKE_DIRECT regs ',' package_ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:111:4: INVOKE_DIRECT regs ',' package_
            {
            match(input,INVOKE_DIRECT,FOLLOW_INVOKE_DIRECT_in_invoke_direct448); 

            pushFollow(FOLLOW_regs_in_invoke_direct450);
            regs();

            state._fsp--;


            match(input,30,FOLLOW_30_in_invoke_direct452); 

            pushFollow(FOLLOW_package__in_invoke_direct454);
            package_();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "invoke_direct"



    // $ANTLR start "regs"
    // src/com/riis/decompiler/DexToSourceWordpress.g:114:1: regs : '{' ( ( ',' )? reg )+ '}' ;
    public final void regs() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:115:2: ( '{' ( ( ',' )? reg )+ '}' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:115:4: '{' ( ( ',' )? reg )+ '}'
            {
            match(input,45,FOLLOW_45_in_regs466); 

            // src/com/riis/decompiler/DexToSourceWordpress.g:115:8: ( ( ',' )? reg )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30||LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:115:9: ( ',' )? reg
            	    {
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:115:9: ( ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==30) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToSourceWordpress.g:115:9: ','
            	            {
            	            match(input,30,FOLLOW_30_in_regs469); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_reg_in_regs472);
            	    reg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            match(input,46,FOLLOW_46_in_regs476); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "regs"



    // $ANTLR start "throw_"
    // src/com/riis/decompiler/DexToSourceWordpress.g:118:1: throw_ : THROW reg ;
    public final void throw_() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:119:2: ( THROW reg )
            // src/com/riis/decompiler/DexToSourceWordpress.g:119:4: THROW reg
            {
            match(input,THROW,FOLLOW_THROW_in_throw_488); 

            pushFollow(FOLLOW_reg_in_throw_490);
            reg();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "throw_"



    // $ANTLR start "goto_stmt"
    // src/com/riis/decompiler/DexToSourceWordpress.g:122:1: goto_stmt : id1= sget invoke_virtual[id1] goto_ ;
    public final void goto_stmt() throws RecognitionException {
        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:123:2: (id1= sget invoke_virtual[id1] goto_ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:123:4: id1= sget invoke_virtual[id1] goto_
            {
            pushFollow(FOLLOW_sget_in_goto_stmt504);
            id1=sget();

            state._fsp--;


            pushFollow(FOLLOW_invoke_virtual_in_goto_stmt506);
            invoke_virtual(id1);

            state._fsp--;


            pushFollow(FOLLOW_goto__in_goto_stmt509);
            goto_();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "goto_stmt"



    // $ANTLR start "sget"
    // src/com/riis/decompiler/DexToSourceWordpress.g:126:1: sget returns [String result] : SGET reg ',' id1= package_ ;
    public final String sget() throws RecognitionException {
        String result = null;


        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:127:2: ( SGET reg ',' id1= package_ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:127:4: SGET reg ',' id1= package_
            {
            match(input,SGET,FOLLOW_SGET_in_sget525); 

            pushFollow(FOLLOW_reg_in_sget527);
            reg();

            state._fsp--;


            match(input,30,FOLLOW_30_in_sget529); 

            pushFollow(FOLLOW_package__in_sget533);
            id1=package_();

            state._fsp--;


            result = id1.split("\r\n")[0];

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "sget"



    // $ANTLR start "invoke_virtual"
    // src/com/riis/decompiler/DexToSourceWordpress.g:131:1: invoke_virtual[String objectName] : INVOKE_VIRTUAL param ',' package_ ';' id1= IDENT id2= params return_ ;
    public final void invoke_virtual(String objectName) throws RecognitionException {
        Token id1=null;
        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:132:2: ( INVOKE_VIRTUAL param ',' package_ ';' id1= IDENT id2= params return_ )
            // src/com/riis/decompiler/DexToSourceWordpress.g:132:4: INVOKE_VIRTUAL param ',' package_ ';' id1= IDENT id2= params return_
            {
            match(input,INVOKE_VIRTUAL,FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual549); 

            pushFollow(FOLLOW_param_in_invoke_virtual551);
            param();

            state._fsp--;


            match(input,30,FOLLOW_30_in_invoke_virtual553); 

            pushFollow(FOLLOW_package__in_invoke_virtual555);
            package_();

            state._fsp--;


            match(input,34,FOLLOW_34_in_invoke_virtual557); 

            id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_invoke_virtual561); 

            pushFollow(FOLLOW_params_in_invoke_virtual565);
            id2=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_invoke_virtual567);
            return_();

            state._fsp--;


            fout.print(objectName + "." + (id1!=null?id1.getText():null) + "(");
            		
            		 String[] args = id2.split(";");
            		 for(int i = 0; i < args.length; i++) {
            			fout.write(args[i].substring(args[i].lastIndexOf('.')+1, args[i].length()).toLowerCase().trim());
            			if(i != args.length-1) { fout.write(", "); }
            		 }
            		 
            		 fout.write(");\n");
            		
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "invoke_virtual"



    // $ANTLR start "param"
    // src/com/riis/decompiler/DexToSourceWordpress.g:146:1: param : '{' ( ( ',' )? reg )+ '}' ;
    public final void param() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:147:2: ( '{' ( ( ',' )? reg )+ '}' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:147:4: '{' ( ( ',' )? reg )+ '}'
            {
            match(input,45,FOLLOW_45_in_param583); 

            // src/com/riis/decompiler/DexToSourceWordpress.g:147:8: ( ( ',' )? reg )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30||LA21_0==44) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:147:9: ( ',' )? reg
            	    {
            	    // src/com/riis/decompiler/DexToSourceWordpress.g:147:9: ( ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==30) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToSourceWordpress.g:147:9: ','
            	            {
            	            match(input,30,FOLLOW_30_in_param586); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_reg_in_param589);
            	    reg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            match(input,46,FOLLOW_46_in_param593); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param"



    // $ANTLR start "goto_"
    // src/com/riis/decompiler/DexToSourceWordpress.g:150:1: goto_ : 'goto' 'l' HEX_DIGIT ;
    public final void goto_() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:151:2: ( 'goto' 'l' HEX_DIGIT )
            // src/com/riis/decompiler/DexToSourceWordpress.g:151:4: 'goto' 'l' HEX_DIGIT
            {
            match(input,38,FOLLOW_38_in_goto_605); 

            match(input,39,FOLLOW_39_in_goto_607); 

            match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_goto_609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "goto_"



    // $ANTLR start "method_end"
    // src/com/riis/decompiler/DexToSourceWordpress.g:154:1: method_end : METHODEND ;
    public final void method_end() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:157:2: ( METHODEND )
            // src/com/riis/decompiler/DexToSourceWordpress.g:157:4: METHODEND
            {
            match(input,METHODEND,FOLLOW_METHODEND_in_method_end629); 

            }

            fout.printJava("}\n ");
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method_end"



    // $ANTLR start "scrap"
    // src/com/riis/decompiler/DexToSourceWordpress.g:160:1: scrap : ( LIMIT REGISTERS HEX_DIGIT | ';' 'this:' reg params | LINE HEX_DIGIT | ';' 'parameter[' HEX_DIGIT ']' ':' reg params | ';' '<init>' params return_ | THROWS package_ | label );
    public final void scrap() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:161:2: ( LIMIT REGISTERS HEX_DIGIT | ';' 'this:' reg params | LINE HEX_DIGIT | ';' 'parameter[' HEX_DIGIT ']' ':' reg params | ';' '<init>' params return_ | THROWS package_ | label )
            int alt22=7;
            switch ( input.LA(1) ) {
            case LIMIT:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt22=2;
                    }
                    break;
                case 40:
                    {
                    alt22=4;
                    }
                    break;
                case INIT:
                    {
                    alt22=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;

                }

                }
                break;
            case LINE:
                {
                alt22=3;
                }
                break;
            case THROWS:
                {
                alt22=6;
                }
                break;
            case 39:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:161:4: LIMIT REGISTERS HEX_DIGIT
                    {
                    match(input,LIMIT,FOLLOW_LIMIT_in_scrap640); 

                    match(input,REGISTERS,FOLLOW_REGISTERS_in_scrap642); 

                    match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_scrap644); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:162:4: ';' 'this:' reg params
                    {
                    match(input,34,FOLLOW_34_in_scrap649); 

                    match(input,43,FOLLOW_43_in_scrap651); 

                    pushFollow(FOLLOW_reg_in_scrap653);
                    reg();

                    state._fsp--;


                    pushFollow(FOLLOW_params_in_scrap655);
                    params();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:163:4: LINE HEX_DIGIT
                    {
                    match(input,LINE,FOLLOW_LINE_in_scrap660); 

                    match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_scrap662); 

                    }
                    break;
                case 4 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:164:4: ';' 'parameter[' HEX_DIGIT ']' ':' reg params
                    {
                    match(input,34,FOLLOW_34_in_scrap667); 

                    match(input,40,FOLLOW_40_in_scrap669); 

                    match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_scrap671); 

                    match(input,37,FOLLOW_37_in_scrap673); 

                    match(input,33,FOLLOW_33_in_scrap675); 

                    pushFollow(FOLLOW_reg_in_scrap677);
                    reg();

                    state._fsp--;


                    pushFollow(FOLLOW_params_in_scrap679);
                    params();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:165:4: ';' '<init>' params return_
                    {
                    match(input,34,FOLLOW_34_in_scrap684); 

                    match(input,INIT,FOLLOW_INIT_in_scrap686); 

                    pushFollow(FOLLOW_params_in_scrap688);
                    params();

                    state._fsp--;


                    pushFollow(FOLLOW_return__in_scrap690);
                    return_();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:166:4: THROWS package_
                    {
                    match(input,THROWS,FOLLOW_THROWS_in_scrap695); 

                    pushFollow(FOLLOW_package__in_scrap697);
                    package_();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // src/com/riis/decompiler/DexToSourceWordpress.g:167:4: label
                    {
                    pushFollow(FOLLOW_label_in_scrap702);
                    label();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "scrap"



    // $ANTLR start "label"
    // src/com/riis/decompiler/DexToSourceWordpress.g:170:1: label : 'l' HEX_DIGIT ':' ;
    public final void label() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceWordpress.g:171:2: ( 'l' HEX_DIGIT ':' )
            // src/com/riis/decompiler/DexToSourceWordpress.g:171:4: 'l' HEX_DIGIT ':'
            {
            match(input,39,FOLLOW_39_in_label714); 

            match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_label716); 

            match(input,33,FOLLOW_33_in_label718); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "label"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\103\uffff";
    static final String DFA16_eofS =
        "\103\uffff";
    static final String DFA16_minS =
        "\1\11\1\54\1\7\1\36\1\47\1\7\1\16\1\23\1\12\1\7\1\10\1\7\2\uffff"+
        "\1\7\1\54\1\7\1\34\1\16\1\10\1\16\1\41\1\16\1\7\1\45\1\10\2\7\1"+
        "\12\1\16\1\34\1\41\2\10\1\44\1\16\1\7\1\10\1\54\2\7\1\10\1\16\2"+
        "\10\1\16\1\7\1\10\3\7\1\10\1\34\1\7\1\10\1\7\1\10\1\7\2\10\1\16"+
        "\2\7\2\10\2\7";
    static final String DFA16_maxS =
        "\1\11\1\54\1\7\1\36\1\47\1\7\1\47\1\23\1\53\1\7\1\43\1\7\2\uffff"+
        "\1\7\1\54\1\7\1\34\1\47\1\10\1\47\1\41\1\47\1\7\1\45\1\43\1\12\1"+
        "\10\1\53\1\47\1\34\1\41\1\10\1\43\1\44\2\47\1\43\1\54\1\12\1\10"+
        "\1\43\1\47\1\10\1\43\1\47\1\7\2\43\1\12\1\10\1\43\1\34\5\43\1\10"+
        "\1\43\1\47\1\12\1\10\4\43";
    static final String DFA16_acceptS =
        "\14\uffff\1\1\1\2\65\uffff";
    static final String DFA16_specialS =
        "\103\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\1\16",
            "\1\21\35\uffff\1\20\2\uffff\1\17",
            "\1\22",
            "\1\24\32\uffff\1\23",
            "\1\25",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\1\24",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\5\uffff\1"+
            "\33\1\32\1\uffff\1\34\4\uffff\1\13",
            "\1\35",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\1\36",
            "\1\37",
            "\1\41\24\uffff\1\42\5\uffff\1\40",
            "\2\44\1\uffff\1\43",
            "\2\44",
            "\1\21\3\uffff\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1"+
            "\12\10\uffff\1\10\4\uffff\1\13\1\20\2\uffff\1\17",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\1\45",
            "\1\46",
            "\1\41",
            "\1\41\24\uffff\1\42\1\uffff\1\50\1\47\1\uffff\1\51\1\40",
            "\1\52",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\34\4\uffff\1\13",
            "\2\44\5\uffff\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1"+
            "\12\5\uffff\1\33\1\32\1\uffff\1\34\4\uffff\1\13",
            "\1\54\24\uffff\1\55\5\uffff\1\53",
            "\1\56",
            "\2\60\1\uffff\1\57",
            "\2\60",
            "\1\41\24\uffff\1\42\5\uffff\1\40",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\1\54",
            "\1\54\24\uffff\1\55\1\uffff\1\62\1\61\1\uffff\1\63\1\53",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\1\64",
            "\1\41\24\uffff\1\42\4\uffff\1\51\1\40",
            "\1\60\1\65\24\uffff\1\42\1\uffff\1\50\1\47\1\uffff\1\51\1\40",
            "\2\67\1\uffff\1\66",
            "\2\67",
            "\1\54\24\uffff\1\55\5\uffff\1\53",
            "\1\70",
            "\1\60\1\65\24\uffff\1\42\1\uffff\1\50\1\47\1\uffff\1\51\1\40",
            "\1\54\24\uffff\1\55\4\uffff\1\63\1\53",
            "\1\67\1\71\24\uffff\1\55\1\uffff\1\62\1\61\1\uffff\1\63\1\53",
            "\1\73\24\uffff\1\74\5\uffff\1\72",
            "\1\67\1\71\24\uffff\1\55\1\uffff\1\62\1\61\1\uffff\1\63\1\53",
            "\1\73",
            "\1\73\24\uffff\1\74\1\uffff\1\76\1\75\1\uffff\1\77\1\72",
            "\1\7\1\11\2\uffff\1\14\1\uffff\1\15\4\uffff\1\12\10\uffff\1"+
            "\10\4\uffff\1\13",
            "\2\101\1\uffff\1\100",
            "\2\101",
            "\1\73\24\uffff\1\74\5\uffff\1\72",
            "\1\73\24\uffff\1\74\4\uffff\1\77\1\72",
            "\1\101\1\102\24\uffff\1\74\1\uffff\1\76\1\75\1\uffff\1\77\1"+
            "\72",
            "\1\101\1\102\24\uffff\1\74\1\uffff\1\76\1\75\1\uffff\1\77\1"+
            "\72"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "75:1: if_stmt : ( if_ ( scrap )* id1= new_instance id2= const_string invoke_direct ( scrap )* throw_ | if_ ( scrap )* RETURN_VOID ( scrap )* goto_stmt );";
        }
    }
 

    public static final BitSet FOLLOW_method_in_rule54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_start_in_method66 = new BitSet(new long[]{0x000000840200C200L});
    public static final BitSet FOLLOW_scrap_in_method68 = new BitSet(new long[]{0x000000840200C200L});
    public static final BitSet FOLLOW_if_stmt_in_method72 = new BitSet(new long[]{0x000000840201C200L});
    public static final BitSet FOLLOW_scrap_in_method74 = new BitSet(new long[]{0x000000840201C200L});
    public static final BitSet FOLLOW_method_end_in_method79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODSTRT_in_method_start91 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_flags_in_method_start95 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_method_start99 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_params_in_method_start103 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_return__in_method_start107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flag_in_flags123 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_flag142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_flag153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_params179 = new BitSet(new long[]{0x0000000820000100L});
    public static final BitSet FOLLOW_package__in_params184 = new BitSet(new long[]{0x0000000820000100L});
    public static final BitSet FOLLOW_29_in_params190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_internal_in_package_208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_package_internal224 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_package_internal227 = new BitSet(new long[]{0x0000000580000002L});
    public static final BitSet FOLLOW_set_in_package_internal230 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_32_in_package_internal246 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INIT_in_package_internal248 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_package_internal252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_return_269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_if_stmt283 = new BitSet(new long[]{0x000000840204C000L});
    public static final BitSet FOLLOW_scrap_in_if_stmt285 = new BitSet(new long[]{0x000000840204C000L});
    public static final BitSet FOLLOW_new_instance_in_if_stmt290 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_const_string_in_if_stmt294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_invoke_direct_in_if_stmt296 = new BitSet(new long[]{0x000000840300C000L});
    public static final BitSet FOLLOW_scrap_in_if_stmt298 = new BitSet(new long[]{0x000000840300C000L});
    public static final BitSet FOLLOW_throw__in_if_stmt301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_if_stmt310 = new BitSet(new long[]{0x000000840210C000L});
    public static final BitSet FOLLOW_scrap_in_if_stmt312 = new BitSet(new long[]{0x000000840210C000L});
    public static final BitSet FOLLOW_RETURN_VOID_in_if_stmt315 = new BitSet(new long[]{0x000000840220C000L});
    public static final BitSet FOLLOW_scrap_in_if_stmt317 = new BitSet(new long[]{0x000000840220C000L});
    public static final BitSet FOLLOW_goto_stmt_in_if_stmt322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_NEZ_in_if_333 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_if_337 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_339 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_if_341 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_if_343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_reg359 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_reg361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_INSTANCE_in_new_instance376 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_new_instance378 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_new_instance380 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_package__in_new_instance384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_STRING_in_const_string404 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_const_string406 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_const_string408 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_quoted_string_in_const_string412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_quoted_string428 = new BitSet(new long[]{0x00007FFFFFFFFFF0L});
    public static final BitSet FOLLOW_27_in_quoted_string436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_DIRECT_in_invoke_direct448 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_regs_in_invoke_direct450 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_invoke_direct452 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_package__in_invoke_direct454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_regs466 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_30_in_regs469 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_regs472 = new BitSet(new long[]{0x0000500040000000L});
    public static final BitSet FOLLOW_46_in_regs476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throw_488 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_throw_490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sget_in_goto_stmt504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_invoke_virtual_in_goto_stmt506 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_goto__in_goto_stmt509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SGET_in_sget525 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_sget527 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_sget529 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_package__in_sget533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual549 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_param_in_invoke_virtual551 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_invoke_virtual553 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_package__in_invoke_virtual555 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_invoke_virtual557 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_invoke_virtual561 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_params_in_invoke_virtual565 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_return__in_invoke_virtual567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_param583 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_30_in_param586 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_param589 = new BitSet(new long[]{0x0000500040000000L});
    public static final BitSet FOLLOW_46_in_param593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_goto_605 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_goto_607 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_goto_609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODEND_in_method_end629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_scrap640 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_REGISTERS_in_scrap642 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_scrap644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_scrap649 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_scrap651 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_scrap653 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_params_in_scrap655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_scrap660 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_scrap662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_scrap667 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_scrap669 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_scrap671 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_scrap673 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_scrap675 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_reg_in_scrap677 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_params_in_scrap679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_scrap684 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INIT_in_scrap686 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_params_in_scrap688 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_return__in_scrap690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_scrap695 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_package__in_scrap697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_scrap702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_label714 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_label716 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_label718 = new BitSet(new long[]{0x0000000000000002L});

}