// $ANTLR 3.4 src/com/riis/decompiler/DexToSourceCasting.g 2012-09-20 16:27:32

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToSourceCastingParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_INT", "CLASS", "COMMENT", "CONST_16", "CONST_4", "CONST_HIGH_16", "CONST_STRING", "DIGIT", "FIELD", "FINAL", "GOTO", "IDENT", "IF_GE", "INIT", "INT_TO_CHAR", "INVOKE_DIRECT", "INVOKE_VIRTUAL", "LABEL", "LIMIT", "LINE", "METHODEND", "METHODSTRT", "MOVE_RESULT_OBJECT", "NEW_INSTANCE", "PUBLIC", "REGISTERS", "RETURN_VOID", "SGET_OBJECT", "SOURCE", "STATIC", "SUPER", "WS", "'\"'", "'('", "')'", "'.'", "'.java'", "'/'", "':'", "';'", "'='", "'L'", "'V'", "'[L'", "']'", "'parameter['", "'this:'", "'v'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ADD_INT=4;
    public static final int CLASS=5;
    public static final int COMMENT=6;
    public static final int CONST_16=7;
    public static final int CONST_4=8;
    public static final int CONST_HIGH_16=9;
    public static final int CONST_STRING=10;
    public static final int DIGIT=11;
    public static final int FIELD=12;
    public static final int FINAL=13;
    public static final int GOTO=14;
    public static final int IDENT=15;
    public static final int IF_GE=16;
    public static final int INIT=17;
    public static final int INT_TO_CHAR=18;
    public static final int INVOKE_DIRECT=19;
    public static final int INVOKE_VIRTUAL=20;
    public static final int LABEL=21;
    public static final int LIMIT=22;
    public static final int LINE=23;
    public static final int METHODEND=24;
    public static final int METHODSTRT=25;
    public static final int MOVE_RESULT_OBJECT=26;
    public static final int NEW_INSTANCE=27;
    public static final int PUBLIC=28;
    public static final int REGISTERS=29;
    public static final int RETURN_VOID=30;
    public static final int SGET_OBJECT=31;
    public static final int SOURCE=32;
    public static final int STATIC=33;
    public static final int SUPER=34;
    public static final int WS=35;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DexToSourceCastingParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToSourceCastingParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DexToSourceCastingParser.tokenNames; }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToSourceCasting.g"; }


    	String className;
    	String flag_result = "";
    	
    	JavaOutput fout = DexToSource.fout;



    // $ANTLR start "rule"
    // src/com/riis/decompiler/DexToSourceCasting.g:22:1: rule : class_name super_ source fields constructor ( methods )+ ;
    public final void rule() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:25:2: ( class_name super_ source fields constructor ( methods )+ )
            // src/com/riis/decompiler/DexToSourceCasting.g:25:4: class_name super_ source fields constructor ( methods )+
            {
            pushFollow(FOLLOW_class_name_in_rule54);
            class_name();

            state._fsp--;


            pushFollow(FOLLOW_super__in_rule56);
            super_();

            state._fsp--;


            pushFollow(FOLLOW_source_in_rule58);
            source();

            state._fsp--;


            pushFollow(FOLLOW_fields_in_rule60);
            fields();

            state._fsp--;


            pushFollow(FOLLOW_constructor_in_rule62);
            constructor();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceCasting.g:25:48: ( methods )+
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
            	    // src/com/riis/decompiler/DexToSourceCasting.g:25:48: methods
            	    {
            	    pushFollow(FOLLOW_methods_in_rule64);
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
    // src/com/riis/decompiler/DexToSourceCasting.g:28:1: class_name : CLASS f1= flags id2= IDENT ;
    public final void class_name() throws RecognitionException {
        Token id2=null;
        DexToSourceCastingParser.flags_return f1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:29:2: ( CLASS f1= flags id2= IDENT )
            // src/com/riis/decompiler/DexToSourceCasting.g:29:4: CLASS f1= flags id2= IDENT
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_name77); 

            pushFollow(FOLLOW_flags_in_class_name81);
            f1=flags();

            state._fsp--;


            id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_class_name85); 

            fout.printJava((f1!=null?input.toString(f1.start,f1.stop):null) + " class " + (id2!=null?id2.getText():null) + " {");
            		 className = (id2!=null?id2.getText():null);

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



    // $ANTLR start "super_"
    // src/com/riis/decompiler/DexToSourceCasting.g:34:1: super_ : SUPER package_ ;
    public final void super_() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:35:2: ( SUPER package_ )
            // src/com/riis/decompiler/DexToSourceCasting.g:35:4: SUPER package_
            {
            match(input,SUPER,FOLLOW_SUPER_in_super_101); 

            pushFollow(FOLLOW_package__in_super_103);
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
    // $ANTLR end "super_"



    // $ANTLR start "source"
    // src/com/riis/decompiler/DexToSourceCasting.g:38:1: source : SOURCE IDENT '.java' ;
    public final void source() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:39:2: ( SOURCE IDENT '.java' )
            // src/com/riis/decompiler/DexToSourceCasting.g:39:4: SOURCE IDENT '.java'
            {
            match(input,SOURCE,FOLLOW_SOURCE_in_source115); 

            match(input,IDENT,FOLLOW_IDENT_in_source117); 

            match(input,40,FOLLOW_40_in_source119); 

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



    // $ANTLR start "fields"
    // src/com/riis/decompiler/DexToSourceCasting.g:42:1: fields : ( field )+ ;
    public final void fields() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:45:2: ( ( field )+ )
            // src/com/riis/decompiler/DexToSourceCasting.g:45:4: ( field )+
            {
            // src/com/riis/decompiler/DexToSourceCasting.g:45:4: ( field )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FIELD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:45:4: field
            	    {
            	    pushFollow(FOLLOW_field_in_fields139);
            	    field();

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

            fout.printJava(" ");
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
    // $ANTLR end "fields"



    // $ANTLR start "field"
    // src/com/riis/decompiler/DexToSourceCasting.g:48:1: field : FIELD f1= flags id2= IDENT p1= package_ ';' '=' id4= quoted_string ;
    public final void field() throws RecognitionException {
        Token id2=null;
        DexToSourceCastingParser.flags_return f1 =null;

        String p1 =null;

        String id4 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:49:2: ( FIELD f1= flags id2= IDENT p1= package_ ';' '=' id4= quoted_string )
            // src/com/riis/decompiler/DexToSourceCasting.g:49:4: FIELD f1= flags id2= IDENT p1= package_ ';' '=' id4= quoted_string
            {
            match(input,FIELD,FOLLOW_FIELD_in_field152); 

            pushFollow(FOLLOW_flags_in_field156);
            f1=flags();

            state._fsp--;


            id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_field160); 

            pushFollow(FOLLOW_package__in_field164);
            p1=package_();

            state._fsp--;


            match(input,43,FOLLOW_43_in_field166); 

            match(input,44,FOLLOW_44_in_field168); 

            pushFollow(FOLLOW_quoted_string_in_field172);
            id4=quoted_string();

            state._fsp--;


            fout.printJava((f1!=null?input.toString(f1.start,f1.stop):null) + " " + p1 + " " + (id2!=null?id2.getText():null) + " = \"" + id4 + "\"" );

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
    // $ANTLR end "field"



    // $ANTLR start "constructor"
    // src/com/riis/decompiler/DexToSourceCasting.g:53:1: constructor : METHODSTRT f1= flags INIT p1= params r1= return_ ( scrap )* method_end ;
    public final void constructor() throws RecognitionException {
        DexToSourceCastingParser.flags_return f1 =null;

        String p1 =null;

        String r1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:54:2: ( METHODSTRT f1= flags INIT p1= params r1= return_ ( scrap )* method_end )
            // src/com/riis/decompiler/DexToSourceCasting.g:54:4: METHODSTRT f1= flags INIT p1= params r1= return_ ( scrap )* method_end
            {
            match(input,METHODSTRT,FOLLOW_METHODSTRT_in_constructor188); 

            pushFollow(FOLLOW_flags_in_constructor192);
            f1=flags();

            state._fsp--;


            match(input,INIT,FOLLOW_INIT_in_constructor194); 

            pushFollow(FOLLOW_params_in_constructor198);
            p1=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_constructor202);
            r1=return_();

            state._fsp--;


            fout.printJava((f1!=null?input.toString(f1.start,f1.stop):null) + " " + className + p1 + " {");

            // src/com/riis/decompiler/DexToSourceCasting.g:56:4: ( scrap )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==INVOKE_DIRECT||(LA3_0 >= LIMIT && LA3_0 <= LINE)||LA3_0==RETURN_VOID||LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:56:4: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_constructor211);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_method_end_in_constructor214);
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
    // $ANTLR end "constructor"



    // $ANTLR start "methods"
    // src/com/riis/decompiler/DexToSourceCasting.g:59:1: methods : ( method_start ( scrap )* method_end | method_start ( scrap )* for_start for_body ( scrap )* for_end method_end );
    public final void methods() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:60:2: ( method_start ( scrap )* method_end | method_start ( scrap )* for_start for_body ( scrap )* for_end method_end )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:60:4: method_start ( scrap )* method_end
                    {
                    pushFollow(FOLLOW_method_start_in_methods226);
                    method_start();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToSourceCasting.g:60:17: ( scrap )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==INVOKE_DIRECT||(LA4_0 >= LIMIT && LA4_0 <= LINE)||LA4_0==RETURN_VOID||LA4_0==43) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceCasting.g:60:17: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_methods228);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    pushFollow(FOLLOW_method_end_in_methods231);
                    method_end();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:61:4: method_start ( scrap )* for_start for_body ( scrap )* for_end method_end
                    {
                    pushFollow(FOLLOW_method_start_in_methods236);
                    method_start();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToSourceCasting.g:61:17: ( scrap )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==INVOKE_DIRECT||(LA5_0 >= LIMIT && LA5_0 <= LINE)||LA5_0==RETURN_VOID||LA5_0==43) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceCasting.g:61:17: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_methods238);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    pushFollow(FOLLOW_for_start_in_methods241);
                    for_start();

                    state._fsp--;


                    pushFollow(FOLLOW_for_body_in_methods243);
                    for_body();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToSourceCasting.g:61:43: ( scrap )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==INVOKE_DIRECT||(LA6_0 >= LIMIT && LA6_0 <= LINE)||LA6_0==RETURN_VOID||LA6_0==43) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceCasting.g:61:43: scrap
                    	    {
                    	    pushFollow(FOLLOW_scrap_in_methods245);
                    	    scrap();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    pushFollow(FOLLOW_for_end_in_methods248);
                    for_end();

                    state._fsp--;


                    pushFollow(FOLLOW_method_end_in_methods250);
                    method_end();

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
    // $ANTLR end "methods"



    // $ANTLR start "method_start"
    // src/com/riis/decompiler/DexToSourceCasting.g:64:1: method_start : METHODSTRT f1= flags id1= IDENT p1= params r1= return_ ;
    public final void method_start() throws RecognitionException {
        Token id1=null;
        DexToSourceCastingParser.flags_return f1 =null;

        String p1 =null;

        String r1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:65:2: ( METHODSTRT f1= flags id1= IDENT p1= params r1= return_ )
            // src/com/riis/decompiler/DexToSourceCasting.g:65:4: METHODSTRT f1= flags id1= IDENT p1= params r1= return_
            {
            match(input,METHODSTRT,FOLLOW_METHODSTRT_in_method_start262); 

            pushFollow(FOLLOW_flags_in_method_start266);
            f1=flags();

            state._fsp--;


            id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_method_start270); 

            pushFollow(FOLLOW_params_in_method_start274);
            p1=params();

            state._fsp--;


            pushFollow(FOLLOW_return__in_method_start278);
            r1=return_();

            state._fsp--;


            fout.printJava((f1!=null?input.toString(f1.start,f1.stop):null) + " " + r1 + " " + (id1!=null?id1.getText():null) + "(" + p1 + ") {");

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



    // $ANTLR start "method_end"
    // src/com/riis/decompiler/DexToSourceCasting.g:69:1: method_end : METHODEND ;
    public final void method_end() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:72:2: ( METHODEND )
            // src/com/riis/decompiler/DexToSourceCasting.g:72:4: METHODEND
            {
            match(input,METHODEND,FOLLOW_METHODEND_in_method_end302); 

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



    // $ANTLR start "for_start"
    // src/com/riis/decompiler/DexToSourceCasting.g:75:1: for_start : id1= put_in_reg label id2= put_in_reg if_ge ( scrap )* ;
    public final void for_start() throws RecognitionException {
        String id1 =null;

        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:76:2: (id1= put_in_reg label id2= put_in_reg if_ge ( scrap )* )
            // src/com/riis/decompiler/DexToSourceCasting.g:76:4: id1= put_in_reg label id2= put_in_reg if_ge ( scrap )*
            {
            pushFollow(FOLLOW_put_in_reg_in_for_start316);
            id1=put_in_reg();

            state._fsp--;


            pushFollow(FOLLOW_label_in_for_start318);
            label();

            state._fsp--;


            pushFollow(FOLLOW_put_in_reg_in_for_start322);
            id2=put_in_reg();

            state._fsp--;


            pushFollow(FOLLOW_if_ge_in_for_start324);
            if_ge();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceCasting.g:76:46: ( scrap )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==INVOKE_DIRECT||(LA8_0 >= LIMIT && LA8_0 <= LINE)||LA8_0==RETURN_VOID||LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:76:46: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_for_start326);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            fout.printJava("for(a = " + id1 + "; a < " + id2 + "; a++) {");

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
    // $ANTLR end "for_start"



    // $ANTLR start "for_body"
    // src/com/riis/decompiler/DexToSourceCasting.g:80:1: for_body : id1= sget id3= stmt_builder id2= invoke_virtual ;
    public final void for_body() throws RecognitionException {
        String id1 =null;

        String id3 =null;

        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:81:2: (id1= sget id3= stmt_builder id2= invoke_virtual )
            // src/com/riis/decompiler/DexToSourceCasting.g:81:4: id1= sget id3= stmt_builder id2= invoke_virtual
            {
            pushFollow(FOLLOW_sget_in_for_body345);
            id1=sget();

            state._fsp--;


            pushFollow(FOLLOW_stmt_builder_in_for_body349);
            id3=stmt_builder();

            state._fsp--;


            pushFollow(FOLLOW_invoke_virtual_in_for_body353);
            id2=invoke_virtual();

            state._fsp--;


            fout.printJava(id1 + "." + id2 + "(" + id3);

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
    // $ANTLR end "for_body"



    // $ANTLR start "stmt_builder"
    // src/com/riis/decompiler/DexToSourceCasting.g:85:1: stmt_builder returns [String result] : new_instance id1= invoke_move id2= invoke_move id3= invoke_move id4= invoke_move id5= invoke_move ;
    public final String stmt_builder() throws RecognitionException {
        String result = null;


        String id1 =null;

        String id2 =null;

        String id3 =null;

        String id4 =null;

        String id5 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:86:2: ( new_instance id1= invoke_move id2= invoke_move id3= invoke_move id4= invoke_move id5= invoke_move )
            // src/com/riis/decompiler/DexToSourceCasting.g:86:4: new_instance id1= invoke_move id2= invoke_move id3= invoke_move id4= invoke_move id5= invoke_move
            {
            pushFollow(FOLLOW_new_instance_in_stmt_builder373);
            new_instance();

            state._fsp--;


            pushFollow(FOLLOW_invoke_move_in_stmt_builder377);
            id1=invoke_move();

            state._fsp--;


            pushFollow(FOLLOW_invoke_move_in_stmt_builder381);
            id2=invoke_move();

            state._fsp--;


            pushFollow(FOLLOW_invoke_move_in_stmt_builder385);
            id3=invoke_move();

            state._fsp--;


            pushFollow(FOLLOW_invoke_move_in_stmt_builder389);
            id4=invoke_move();

            state._fsp--;


            pushFollow(FOLLOW_invoke_move_in_stmt_builder393);
            id5=invoke_move();

            state._fsp--;


            result = "\"" + id1 + "\" + " + id2 + " + \"" + id3 + "\" + " + id4 + ");";

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
    // $ANTLR end "stmt_builder"



    // $ANTLR start "invoke_move"
    // src/com/riis/decompiler/DexToSourceCasting.g:90:1: invoke_move returns [String result] : (id1= invoke_virtual move_result |id1= const_string invoke_virtual move_result );
    public final String invoke_move() throws RecognitionException {
        String result = null;


        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:91:2: (id1= invoke_virtual move_result |id1= const_string invoke_virtual move_result )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INVOKE_VIRTUAL) ) {
                alt9=1;
            }
            else if ( (LA9_0==CONST_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:91:4: id1= invoke_virtual move_result
                    {
                    pushFollow(FOLLOW_invoke_virtual_in_invoke_move415);
                    id1=invoke_virtual();

                    state._fsp--;


                    pushFollow(FOLLOW_move_result_in_invoke_move417);
                    move_result();

                    state._fsp--;


                    result = id1;

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:93:4: id1= const_string invoke_virtual move_result
                    {
                    pushFollow(FOLLOW_const_string_in_invoke_move428);
                    id1=const_string();

                    state._fsp--;


                    pushFollow(FOLLOW_invoke_virtual_in_invoke_move430);
                    invoke_virtual();

                    state._fsp--;


                    pushFollow(FOLLOW_move_result_in_invoke_move432);
                    move_result();

                    state._fsp--;


                    result = id1;

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
        return result;
    }
    // $ANTLR end "invoke_move"



    // $ANTLR start "move_result"
    // src/com/riis/decompiler/DexToSourceCasting.g:97:1: move_result : MOVE_RESULT_OBJECT reg ;
    public final void move_result() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:98:2: ( MOVE_RESULT_OBJECT reg )
            // src/com/riis/decompiler/DexToSourceCasting.g:98:4: MOVE_RESULT_OBJECT reg
            {
            match(input,MOVE_RESULT_OBJECT,FOLLOW_MOVE_RESULT_OBJECT_in_move_result448); 

            pushFollow(FOLLOW_reg_in_move_result450);
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
    // $ANTLR end "move_result"



    // $ANTLR start "const_string"
    // src/com/riis/decompiler/DexToSourceCasting.g:101:1: const_string returns [String result] : CONST_STRING reg id1= quoted_string ;
    public final String const_string() throws RecognitionException {
        String result = null;


        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:102:2: ( CONST_STRING reg id1= quoted_string )
            // src/com/riis/decompiler/DexToSourceCasting.g:102:4: CONST_STRING reg id1= quoted_string
            {
            match(input,CONST_STRING,FOLLOW_CONST_STRING_in_const_string466); 

            pushFollow(FOLLOW_reg_in_const_string468);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_quoted_string_in_const_string472);
            id1=quoted_string();

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
    // $ANTLR end "const_string"



    // $ANTLR start "for_end"
    // src/com/riis/decompiler/DexToSourceCasting.g:106:1: for_end : add_int int_to_char goto_ label ( scrap )* ;
    public final void for_end() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:107:2: ( add_int int_to_char goto_ label ( scrap )* )
            // src/com/riis/decompiler/DexToSourceCasting.g:107:4: add_int int_to_char goto_ label ( scrap )*
            {
            pushFollow(FOLLOW_add_int_in_for_end488);
            add_int();

            state._fsp--;


            pushFollow(FOLLOW_int_to_char_in_for_end490);
            int_to_char();

            state._fsp--;


            pushFollow(FOLLOW_goto__in_for_end492);
            goto_();

            state._fsp--;


            pushFollow(FOLLOW_label_in_for_end494);
            label();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceCasting.g:107:36: ( scrap )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==INVOKE_DIRECT||(LA10_0 >= LIMIT && LA10_0 <= LINE)||LA10_0==RETURN_VOID||LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:107:36: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_for_end496);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            fout.printJava("}");

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
    // $ANTLR end "for_end"



    // $ANTLR start "new_instance"
    // src/com/riis/decompiler/DexToSourceCasting.g:111:1: new_instance : NEW_INSTANCE reg package_ ( scrap )* ;
    public final void new_instance() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:112:2: ( NEW_INSTANCE reg package_ ( scrap )* )
            // src/com/riis/decompiler/DexToSourceCasting.g:112:4: NEW_INSTANCE reg package_ ( scrap )*
            {
            match(input,NEW_INSTANCE,FOLLOW_NEW_INSTANCE_in_new_instance513); 

            pushFollow(FOLLOW_reg_in_new_instance515);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_package__in_new_instance517);
            package_();

            state._fsp--;


            // src/com/riis/decompiler/DexToSourceCasting.g:112:30: ( scrap )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==INVOKE_DIRECT||(LA11_0 >= LIMIT && LA11_0 <= LINE)||LA11_0==RETURN_VOID||LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:112:30: scrap
            	    {
            	    pushFollow(FOLLOW_scrap_in_new_instance519);
            	    scrap();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
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
        return ;
    }
    // $ANTLR end "new_instance"



    // $ANTLR start "sget"
    // src/com/riis/decompiler/DexToSourceCasting.g:115:1: sget returns [String result] : SGET_OBJECT reg id1= package_ id2= package_ ';' ;
    public final String sget() throws RecognitionException {
        String result = null;


        String id1 =null;

        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:116:2: ( SGET_OBJECT reg id1= package_ id2= package_ ';' )
            // src/com/riis/decompiler/DexToSourceCasting.g:116:4: SGET_OBJECT reg id1= package_ id2= package_ ';'
            {
            match(input,SGET_OBJECT,FOLLOW_SGET_OBJECT_in_sget536); 

            pushFollow(FOLLOW_reg_in_sget538);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_package__in_sget542);
            id1=package_();

            state._fsp--;


            pushFollow(FOLLOW_package__in_sget546);
            id2=package_();

            state._fsp--;


            match(input,43,FOLLOW_43_in_sget548); 

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
    // $ANTLR end "sget"



    // $ANTLR start "invoke_virtual"
    // src/com/riis/decompiler/DexToSourceCasting.g:120:1: invoke_virtual returns [String result] : ( INVOKE_VIRTUAL reg_args id1= package_ ';' params 'V' | INVOKE_VIRTUAL reg_args package_ ';' id1= params package_ ';' );
    public final String invoke_virtual() throws RecognitionException {
        String result = null;


        String id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:121:2: ( INVOKE_VIRTUAL reg_args id1= package_ ';' params 'V' | INVOKE_VIRTUAL reg_args package_ ';' id1= params package_ ';' )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:121:4: INVOKE_VIRTUAL reg_args id1= package_ ';' params 'V'
                    {
                    match(input,INVOKE_VIRTUAL,FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual568); 

                    pushFollow(FOLLOW_reg_args_in_invoke_virtual570);
                    reg_args();

                    state._fsp--;


                    pushFollow(FOLLOW_package__in_invoke_virtual574);
                    id1=package_();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_invoke_virtual576); 

                    pushFollow(FOLLOW_params_in_invoke_virtual578);
                    params();

                    state._fsp--;


                    match(input,46,FOLLOW_46_in_invoke_virtual580); 

                    result = id1;

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:123:4: INVOKE_VIRTUAL reg_args package_ ';' id1= params package_ ';'
                    {
                    match(input,INVOKE_VIRTUAL,FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual589); 

                    pushFollow(FOLLOW_reg_args_in_invoke_virtual591);
                    reg_args();

                    state._fsp--;


                    pushFollow(FOLLOW_package__in_invoke_virtual593);
                    package_();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_invoke_virtual595); 

                    pushFollow(FOLLOW_params_in_invoke_virtual599);
                    id1=params();

                    state._fsp--;


                    pushFollow(FOLLOW_package__in_invoke_virtual601);
                    package_();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_invoke_virtual603); 

                    if(id1.compareTo("I") == 0) { result = "(int)a"; } else {result ="(char)a";}

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
        return result;
    }
    // $ANTLR end "invoke_virtual"



    // $ANTLR start "add_int"
    // src/com/riis/decompiler/DexToSourceCasting.g:127:1: add_int : ADD_INT reg reg DIGIT ;
    public final void add_int() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:128:2: ( ADD_INT reg reg DIGIT )
            // src/com/riis/decompiler/DexToSourceCasting.g:128:4: ADD_INT reg reg DIGIT
            {
            match(input,ADD_INT,FOLLOW_ADD_INT_in_add_int619); 

            pushFollow(FOLLOW_reg_in_add_int621);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_reg_in_add_int623);
            reg();

            state._fsp--;


            match(input,DIGIT,FOLLOW_DIGIT_in_add_int625); 

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
    // $ANTLR end "add_int"



    // $ANTLR start "int_to_char"
    // src/com/riis/decompiler/DexToSourceCasting.g:131:1: int_to_char : INT_TO_CHAR reg reg ;
    public final void int_to_char() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:132:2: ( INT_TO_CHAR reg reg )
            // src/com/riis/decompiler/DexToSourceCasting.g:132:4: INT_TO_CHAR reg reg
            {
            match(input,INT_TO_CHAR,FOLLOW_INT_TO_CHAR_in_int_to_char637); 

            pushFollow(FOLLOW_reg_in_int_to_char639);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_reg_in_int_to_char641);
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
    // $ANTLR end "int_to_char"



    // $ANTLR start "goto_"
    // src/com/riis/decompiler/DexToSourceCasting.g:135:1: goto_ : GOTO label ;
    public final void goto_() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:136:2: ( GOTO label )
            // src/com/riis/decompiler/DexToSourceCasting.g:136:4: GOTO label
            {
            match(input,GOTO,FOLLOW_GOTO_in_goto_653); 

            pushFollow(FOLLOW_label_in_goto_655);
            label();

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
    // $ANTLR end "goto_"



    // $ANTLR start "if_ge"
    // src/com/riis/decompiler/DexToSourceCasting.g:139:1: if_ge : IF_GE reg reg label ;
    public final void if_ge() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:140:2: ( IF_GE reg reg label )
            // src/com/riis/decompiler/DexToSourceCasting.g:140:4: IF_GE reg reg label
            {
            match(input,IF_GE,FOLLOW_IF_GE_in_if_ge667); 

            pushFollow(FOLLOW_reg_in_if_ge669);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_reg_in_if_ge671);
            reg();

            state._fsp--;


            pushFollow(FOLLOW_label_in_if_ge673);
            label();

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
    // $ANTLR end "if_ge"



    // $ANTLR start "put_in_reg"
    // src/com/riis/decompiler/DexToSourceCasting.g:143:1: put_in_reg returns [String result] : const_ reg id1= DIGIT ;
    public final String put_in_reg() throws RecognitionException {
        String result = null;


        Token id1=null;

        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:144:2: ( const_ reg id1= DIGIT )
            // src/com/riis/decompiler/DexToSourceCasting.g:144:4: const_ reg id1= DIGIT
            {
            pushFollow(FOLLOW_const__in_put_in_reg689);
            const_();

            state._fsp--;


            pushFollow(FOLLOW_reg_in_put_in_reg691);
            reg();

            state._fsp--;


            id1=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_put_in_reg695); 

            result = id1.getText();

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
    // $ANTLR end "put_in_reg"



    // $ANTLR start "reg_args"
    // src/com/riis/decompiler/DexToSourceCasting.g:148:1: reg_args : '{' ( reg )+ '}' ;
    public final void reg_args() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:149:2: ( '{' ( reg )+ '}' )
            // src/com/riis/decompiler/DexToSourceCasting.g:149:4: '{' ( reg )+ '}'
            {
            match(input,52,FOLLOW_52_in_reg_args711); 

            // src/com/riis/decompiler/DexToSourceCasting.g:149:8: ( reg )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:149:8: reg
            	    {
            	    pushFollow(FOLLOW_reg_in_reg_args713);
            	    reg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input,53,FOLLOW_53_in_reg_args716); 

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
    // $ANTLR end "reg_args"



    // $ANTLR start "label"
    // src/com/riis/decompiler/DexToSourceCasting.g:152:1: label : ( LABEL | LABEL ':' );
    public final void label() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:153:2: ( LABEL | LABEL ':' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LABEL) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==42) ) {
                    alt14=2;
                }
                else if ( ((LA14_1 >= CONST_16 && LA14_1 <= CONST_HIGH_16)||LA14_1==INVOKE_DIRECT||(LA14_1 >= LABEL && LA14_1 <= METHODEND)||(LA14_1 >= RETURN_VOID && LA14_1 <= SGET_OBJECT)||LA14_1==43) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:153:4: LABEL
                    {
                    match(input,LABEL,FOLLOW_LABEL_in_label728); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:154:4: LABEL ':'
                    {
                    match(input,LABEL,FOLLOW_LABEL_in_label733); 

                    match(input,42,FOLLOW_42_in_label735); 

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
    // $ANTLR end "label"



    // $ANTLR start "invoke_direct"
    // src/com/riis/decompiler/DexToSourceCasting.g:157:1: invoke_direct : INVOKE_DIRECT regs package_ ;
    public final void invoke_direct() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:158:2: ( INVOKE_DIRECT regs package_ )
            // src/com/riis/decompiler/DexToSourceCasting.g:158:4: INVOKE_DIRECT regs package_
            {
            match(input,INVOKE_DIRECT,FOLLOW_INVOKE_DIRECT_in_invoke_direct747); 

            pushFollow(FOLLOW_regs_in_invoke_direct749);
            regs();

            state._fsp--;


            pushFollow(FOLLOW_package__in_invoke_direct751);
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


    public static class flags_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "flags"
    // src/com/riis/decompiler/DexToSourceCasting.g:161:1: flags : ( flag )+ ;
    public final DexToSourceCastingParser.flags_return flags() throws RecognitionException {
        DexToSourceCastingParser.flags_return retval = new DexToSourceCastingParser.flags_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:162:2: ( ( flag )+ )
            // src/com/riis/decompiler/DexToSourceCasting.g:162:4: ( flag )+
            {
            // src/com/riis/decompiler/DexToSourceCasting.g:162:4: ( flag )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==FINAL||LA15_0==PUBLIC||LA15_0==STATIC) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:162:4: flag
            	    {
            	    pushFollow(FOLLOW_flag_in_flags763);
            	    flag();

            	    state._fsp--;


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
    // src/com/riis/decompiler/DexToSourceCasting.g:165:1: flag returns [String flag_result] : (f1= 'public' |f1= 'static' |f1= 'final' );
    public final String flag() throws RecognitionException {
        String flag_result = null;


        Token f1=null;

        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:166:2: (f1= 'public' |f1= 'static' |f1= 'final' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case PUBLIC:
                {
                alt16=1;
                }
                break;
            case STATIC:
                {
                alt16=2;
                }
                break;
            case FINAL:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:166:4: f1= 'public'
                    {
                    f1=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_flag782); 

                    flag_result += (f1!=null?f1.getText():null);

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:168:4: f1= 'static'
                    {
                    f1=(Token)match(input,STATIC,FOLLOW_STATIC_in_flag793); 

                    flag_result += (f1!=null?f1.getText():null);

                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:170:4: f1= 'final'
                    {
                    f1=(Token)match(input,FINAL,FOLLOW_FINAL_in_flag804); 

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
    // src/com/riis/decompiler/DexToSourceCasting.g:174:1: params returns [String result] : ( '(' ')' | '(' '[L' id1= package_ ';' ')' | '(' id2= IDENT ';' ')' | IDENT '(' id3= package_ ';' ')' | IDENT '(' id4= IDENT ')' | IDENT '(' ')' );
    public final String params() throws RecognitionException {
        String result = null;


        Token id2=null;
        Token id4=null;
        String id1 =null;

        String id3 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:175:2: ( '(' ')' | '(' '[L' id1= package_ ';' ')' | '(' id2= IDENT ';' ')' | IDENT '(' id3= package_ ';' ')' | IDENT '(' id4= IDENT ')' | IDENT '(' ')' )
            int alt17=6;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt17=1;
                    }
                    break;
                case 47:
                    {
                    alt17=2;
                    }
                    break;
                case IDENT:
                    {
                    alt17=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA17_0==IDENT) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==37) ) {
                    switch ( input.LA(3) ) {
                    case IDENT:
                        {
                        int LA17_7 = input.LA(4);

                        if ( (LA17_7==38) ) {
                            alt17=5;
                        }
                        else if ( (LA17_7==41) ) {
                            alt17=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 38:
                        {
                        alt17=6;
                        }
                        break;
                    case 45:
                        {
                        alt17=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:175:4: '(' ')'
                    {
                    match(input,37,FOLLOW_37_in_params824); 

                    match(input,38,FOLLOW_38_in_params826); 

                    result = "()";

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:177:4: '(' '[L' id1= package_ ';' ')'
                    {
                    match(input,37,FOLLOW_37_in_params835); 

                    match(input,47,FOLLOW_47_in_params837); 

                    pushFollow(FOLLOW_package__in_params841);
                    id1=package_();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_params843); 

                    match(input,38,FOLLOW_38_in_params845); 

                    result = id1 + " args[]";

                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:179:4: '(' id2= IDENT ';' ')'
                    {
                    match(input,37,FOLLOW_37_in_params854); 

                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_params858); 

                    match(input,43,FOLLOW_43_in_params860); 

                    match(input,38,FOLLOW_38_in_params862); 

                    result = id2.getText();

                    }
                    break;
                case 4 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:181:4: IDENT '(' id3= package_ ';' ')'
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_params871); 

                    match(input,37,FOLLOW_37_in_params873); 

                    pushFollow(FOLLOW_package__in_params877);
                    id3=package_();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_params879); 

                    match(input,38,FOLLOW_38_in_params881); 

                    result =id3;

                    }
                    break;
                case 5 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:183:4: IDENT '(' id4= IDENT ')'
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_params890); 

                    match(input,37,FOLLOW_37_in_params892); 

                    id4=(Token)match(input,IDENT,FOLLOW_IDENT_in_params896); 

                    match(input,38,FOLLOW_38_in_params898); 

                    result = id4.getText();

                    }
                    break;
                case 6 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:185:4: IDENT '(' ')'
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_params907); 

                    match(input,37,FOLLOW_37_in_params909); 

                    match(input,38,FOLLOW_38_in_params911); 

                    result = "()";

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
        return result;
    }
    // $ANTLR end "params"



    // $ANTLR start "package_"
    // src/com/riis/decompiler/DexToSourceCasting.g:189:1: package_ returns [String result] : ( IDENT '/' IDENT '/' id1= IDENT | IDENT '/' IDENT '/' IDENT '/' id1= IDENT | IDENT '/' IDENT '/' id1= IDENT '.' id2= IDENT | IDENT '/' IDENT '/' IDENT '/' '<init>' | 'L' IDENT '/' IDENT '/' id1= IDENT );
    public final String package_() throws RecognitionException {
        String result = null;


        Token id1=null;
        Token id2=null;

        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:190:2: ( IDENT '/' IDENT '/' id1= IDENT | IDENT '/' IDENT '/' IDENT '/' id1= IDENT | IDENT '/' IDENT '/' id1= IDENT '.' id2= IDENT | IDENT '/' IDENT '/' IDENT '/' '<init>' | 'L' IDENT '/' IDENT '/' id1= IDENT )
            int alt18=5;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==41) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==IDENT) ) {
                        int LA18_4 = input.LA(4);

                        if ( (LA18_4==41) ) {
                            int LA18_5 = input.LA(5);

                            if ( (LA18_5==IDENT) ) {
                                switch ( input.LA(6) ) {
                                case 41:
                                    {
                                    int LA18_7 = input.LA(7);

                                    if ( (LA18_7==IDENT) ) {
                                        alt18=2;
                                    }
                                    else if ( (LA18_7==INIT) ) {
                                        alt18=4;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 18, 7, input);

                                        throw nvae;

                                    }
                                    }
                                    break;
                                case 39:
                                    {
                                    alt18=3;
                                    }
                                    break;
                                case CONST_STRING:
                                case IDENT:
                                case INVOKE_DIRECT:
                                case INVOKE_VIRTUAL:
                                case LIMIT:
                                case LINE:
                                case RETURN_VOID:
                                case SOURCE:
                                case 43:
                                case 45:
                                    {
                                    alt18=1;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 18, 6, input);

                                    throw nvae;

                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA18_0==45) ) {
                alt18=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:190:4: IDENT '/' IDENT '/' id1= IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_package_931); 

                    match(input,41,FOLLOW_41_in_package_933); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_935); 

                    match(input,41,FOLLOW_41_in_package_937); 

                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_package_941); 

                    result = id1.getText();

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:192:4: IDENT '/' IDENT '/' IDENT '/' id1= IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_package_950); 

                    match(input,41,FOLLOW_41_in_package_952); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_954); 

                    match(input,41,FOLLOW_41_in_package_956); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_958); 

                    match(input,41,FOLLOW_41_in_package_960); 

                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_package_964); 

                    result = id1.getText();

                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:194:4: IDENT '/' IDENT '/' id1= IDENT '.' id2= IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_package_973); 

                    match(input,41,FOLLOW_41_in_package_975); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_977); 

                    match(input,41,FOLLOW_41_in_package_979); 

                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_package_983); 

                    match(input,39,FOLLOW_39_in_package_985); 

                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_package_989); 

                    result = id1.getText() + "." + id2.getText();

                    }
                    break;
                case 4 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:196:4: IDENT '/' IDENT '/' IDENT '/' '<init>'
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_package_998); 

                    match(input,41,FOLLOW_41_in_package_1000); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_1002); 

                    match(input,41,FOLLOW_41_in_package_1004); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_1006); 

                    match(input,41,FOLLOW_41_in_package_1008); 

                    match(input,INIT,FOLLOW_INIT_in_package_1010); 

                    result = "init";

                    }
                    break;
                case 5 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:198:4: 'L' IDENT '/' IDENT '/' id1= IDENT
                    {
                    match(input,45,FOLLOW_45_in_package_1019); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_1021); 

                    match(input,41,FOLLOW_41_in_package_1023); 

                    match(input,IDENT,FOLLOW_IDENT_in_package_1025); 

                    match(input,41,FOLLOW_41_in_package_1027); 

                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_package_1031); 

                    result = id1.getText();

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
        return result;
    }
    // $ANTLR end "package_"



    // $ANTLR start "return_"
    // src/com/riis/decompiler/DexToSourceCasting.g:202:1: return_ returns [String result] : 'V' ;
    public final String return_() throws RecognitionException {
        String result = null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:203:2: ( 'V' )
            // src/com/riis/decompiler/DexToSourceCasting.g:203:4: 'V'
            {
            match(input,46,FOLLOW_46_in_return_1051); 

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



    // $ANTLR start "regs"
    // src/com/riis/decompiler/DexToSourceCasting.g:206:1: regs : '{' ( reg )+ '}' ;
    public final void regs() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:207:2: ( '{' ( reg )+ '}' )
            // src/com/riis/decompiler/DexToSourceCasting.g:207:4: '{' ( reg )+ '}'
            {
            match(input,52,FOLLOW_52_in_regs1065); 

            // src/com/riis/decompiler/DexToSourceCasting.g:207:8: ( reg )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:207:8: reg
            	    {
            	    pushFollow(FOLLOW_reg_in_regs1067);
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


            match(input,53,FOLLOW_53_in_regs1070); 

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
    // src/com/riis/decompiler/DexToSourceCasting.g:210:1: reg : 'v' DIGIT ;
    public final void reg() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:211:2: ( 'v' DIGIT )
            // src/com/riis/decompiler/DexToSourceCasting.g:211:4: 'v' DIGIT
            {
            match(input,51,FOLLOW_51_in_reg1082); 

            match(input,DIGIT,FOLLOW_DIGIT_in_reg1084); 

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



    // $ANTLR start "const_"
    // src/com/riis/decompiler/DexToSourceCasting.g:214:1: const_ : ( CONST_4 | CONST_16 | CONST_HIGH_16 );
    public final void const_() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:215:2: ( CONST_4 | CONST_16 | CONST_HIGH_16 )
            // src/com/riis/decompiler/DexToSourceCasting.g:
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
    // src/com/riis/decompiler/DexToSourceCasting.g:220:1: scrap : ( LIMIT REGISTERS DIGIT | ';' 'this:' reg params | LINE ( DIGIT )+ | invoke_direct ';' '<init>' params return_ | RETURN_VOID | ';' 'parameter[' DIGIT ']' ':' reg params );
    public final void scrap() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:221:2: ( LIMIT REGISTERS DIGIT | ';' 'this:' reg params | LINE ( DIGIT )+ | invoke_direct ';' '<init>' params return_ | RETURN_VOID | ';' 'parameter[' DIGIT ']' ':' reg params )
            int alt21=6;
            switch ( input.LA(1) ) {
            case LIMIT:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==50) ) {
                    alt21=2;
                }
                else if ( (LA21_2==49) ) {
                    alt21=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case LINE:
                {
                alt21=3;
                }
                break;
            case INVOKE_DIRECT:
                {
                alt21=4;
                }
                break;
            case RETURN_VOID:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:221:4: LIMIT REGISTERS DIGIT
                    {
                    match(input,LIMIT,FOLLOW_LIMIT_in_scrap1117); 

                    match(input,REGISTERS,FOLLOW_REGISTERS_in_scrap1119); 

                    match(input,DIGIT,FOLLOW_DIGIT_in_scrap1121); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:222:4: ';' 'this:' reg params
                    {
                    match(input,43,FOLLOW_43_in_scrap1126); 

                    match(input,50,FOLLOW_50_in_scrap1128); 

                    pushFollow(FOLLOW_reg_in_scrap1130);
                    reg();

                    state._fsp--;


                    pushFollow(FOLLOW_params_in_scrap1132);
                    params();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:223:4: LINE ( DIGIT )+
                    {
                    match(input,LINE,FOLLOW_LINE_in_scrap1137); 

                    // src/com/riis/decompiler/DexToSourceCasting.g:223:9: ( DIGIT )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==DIGIT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToSourceCasting.g:223:9: DIGIT
                    	    {
                    	    match(input,DIGIT,FOLLOW_DIGIT_in_scrap1139); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:224:4: invoke_direct ';' '<init>' params return_
                    {
                    pushFollow(FOLLOW_invoke_direct_in_scrap1145);
                    invoke_direct();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_scrap1147); 

                    match(input,INIT,FOLLOW_INIT_in_scrap1149); 

                    pushFollow(FOLLOW_params_in_scrap1151);
                    params();

                    state._fsp--;


                    pushFollow(FOLLOW_return__in_scrap1153);
                    return_();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:225:4: RETURN_VOID
                    {
                    match(input,RETURN_VOID,FOLLOW_RETURN_VOID_in_scrap1158); 

                    }
                    break;
                case 6 :
                    // src/com/riis/decompiler/DexToSourceCasting.g:226:4: ';' 'parameter[' DIGIT ']' ':' reg params
                    {
                    match(input,43,FOLLOW_43_in_scrap1163); 

                    match(input,49,FOLLOW_49_in_scrap1165); 

                    match(input,DIGIT,FOLLOW_DIGIT_in_scrap1167); 

                    match(input,48,FOLLOW_48_in_scrap1169); 

                    match(input,42,FOLLOW_42_in_scrap1171); 

                    pushFollow(FOLLOW_reg_in_scrap1173);
                    reg();

                    state._fsp--;


                    pushFollow(FOLLOW_params_in_scrap1175);
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



    // $ANTLR start "quoted_string"
    // src/com/riis/decompiler/DexToSourceCasting.g:229:1: quoted_string returns [String stringContents] : id1= quoted_string_internal ;
    public final String quoted_string() throws RecognitionException {
        String stringContents = null;


        DexToSourceCastingParser.quoted_string_internal_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:230:2: (id1= quoted_string_internal )
            // src/com/riis/decompiler/DexToSourceCasting.g:230:4: id1= quoted_string_internal
            {
            pushFollow(FOLLOW_quoted_string_internal_in_quoted_string1193);
            id1=quoted_string_internal();

            state._fsp--;


             stringContents = (id1!=null?input.toString(id1.start,id1.stop):null).replace("\"", ""); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stringContents;
    }
    // $ANTLR end "quoted_string"


    public static class quoted_string_internal_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "quoted_string_internal"
    // src/com/riis/decompiler/DexToSourceCasting.g:234:1: quoted_string_internal : '\"' (~ '\"' )* '\"' ;
    public final DexToSourceCastingParser.quoted_string_internal_return quoted_string_internal() throws RecognitionException {
        DexToSourceCastingParser.quoted_string_internal_return retval = new DexToSourceCastingParser.quoted_string_internal_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToSourceCasting.g:235:2: ( '\"' (~ '\"' )* '\"' )
            // src/com/riis/decompiler/DexToSourceCasting.g:235:4: '\"' (~ '\"' )* '\"'
            {
            match(input,36,FOLLOW_36_in_quoted_string_internal1209); 

            // src/com/riis/decompiler/DexToSourceCasting.g:235:8: (~ '\"' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= ADD_INT && LA22_0 <= WS)||(LA22_0 >= 37 && LA22_0 <= 53)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:
            	    {
            	    if ( (input.LA(1) >= ADD_INT && input.LA(1) <= WS)||(input.LA(1) >= 37 && input.LA(1) <= 53) ) {
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
            	    break loop22;
                }
            } while (true);


            match(input,36,FOLLOW_36_in_quoted_string_internal1217); 

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
    // $ANTLR end "quoted_string_internal"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA7_eotS =
        "\u00e9\uffff";
    static final String DFA7_eofS =
        "\u00e9\uffff";
    static final String DFA7_minS =
        "\1\31\4\15\2\17\1\45\1\56\1\17\1\53\1\17\1\7\1\51\1\17\2\46\1\56"+
        "\1\17\1\35\1\61\1\13\1\64\1\7\2\uffff\1\17\1\51\2\56\1\17\1\51\1"+
        "\13\1\63\1\13\1\7\1\63\1\51\1\17\1\51\1\17\1\7\1\13\1\60\1\13\1"+
        "\17\1\51\1\17\1\51\1\17\1\52\1\63\1\47\1\17\1\47\2\17\1\45\1\63"+
        "\3\17\1\46\1\53\2\17\1\46\1\53\1\7\1\17\1\53\1\17\1\13\1\51\1\17"+
        "\3\53\1\56\3\53\1\56\1\51\1\17\2\46\1\7\3\17\1\51\1\17\1\51\2\7"+
        "\1\17\1\51\1\17\1\45\1\51\1\17\1\51\1\17\1\51\1\17\1\7\1\17\1\53"+
        "\2\17\1\51\1\17\1\51\1\17\2\51\1\17\2\46\1\7\1\17\1\47\1\17\1\47"+
        "\1\17\1\47\2\17\1\51\2\7\1\17\1\51\2\17\1\21\1\53\2\17\1\46\1\53"+
        "\2\17\1\46\1\53\1\51\1\17\1\51\1\17\3\53\1\17\3\53\1\7\3\53\1\7"+
        "\1\17\1\51\1\17\1\51\1\17\1\45\1\47\1\17\1\47\1\17\1\56\1\17\1\53"+
        "\3\17\1\46\1\53\2\17\1\46\1\53\1\7\1\51\1\17\2\46\1\56\1\17\3\53"+
        "\1\7\3\53\1\7\1\17\1\51\2\56\1\17\2\51\1\17\1\51\2\17\1\51\1\17"+
        "\1\51\1\47\1\17\1\47\3\17\1\46\1\53\2\17\1\46\4\53\1\56\3\53\1\56";
    static final String DFA7_maxS =
        "\1\31\4\41\1\45\1\57\1\45\1\56\1\55\1\53\1\55\1\53\1\51\1\17\1\46"+
        "\1\51\1\56\1\17\1\35\1\62\1\13\1\64\1\53\2\uffff\1\17\1\51\2\56"+
        "\1\17\1\51\1\13\1\63\1\13\1\53\1\63\1\51\1\17\1\51\1\17\1\53\1\13"+
        "\1\60\1\13\1\17\1\51\1\17\1\51\1\45\1\52\1\65\1\53\1\17\1\53\1\17"+
        "\1\57\1\45\1\63\1\55\1\21\1\17\1\46\1\53\1\21\1\17\1\46\2\53\1\55"+
        "\1\53\1\55\1\13\1\51\1\17\3\53\1\56\3\53\1\56\1\51\1\17\1\46\1\51"+
        "\1\53\1\17\1\45\1\17\1\51\1\17\1\51\2\53\1\17\1\51\1\57\1\45\1\51"+
        "\1\17\1\51\1\17\1\51\1\17\1\53\1\55\1\53\1\55\1\17\1\51\1\17\1\51"+
        "\1\17\2\51\1\17\1\46\1\51\1\53\1\17\1\53\1\17\1\53\1\17\1\53\2\17"+
        "\1\51\2\53\1\17\1\51\1\21\1\17\1\21\1\53\1\21\1\17\1\46\1\53\1\21"+
        "\1\17\1\46\1\53\1\51\1\17\1\51\1\17\3\53\1\45\10\53\1\17\1\51\1"+
        "\17\1\51\1\57\1\45\1\53\1\17\1\53\1\17\1\56\1\55\1\53\1\55\1\21"+
        "\1\17\1\46\1\53\1\21\1\17\1\46\2\53\1\51\1\17\1\46\1\51\1\56\1\17"+
        "\10\53\1\17\1\51\2\56\1\17\2\51\1\17\1\51\2\17\1\51\1\17\1\51\1"+
        "\53\1\17\1\53\1\17\1\21\1\17\1\46\1\53\1\21\1\17\1\46\4\53\1\56"+
        "\3\53\1\56";
    static final String DFA7_acceptS =
        "\30\uffff\1\1\1\2\u00cf\uffff";
    static final String DFA7_specialS =
        "\u00e9\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\4\16\uffff\1\2\4\uffff\1\3",
            "\1\4\1\uffff\1\5\14\uffff\1\2\4\uffff\1\3",
            "\1\4\1\uffff\1\5\14\uffff\1\2\4\uffff\1\3",
            "\1\4\1\uffff\1\5\14\uffff\1\2\4\uffff\1\3",
            "\1\7\25\uffff\1\6",
            "\1\12\26\uffff\1\10\10\uffff\1\11",
            "\1\13",
            "\1\14",
            "\1\15\35\uffff\1\16",
            "\1\17",
            "\1\20\26\uffff\1\21\6\uffff\1\22",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35\2\uffff\1\36",
            "\1\14",
            "\1\37",
            "\1\40",
            "\1\42\1\41",
            "\1\43",
            "\1\44",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\14",
            "\1\14",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\3\31\1\uffff\1\43\7\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff"+
            "\1\27\14\uffff\1\24",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71\25\uffff\1\70",
            "\1\72",
            "\1\54\1\uffff\1\73",
            "\1\75\1\uffff\1\74\1\uffff\1\76",
            "\1\77",
            "\1\101\1\uffff\1\100\1\uffff\1\102",
            "\1\103",
            "\1\106\26\uffff\1\104\10\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\111\35\uffff\1\112",
            "\1\113\1\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\76",
            "\1\117\1\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\102",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\123\35\uffff\1\124",
            "\1\125",
            "\1\126\26\uffff\1\127\6\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\76",
            "\1\76",
            "\1\76",
            "\1\14",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\14",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137\2\uffff\1\140",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\141",
            "\1\143\25\uffff\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\150",
            "\1\151",
            "\1\154\26\uffff\1\152\10\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\164\35\uffff\1\165",
            "\1\166",
            "\1\167\26\uffff\1\170\6\uffff\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\2\uffff\1\u0084",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u0085",
            "\1\u0087\1\uffff\1\u0086\1\uffff\1\u0088",
            "\1\u0089",
            "\1\u008b\1\uffff\1\u008a\1\uffff\1\u008c",
            "\1\u008d",
            "\1\u008f\1\uffff\1\u008e\1\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\1\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u0088",
            "\1\u009a\1\uffff\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u008c",
            "\1\u009e\1\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u0090",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u0088",
            "\1\u0088",
            "\1\u0088",
            "\1\u00a7\25\uffff\1\u00a6",
            "\1\u008c",
            "\1\u008c",
            "\1\u008c",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u0090",
            "\1\u0090",
            "\1\u0090",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ae\26\uffff\1\u00ac\10\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b1\1\uffff\1\u00b0\1\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b5\1\uffff\1\u00b4\1\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\35\uffff\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\26\uffff\1\u00bd\6\uffff\1\u00be",
            "\1\u00bf\1\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00b2",
            "\1\u00c3\1\uffff\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00b6",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\2\uffff\1\u00cb",
            "\1\u00b8",
            "\1\u00cc",
            "\1\u00b2",
            "\1\u00b2",
            "\1\u00b2",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b6",
            "\3\31\11\uffff\1\26\2\uffff\1\23\1\25\1\30\5\uffff\1\27\14"+
            "\uffff\1\24",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00b8",
            "\1\u00b8",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00da\1\uffff\1\u00d9\1\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00de\1\uffff\1\u00dd\1\uffff\1\u00df",
            "\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00db",
            "\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00df",
            "\1\u00db",
            "\1\u00db",
            "\1\u00db",
            "\1\u00b8",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00b8"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "59:1: methods : ( method_start ( scrap )* method_end | method_start ( scrap )* for_start for_body ( scrap )* for_end method_end );";
        }
    }
    static final String DFA12_eotS =
        "\107\uffff";
    static final String DFA12_eofS =
        "\107\uffff";
    static final String DFA12_minS =
        "\1\24\1\64\1\63\1\13\1\63\1\17\1\51\2\17\2\51\2\17\1\51\1\47\4\17"+
        "\4\53\1\17\1\45\2\17\1\53\1\17\2\uffff\1\51\1\17\2\46\3\17\1\51"+
        "\3\17\2\51\1\17\1\51\2\17\1\51\1\17\1\51\1\47\1\17\1\47\3\17\1\46"+
        "\1\53\2\17\1\46\4\53\1\17\3\53\1\17";
    static final String DFA12_maxS =
        "\1\24\1\64\1\63\1\13\1\65\1\55\1\51\2\17\2\51\2\17\1\51\1\53\1\17"+
        "\1\21\1\17\1\45\4\53\1\57\1\45\1\56\1\55\1\53\1\55\2\uffff\1\51"+
        "\1\17\1\46\1\51\1\56\2\17\1\51\2\56\1\17\2\51\1\17\1\51\2\17\1\51"+
        "\1\17\1\51\1\53\1\17\1\53\1\17\1\21\1\17\1\46\1\53\1\21\1\17\1\46"+
        "\4\53\1\56\3\53\1\56";
    static final String DFA12_acceptS =
        "\35\uffff\1\1\1\2\50\uffff";
    static final String DFA12_specialS =
        "\107\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\3\1\uffff\1\5",
            "\1\6\35\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\21\1\uffff\1\20\1\uffff\1\22",
            "\1\23",
            "\1\24\1\uffff\1\25",
            "\1\26",
            "\1\30\25\uffff\1\27",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\33\26\uffff\1\31\10\uffff\1\32",
            "\1\34",
            "\1\36\35\uffff\1\36\1\35",
            "\1\37\35\uffff\1\40",
            "\1\41",
            "\1\42\26\uffff\1\43\6\uffff\1\44",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\2\uffff\1\51",
            "\1\36\35\uffff\1\36\1\35",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\36\35\uffff\1\36\1\35",
            "\1\36\35\uffff\1\36\1\35",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\1\uffff\1\67\1\uffff\1\71",
            "\1\72",
            "\1\74\1\uffff\1\73\1\uffff\1\75",
            "\1\76",
            "\1\77\1\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\71",
            "\1\103\1\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\75",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\36\35\uffff\1\36\1\35",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\36\35\uffff\1\36\1\35"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "120:1: invoke_virtual returns [String result] : ( INVOKE_VIRTUAL reg_args id1= package_ ';' params 'V' | INVOKE_VIRTUAL reg_args package_ ';' id1= params package_ ';' );";
        }
    }
 

    public static final BitSet FOLLOW_class_name_in_rule54 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_super__in_rule56 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_source_in_rule58 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fields_in_rule60 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_constructor_in_rule62 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_methods_in_rule64 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CLASS_in_class_name77 = new BitSet(new long[]{0x0000000210002000L});
    public static final BitSet FOLLOW_flags_in_class_name81 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_class_name85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_super_101 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_super_103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_in_source115 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_source117 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_source119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_fields139 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_FIELD_in_field152 = new BitSet(new long[]{0x0000000210002000L});
    public static final BitSet FOLLOW_flags_in_field156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_field160 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_field164 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_field166 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_field168 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_quoted_string_in_field172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODSTRT_in_constructor188 = new BitSet(new long[]{0x0000000210002000L});
    public static final BitSet FOLLOW_flags_in_constructor192 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INIT_in_constructor194 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_constructor198 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_return__in_constructor202 = new BitSet(new long[]{0x0000080041C80000L});
    public static final BitSet FOLLOW_scrap_in_constructor211 = new BitSet(new long[]{0x0000080041C80000L});
    public static final BitSet FOLLOW_method_end_in_constructor214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_start_in_methods226 = new BitSet(new long[]{0x0000080041C80000L});
    public static final BitSet FOLLOW_scrap_in_methods228 = new BitSet(new long[]{0x0000080041C80000L});
    public static final BitSet FOLLOW_method_end_in_methods231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_start_in_methods236 = new BitSet(new long[]{0x0000080040C80380L});
    public static final BitSet FOLLOW_scrap_in_methods238 = new BitSet(new long[]{0x0000080040C80380L});
    public static final BitSet FOLLOW_for_start_in_methods241 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_for_body_in_methods243 = new BitSet(new long[]{0x0000080040C80010L});
    public static final BitSet FOLLOW_scrap_in_methods245 = new BitSet(new long[]{0x0000080040C80010L});
    public static final BitSet FOLLOW_for_end_in_methods248 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_method_end_in_methods250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODSTRT_in_method_start262 = new BitSet(new long[]{0x0000000210002000L});
    public static final BitSet FOLLOW_flags_in_method_start266 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_method_start270 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_method_start274 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_return__in_method_start278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODEND_in_method_end302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_put_in_reg_in_for_start316 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_label_in_for_start318 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_put_in_reg_in_for_start322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_if_ge_in_for_start324 = new BitSet(new long[]{0x0000080040C80002L});
    public static final BitSet FOLLOW_scrap_in_for_start326 = new BitSet(new long[]{0x0000080040C80002L});
    public static final BitSet FOLLOW_sget_in_for_body345 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_stmt_builder_in_for_body349 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_invoke_virtual_in_for_body353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_new_instance_in_stmt_builder373 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_invoke_move_in_stmt_builder377 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_invoke_move_in_stmt_builder381 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_invoke_move_in_stmt_builder385 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_invoke_move_in_stmt_builder389 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_invoke_move_in_stmt_builder393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_virtual_in_invoke_move415 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_move_result_in_invoke_move417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_string_in_invoke_move428 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_invoke_virtual_in_invoke_move430 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_move_result_in_invoke_move432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_RESULT_OBJECT_in_move_result448 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_move_result450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_STRING_in_const_string466 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_const_string468 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_quoted_string_in_const_string472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_int_in_for_end488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_int_to_char_in_for_end490 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_goto__in_for_end492 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_label_in_for_end494 = new BitSet(new long[]{0x0000080040C80002L});
    public static final BitSet FOLLOW_scrap_in_for_end496 = new BitSet(new long[]{0x0000080040C80002L});
    public static final BitSet FOLLOW_NEW_INSTANCE_in_new_instance513 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_new_instance515 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_new_instance517 = new BitSet(new long[]{0x0000080040C80002L});
    public static final BitSet FOLLOW_scrap_in_new_instance519 = new BitSet(new long[]{0x0000080040C80002L});
    public static final BitSet FOLLOW_SGET_OBJECT_in_sget536 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_sget538 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_sget542 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_sget546 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_sget548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual568 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_reg_args_in_invoke_virtual570 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_invoke_virtual574 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_invoke_virtual576 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_invoke_virtual578 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_invoke_virtual580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_VIRTUAL_in_invoke_virtual589 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_reg_args_in_invoke_virtual591 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_invoke_virtual593 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_invoke_virtual595 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_invoke_virtual599 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_invoke_virtual601 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_invoke_virtual603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_INT_in_add_int619 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_add_int621 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_add_int623 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_add_int625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TO_CHAR_in_int_to_char637 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_int_to_char639 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_int_to_char641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_653 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_label_in_goto_655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_GE_in_if_ge667 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_if_ge669 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_if_ge671 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_label_in_if_ge673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const__in_put_in_reg689 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_put_in_reg691 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_put_in_reg695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_reg_args711 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_reg_args713 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_reg_args716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_label728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_label733 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_label735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVOKE_DIRECT_in_invoke_direct747 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_regs_in_invoke_direct749 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_invoke_direct751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flag_in_flags763 = new BitSet(new long[]{0x0000000210002002L});
    public static final BitSet FOLLOW_PUBLIC_in_flag782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_flag793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_flag804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_params824 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_params826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_params835 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_params837 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_params841 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_params843 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_params845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_params854 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_params858 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_params860 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_params862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_params871 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_params873 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_package__in_params877 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_params879 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_params881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_params890 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_params892 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_params896 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_params898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_params907 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_params909 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_params911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_package_931 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_933 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_935 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_937 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_package_950 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_952 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_954 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_956 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_958 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_960 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_package_973 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_977 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_983 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_package_985 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_package_998 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_1000 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_1002 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_1004 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_1006 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_1008 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INIT_in_package_1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_package_1019 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_1021 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_1023 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_1025 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_package_1027 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_package_1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_return_1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_regs1065 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_regs1067 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_regs1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_reg1082 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_reg1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_scrap1117 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_REGISTERS_in_scrap1119 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_scrap1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_scrap1126 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_scrap1128 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_scrap1130 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_scrap1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_scrap1137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_scrap1139 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_invoke_direct_in_scrap1145 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_scrap1147 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INIT_in_scrap1149 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_scrap1151 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_return__in_scrap1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_VOID_in_scrap1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_scrap1163 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_scrap1165 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DIGIT_in_scrap1167 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_scrap1169 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_scrap1171 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_reg_in_scrap1173 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_params_in_scrap1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_internal_in_quoted_string1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_quoted_string_internal1209 = new BitSet(new long[]{0x003FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_36_in_quoted_string_internal1217 = new BitSet(new long[]{0x0000000000000002L});

}