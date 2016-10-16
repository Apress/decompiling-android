// $ANTLR 3.4 src/com/riis/decompiler/DexToSourceHello.g 2012-09-20 16:27:37

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToSourceHelloParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS", "COMMENT", "CONST_16", "CONST_4", "CONST_HIGH_16", "DIGIT", "FINAL", "IDENT", "INIT", "INVOKE_DIRECT", "INVOKE_SUPER", "INVOKE_VIRTUAL", "LIMIT", "LINE", "METHODEND", "METHODSTRT", "PUBLIC", "REGISTERS", "RETURN_VOID", "SOURCE", "STATIC", "SUPER", "WS", "'('", "')'", "','", "'.java'", "'/'", "':'", "';'", "'L'", "'V'", "']'", "'parameter['", "'this:'", "'v'", "'{'", "'}'"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DexToSourceHelloParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToSourceHelloParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DexToSourceHelloParser.tokenNames; }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToSourceHello.g"; }


    	JavaOutput fout = DexToSource.fout;



    // $ANTLR start "rule"
    // src/com/riis/decompiler/DexToSourceHello.g:19:1: rule : class_name source constructor ( methods )+ ;
    public final void rule() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:22:2: ( class_name source constructor ( methods )+ )
            // src/com/riis/decompiler/DexToSourceHello.g:22:4: class_name source constructor ( methods )+
            {
            pushFollow(FOLLOW_class_name_in_rule54);
            class_name();

            state._fsp--;


            pushFollow(FOLLOW_source_in_rule56);
            source();

            state._fsp--;


            pushFollow(FOLLOW_constructor_in_rule58);
            constructor();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceHello.g:22:34: ( methods )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==METHODSTRT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:22:34: methods
            	    {
            	    pushFollow(FOLLOW_methods_in_rule60);
            	    methods();

            	    state._fsp--;


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

            fout.printJava("}"); fout.close();
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



    // $ANTLR start "class_name"
    // src/com/riis/decompiler/DexToSourceHello.g:25:1: class_name : CLASS f1= flags id2= package_ SUPER id3= package_ ;
    public final void class_name() throws RecognitionException {
        DexToSourceHelloParser.flags_return f1 =null;

        String id2 =null;

        String id3 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:26:2: ( CLASS f1= flags id2= package_ SUPER id3= package_ )
            // src/com/riis/decompiler/DexToSourceHello.g:26:4: CLASS f1= flags id2= package_ SUPER id3= package_
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_name73); 

            pushFollow(FOLLOW_flags_in_class_name77);
            f1=flags();

            state._fsp--;


            pushFollow(FOLLOW_package__in_class_name81);
            id2=package_();

            state._fsp--;


            match(input,SUPER,FOLLOW_SUPER_in_class_name83); 

            pushFollow(FOLLOW_package__in_class_name87);
            id3=package_();

            state._fsp--;


            fout.printJava("package " + id2.substring(0, id2.lastIndexOf('.')) + ";\n ");
            		
            		 String className = id2.substring(id2.lastIndexOf('.')+1, id2.length());
            		 
            		 fout.printJava((f1!=null?input.toString(f1.start,f1.stop):null) + " class " + className + " extends " + id3 + " {\n ");

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
    // $ANTLR end "class_name"


    public static class flags_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "flags"
    // src/com/riis/decompiler/DexToSourceHello.g:34:1: flags : ( flag )+ ;
    public final DexToSourceHelloParser.flags_return flags() throws RecognitionException {
        DexToSourceHelloParser.flags_return retval = new DexToSourceHelloParser.flags_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:35:2: ( ( flag )+ )
            // src/com/riis/decompiler/DexToSourceHello.g:35:4: ( flag )+
            {
            // src/com/riis/decompiler/DexToSourceHello.g:35:4: ( flag )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==PUBLIC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:35:4: flag
            	    {
            	    pushFollow(FOLLOW_flag_in_flags103);
            	    flag();

            	    state._fsp--;


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
    // src/com/riis/decompiler/DexToSourceHello.g:38:1: flag returns [String flag_result] : f1= 'public' ;
    public final String flag() throws RecognitionException {
        String flag_result = null;


        Token f1=null;

        try {
            // src/com/riis/decompiler/DexToSourceHello.g:39:2: (f1= 'public' )
            // src/com/riis/decompiler/DexToSourceHello.g:39:4: f1= 'public'
            {
            f1=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_flag122); 

            flag_result += (f1!=null?f1.getText():null);

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



    // $ANTLR start "package_"
    // src/com/riis/decompiler/DexToSourceHello.g:43:1: package_ returns [String result] : id1= package_internal ;
    public final String package_() throws RecognitionException {
        String result = null;


        DexToSourceHelloParser.package_internal_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:44:2: (id1= package_internal )
            // src/com/riis/decompiler/DexToSourceHello.g:44:4: id1= package_internal
            {
            pushFollow(FOLLOW_package_internal_in_package_144);
            id1=package_internal();

            state._fsp--;


            result = (id1!=null?input.toString(id1.start,id1.stop):null).replace("/", ".").replace(";", "");
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
    // src/com/riis/decompiler/DexToSourceHello.g:52:1: package_internal : ( 'L' )? IDENT ( '/' IDENT )* ( '/' '<init>' )? ( ';' )? ;
    public final DexToSourceHelloParser.package_internal_return package_internal() throws RecognitionException {
        DexToSourceHelloParser.package_internal_return retval = new DexToSourceHelloParser.package_internal_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:53:2: ( ( 'L' )? IDENT ( '/' IDENT )* ( '/' '<init>' )? ( ';' )? )
            // src/com/riis/decompiler/DexToSourceHello.g:53:4: ( 'L' )? IDENT ( '/' IDENT )* ( '/' '<init>' )? ( ';' )?
            {
            // src/com/riis/decompiler/DexToSourceHello.g:53:4: ( 'L' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceHello.g:53:4: 'L'
                    {
                    match(input,34,FOLLOW_34_in_package_internal160); 

                    }
                    break;

            }


            match(input,IDENT,FOLLOW_IDENT_in_package_internal163); 

            // src/com/riis/decompiler/DexToSourceHello.g:53:15: ( '/' IDENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==IDENT) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:53:16: '/' IDENT
            	    {
            	    match(input,31,FOLLOW_31_in_package_internal166); 

            	    match(input,IDENT,FOLLOW_IDENT_in_package_internal168); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // src/com/riis/decompiler/DexToSourceHello.g:53:28: ( '/' '<init>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceHello.g:53:29: '/' '<init>'
                    {
                    match(input,31,FOLLOW_31_in_package_internal173); 

                    match(input,INIT,FOLLOW_INIT_in_package_internal175); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToSourceHello.g:53:44: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==IDENT||LA6_3==28||LA6_3==31||(LA6_3 >= 33 && LA6_3 <= 34)) ) {
                        alt6=1;
                    }
                }
                else if ( (LA6_1==SOURCE||LA6_1==SUPER||LA6_1==28||(LA6_1 >= 33 && LA6_1 <= 34)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceHello.g:53:44: ';'
                    {
                    match(input,33,FOLLOW_33_in_package_internal179); 

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



    // $ANTLR start "source"
    // src/com/riis/decompiler/DexToSourceHello.g:56:1: source : SOURCE IDENT '.java' ;
    public final void source() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:57:2: ( SOURCE IDENT '.java' )
            // src/com/riis/decompiler/DexToSourceHello.g:57:4: SOURCE IDENT '.java'
            {
            match(input,SOURCE,FOLLOW_SOURCE_in_source192); 

            match(input,IDENT,FOLLOW_IDENT_in_source194); 

            match(input,30,FOLLOW_30_in_source196); 

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
    // $ANTLR end "source"



    // $ANTLR start "constructor"
    // src/com/riis/decompiler/DexToSourceHello.g:60:1: constructor : METHODSTRT f1= flags INIT p1= params r1= return_ ( scrap )* invoke_direct ';' '<init>' params return_ RETURN_VOID METHODEND ;
    public final void constructor() throws RecognitionException {
        DexToSourceHelloParser.flags_return f1 =null;

        String p1 =null;

        String r1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:61:2: ( METHODSTRT f1= flags INIT p1= params r1= return_ ( scrap )* invoke_direct ';' '<init>' params return_ RETURN_VOID METHODEND )
            // src/com/riis/decompiler/DexToSourceHello.g:61:4: METHODSTRT f1= flags INIT p1= params r1= return_ ( scrap )* invoke_direct ';' '<init>' params return_ RETURN_VOID METHODEND
            {
            match(input,METHODSTRT,FOLLOW_METHODSTRT_in_constructor208); 

            pushFollow(FOLLOW_flags_in_constructor212);
            f1=flags();

            state._fsp--;


            match(input,INIT,FOLLOW_INIT_in_constructor214); 

            pushFollow(FOLLOW_params_in_constructor218);
            p1=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_constructor222);
            r1=return_();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceHello.g:62:4: ( scrap )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= LIMIT && LA7_0 <= LINE)||LA7_0==RETURN_VOID||LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:62:4: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_constructor227);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_invoke_direct_in_constructor237);
            invoke_direct();

            state._fsp--;


            match(input,33,FOLLOW_33_in_constructor239); 

            match(input,INIT,FOLLOW_INIT_in_constructor241); 

            pushFollow(FOLLOW_params_in_constructor243);
            params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_constructor245);
            return_();

            state._fsp--;


            match(input,RETURN_VOID,FOLLOW_RETURN_VOID_in_constructor250); 

            match(input,METHODEND,FOLLOW_METHODEND_in_constructor259); 

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
    // $ANTLR end "constructor"



    // $ANTLR start "params"
    // src/com/riis/decompiler/DexToSourceHello.g:70:1: params returns [String result] : '(' (id1= package_ )* ')' ;
    public final String params() throws RecognitionException {
        String result = null;


        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:71:2: ( '(' (id1= package_ )* ')' )
            // src/com/riis/decompiler/DexToSourceHello.g:71:4: '(' (id1= package_ )* ')'
            {
            match(input,27,FOLLOW_27_in_params275); 

            result = "(";

            // src/com/riis/decompiler/DexToSourceHello.g:71:25: (id1= package_ )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:71:26: id1= package_
            	    {
            	    pushFollow(FOLLOW_package__in_params282);
            	    id1=package_();

            	    state._fsp--;


            	    result += id1;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,28,FOLLOW_28_in_params288); 

            result += ")";

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



    // $ANTLR start "return_"
    // src/com/riis/decompiler/DexToSourceHello.g:74:1: return_ returns [String result] : 'V' ;
    public final String return_() throws RecognitionException {
        String result = null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:75:2: ( 'V' )
            // src/com/riis/decompiler/DexToSourceHello.g:75:4: 'V'
            {
            match(input,35,FOLLOW_35_in_return_306); 

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



    // $ANTLR start "invoke_direct"
    // src/com/riis/decompiler/DexToSourceHello.g:78:1: invoke_direct : INVOKE_DIRECT regs ',' package_ ;
    public final void invoke_direct() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:79:2: ( INVOKE_DIRECT regs ',' package_ )
            // src/com/riis/decompiler/DexToSourceHello.g:79:4: INVOKE_DIRECT regs ',' package_
            {
            match(input,INVOKE_DIRECT,FOLLOW_INVOKE_DIRECT_in_invoke_direct320); 

            pushFollow(FOLLOW_regs_in_invoke_direct322);
            regs();

            state._fsp--;


            match(input,29,FOLLOW_29_in_invoke_direct324); 

            pushFollow(FOLLOW_package__in_invoke_direct326);
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
    // src/com/riis/decompiler/DexToSourceHello.g:82:1: regs : '{' ( reg )+ '}' ;
    public final void regs() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:83:2: ( '{' ( reg )+ '}' )
            // src/com/riis/decompiler/DexToSourceHello.g:83:4: '{' ( reg )+ '}'
            {
            match(input,40,FOLLOW_40_in_regs338); 

            // src/com/riis/decompiler/DexToSourceHello.g:83:8: ( reg )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:83:8: reg
            	    {
            	    pushFollow(FOLLOW_reg_in_regs340);
            	    reg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input,41,FOLLOW_41_in_regs343); 

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



    // $ANTLR start "reg"
    // src/com/riis/decompiler/DexToSourceHello.g:86:1: reg : 'v' DIGIT ;
    public final void reg() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:87:2: ( 'v' DIGIT )
            // src/com/riis/decompiler/DexToSourceHello.g:87:4: 'v' DIGIT
            {
            match(input,39,FOLLOW_39_in_reg355); 

            match(input,DIGIT,FOLLOW_DIGIT_in_reg357); 

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
    // $ANTLR end "reg"



    // $ANTLR start "methods"
    // src/com/riis/decompiler/DexToSourceHello.g:90:1: methods : method_start ( scrap )* invoke_super ( scrap )* invoke_virtual_content ( scrap )* method_end ;
    public final void methods() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:91:2: ( method_start ( scrap )* invoke_super ( scrap )* invoke_virtual_content ( scrap )* method_end )
            // src/com/riis/decompiler/DexToSourceHello.g:91:4: method_start ( scrap )* invoke_super ( scrap )* invoke_virtual_content ( scrap )* method_end
            {
            pushFollow(FOLLOW_method_start_in_methods369);
            method_start();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceHello.g:91:17: ( scrap )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= LIMIT && LA10_0 <= LINE)||LA10_0==RETURN_VOID||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:91:17: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_methods371);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_invoke_super_in_methods374);
            invoke_super();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceHello.g:91:37: ( scrap )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= LIMIT && LA11_0 <= LINE)||LA11_0==RETURN_VOID||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:91:37: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_methods376);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_invoke_virtual_content_in_methods379);
            invoke_virtual_content();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceHello.g:91:67: ( scrap )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= LIMIT && LA12_0 <= LINE)||LA12_0==RETURN_VOID||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:91:67: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_methods381);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_method_end_in_methods384);
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
    // $ANTLR end "methods"



    // $ANTLR start "method_start"
    // src/com/riis/decompiler/DexToSourceHello.g:94:1: method_start : METHODSTRT f1= flags id1= IDENT p1= params r1= return_ ;
    public final void method_start() throws RecognitionException {
        Token id1=null;
        DexToSourceHelloParser.flags_return f1 =null;

        String p1 =null;

        String r1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:95:2: ( METHODSTRT f1= flags id1= IDENT p1= params r1= return_ )
            // src/com/riis/decompiler/DexToSourceHello.g:95:4: METHODSTRT f1= flags id1= IDENT p1= params r1= return_
            {
            match(input,METHODSTRT,FOLLOW_METHODSTRT_in_method_start396); 

            pushFollow(FOLLOW_flags_in_method_start400);
            f1=flags();

            state._fsp--;


            id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_method_start404); 

            pushFollow(FOLLOW_params_in_method_start408);
            p1=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_method_start412);
            r1=return_();

            state._fsp--;


            fout.printJava((f1!=null?input.toString(f1.start,f1.stop):null) + " " + r1 + " " + (id1!=null?id1.getText():null) +
            						p1.replace(")", "") + " " + p1.substring(p1.lastIndexOf('.')+1, p1.length()).toLowerCase() + " {");

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



    // $ANTLR start "invoke_super"
    // src/com/riis/decompiler/DexToSourceHello.g:100:1: invoke_super : INVOKE_SUPER param ',' package_ ';' id1= IDENT id2= params return_ ;
    public final void invoke_super() throws RecognitionException {
        Token id1=null;
        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:101:2: ( INVOKE_SUPER param ',' package_ ';' id1= IDENT id2= params return_ )
            // src/com/riis/decompiler/DexToSourceHello.g:101:4: INVOKE_SUPER param ',' package_ ';' id1= IDENT id2= params return_
            {
            match(input,INVOKE_SUPER,FOLLOW_INVOKE_SUPER_in_invoke_super428); 

            pushFollow(FOLLOW_param_in_invoke_super430);
            param();

            state._fsp--;


            match(input,29,FOLLOW_29_in_invoke_super432); 

            pushFollow(FOLLOW_package__in_invoke_super434);
            package_();

            state._fsp--;


            match(input,33,FOLLOW_33_in_invoke_super436); 

            id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_invoke_super440); 

            pushFollow(FOLLOW_params_in_invoke_super444);
            id2=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_invoke_super446);
            return_();

            state._fsp--;


            fout.printJava("super." + (id1!=null?id1.getText():null) + "(" + id2.substring(id2.lastIndexOf('.')+1, id2.length()).toLowerCase() + ";");

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
    // $ANTLR end "invoke_super"



    // $ANTLR start "param"
    // src/com/riis/decompiler/DexToSourceHello.g:105:1: param : ( '{' reg '}' | '{' reg ',' reg '}' );
    public final void param() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:106:2: ( '{' reg '}' | '{' reg ',' reg '}' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==39) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==DIGIT) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==41) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==29) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceHello.g:106:4: '{' reg '}'
                    {
                    match(input,40,FOLLOW_40_in_param462); 

                    pushFollow(FOLLOW_reg_in_param464);
                    reg();

                    state._fsp--;


                    match(input,41,FOLLOW_41_in_param466); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceHello.g:107:4: '{' reg ',' reg '}'
                    {
                    match(input,40,FOLLOW_40_in_param471); 

                    pushFollow(FOLLOW_reg_in_param473);
                    reg();

                    state._fsp--;


                    match(input,29,FOLLOW_29_in_param475); 

                    pushFollow(FOLLOW_reg_in_param477);
                    reg();

                    state._fsp--;


                    match(input,41,FOLLOW_41_in_param479); 

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
    // $ANTLR end "param"



    // $ANTLR start "invoke_virtual_content"
    // src/com/riis/decompiler/DexToSourceHello.g:110:1: invoke_virtual_content : id1= constant id2= invoke_virtual ;
    public final void invoke_virtual_content() throws RecognitionException {
        String id1 =null;

        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceHello.g:111:2: (id1= constant id2= invoke_virtual )
            // src/com/riis/decompiler/DexToSourceHello.g:111:4: id1= constant id2= invoke_virtual
            {
            pushFollow(FOLLOW_constant_in_invoke_virtual_content493);
            id1=constant();

            state._fsp--;


            pushFollow(FOLLOW_invoke_virtual_in_invoke_virtual_content497);
            id2=invoke_virtual();

            state._fsp--;


            fout.printJava(id2 + "(" + id1 + ");");

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
    // $ANTLR end "invoke_virtual_content"



    // $ANTLR start "constant"
    // src/com/riis/decompiler/DexToSourceHello.g:115:1: constant returns [String number] : const_ reg ',' (id1= DIGIT )+ ;
    public final String constant() throws RecognitionException {
        String number = null;


        Token id1=null;

        number = "";
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:117:2: ( const_ reg ',' (id1= DIGIT )+ )
            // src/com/riis/decompiler/DexToSourceHello.g:117:4: const_ reg ',' (id1= DIGIT )+
            {
            pushFollow(FOLLOW_const__in_constant522);
            const_();

            state._fsp--;


            pushFollow(FOLLOW_reg_in_constant524);
            reg();

            state._fsp--;


            match(input,29,FOLLOW_29_in_constant526); 

            // src/com/riis/decompiler/DexToSourceHello.g:117:19: (id1= DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==DIGIT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceHello.g:117:20: id1= DIGIT
            	    {
            	    id1=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_constant531); 

            	    number += (id1!=null?id1.getText():null);

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return number;
    }
    // $ANTLR end "constant"



    // $ANTLR start "invoke_virtual"
    // src/com/riis/decompiler/DexToSourceHello.g:120:1: invoke_virtual returns [String name] : INVOKE_VIRTUAL param ',' package_ ';' id1= IDENT params return_ ;
    public final String invoke_virtual() throws RecognitionException {
        String name = null;


        Token id1=null;

        try {
            // src/com/riis/decompiler/DexToSourceHello.g:121:2: ( INVOKE_VIRTUAL param ',' package_ ';' id1= IDENT params return_ )
            // src/com/riis/decompiler/DexToSourceHello.g:121:4: INVOKE_VIRTUAL param ',' package_ ';' id1= IDENT params return_
            {
            match(input,INVOKE_VIRTUAL,FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual550); 

            pushFollow(FOLLOW_param_in_invoke_virtual552);
            param();

            state._fsp--;


            match(input,29,FOLLOW_29_in_invoke_virtual554); 

            pushFollow(FOLLOW_package__in_invoke_virtual556);
            package_();

            state._fsp--;


            match(input,33,FOLLOW_33_in_invoke_virtual558); 

            id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_invoke_virtual562); 

            pushFollow(FOLLOW_params_in_invoke_virtual564);
            params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_invoke_virtual566);
            return_();

            state._fsp--;


            name = (id1!=null?id1.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "invoke_virtual"



    // $ANTLR start "method_end"
    // src/com/riis/decompiler/DexToSourceHello.g:125:1: method_end : METHODEND ;
    public final void method_end() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:128:2: ( METHODEND )
            // src/com/riis/decompiler/DexToSourceHello.g:128:4: METHODEND
            {
            match(input,METHODEND,FOLLOW_METHODEND_in_method_end590); 

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



    // $ANTLR start "const_"
    // src/com/riis/decompiler/DexToSourceHello.g:131:1: const_ : ( CONST_4 | CONST_16 | CONST_HIGH_16 );
    public final void const_() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:132:2: ( CONST_4 | CONST_16 | CONST_HIGH_16 )
            // src/com/riis/decompiler/DexToSourceHello.g:
            {
            if ( (input.LA(1) >= CONST_16 && input.LA(1) <= CONST_HIGH_16) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "const_"



    // $ANTLR start "scrap"
    // src/com/riis/decompiler/DexToSourceHello.g:137:1: scrap : ( LIMIT REGISTERS DIGIT | ';' 'this:' reg params | LINE ( DIGIT )+ | RETURN_VOID | ';' 'parameter[' DIGIT ']' ':' reg params );
    public final void scrap() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceHello.g:138:2: ( LIMIT REGISTERS DIGIT | ';' 'this:' reg params | LINE ( DIGIT )+ | RETURN_VOID | ';' 'parameter[' DIGIT ']' ':' reg params )
            int alt16=5;
            switch ( input.LA(1) ) {
            case LIMIT:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==38) ) {
                    alt16=2;
                }
                else if ( (LA16_2==37) ) {
                    alt16=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
                }
                break;
            case LINE:
                {
                alt16=3;
                }
                break;
            case RETURN_VOID:
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
                    // src/com/riis/decompiler/DexToSourceHello.g:138:4: LIMIT REGISTERS DIGIT
                    {
                    match(input,LIMIT,FOLLOW_LIMIT_in_scrap623); 

                    match(input,REGISTERS,FOLLOW_REGISTERS_in_scrap625); 

                    match(input,DIGIT,FOLLOW_DIGIT_in_scrap627); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceHello.g:139:4: ';' 'this:' reg params
                    {
                    match(input,33,FOLLOW_33_in_scrap632); 

                    match(input,38,FOLLOW_38_in_scrap634); 

                    pushFollow(FOLLOW_reg_in_scrap636);
                    reg();

                    state._fsp--;


                    pushFollow(FOLLOW_params_in_scrap638);
                    params();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToSourceHello.g:140:4: LINE ( DIGIT )+
                    {
                    match(input,LINE,FOLLOW_LINE_in_scrap643); 

                    // src/com/riis/decompiler/DexToSourceHello.g:140:9: ( DIGIT )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==DIGIT) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceHello.g:140:9: DIGIT
                    	    {
                    	    match(input,DIGIT,FOLLOW_DIGIT_in_scrap645); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // src/com/riis/decompiler/DexToSourceHello.g:141:4: RETURN_VOID
                    {
                    match(input,RETURN_VOID,FOLLOW_RETURN_VOID_in_scrap651); 

                    }
                    break;
                case 5 :
                    // src/com/riis/decompiler/DexToSourceHello.g:142:4: ';' 'parameter[' DIGIT ']' ':' reg params
                    {
                    match(input,33,FOLLOW_33_in_scrap656); 

                    match(input,37,FOLLOW_37_in_scrap658); 

                    match(input,DIGIT,FOLLOW_DIGIT_in_scrap660); 

                    match(input,36,FOLLOW_36_in_scrap662); 

                    match(input,32,FOLLOW_32_in_scrap664); 

                    pushFollow(FOLLOW_reg_in_scrap666);
                    reg();

                    state._fsp--;


                    pushFollow(FOLLOW_params_in_scrap668);
                    params();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_class_name_in_rule54 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_source_in_rule56 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_constructor_in_rule58 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_methods_in_rule60 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_CLASS_in_class_name73 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_flags_in_class_name77 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_package__in_class_name81 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SUPER_in_class_name83 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_package__in_class_name87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flag_in_flags103 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_PUBLIC_in_flag122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_internal_in_package_144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_package_internal160 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_package_internal163 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_package_internal166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_package_internal168 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_package_internal173 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INIT_in_package_internal175 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_package_internal179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_in_source192 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_source194 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_source196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODSTRT_in_constructor208 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_flags_in_constructor212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INIT_in_constructor214 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_constructor218 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_return__in_constructor222 = new BitSet(new long[]{0x0000000200432000L});
    public static final BitSet FOLLOW_scrap_in_constructor227 = new BitSet(new long[]{0x0000000200432000L});
    public static final BitSet FOLLOW_invoke_direct_in_constructor237 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_constructor239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INIT_in_constructor241 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_constructor243 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_return__in_constructor245 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RETURN_VOID_in_constructor250 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_METHODEND_in_constructor259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_params275 = new BitSet(new long[]{0x0000000410000800L});
    public static final BitSet FOLLOW_package__in_params282 = new BitSet(new long[]{0x0000000410000800L});
    public static final BitSet FOLLOW_28_in_params288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_return_306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_DIRECT_in_invoke_direct320 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_regs_in_invoke_direct322 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_invoke_direct324 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_package__in_invoke_direct326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_regs338 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_regs340 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_regs343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_reg355 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_reg357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_start_in_methods369 = new BitSet(new long[]{0x0000000200434000L});
    public static final BitSet FOLLOW_scrap_in_methods371 = new BitSet(new long[]{0x0000000200434000L});
    public static final BitSet FOLLOW_invoke_super_in_methods374 = new BitSet(new long[]{0x00000002004301C0L});
    public static final BitSet FOLLOW_scrap_in_methods376 = new BitSet(new long[]{0x00000002004301C0L});
    public static final BitSet FOLLOW_invoke_virtual_content_in_methods379 = new BitSet(new long[]{0x0000000200470000L});
    public static final BitSet FOLLOW_scrap_in_methods381 = new BitSet(new long[]{0x0000000200470000L});
    public static final BitSet FOLLOW_method_end_in_methods384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODSTRT_in_method_start396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_flags_in_method_start400 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_method_start404 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_method_start408 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_return__in_method_start412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_SUPER_in_invoke_super428 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_param_in_invoke_super430 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_invoke_super432 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_package__in_invoke_super434 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_invoke_super436 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_invoke_super440 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_invoke_super444 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_return__in_invoke_super446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_param462 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_param464 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_param466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_param471 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_param473 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_param475 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_param477 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_param479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_invoke_virtual_content493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_invoke_virtual_in_invoke_virtual_content497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const__in_constant522 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_constant524 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_constant526 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_constant531 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual550 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_param_in_invoke_virtual552 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_invoke_virtual554 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_package__in_invoke_virtual556 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_invoke_virtual558 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENT_in_invoke_virtual562 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_invoke_virtual564 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_return__in_invoke_virtual566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODEND_in_method_end590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_scrap623 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_REGISTERS_in_scrap625 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_scrap627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_scrap632 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_scrap634 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_scrap636 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_scrap638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_scrap643 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_scrap645 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RETURN_VOID_in_scrap651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_scrap656 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_scrap658 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_scrap660 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_scrap662 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_scrap664 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_reg_in_scrap666 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_scrap668 = new BitSet(new long[]{0x0000000000000002L});

}