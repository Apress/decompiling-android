// $ANTLR 3.4 src/com/riis/decompiler/DexToXML.g 2012-09-20 16:26:58

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToXMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANY_CHAR", "DIGIT", "IDENT", "LINE_SPLIT", "NEWLINE", "WS", "'$'", "'('", "')'", "'+'", "','", "'-'", "'.'", "'/'", "'//'", "':'", "';'", "'<'", "'='", "'>'", "'['", "'\\\"'", "']'", "'accessFlags:'", "'access_flags:'", "'advance pc'", "'annotation set'", "'annotations directory'", "'annotations_off:'", "'byte_data:'", "'catch'", "'checksum'", "'class'", "'class_annotations_off:'", "'class_data_off:'", "'class_defs:'", "'class_defs_off:'", "'class_defs_size:'", "'class_idx:'", "'code'", "'code-address'", "'code_off:'", "'data'", "'data_off:'", "'data_size:'", "'debug info'", "'debug_off:'", "'descriptor_idx:'", "'direct_methods:'", "'direct_methods_size:'", "'elements'", "'encoded array'", "'end sequence'", "'endian_tag:'", "'entries'", "'field_ids:'", "'field_ids_off:'", "'field_ids_size:'", "'field_idx:'", "'fields:'", "'fields_size:'", "'file_size:'", "'for'", "'handlers'", "'header_size:'", "'index:'", "'ins_size:'", "'insns_size:'", "'instance_fields:'", "'instance_fields_size:'", "'interfaces_off:'", "'line'", "'line_start:'", "'link_off:'", "'link_size:'", "'list'", "'local-snapshot'", "'local-start'", "'magic:'", "'map_off:'", "'method_ids:'", "'method_ids_off:'", "'method_ids_size:'", "'method_idx:'", "'methods:'", "'methods_size:'", "'name_idx:'", "'offset:'", "'outs_size:'", "'padding'", "'parameter'", "'parameters_off:'", "'parameters_size:'", "'prologue end'", "'proto'", "'proto_ids:'", "'proto_ids_off:'", "'proto_ids_size:'", "'proto_idx:'", "'registers_size:'", "'return_type_idx:'", "'shorty_idx:'", "'signature'", "'source_file_idx:'", "'static_fields:'", "'static_fields_size:'", "'static_values_off:'", "'string_data:'", "'string_data_off:'", "'string_ids:'", "'string_ids_off:'", "'string_ids_size:'", "'superclass_idx:'", "'throws'", "'tries'", "'tries_size:'", "'try'", "'type:'", "'type_ids:'", "'type_ids_off:'", "'type_ids_size:'", "'type_idx:'", "'type_list'", "'unused:'", "'utf16_size:'", "'virtual_methods:'", "'virtual_methods_size:'", "'visibility:'", "'word_data:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
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
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int ANY_CHAR=4;
    public static final int DIGIT=5;
    public static final int IDENT=6;
    public static final int LINE_SPLIT=7;
    public static final int NEWLINE=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DexToXMLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToXMLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DexToXMLParser.tokenNames; }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToXML.g"; }


    	int fileSize = 0;
    	int headerSize = 0;
    	int linkSize = 0;
    	int linkOffset = 0;
    	int mapOffset = 0;
    	
    	int stringIdsSize = 0;
    	int stringIdsOffset = 0;
    	
    	int typeIdsSize = 0;
    	int typeIdsOffset = 0;
    	
    	int protoIdsSize = 0;
    	int protoIdsOffset = 0;
    	
    	int fieldIdsSize = 0;
    	int fieldIdsOffset = 0;
    	
    	int methodIdsSize = 0;
    	int methodIdsOffset = 0;
    	
    	int classDefsSize = 0;
    	int classDefsOffset = 0;
    	
    	int dataSize = 0;
    	int dataOffset = 0;
    	
    	int staticFieldsSize = 0;
    	int instanceFieldsSize = 0;
    	int directMethodsSize = 0;
    	int virtualMethodsSize = 0;
    	
    	XMLOutput fout = DexToXML.fout;



    // $ANTLR start "rule"
    // src/com/riis/decompiler/DexToXML.g:55:1: rule : header string_ids_block type_ids_block proto_ids_block field_ids_block method_ids_block class_defs_block annotation_set_block code_items_block annotations_directory_block type_list_block string_data_block byte_data_block annotations_block encoded_array_block class_data_block map_block method_code_index_block ;
    public final void rule() throws RecognitionException {
        fout.printXML("<root>"); 
        try {
            // src/com/riis/decompiler/DexToXML.g:59:2: ( header string_ids_block type_ids_block proto_ids_block field_ids_block method_ids_block class_defs_block annotation_set_block code_items_block annotations_directory_block type_list_block string_data_block byte_data_block annotations_block encoded_array_block class_data_block map_block method_code_index_block )
            // src/com/riis/decompiler/DexToXML.g:59:4: header string_ids_block type_ids_block proto_ids_block field_ids_block method_ids_block class_defs_block annotation_set_block code_items_block annotations_directory_block type_list_block string_data_block byte_data_block annotations_block encoded_array_block class_data_block map_block method_code_index_block
            {
            pushFollow(FOLLOW_header_in_rule66);
            header();

            state._fsp--;


            pushFollow(FOLLOW_string_ids_block_in_rule78);
            string_ids_block();

            state._fsp--;


            pushFollow(FOLLOW_type_ids_block_in_rule83);
            type_ids_block();

            state._fsp--;


            pushFollow(FOLLOW_proto_ids_block_in_rule88);
            proto_ids_block();

            state._fsp--;


            pushFollow(FOLLOW_field_ids_block_in_rule93);
            field_ids_block();

            state._fsp--;


            pushFollow(FOLLOW_method_ids_block_in_rule98);
            method_ids_block();

            state._fsp--;


            pushFollow(FOLLOW_class_defs_block_in_rule103);
            class_defs_block();

            state._fsp--;


            pushFollow(FOLLOW_annotation_set_block_in_rule112);
            annotation_set_block();

            state._fsp--;


            pushFollow(FOLLOW_code_items_block_in_rule121);
            code_items_block();

            state._fsp--;


            pushFollow(FOLLOW_annotations_directory_block_in_rule127);
            annotations_directory_block();

            state._fsp--;


            pushFollow(FOLLOW_type_list_block_in_rule132);
            type_list_block();

            state._fsp--;


            pushFollow(FOLLOW_string_data_block_in_rule137);
            string_data_block();

            state._fsp--;


            pushFollow(FOLLOW_byte_data_block_in_rule142);
            byte_data_block();

            state._fsp--;


            pushFollow(FOLLOW_annotations_block_in_rule147);
            annotations_block();

            state._fsp--;


            pushFollow(FOLLOW_encoded_array_block_in_rule152);
            encoded_array_block();

            state._fsp--;


            pushFollow(FOLLOW_class_data_block_in_rule161);
            class_data_block();

            state._fsp--;


            pushFollow(FOLLOW_map_block_in_rule170);
            map_block();

            state._fsp--;


            pushFollow(FOLLOW_method_code_index_block_in_rule175);
            method_code_index_block();

            state._fsp--;


            }

            fout.printXML("</root>"); fout.close(); 
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



    // $ANTLR start "header"
    // src/com/riis/decompiler/DexToXML.g:88:1: header : signature_block pointer_block empty_line ;
    public final void header() throws RecognitionException {
        fout.printXML("<header>"); 
        try {
            // src/com/riis/decompiler/DexToXML.g:92:2: ( signature_block pointer_block empty_line )
            // src/com/riis/decompiler/DexToXML.g:92:4: signature_block pointer_block empty_line
            {
            pushFollow(FOLLOW_signature_block_in_header205);
            signature_block();

            state._fsp--;


            pushFollow(FOLLOW_pointer_block_in_header210);
            pointer_block();

            state._fsp--;


            pushFollow(FOLLOW_empty_line_in_header215);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</header>"); 
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
    // $ANTLR end "header"



    // $ANTLR start "signature_block"
    // src/com/riis/decompiler/DexToXML.g:101:1: signature_block : magic checksum signature ;
    public final void signature_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:102:2: ( magic checksum signature )
            // src/com/riis/decompiler/DexToXML.g:102:4: magic checksum signature
            {
            pushFollow(FOLLOW_magic_in_signature_block232);
            magic();

            state._fsp--;


            pushFollow(FOLLOW_checksum_in_signature_block237);
            checksum();

            state._fsp--;


            pushFollow(FOLLOW_signature_in_signature_block242);
            signature();

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
    // $ANTLR end "signature_block"



    // $ANTLR start "magic"
    // src/com/riis/decompiler/DexToXML.g:107:1: magic : address hex_after_address 'magic:' id= quoted_string NEWLINE ;
    public final void magic() throws RecognitionException {
        String id =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:108:2: ( address hex_after_address 'magic:' id= quoted_string NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:108:4: address hex_after_address 'magic:' id= quoted_string NEWLINE
            {
            pushFollow(FOLLOW_address_in_magic253);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_magic255);
            hex_after_address();

            state._fsp--;


            match(input,82,FOLLOW_82_in_magic257); 

            pushFollow(FOLLOW_quoted_string_in_magic261);
            id=quoted_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_magic263); 

            fout.printXML("<magic>" + id + "</magic>"); 

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
    // $ANTLR end "magic"



    // $ANTLR start "checksum"
    // src/com/riis/decompiler/DexToXML.g:112:1: checksum : address id= hex_after_address 'checksum' NEWLINE ;
    public final void checksum() throws RecognitionException {
        String id =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:113:2: ( address id= hex_after_address 'checksum' NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:113:4: address id= hex_after_address 'checksum' NEWLINE
            {
            pushFollow(FOLLOW_address_in_checksum279);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_checksum283);
            id=hex_after_address();

            state._fsp--;


            match(input,35,FOLLOW_35_in_checksum285); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_checksum287); 

            fout.printXML("<checksum>" + id + "</checksum>"); 

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
    // $ANTLR end "checksum"



    // $ANTLR start "signature"
    // src/com/riis/decompiler/DexToXML.g:117:1: signature : address id1= hex_after_address 'signature' NEWLINE address id2= hex_after_address NEWLINE ;
    public final void signature() throws RecognitionException {
        String id1 =null;

        String id2 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:118:2: ( address id1= hex_after_address 'signature' NEWLINE address id2= hex_after_address NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:118:4: address id1= hex_after_address 'signature' NEWLINE address id2= hex_after_address NEWLINE
            {
            pushFollow(FOLLOW_address_in_signature303);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_signature307);
            id1=hex_after_address();

            state._fsp--;


            match(input,106,FOLLOW_106_in_signature309); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_signature311); 

            pushFollow(FOLLOW_address_in_signature316);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_signature320);
            id2=hex_after_address();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_signature322); 

            fout.printXML("<signature>" + id1 + id2 + "</signature>"); 

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
    // $ANTLR end "signature"



    // $ANTLR start "pointer_block"
    // src/com/riis/decompiler/DexToXML.g:126:1: pointer_block : file_size header_size endian_tag link_size link_offset map_offset string_ids_size string_ids_offset type_ids_size type_ids_offset proto_ids_size proto_ids_offset field_ids_size field_ids_offset method_ids_size method_ids_offset class_defs_size class_defs_offset data_size data_offset ;
    public final void pointer_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:127:2: ( file_size header_size endian_tag link_size link_offset map_offset string_ids_size string_ids_offset type_ids_size type_ids_offset proto_ids_size proto_ids_offset field_ids_size field_ids_offset method_ids_size method_ids_offset class_defs_size class_defs_offset data_size data_offset )
            // src/com/riis/decompiler/DexToXML.g:127:4: file_size header_size endian_tag link_size link_offset map_offset string_ids_size string_ids_offset type_ids_size type_ids_offset proto_ids_size proto_ids_offset field_ids_size field_ids_offset method_ids_size method_ids_offset class_defs_size class_defs_offset data_size data_offset
            {
            pushFollow(FOLLOW_file_size_in_pointer_block342);
            file_size();

            state._fsp--;


            pushFollow(FOLLOW_header_size_in_pointer_block347);
            header_size();

            state._fsp--;


            pushFollow(FOLLOW_endian_tag_in_pointer_block352);
            endian_tag();

            state._fsp--;


            pushFollow(FOLLOW_link_size_in_pointer_block357);
            link_size();

            state._fsp--;


            pushFollow(FOLLOW_link_offset_in_pointer_block362);
            link_offset();

            state._fsp--;


            pushFollow(FOLLOW_map_offset_in_pointer_block367);
            map_offset();

            state._fsp--;


            pushFollow(FOLLOW_string_ids_size_in_pointer_block372);
            string_ids_size();

            state._fsp--;


            pushFollow(FOLLOW_string_ids_offset_in_pointer_block377);
            string_ids_offset();

            state._fsp--;


            pushFollow(FOLLOW_type_ids_size_in_pointer_block382);
            type_ids_size();

            state._fsp--;


            pushFollow(FOLLOW_type_ids_offset_in_pointer_block387);
            type_ids_offset();

            state._fsp--;


            pushFollow(FOLLOW_proto_ids_size_in_pointer_block392);
            proto_ids_size();

            state._fsp--;


            pushFollow(FOLLOW_proto_ids_offset_in_pointer_block397);
            proto_ids_offset();

            state._fsp--;


            pushFollow(FOLLOW_field_ids_size_in_pointer_block402);
            field_ids_size();

            state._fsp--;


            pushFollow(FOLLOW_field_ids_offset_in_pointer_block407);
            field_ids_offset();

            state._fsp--;


            pushFollow(FOLLOW_method_ids_size_in_pointer_block412);
            method_ids_size();

            state._fsp--;


            pushFollow(FOLLOW_method_ids_offset_in_pointer_block417);
            method_ids_offset();

            state._fsp--;


            pushFollow(FOLLOW_class_defs_size_in_pointer_block422);
            class_defs_size();

            state._fsp--;


            pushFollow(FOLLOW_class_defs_offset_in_pointer_block427);
            class_defs_offset();

            state._fsp--;


            pushFollow(FOLLOW_data_size_in_pointer_block432);
            data_size();

            state._fsp--;


            pushFollow(FOLLOW_data_offset_in_pointer_block437);
            data_offset();

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
    // $ANTLR end "pointer_block"



    // $ANTLR start "file_size"
    // src/com/riis/decompiler/DexToXML.g:149:1: file_size : address hex_after_address 'file_size:' id1= num_to_end_of_line ;
    public final void file_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:150:2: ( address hex_after_address 'file_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:150:4: address hex_after_address 'file_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_file_size449);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_file_size451);
            hex_after_address();

            state._fsp--;


            match(input,65,FOLLOW_65_in_file_size453); 

            pushFollow(FOLLOW_num_to_end_of_line_in_file_size457);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<file_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</file_size>");
            		  fileSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "file_size"



    // $ANTLR start "header_size"
    // src/com/riis/decompiler/DexToXML.g:155:1: header_size : address hex_after_address 'header_size:' id1= num_to_end_of_line ;
    public final void header_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:156:2: ( address hex_after_address 'header_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:156:4: address hex_after_address 'header_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_header_size473);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_header_size475);
            hex_after_address();

            state._fsp--;


            match(input,68,FOLLOW_68_in_header_size477); 

            pushFollow(FOLLOW_num_to_end_of_line_in_header_size481);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<header_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</header_size>");
            		  headerSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "header_size"



    // $ANTLR start "endian_tag"
    // src/com/riis/decompiler/DexToXML.g:161:1: endian_tag : address hex_after_address 'endian_tag:' id1= num_to_end_of_line ;
    public final void endian_tag() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:162:2: ( address hex_after_address 'endian_tag:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:162:4: address hex_after_address 'endian_tag:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_endian_tag497);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_endian_tag499);
            hex_after_address();

            state._fsp--;


            match(input,57,FOLLOW_57_in_endian_tag501); 

            pushFollow(FOLLOW_num_to_end_of_line_in_endian_tag505);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<endian_tag>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</endian_tag>");
            		  headerSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "endian_tag"



    // $ANTLR start "link_size"
    // src/com/riis/decompiler/DexToXML.g:167:1: link_size : address hex_after_address 'link_size:' id1= num_to_end_of_line ;
    public final void link_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:168:2: ( address hex_after_address 'link_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:168:4: address hex_after_address 'link_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_link_size521);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_link_size523);
            hex_after_address();

            state._fsp--;


            match(input,78,FOLLOW_78_in_link_size525); 

            pushFollow(FOLLOW_num_to_end_of_line_in_link_size529);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<link_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</link_size>");
            		  linkSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "link_size"



    // $ANTLR start "link_offset"
    // src/com/riis/decompiler/DexToXML.g:173:1: link_offset : address hex_after_address 'link_off:' id1= num_to_end_of_line ;
    public final void link_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:174:2: ( address hex_after_address 'link_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:174:4: address hex_after_address 'link_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_link_offset545);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_link_offset547);
            hex_after_address();

            state._fsp--;


            match(input,77,FOLLOW_77_in_link_offset549); 

            pushFollow(FOLLOW_num_to_end_of_line_in_link_offset553);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<link_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</link_offset>");
            		  linkOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "link_offset"



    // $ANTLR start "map_offset"
    // src/com/riis/decompiler/DexToXML.g:179:1: map_offset : address hex_after_address 'map_off:' id1= num_to_end_of_line ;
    public final void map_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:180:2: ( address hex_after_address 'map_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:180:4: address hex_after_address 'map_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_map_offset569);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_map_offset571);
            hex_after_address();

            state._fsp--;


            match(input,83,FOLLOW_83_in_map_offset573); 

            pushFollow(FOLLOW_num_to_end_of_line_in_map_offset577);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<map_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</map_offset>");
            		  mapOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "map_offset"



    // $ANTLR start "string_ids_size"
    // src/com/riis/decompiler/DexToXML.g:185:1: string_ids_size : address hex_after_address 'string_ids_size:' id1= num_to_end_of_line ;
    public final void string_ids_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:186:2: ( address hex_after_address 'string_ids_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:186:4: address hex_after_address 'string_ids_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_string_ids_size593);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_string_ids_size595);
            hex_after_address();

            state._fsp--;


            match(input,115,FOLLOW_115_in_string_ids_size597); 

            pushFollow(FOLLOW_num_to_end_of_line_in_string_ids_size601);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<string_ids_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</string_ids_size>");
            		  stringIdsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "string_ids_size"



    // $ANTLR start "string_ids_offset"
    // src/com/riis/decompiler/DexToXML.g:191:1: string_ids_offset : address hex_after_address 'string_ids_off:' id1= num_to_end_of_line ;
    public final void string_ids_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:192:2: ( address hex_after_address 'string_ids_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:192:4: address hex_after_address 'string_ids_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_string_ids_offset617);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_string_ids_offset619);
            hex_after_address();

            state._fsp--;


            match(input,114,FOLLOW_114_in_string_ids_offset621); 

            pushFollow(FOLLOW_num_to_end_of_line_in_string_ids_offset625);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<string_ids_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</string_ids_offset>");
            		  stringIdsOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "string_ids_offset"



    // $ANTLR start "type_ids_size"
    // src/com/riis/decompiler/DexToXML.g:197:1: type_ids_size : address hex_after_address 'type_ids_size:' id1= num_to_end_of_line ;
    public final void type_ids_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:198:2: ( address hex_after_address 'type_ids_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:198:4: address hex_after_address 'type_ids_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_type_ids_size641);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_type_ids_size643);
            hex_after_address();

            state._fsp--;


            match(input,124,FOLLOW_124_in_type_ids_size645); 

            pushFollow(FOLLOW_num_to_end_of_line_in_type_ids_size649);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<type_ids_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</type_ids_size>");
            		  typeIdsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "type_ids_size"



    // $ANTLR start "type_ids_offset"
    // src/com/riis/decompiler/DexToXML.g:203:1: type_ids_offset : address hex_after_address 'type_ids_off:' id1= num_to_end_of_line ;
    public final void type_ids_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:204:2: ( address hex_after_address 'type_ids_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:204:4: address hex_after_address 'type_ids_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_type_ids_offset665);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_type_ids_offset667);
            hex_after_address();

            state._fsp--;


            match(input,123,FOLLOW_123_in_type_ids_offset669); 

            pushFollow(FOLLOW_num_to_end_of_line_in_type_ids_offset673);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<type_ids_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</type_ids_offset>");
            		  typeIdsOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "type_ids_offset"



    // $ANTLR start "proto_ids_size"
    // src/com/riis/decompiler/DexToXML.g:209:1: proto_ids_size : address hex_after_address 'proto_ids_size:' id1= num_to_end_of_line ;
    public final void proto_ids_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:210:2: ( address hex_after_address 'proto_ids_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:210:4: address hex_after_address 'proto_ids_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_proto_ids_size689);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_proto_ids_size691);
            hex_after_address();

            state._fsp--;


            match(input,101,FOLLOW_101_in_proto_ids_size693); 

            pushFollow(FOLLOW_num_to_end_of_line_in_proto_ids_size697);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<proto_ids_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</proto_ids_size>");
            		  protoIdsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "proto_ids_size"



    // $ANTLR start "proto_ids_offset"
    // src/com/riis/decompiler/DexToXML.g:215:1: proto_ids_offset : address hex_after_address 'proto_ids_off:' id1= num_to_end_of_line ;
    public final void proto_ids_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:216:2: ( address hex_after_address 'proto_ids_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:216:4: address hex_after_address 'proto_ids_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_proto_ids_offset713);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_proto_ids_offset715);
            hex_after_address();

            state._fsp--;


            match(input,100,FOLLOW_100_in_proto_ids_offset717); 

            pushFollow(FOLLOW_num_to_end_of_line_in_proto_ids_offset721);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<proto_ids_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</proto_ids_offset>");
            		  protoIdsOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "proto_ids_offset"



    // $ANTLR start "field_ids_size"
    // src/com/riis/decompiler/DexToXML.g:221:1: field_ids_size : address hex_after_address 'field_ids_size:' id1= num_to_end_of_line ;
    public final void field_ids_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:222:2: ( address hex_after_address 'field_ids_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:222:4: address hex_after_address 'field_ids_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_field_ids_size737);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_field_ids_size739);
            hex_after_address();

            state._fsp--;


            match(input,61,FOLLOW_61_in_field_ids_size741); 

            pushFollow(FOLLOW_num_to_end_of_line_in_field_ids_size745);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<field_ids_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</field_ids_size>");
            		  fieldIdsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "field_ids_size"



    // $ANTLR start "field_ids_offset"
    // src/com/riis/decompiler/DexToXML.g:227:1: field_ids_offset : address hex_after_address 'field_ids_off:' id1= num_to_end_of_line ;
    public final void field_ids_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:228:2: ( address hex_after_address 'field_ids_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:228:4: address hex_after_address 'field_ids_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_field_ids_offset761);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_field_ids_offset763);
            hex_after_address();

            state._fsp--;


            match(input,60,FOLLOW_60_in_field_ids_offset765); 

            pushFollow(FOLLOW_num_to_end_of_line_in_field_ids_offset769);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<field_ids_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</field_ids_offset>");
            		  fieldIdsOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "field_ids_offset"



    // $ANTLR start "method_ids_size"
    // src/com/riis/decompiler/DexToXML.g:233:1: method_ids_size : address hex_after_address 'method_ids_size:' id1= num_to_end_of_line ;
    public final void method_ids_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:234:2: ( address hex_after_address 'method_ids_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:234:4: address hex_after_address 'method_ids_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_method_ids_size784);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_method_ids_size786);
            hex_after_address();

            state._fsp--;


            match(input,86,FOLLOW_86_in_method_ids_size788); 

            pushFollow(FOLLOW_num_to_end_of_line_in_method_ids_size792);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<method_ids_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</method_ids_size>");
            		 methodIdsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "method_ids_size"



    // $ANTLR start "method_ids_offset"
    // src/com/riis/decompiler/DexToXML.g:239:1: method_ids_offset : address hex_after_address 'method_ids_off:' id1= num_to_end_of_line ;
    public final void method_ids_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:240:2: ( address hex_after_address 'method_ids_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:240:4: address hex_after_address 'method_ids_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_method_ids_offset808);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_method_ids_offset810);
            hex_after_address();

            state._fsp--;


            match(input,85,FOLLOW_85_in_method_ids_offset812); 

            pushFollow(FOLLOW_num_to_end_of_line_in_method_ids_offset816);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<method_ids_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</method_ids_offset>");
            		  methodIdsOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "method_ids_offset"



    // $ANTLR start "class_defs_size"
    // src/com/riis/decompiler/DexToXML.g:245:1: class_defs_size : address hex_after_address 'class_defs_size:' id1= num_to_end_of_line ;
    public final void class_defs_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:246:2: ( address hex_after_address 'class_defs_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:246:4: address hex_after_address 'class_defs_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_class_defs_size831);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_defs_size833);
            hex_after_address();

            state._fsp--;


            match(input,41,FOLLOW_41_in_class_defs_size835); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_defs_size839);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<class_defs_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</class_defs_size>");
            		  classDefsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "class_defs_size"



    // $ANTLR start "class_defs_offset"
    // src/com/riis/decompiler/DexToXML.g:251:1: class_defs_offset : address hex_after_address 'class_defs_off:' id1= num_to_end_of_line ;
    public final void class_defs_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:252:2: ( address hex_after_address 'class_defs_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:252:4: address hex_after_address 'class_defs_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_class_defs_offset854);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_defs_offset856);
            hex_after_address();

            state._fsp--;


            match(input,40,FOLLOW_40_in_class_defs_offset858); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_defs_offset862);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<class_defs_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</class_defs_offset>");
            		  classDefsOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "class_defs_offset"



    // $ANTLR start "data_size"
    // src/com/riis/decompiler/DexToXML.g:257:1: data_size : address hex_after_address 'data_size:' id1= num_to_end_of_line ;
    public final void data_size() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:258:2: ( address hex_after_address 'data_size:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:258:4: address hex_after_address 'data_size:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_data_size877);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_data_size879);
            hex_after_address();

            state._fsp--;


            match(input,48,FOLLOW_48_in_data_size881); 

            pushFollow(FOLLOW_num_to_end_of_line_in_data_size885);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<data_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</data_size>");
            		  dataSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "data_size"



    // $ANTLR start "data_offset"
    // src/com/riis/decompiler/DexToXML.g:263:1: data_offset : address hex_after_address 'data_off:' id1= num_to_end_of_line ;
    public final void data_offset() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:264:2: ( address hex_after_address 'data_off:' id1= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:264:4: address hex_after_address 'data_off:' id1= num_to_end_of_line
            {
            pushFollow(FOLLOW_address_in_data_offset900);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_data_offset902);
            hex_after_address();

            state._fsp--;


            match(input,47,FOLLOW_47_in_data_offset904); 

            pushFollow(FOLLOW_num_to_end_of_line_in_data_offset908);
            id1=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<data_offset>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</data_offset>");
            		  dataOffset = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);

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
    // $ANTLR end "data_offset"



    // $ANTLR start "string_ids_block"
    // src/com/riis/decompiler/DexToXML.g:273:1: string_ids_block : LINE_SPLIT 'string_ids:' NEWLINE ( string_id )+ {...}? empty_line ;
    public final void string_ids_block() throws RecognitionException {
        fout.printXML("<string_ids>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:277:2: ( LINE_SPLIT 'string_ids:' NEWLINE ( string_id )+ {...}? empty_line )
            // src/com/riis/decompiler/DexToXML.g:277:4: LINE_SPLIT 'string_ids:' NEWLINE ( string_id )+ {...}? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_string_ids_block943); 

            match(input,113,FOLLOW_113_in_string_ids_block945); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_string_ids_block947); 

            // src/com/riis/decompiler/DexToXML.g:278:4: ( string_id )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LINE_SPLIT) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==24) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:278:5: string_id
            	    {
            	    pushFollow(FOLLOW_string_id_in_string_ids_block953);
            	    string_id();

            	    state._fsp--;


            	     n++; 

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


            if ( !(( n == stringIdsSize )) ) {
                throw new FailedPredicateException(input, "string_ids_block", " n == stringIdsSize ");
            }

            pushFollow(FOLLOW_empty_line_in_string_ids_block965);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</string_ids>");
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
    // $ANTLR end "string_ids_block"



    // $ANTLR start "string_id"
    // src/com/riis/decompiler/DexToXML.g:282:1: string_id : LINE_SPLIT id1= element id2= quoted_string NEWLINE address hex_after_address 'string_data_off:' id3= num_to_end_of_line ;
    public final void string_id() throws RecognitionException {
        String id1 =null;

        String id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:283:2: ( LINE_SPLIT id1= element id2= quoted_string NEWLINE address hex_after_address 'string_data_off:' id3= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:283:4: LINE_SPLIT id1= element id2= quoted_string NEWLINE address hex_after_address 'string_data_off:' id3= num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_string_id978); 

            pushFollow(FOLLOW_element_in_string_id982);
            id1=element();

            state._fsp--;


            pushFollow(FOLLOW_quoted_string_in_string_id986);
            id2=quoted_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_string_id988); 

            pushFollow(FOLLOW_address_in_string_id993);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_string_id995);
            hex_after_address();

            state._fsp--;


            match(input,112,FOLLOW_112_in_string_id997); 

            pushFollow(FOLLOW_num_to_end_of_line_in_string_id1001);
            id3=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<string>\n<id>" + id1 + "</id>\n<address>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</address>\n<contents>" + fout.encodeXML(id2) + "</contents>\n</string>"); 

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
    // $ANTLR end "string_id"



    // $ANTLR start "type_ids_block"
    // src/com/riis/decompiler/DexToXML.g:292:1: type_ids_block : LINE_SPLIT 'type_ids:' NEWLINE ( type_id )+ {...}? empty_line ;
    public final void type_ids_block() throws RecognitionException {
        fout.printXML("<type_ids>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:296:2: ( LINE_SPLIT 'type_ids:' NEWLINE ( type_id )+ {...}? empty_line )
            // src/com/riis/decompiler/DexToXML.g:296:4: LINE_SPLIT 'type_ids:' NEWLINE ( type_id )+ {...}? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_type_ids_block1036); 

            match(input,122,FOLLOW_122_in_type_ids_block1038); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_ids_block1040); 

            // src/com/riis/decompiler/DexToXML.g:297:4: ( type_id )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LINE_SPLIT) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==24) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:297:5: type_id
            	    {
            	    pushFollow(FOLLOW_type_id_in_type_ids_block1046);
            	    type_id();

            	    state._fsp--;


            	     n++; 

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


            if ( !(( n == typeIdsSize )) ) {
                throw new FailedPredicateException(input, "type_ids_block", " n == typeIdsSize ");
            }

            pushFollow(FOLLOW_empty_line_in_type_ids_block1058);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</type_ids>");
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
    // $ANTLR end "type_ids_block"



    // $ANTLR start "type_id"
    // src/com/riis/decompiler/DexToXML.g:301:1: type_id : LINE_SPLIT id1= element id2= proto_type_string NEWLINE address hex_after_address 'descriptor_idx:' id3= num_to_end_of_line ;
    public final void type_id() throws RecognitionException {
        String id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:302:2: ( LINE_SPLIT id1= element id2= proto_type_string NEWLINE address hex_after_address 'descriptor_idx:' id3= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:302:4: LINE_SPLIT id1= element id2= proto_type_string NEWLINE address hex_after_address 'descriptor_idx:' id3= num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_type_id1071); 

            pushFollow(FOLLOW_element_in_type_id1075);
            id1=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_type_id1079);
            id2=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_id1081); 

            pushFollow(FOLLOW_address_in_type_id1086);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_type_id1088);
            hex_after_address();

            state._fsp--;


            match(input,51,FOLLOW_51_in_type_id1090); 

            pushFollow(FOLLOW_num_to_end_of_line_in_type_id1094);
            id3=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<type>\n<id>" + id1 + "</id>\n<string_id>" 
            		  		+ (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</string_id>\n<string>" + (id2!=null?input.toString(id2.start,id2.stop):null) + "</string>\n</type>");

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
    // $ANTLR end "type_id"



    // $ANTLR start "proto_ids_block"
    // src/com/riis/decompiler/DexToXML.g:312:1: proto_ids_block : LINE_SPLIT 'proto_ids:' NEWLINE ( proto_id )+ {...}? empty_line ;
    public final void proto_ids_block() throws RecognitionException {
        fout.printXML("<proto_ids>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:316:2: ( LINE_SPLIT 'proto_ids:' NEWLINE ( proto_id )+ {...}? empty_line )
            // src/com/riis/decompiler/DexToXML.g:316:4: LINE_SPLIT 'proto_ids:' NEWLINE ( proto_id )+ {...}? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_proto_ids_block1129); 

            match(input,99,FOLLOW_99_in_proto_ids_block1131); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_proto_ids_block1133); 

            // src/com/riis/decompiler/DexToXML.g:317:4: ( proto_id )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==LINE_SPLIT) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==24) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:317:5: proto_id
            	    {
            	    pushFollow(FOLLOW_proto_id_in_proto_ids_block1139);
            	    proto_id();

            	    state._fsp--;


            	     n++; 

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


            if ( !(( n == protoIdsSize)) ) {
                throw new FailedPredicateException(input, "proto_ids_block", " n == protoIdsSize");
            }

            pushFollow(FOLLOW_empty_line_in_proto_ids_block1151);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</proto_ids>"); 
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
    // $ANTLR end "proto_ids_block"



    // $ANTLR start "proto_id"
    // src/com/riis/decompiler/DexToXML.g:321:1: proto_id : LINE_SPLIT id1= element proto_type_string 'proto' '(' ( ( ',' )? proto_type_string )* ')' NEWLINE address hex_after_address 'shorty_idx:' num_to_slashes id2= quoted_string NEWLINE address hex_after_address 'return_type_idx:' num_to_slashes id3= proto_type_string NEWLINE address hex_after_address 'parameters_off:' num_to_end_of_line ;
    public final void proto_id() throws RecognitionException {
        String id1 =null;

        String id2 =null;

        DexToXMLParser.proto_type_string_return id3 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:322:2: ( LINE_SPLIT id1= element proto_type_string 'proto' '(' ( ( ',' )? proto_type_string )* ')' NEWLINE address hex_after_address 'shorty_idx:' num_to_slashes id2= quoted_string NEWLINE address hex_after_address 'return_type_idx:' num_to_slashes id3= proto_type_string NEWLINE address hex_after_address 'parameters_off:' num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:322:4: LINE_SPLIT id1= element proto_type_string 'proto' '(' ( ( ',' )? proto_type_string )* ')' NEWLINE address hex_after_address 'shorty_idx:' num_to_slashes id2= quoted_string NEWLINE address hex_after_address 'return_type_idx:' num_to_slashes id3= proto_type_string NEWLINE address hex_after_address 'parameters_off:' num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_proto_id1164); 

            pushFollow(FOLLOW_element_in_proto_id1168);
            id1=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_proto_id1170);
            proto_type_string();

            state._fsp--;


            match(input,98,FOLLOW_98_in_proto_id1172); 

            match(input,11,FOLLOW_11_in_proto_id1174); 

            // src/com/riis/decompiler/DexToXML.g:322:57: ( ( ',' )? proto_type_string )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= DIGIT && LA5_0 <= IDENT)||LA5_0==11||LA5_0==14||LA5_0==21||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:322:58: ( ',' )? proto_type_string
            	    {
            	    // src/com/riis/decompiler/DexToXML.g:322:58: ( ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:322:58: ','
            	            {
            	            match(input,14,FOLLOW_14_in_proto_id1177); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_proto_type_string_in_proto_id1180);
            	    proto_type_string();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,12,FOLLOW_12_in_proto_id1184); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_proto_id1186); 

            pushFollow(FOLLOW_address_in_proto_id1191);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_proto_id1193);
            hex_after_address();

            state._fsp--;


            match(input,105,FOLLOW_105_in_proto_id1195); 

            pushFollow(FOLLOW_num_to_slashes_in_proto_id1197);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_quoted_string_in_proto_id1201);
            id2=quoted_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_proto_id1203); 

            pushFollow(FOLLOW_address_in_proto_id1208);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_proto_id1210);
            hex_after_address();

            state._fsp--;


            match(input,104,FOLLOW_104_in_proto_id1212); 

            pushFollow(FOLLOW_num_to_slashes_in_proto_id1214);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_proto_id1218);
            id3=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_proto_id1220); 

            pushFollow(FOLLOW_address_in_proto_id1226);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_proto_id1228);
            hex_after_address();

            state._fsp--;


            match(input,95,FOLLOW_95_in_proto_id1230); 

            pushFollow(FOLLOW_num_to_end_of_line_in_proto_id1232);
            num_to_end_of_line();

            state._fsp--;


            fout.printXML("<proto>\n<id>" + id1 + "</id>\n<string>" 
            		   		+ id2 + "</string>\n<signature>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</signature>\n</proto>");

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
    // $ANTLR end "proto_id"



    // $ANTLR start "field_ids_block"
    // src/com/riis/decompiler/DexToXML.g:334:1: field_ids_block : LINE_SPLIT 'field_ids:' NEWLINE ( field_id )* {...}? empty_line ;
    public final void field_ids_block() throws RecognitionException {
        fout.printXML("<field_ids>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:338:2: ( LINE_SPLIT 'field_ids:' NEWLINE ( field_id )* {...}? empty_line )
            // src/com/riis/decompiler/DexToXML.g:338:4: LINE_SPLIT 'field_ids:' NEWLINE ( field_id )* {...}? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_field_ids_block1268); 

            match(input,59,FOLLOW_59_in_field_ids_block1270); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_field_ids_block1272); 

            // src/com/riis/decompiler/DexToXML.g:339:4: ( field_id )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LINE_SPLIT) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==24) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:339:5: field_id
            	    {
            	    pushFollow(FOLLOW_field_id_in_field_ids_block1278);
            	    field_id();

            	    state._fsp--;


            	     n++; 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( !(( n == fieldIdsSize )) ) {
                throw new FailedPredicateException(input, "field_ids_block", " n == fieldIdsSize ");
            }

            pushFollow(FOLLOW_empty_line_in_field_ids_block1290);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</field_ids>");
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
    // $ANTLR end "field_ids_block"



    // $ANTLR start "field_id"
    // src/com/riis/decompiler/DexToXML.g:343:1: field_id : LINE_SPLIT id1= element id2= proto_type_string ':' id3= proto_type_string NEWLINE address hex_after_address 'class_idx:' num_to_end_of_line address hex_after_address 'type_idx:' num_to_end_of_line address hex_after_address 'name_idx:' num_to_end_of_line ;
    public final void field_id() throws RecognitionException {
        String id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.proto_type_string_return id3 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:344:2: ( LINE_SPLIT id1= element id2= proto_type_string ':' id3= proto_type_string NEWLINE address hex_after_address 'class_idx:' num_to_end_of_line address hex_after_address 'type_idx:' num_to_end_of_line address hex_after_address 'name_idx:' num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:344:4: LINE_SPLIT id1= element id2= proto_type_string ':' id3= proto_type_string NEWLINE address hex_after_address 'class_idx:' num_to_end_of_line address hex_after_address 'type_idx:' num_to_end_of_line address hex_after_address 'name_idx:' num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_field_id1302); 

            pushFollow(FOLLOW_element_in_field_id1306);
            id1=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_field_id1310);
            id2=proto_type_string();

            state._fsp--;


            match(input,19,FOLLOW_19_in_field_id1312); 

            pushFollow(FOLLOW_proto_type_string_in_field_id1316);
            id3=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_field_id1318); 

            pushFollow(FOLLOW_address_in_field_id1323);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_field_id1325);
            hex_after_address();

            state._fsp--;


            match(input,42,FOLLOW_42_in_field_id1327); 

            pushFollow(FOLLOW_num_to_end_of_line_in_field_id1329);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_field_id1334);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_field_id1336);
            hex_after_address();

            state._fsp--;


            match(input,125,FOLLOW_125_in_field_id1338); 

            pushFollow(FOLLOW_num_to_end_of_line_in_field_id1340);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_field_id1345);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_field_id1347);
            hex_after_address();

            state._fsp--;


            match(input,90,FOLLOW_90_in_field_id1349); 

            pushFollow(FOLLOW_num_to_end_of_line_in_field_id1351);
            num_to_end_of_line();

            state._fsp--;


            fout.printXML("<field>\n<id>" + id1 + "</id>\n<name>" 
            		   		+ (id2!=null?input.toString(id2.start,id2.stop):null) + "</name>\n<type>" + (id3!=null?input.toString(id3.start,id3.stop):null) + "</type>\n</field>");

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
    // $ANTLR end "field_id"



    // $ANTLR start "method_ids_block"
    // src/com/riis/decompiler/DexToXML.g:357:1: method_ids_block : LINE_SPLIT 'method_ids:' NEWLINE ( method_id )+ {...}? empty_line ;
    public final void method_ids_block() throws RecognitionException {
        fout.printXML("<method_ids>"); int n = 0; 
        try {
            // src/com/riis/decompiler/DexToXML.g:361:2: ( LINE_SPLIT 'method_ids:' NEWLINE ( method_id )+ {...}? empty_line )
            // src/com/riis/decompiler/DexToXML.g:361:4: LINE_SPLIT 'method_ids:' NEWLINE ( method_id )+ {...}? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_method_ids_block1389); 

            match(input,84,FOLLOW_84_in_method_ids_block1391); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_ids_block1393); 

            // src/com/riis/decompiler/DexToXML.g:362:4: ( method_id )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_SPLIT) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==24) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:362:5: method_id
            	    {
            	    pushFollow(FOLLOW_method_id_in_method_ids_block1399);
            	    method_id();

            	    state._fsp--;


            	     n++; 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            if ( !(( n == methodIdsSize )) ) {
                throw new FailedPredicateException(input, "method_ids_block", " n == methodIdsSize ");
            }

            pushFollow(FOLLOW_empty_line_in_method_ids_block1411);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</method_ids>"); 
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
    // $ANTLR end "method_ids_block"



    // $ANTLR start "method_id"
    // src/com/riis/decompiler/DexToXML.g:366:1: method_id : LINE_SPLIT id1= element id2= proto_type_string ( DIGIT )* ':' id3= proto_type_string NEWLINE address hex_after_address 'class_idx:' num_to_end_of_line address hex_after_address 'proto_idx:' num_to_end_of_line address hex_after_address 'name_idx:' num_to_end_of_line ;
    public final void method_id() throws RecognitionException {
        String id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.proto_type_string_return id3 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:367:2: ( LINE_SPLIT id1= element id2= proto_type_string ( DIGIT )* ':' id3= proto_type_string NEWLINE address hex_after_address 'class_idx:' num_to_end_of_line address hex_after_address 'proto_idx:' num_to_end_of_line address hex_after_address 'name_idx:' num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:367:4: LINE_SPLIT id1= element id2= proto_type_string ( DIGIT )* ':' id3= proto_type_string NEWLINE address hex_after_address 'class_idx:' num_to_end_of_line address hex_after_address 'proto_idx:' num_to_end_of_line address hex_after_address 'name_idx:' num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_method_id1424); 

            pushFollow(FOLLOW_element_in_method_id1428);
            id1=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_method_id1432);
            id2=proto_type_string();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:367:49: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DIGIT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:367:49: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_method_id1434); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_method_id1437); 

            pushFollow(FOLLOW_proto_type_string_in_method_id1441);
            id3=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_id1443); 

            pushFollow(FOLLOW_address_in_method_id1448);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_method_id1450);
            hex_after_address();

            state._fsp--;


            match(input,42,FOLLOW_42_in_method_id1452); 

            pushFollow(FOLLOW_num_to_end_of_line_in_method_id1454);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_method_id1459);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_method_id1461);
            hex_after_address();

            state._fsp--;


            match(input,102,FOLLOW_102_in_method_id1463); 

            pushFollow(FOLLOW_num_to_end_of_line_in_method_id1465);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_method_id1470);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_method_id1472);
            hex_after_address();

            state._fsp--;


            match(input,90,FOLLOW_90_in_method_id1474); 

            pushFollow(FOLLOW_num_to_end_of_line_in_method_id1476);
            num_to_end_of_line();

            state._fsp--;


            fout.printXML("<method>\n<id>" + id1 + "</id>\n<name>" 
            		   		+ fout.encodeXML((id2!=null?input.toString(id2.start,id2.stop):null)) + "</name>\n<proto>" + fout.encodeXML((id3!=null?input.toString(id3.start,id3.stop):null)) + "</proto>\n</method>");

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
    // $ANTLR end "method_id"



    // $ANTLR start "class_defs_block"
    // src/com/riis/decompiler/DexToXML.g:380:1: class_defs_block : LINE_SPLIT 'class_defs:' NEWLINE ( class_def )+ {...}? empty_line ;
    public final void class_defs_block() throws RecognitionException {
        fout.printXML("<class_defs>"); int n = 0; 
        try {
            // src/com/riis/decompiler/DexToXML.g:384:2: ( LINE_SPLIT 'class_defs:' NEWLINE ( class_def )+ {...}? empty_line )
            // src/com/riis/decompiler/DexToXML.g:384:4: LINE_SPLIT 'class_defs:' NEWLINE ( class_def )+ {...}? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_class_defs_block1514); 

            match(input,39,FOLLOW_39_in_class_defs_block1516); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_class_defs_block1518); 

            // src/com/riis/decompiler/DexToXML.g:385:4: ( class_def )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LINE_SPLIT) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==24) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:385:5: class_def
            	    {
            	    pushFollow(FOLLOW_class_def_in_class_defs_block1524);
            	    class_def();

            	    state._fsp--;


            	     n++; 

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


            if ( !(( n == classDefsSize )) ) {
                throw new FailedPredicateException(input, "class_defs_block", " n == classDefsSize ");
            }

            pushFollow(FOLLOW_empty_line_in_class_defs_block1536);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</class_defs>"); 
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
    // $ANTLR end "class_defs_block"



    // $ANTLR start "class_def"
    // src/com/riis/decompiler/DexToXML.g:389:1: class_def : LINE_SPLIT id1= element id2= proto_type_string NEWLINE address hex_after_address 'class_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'superclass_idx:' num_to_slashes id5= proto_type_string NEWLINE address hex_after_address 'interfaces_off:' id6= num_to_end_of_line ( LINE_SPLIT proto_type_string NEWLINE )* address hex_after_address 'source_file_idx:' num_to_slashes id7= proto_type_string NEWLINE address hex_after_address 'annotations_off:' id8= num_to_end_of_line address hex_after_address 'class_data_off:' id9= num_to_end_of_line address hex_after_address 'static_values_off:' id10= num_to_end_of_line ;
    public final void class_def() throws RecognitionException {
        String id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.access_modifiers_with_nums_return id4 =null;

        DexToXMLParser.proto_type_string_return id5 =null;

        DexToXMLParser.num_to_end_of_line_return id6 =null;

        DexToXMLParser.proto_type_string_return id7 =null;

        DexToXMLParser.num_to_end_of_line_return id8 =null;

        DexToXMLParser.num_to_end_of_line_return id9 =null;

        DexToXMLParser.num_to_end_of_line_return id10 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:390:2: ( LINE_SPLIT id1= element id2= proto_type_string NEWLINE address hex_after_address 'class_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'superclass_idx:' num_to_slashes id5= proto_type_string NEWLINE address hex_after_address 'interfaces_off:' id6= num_to_end_of_line ( LINE_SPLIT proto_type_string NEWLINE )* address hex_after_address 'source_file_idx:' num_to_slashes id7= proto_type_string NEWLINE address hex_after_address 'annotations_off:' id8= num_to_end_of_line address hex_after_address 'class_data_off:' id9= num_to_end_of_line address hex_after_address 'static_values_off:' id10= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:390:4: LINE_SPLIT id1= element id2= proto_type_string NEWLINE address hex_after_address 'class_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'superclass_idx:' num_to_slashes id5= proto_type_string NEWLINE address hex_after_address 'interfaces_off:' id6= num_to_end_of_line ( LINE_SPLIT proto_type_string NEWLINE )* address hex_after_address 'source_file_idx:' num_to_slashes id7= proto_type_string NEWLINE address hex_after_address 'annotations_off:' id8= num_to_end_of_line address hex_after_address 'class_data_off:' id9= num_to_end_of_line address hex_after_address 'static_values_off:' id10= num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_class_def1547); 

            pushFollow(FOLLOW_element_in_class_def1551);
            id1=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_class_def1555);
            id2=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_class_def1557); 

            pushFollow(FOLLOW_address_in_class_def1561);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1563);
            hex_after_address();

            state._fsp--;


            match(input,42,FOLLOW_42_in_class_def1565); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_def1569);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_def1573);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1575);
            hex_after_address();

            state._fsp--;


            match(input,28,FOLLOW_28_in_class_def1577); 

            pushFollow(FOLLOW_access_modifiers_with_nums_in_class_def1581);
            id4=access_modifiers_with_nums();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_def1585);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1587);
            hex_after_address();

            state._fsp--;


            match(input,116,FOLLOW_116_in_class_def1589); 

            pushFollow(FOLLOW_num_to_slashes_in_class_def1591);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_class_def1595);
            id5=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_class_def1597); 

            pushFollow(FOLLOW_address_in_class_def1601);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1603);
            hex_after_address();

            state._fsp--;


            match(input,74,FOLLOW_74_in_class_def1605); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_def1609);
            id6=num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:395:3: ( LINE_SPLIT proto_type_string NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LINE_SPLIT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:395:4: LINE_SPLIT proto_type_string NEWLINE
            	    {
            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_class_def1614); 

            	    pushFollow(FOLLOW_proto_type_string_in_class_def1616);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_class_def1618); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_address_in_class_def1624);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1626);
            hex_after_address();

            state._fsp--;


            match(input,107,FOLLOW_107_in_class_def1628); 

            pushFollow(FOLLOW_num_to_slashes_in_class_def1630);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_class_def1634);
            id7=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_class_def1636); 

            pushFollow(FOLLOW_address_in_class_def1640);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1642);
            hex_after_address();

            state._fsp--;


            match(input,32,FOLLOW_32_in_class_def1644); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_def1648);
            id8=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_def1652);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1654);
            hex_after_address();

            state._fsp--;


            match(input,38,FOLLOW_38_in_class_def1656); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_def1660);
            id9=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_def1664);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_def1666);
            hex_after_address();

            state._fsp--;


            match(input,110,FOLLOW_110_in_class_def1668); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_def1672);
            id10=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<class_def>\n" 
             		 			 +"<class_id>" + id1 + "</class_id>\n"
             		 			 +"<class_name>" + (id2!=null?input.toString(id2.start,id2.stop):null).trim() + "</class_name>\n"
             		 			 +"<type_id>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</type_id>\n" 		 
             		 			 +"<access_flags>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</access_flags>\n"
             		 			 +"<superclass_id>" + (id5!=null?input.toString(id5.start,id5.stop):null).trim() + "</superclass_id>\n"
             		 			 +"<interfaces_offset>" + (id6!=null?input.toString(id6.start,id6.stop):null).trim() + "</interfaces_offset>\n"
             		 			 +"<source_file_id>" + (id7!=null?input.toString(id7.start,id7.stop):null).trim() + "</source_file_id>\n"
             		 			 +"<annotations_offset>" + (id8!=null?input.toString(id8.start,id8.stop):null).trim() + "</annotations_offset>\n"
             		 			 +"<class_data_offset>" + (id9!=null?input.toString(id9.start,id9.stop):null).trim() + "</class_data_offset>\n"
             		 			 +"<static_values_offset>" + (id10!=null?input.toString(id10.start,id10.stop):null).trim() + "</static_values_offset>\n"
             		 			 +"</class_def>"); 

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
    // $ANTLR end "class_def"


    public static class access_modifiers_with_nums_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "access_modifiers_with_nums"
    // src/com/riis/decompiler/DexToXML.g:414:1: access_modifiers_with_nums : ( access_modifiers | num_to_end_of_line );
    public final DexToXMLParser.access_modifiers_with_nums_return access_modifiers_with_nums() throws RecognitionException {
        DexToXMLParser.access_modifiers_with_nums_return retval = new DexToXMLParser.access_modifiers_with_nums_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToXML.g:415:2: ( access_modifiers | num_to_end_of_line )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                switch ( input.LA(2) ) {
                case LINE_SPLIT:
                    {
                    alt11=1;
                    }
                    break;
                case NEWLINE:
                    {
                    alt11=1;
                    }
                    break;
                case DIGIT:
                case IDENT:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA11_0==DIGIT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:415:4: access_modifiers
                    {
                    pushFollow(FOLLOW_access_modifiers_in_access_modifiers_with_nums1688);
                    access_modifiers();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:415:23: num_to_end_of_line
                    {
                    pushFollow(FOLLOW_num_to_end_of_line_in_access_modifiers_with_nums1692);
                    num_to_end_of_line();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "access_modifiers_with_nums"



    // $ANTLR start "annotation_set_block"
    // src/com/riis/decompiler/DexToXML.g:420:1: annotation_set_block : LINE_SPLIT 'word_data:' NEWLINE ( annotation_set )* ;
    public final void annotation_set_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:422:2: ( LINE_SPLIT 'word_data:' NEWLINE ( annotation_set )* )
            // src/com/riis/decompiler/DexToXML.g:422:4: LINE_SPLIT 'word_data:' NEWLINE ( annotation_set )*
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set_block1707); 

            match(input,132,FOLLOW_132_in_annotation_set_block1709); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_set_block1711); 

            // src/com/riis/decompiler/DexToXML.g:423:4: ( annotation_set )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:423:4: annotation_set
            	    {
            	    pushFollow(FOLLOW_annotation_set_in_annotation_set_block1716);
            	    annotation_set();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "annotation_set_block"



    // $ANTLR start "annotation_set"
    // src/com/riis/decompiler/DexToXML.g:426:1: annotation_set : LINE_SPLIT element 'annotation set' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE ( LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )? ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )? )+ ( empty_line )? ;
    public final void annotation_set() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:427:2: ( LINE_SPLIT element 'annotation set' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE ( LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )? ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )? )+ ( empty_line )? )
            // src/com/riis/decompiler/DexToXML.g:427:4: LINE_SPLIT element 'annotation set' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE ( LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )? ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )? )+ ( empty_line )?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1729); 

            pushFollow(FOLLOW_element_in_annotation_set1731);
            element();

            state._fsp--;


            match(input,30,FOLLOW_30_in_annotation_set1733); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_set1735); 

            pushFollow(FOLLOW_address_in_annotation_set1740);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotation_set1742);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1744); 

            match(input,19,FOLLOW_19_in_annotation_set1746); 

            pushFollow(FOLLOW_num_to_end_of_line_in_annotation_set1748);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:430:4: ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE ( LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )? ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )? )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= DIGIT && LA17_0 <= IDENT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:430:5: address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE ( LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )? ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )?
            	    {
            	    pushFollow(FOLLOW_address_in_annotation_set1757);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_annotation_set1759);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,58,FOLLOW_58_in_annotation_set1761); 

            	    pushFollow(FOLLOW_element_in_annotation_set1763);
            	    element();

            	    state._fsp--;


            	    match(input,19,FOLLOW_19_in_annotation_set1765); 

            	    pushFollow(FOLLOW_num_to_end_of_line_in_annotation_set1767);
            	    num_to_end_of_line();

            	    state._fsp--;


            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1772); 

            	    match(input,131,FOLLOW_131_in_annotation_set1774); 

            	    pushFollow(FOLLOW_word_to_end_of_line_in_annotation_set1776);
            	    word_to_end_of_line();

            	    state._fsp--;


            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1781); 

            	    match(input,121,FOLLOW_121_in_annotation_set1783); 

            	    pushFollow(FOLLOW_proto_type_string_in_annotation_set1785);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_set1787); 

            	    // src/com/riis/decompiler/DexToXML.g:433:4: ( LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )?
            	    int alt15=3;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==LINE_SPLIT) ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1==IDENT) ) {
            	            int LA15_3 = input.LA(3);

            	            if ( (LA15_3==19) ) {
            	                int LA15_4 = input.LA(4);

            	                if ( (LA15_4==IDENT) ) {
            	                    int LA15_5 = input.LA(5);

            	                    if ( (LA15_5==133) ) {
            	                        alt15=2;
            	                    }
            	                    else if ( ((LA15_5 >= DIGIT && LA15_5 <= IDENT)||LA15_5==11||LA15_5==21||LA15_5==24) ) {
            	                        alt15=1;
            	                    }
            	                }
            	            }
            	        }
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:433:7: LINE_SPLIT IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE
            	            {
            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1795); 

            	            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1797); 

            	            match(input,19,FOLLOW_19_in_annotation_set1799); 

            	            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1801); 

            	            pushFollow(FOLLOW_proto_type_string_in_annotation_set1803);
            	            proto_type_string();

            	            state._fsp--;


            	            // src/com/riis/decompiler/DexToXML.g:433:52: ( ':' proto_type_string )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==19) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // src/com/riis/decompiler/DexToXML.g:433:53: ':' proto_type_string
            	                    {
            	                    match(input,19,FOLLOW_19_in_annotation_set1806); 

            	                    pushFollow(FOLLOW_proto_type_string_in_annotation_set1808);
            	                    proto_type_string();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_set1812); 

            	            }
            	            break;
            	        case 2 :
            	            // src/com/riis/decompiler/DexToXML.g:434:7: LINE_SPLIT IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE
            	            {
            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1820); 

            	            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1822); 

            	            match(input,19,FOLLOW_19_in_annotation_set1824); 

            	            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1826); 

            	            match(input,133,FOLLOW_133_in_annotation_set1828); 

            	            // src/com/riis/decompiler/DexToXML.g:434:38: (~ '}' )+
            	            int cnt14=0;
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( ((LA14_0 >= ANY_CHAR && LA14_0 <= 133)) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // src/com/riis/decompiler/DexToXML.g:
            	            	    {
            	            	    if ( (input.LA(1) >= ANY_CHAR && input.LA(1) <= 133) ) {
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
            	            	    if ( cnt14 >= 1 ) break loop14;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(14, input);
            	                        throw eee;
            	                }
            	                cnt14++;
            	            } while (true);


            	            match(input,134,FOLLOW_134_in_annotation_set1836); 

            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_set1838); 

            	            }
            	            break;

            	    }


            	    // src/com/riis/decompiler/DexToXML.g:437:4: ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )?
            	    int alt16=2;
            	    alt16 = dfa16.predict(input);
            	    switch (alt16) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:437:5: address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type
            	            {
            	            pushFollow(FOLLOW_address_in_annotation_set1851);
            	            address();

            	            state._fsp--;


            	            pushFollow(FOLLOW_hex_after_address_in_annotation_set1853);
            	            hex_after_address();

            	            state._fsp--;


            	            match(input,58,FOLLOW_58_in_annotation_set1855); 

            	            pushFollow(FOLLOW_element_in_annotation_set1857);
            	            element();

            	            state._fsp--;


            	            match(input,19,FOLLOW_19_in_annotation_set1859); 

            	            pushFollow(FOLLOW_num_to_end_of_line_in_annotation_set1861);
            	            num_to_end_of_line();

            	            state._fsp--;


            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1866); 

            	            match(input,131,FOLLOW_131_in_annotation_set1868); 

            	            pushFollow(FOLLOW_word_to_end_of_line_in_annotation_set1870);
            	            word_to_end_of_line();

            	            state._fsp--;


            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1875); 

            	            match(input,121,FOLLOW_121_in_annotation_set1877); 

            	            pushFollow(FOLLOW_proto_type_string_in_annotation_set1879);
            	            proto_type_string();

            	            state._fsp--;


            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_set1881); 

            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1886); 

            	            match(input,27,FOLLOW_27_in_annotation_set1888); 

            	            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1890); 

            	            pushFollow(FOLLOW_num_to_end_of_line_in_annotation_set1892);
            	            num_to_end_of_line();

            	            state._fsp--;


            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_set1897); 

            	            match(input,IDENT,FOLLOW_IDENT_in_annotation_set1899); 

            	            match(input,19,FOLLOW_19_in_annotation_set1901); 

            	            pushFollow(FOLLOW_name_type_in_annotation_set1903);
            	            name_type();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            // src/com/riis/decompiler/DexToXML.g:443:4: ( empty_line )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LINE_SPLIT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==NEWLINE) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:443:4: empty_line
                    {
                    pushFollow(FOLLOW_empty_line_in_annotation_set1916);
                    empty_line();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "annotation_set"



    // $ANTLR start "name_type"
    // src/com/riis/decompiler/DexToXML.g:446:1: name_type : IDENT ( word_to_end_of_line | NEWLINE ) ;
    public final void name_type() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:447:2: ( IDENT ( word_to_end_of_line | NEWLINE ) )
            // src/com/riis/decompiler/DexToXML.g:447:4: IDENT ( word_to_end_of_line | NEWLINE )
            {
            match(input,IDENT,FOLLOW_IDENT_in_name_type1929); 

            // src/com/riis/decompiler/DexToXML.g:447:10: ( word_to_end_of_line | NEWLINE )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            else if ( (LA19_0==NEWLINE) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:447:11: word_to_end_of_line
                    {
                    pushFollow(FOLLOW_word_to_end_of_line_in_name_type1932);
                    word_to_end_of_line();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:447:33: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_name_type1936); 

                    }
                    break;

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
    // $ANTLR end "name_type"



    // $ANTLR start "code_items_block"
    // src/com/riis/decompiler/DexToXML.g:454:1: code_items_block : ( code_item )+ ;
    public final void code_items_block() throws RecognitionException {
        fout.printXML("<code_items>"); 
        try {
            // src/com/riis/decompiler/DexToXML.g:458:2: ( ( code_item )+ )
            // src/com/riis/decompiler/DexToXML.g:458:4: ( code_item )+
            {
            // src/com/riis/decompiler/DexToXML.g:458:4: ( code_item )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:458:4: code_item
            	    {
            	    pushFollow(FOLLOW_code_item_in_code_items_block1969);
            	    code_item();

            	    state._fsp--;


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

            fout.printXML("</code_items>"); 
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
    // $ANTLR end "code_items_block"



    // $ANTLR start "code_item"
    // src/com/riis/decompiler/DexToXML.g:461:1: code_item : LINE_SPLIT element id1= proto_type_string ( DIGIT )* ':' proto_type_string NEWLINE address hex_after_address 'registers_size:' id2= num_to_end_of_line address hex_after_address 'ins_size:' id3= num_to_end_of_line address hex_after_address 'outs_size:' id4= num_to_end_of_line address hex_after_address 'tries_size:' id5= num_to_end_of_line address hex_after_address 'debug_off:' id6= num_to_end_of_line address hex_after_address 'insns_size:' id7= num_to_end_of_line ( LINE_SPLIT 'throws' ( ( ',' )? proto_type_string )+ NEWLINE )? bytecode ( address hex_after_address NEWLINE )? empty_line ( address hex_after_address NEWLINE )? ;
    public final void code_item() throws RecognitionException {
        DexToXMLParser.proto_type_string_return id1 =null;

        DexToXMLParser.num_to_end_of_line_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.num_to_end_of_line_return id4 =null;

        DexToXMLParser.num_to_end_of_line_return id5 =null;

        DexToXMLParser.num_to_end_of_line_return id6 =null;

        DexToXMLParser.num_to_end_of_line_return id7 =null;


        fout.printXML("<code_item>"); 
        try {
            // src/com/riis/decompiler/DexToXML.g:465:2: ( LINE_SPLIT element id1= proto_type_string ( DIGIT )* ':' proto_type_string NEWLINE address hex_after_address 'registers_size:' id2= num_to_end_of_line address hex_after_address 'ins_size:' id3= num_to_end_of_line address hex_after_address 'outs_size:' id4= num_to_end_of_line address hex_after_address 'tries_size:' id5= num_to_end_of_line address hex_after_address 'debug_off:' id6= num_to_end_of_line address hex_after_address 'insns_size:' id7= num_to_end_of_line ( LINE_SPLIT 'throws' ( ( ',' )? proto_type_string )+ NEWLINE )? bytecode ( address hex_after_address NEWLINE )? empty_line ( address hex_after_address NEWLINE )? )
            // src/com/riis/decompiler/DexToXML.g:465:4: LINE_SPLIT element id1= proto_type_string ( DIGIT )* ':' proto_type_string NEWLINE address hex_after_address 'registers_size:' id2= num_to_end_of_line address hex_after_address 'ins_size:' id3= num_to_end_of_line address hex_after_address 'outs_size:' id4= num_to_end_of_line address hex_after_address 'tries_size:' id5= num_to_end_of_line address hex_after_address 'debug_off:' id6= num_to_end_of_line address hex_after_address 'insns_size:' id7= num_to_end_of_line ( LINE_SPLIT 'throws' ( ( ',' )? proto_type_string )+ NEWLINE )? bytecode ( address hex_after_address NEWLINE )? empty_line ( address hex_after_address NEWLINE )?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_code_item1996); 

            pushFollow(FOLLOW_element_in_code_item1998);
            element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_code_item2002);
            id1=proto_type_string();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:465:45: ( DIGIT )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==DIGIT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:465:45: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_code_item2004); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_code_item2007); 

            pushFollow(FOLLOW_proto_type_string_in_code_item2009);
            proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_code_item2011); 

            pushFollow(FOLLOW_address_in_code_item2016);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_code_item2018);
            hex_after_address();

            state._fsp--;


            match(input,103,FOLLOW_103_in_code_item2020); 

            pushFollow(FOLLOW_num_to_end_of_line_in_code_item2024);
            id2=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_code_item2029);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_code_item2031);
            hex_after_address();

            state._fsp--;


            match(input,70,FOLLOW_70_in_code_item2033); 

            pushFollow(FOLLOW_num_to_end_of_line_in_code_item2037);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_code_item2042);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_code_item2044);
            hex_after_address();

            state._fsp--;


            match(input,92,FOLLOW_92_in_code_item2046); 

            pushFollow(FOLLOW_num_to_end_of_line_in_code_item2050);
            id4=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_code_item2055);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_code_item2057);
            hex_after_address();

            state._fsp--;


            match(input,119,FOLLOW_119_in_code_item2059); 

            pushFollow(FOLLOW_num_to_end_of_line_in_code_item2063);
            id5=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_code_item2068);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_code_item2070);
            hex_after_address();

            state._fsp--;


            match(input,50,FOLLOW_50_in_code_item2072); 

            pushFollow(FOLLOW_num_to_end_of_line_in_code_item2076);
            id6=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_code_item2081);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_code_item2083);
            hex_after_address();

            state._fsp--;


            match(input,71,FOLLOW_71_in_code_item2085); 

            pushFollow(FOLLOW_num_to_end_of_line_in_code_item2089);
            id7=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<method_name>" + fout.encodeXML((id1!=null?input.toString(id1.start,id1.stop):null)) + "</method_name>\n"
             		 			 +"<registers_size>" + (id2!=null?input.toString(id2.start,id2.stop):null).trim() + "</registers_size>\n"
             		 			 +"<ins_size>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</ins_size>\n" 		 
             		 			 +"<outs_size>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</outs_size>\n"
             		 			 +"<tries_size>" + (id5!=null?input.toString(id5.start,id5.stop):null).trim() + "</tries_size>\n"
             		 			 +"<debug_off>" + (id6!=null?input.toString(id6.start,id6.stop):null).trim() + "</debug_off>\n"
             		 			 +"<insns_size>" + (id7!=null?input.toString(id7.start,id7.stop):null).trim() + "</insns_size>\n"); 

            // src/com/riis/decompiler/DexToXML.g:481:5: ( LINE_SPLIT 'throws' ( ( ',' )? proto_type_string )+ NEWLINE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LINE_SPLIT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==117) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:481:6: LINE_SPLIT 'throws' ( ( ',' )? proto_type_string )+ NEWLINE
                    {
                    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_code_item2107); 

                    match(input,117,FOLLOW_117_in_code_item2109); 

                    // src/com/riis/decompiler/DexToXML.g:481:26: ( ( ',' )? proto_type_string )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0 >= DIGIT && LA23_0 <= IDENT)||LA23_0==11||LA23_0==14||LA23_0==21||LA23_0==24) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:481:27: ( ',' )? proto_type_string
                    	    {
                    	    // src/com/riis/decompiler/DexToXML.g:481:27: ( ',' )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==14) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // src/com/riis/decompiler/DexToXML.g:481:27: ','
                    	            {
                    	            match(input,14,FOLLOW_14_in_code_item2112); 

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_proto_type_string_in_code_item2115);
                    	    proto_type_string();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_code_item2119); 

                    }
                    break;

            }


            pushFollow(FOLLOW_bytecode_in_code_item2127);
            bytecode();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:485:4: ( address hex_after_address NEWLINE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0 >= DIGIT && LA25_0 <= IDENT)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:485:5: address hex_after_address NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_code_item2134);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_code_item2136);
                    hex_after_address();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_code_item2138); 

                    }
                    break;

            }


            pushFollow(FOLLOW_empty_line_in_code_item2145);
            empty_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:487:4: ( address hex_after_address NEWLINE )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0 >= DIGIT && LA26_0 <= IDENT)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:487:5: address hex_after_address NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_code_item2151);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_code_item2153);
                    hex_after_address();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_code_item2155); 

                    }
                    break;

            }


            }

            fout.printXML("</code_item>"); 
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
    // $ANTLR end "code_item"



    // $ANTLR start "bytecode"
    // src/com/riis/decompiler/DexToXML.g:490:1: bytecode : ( ignore_instruction | good_instruction )+ ( try_block )? ( debug_info )? ;
    public final void bytecode() throws RecognitionException {
        fout.printXML("<bytecode>"); 
        try {
            // src/com/riis/decompiler/DexToXML.g:494:2: ( ( ignore_instruction | good_instruction )+ ( try_block )? ( debug_info )? )
            // src/com/riis/decompiler/DexToXML.g:494:4: ( ignore_instruction | good_instruction )+ ( try_block )? ( debug_info )?
            {
            // src/com/riis/decompiler/DexToXML.g:494:4: ( ignore_instruction | good_instruction )+
            int cnt27=0;
            loop27:
            do {
                int alt27=3;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:494:5: ignore_instruction
            	    {
            	    pushFollow(FOLLOW_ignore_instruction_in_bytecode2185);
            	    ignore_instruction();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // src/com/riis/decompiler/DexToXML.g:494:26: good_instruction
            	    {
            	    pushFollow(FOLLOW_good_instruction_in_bytecode2189);
            	    good_instruction();

            	    state._fsp--;


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


            // src/com/riis/decompiler/DexToXML.g:495:4: ( try_block )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:495:4: try_block
                    {
                    pushFollow(FOLLOW_try_block_in_bytecode2196);
                    try_block();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:496:4: ( debug_info )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LINE_SPLIT) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==49) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:496:4: debug_info
                    {
                    pushFollow(FOLLOW_debug_info_in_bytecode2202);
                    debug_info();

                    state._fsp--;


                    }
                    break;

            }


            }

            fout.printXML("</bytecode>"); 
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
    // $ANTLR end "bytecode"



    // $ANTLR start "good_instruction"
    // src/com/riis/decompiler/DexToXML.g:499:1: good_instruction : address hex_after_address address id1= instruction ;
    public final void good_instruction() throws RecognitionException {
        DexToXMLParser.instruction_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:500:2: ( address hex_after_address address id1= instruction )
            // src/com/riis/decompiler/DexToXML.g:500:4: address hex_after_address address id1= instruction
            {
            pushFollow(FOLLOW_address_in_good_instruction2215);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_good_instruction2217);
            hex_after_address();

            state._fsp--;


            pushFollow(FOLLOW_address_in_good_instruction2219);
            address();

            state._fsp--;


            pushFollow(FOLLOW_instruction_in_good_instruction2223);
            id1=instruction();

            state._fsp--;


            fout.println("<insn>" + fout.encodeXML((id1!=null?input.toString(id1.start,id1.stop):null).trim()) + "</insn>");

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
    // $ANTLR end "good_instruction"



    // $ANTLR start "ignore_instruction"
    // src/com/riis/decompiler/DexToXML.g:504:1: ignore_instruction : ( LINE_SPLIT address ( 'code-address' | 'local-snapshot' | 'local-start' ) ( . )* NEWLINE ( LINE_SPLIT IDENT ( . )* NEWLINE )* | ( LINE_SPLIT | address hex_after_address ) ( '-' )? address num_to_slashes '+' num_to_end_of_line );
    public final void ignore_instruction() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:505:2: ( LINE_SPLIT address ( 'code-address' | 'local-snapshot' | 'local-start' ) ( . )* NEWLINE ( LINE_SPLIT IDENT ( . )* NEWLINE )* | ( LINE_SPLIT | address hex_after_address ) ( '-' )? address num_to_slashes '+' num_to_end_of_line )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:505:4: LINE_SPLIT address ( 'code-address' | 'local-snapshot' | 'local-start' ) ( . )* NEWLINE ( LINE_SPLIT IDENT ( . )* NEWLINE )*
                    {
                    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_ignore_instruction2239); 

                    pushFollow(FOLLOW_address_in_ignore_instruction2241);
                    address();

                    state._fsp--;


                    if ( input.LA(1)==44||(input.LA(1) >= 80 && input.LA(1) <= 81) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/com/riis/decompiler/DexToXML.g:505:71: ( . )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==NEWLINE) ) {
                            alt30=2;
                        }
                        else if ( ((LA30_0 >= ANY_CHAR && LA30_0 <= LINE_SPLIT)||(LA30_0 >= WS && LA30_0 <= 134)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:505:71: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_ignore_instruction2254); 

                    // src/com/riis/decompiler/DexToXML.g:506:3: ( LINE_SPLIT IDENT ( . )* NEWLINE )*
                    loop32:
                    do {
                        int alt32=2;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:506:4: LINE_SPLIT IDENT ( . )* NEWLINE
                    	    {
                    	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_ignore_instruction2259); 

                    	    match(input,IDENT,FOLLOW_IDENT_in_ignore_instruction2261); 

                    	    // src/com/riis/decompiler/DexToXML.g:506:21: ( . )*
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        int LA31_0 = input.LA(1);

                    	        if ( (LA31_0==NEWLINE) ) {
                    	            alt31=2;
                    	        }
                    	        else if ( ((LA31_0 >= ANY_CHAR && LA31_0 <= LINE_SPLIT)||(LA31_0 >= WS && LA31_0 <= 134)) ) {
                    	            alt31=1;
                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // src/com/riis/decompiler/DexToXML.g:506:21: .
                    	    	    {
                    	    	    matchAny(input); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop31;
                    	        }
                    	    } while (true);


                    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_ignore_instruction2266); 

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:507:4: ( LINE_SPLIT | address hex_after_address ) ( '-' )? address num_to_slashes '+' num_to_end_of_line
                    {
                    // src/com/riis/decompiler/DexToXML.g:507:4: ( LINE_SPLIT | address hex_after_address )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LINE_SPLIT) ) {
                        alt33=1;
                    }
                    else if ( ((LA33_0 >= DIGIT && LA33_0 <= IDENT)) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }
                    switch (alt33) {
                        case 1 :
                            // src/com/riis/decompiler/DexToXML.g:507:5: LINE_SPLIT
                            {
                            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_ignore_instruction2274); 

                            }
                            break;
                        case 2 :
                            // src/com/riis/decompiler/DexToXML.g:507:18: address hex_after_address
                            {
                            pushFollow(FOLLOW_address_in_ignore_instruction2278);
                            address();

                            state._fsp--;


                            pushFollow(FOLLOW_hex_after_address_in_ignore_instruction2280);
                            hex_after_address();

                            state._fsp--;


                            }
                            break;

                    }


                    // src/com/riis/decompiler/DexToXML.g:507:45: ( '-' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==15) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // src/com/riis/decompiler/DexToXML.g:507:45: '-'
                            {
                            match(input,15,FOLLOW_15_in_ignore_instruction2283); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_address_in_ignore_instruction2286);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_num_to_slashes_in_ignore_instruction2288);
                    num_to_slashes();

                    state._fsp--;


                    match(input,13,FOLLOW_13_in_ignore_instruction2290); 

                    pushFollow(FOLLOW_num_to_end_of_line_in_ignore_instruction2292);
                    num_to_end_of_line();

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
    // $ANTLR end "ignore_instruction"


    public static class instruction_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "instruction"
    // src/com/riis/decompiler/DexToXML.g:510:1: instruction : instruction_ident ( . )* NEWLINE ;
    public final DexToXMLParser.instruction_return instruction() throws RecognitionException {
        DexToXMLParser.instruction_return retval = new DexToXMLParser.instruction_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToXML.g:511:2: ( instruction_ident ( . )* NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:511:4: instruction_ident ( . )* NEWLINE
            {
            pushFollow(FOLLOW_instruction_ident_in_instruction2303);
            instruction_ident();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:511:22: ( . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==NEWLINE) ) {
                    alt36=2;
                }
                else if ( ((LA36_0 >= ANY_CHAR && LA36_0 <= LINE_SPLIT)||(LA36_0 >= WS && LA36_0 <= 134)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:511:22: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction2308); 

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
    // $ANTLR end "instruction"



    // $ANTLR start "instruction_ident"
    // src/com/riis/decompiler/DexToXML.g:514:1: instruction_ident : IDENT ( '-' IDENT )* ( '/' ( DIGIT )* IDENT )? ;
    public final void instruction_ident() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:515:2: ( IDENT ( '-' IDENT )* ( '/' ( DIGIT )* IDENT )? )
            // src/com/riis/decompiler/DexToXML.g:515:4: IDENT ( '-' IDENT )* ( '/' ( DIGIT )* IDENT )?
            {
            match(input,IDENT,FOLLOW_IDENT_in_instruction_ident2320); 

            // src/com/riis/decompiler/DexToXML.g:515:10: ( '-' IDENT )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==15) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==IDENT) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:515:11: '-' IDENT
            	    {
            	    match(input,15,FOLLOW_15_in_instruction_ident2323); 

            	    match(input,IDENT,FOLLOW_IDENT_in_instruction_ident2325); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            // src/com/riis/decompiler/DexToXML.g:515:23: ( '/' ( DIGIT )* IDENT )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:515:24: '/' ( DIGIT )* IDENT
                    {
                    match(input,17,FOLLOW_17_in_instruction_ident2330); 

                    // src/com/riis/decompiler/DexToXML.g:515:28: ( DIGIT )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==DIGIT) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:515:28: DIGIT
                    	    {
                    	    match(input,DIGIT,FOLLOW_DIGIT_in_instruction_ident2332); 

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    match(input,IDENT,FOLLOW_IDENT_in_instruction_ident2335); 

                    }
                    break;

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
    // $ANTLR end "instruction_ident"



    // $ANTLR start "try_block"
    // src/com/riis/decompiler/DexToXML.g:518:1: try_block : ( address hex_after_address 'padding' ':' num_to_end_of_line )? LINE_SPLIT 'tries' ':' NEWLINE ( try_piece )+ LINE_SPLIT 'handlers' ':' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( handler )+ ;
    public final void try_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:519:2: ( ( address hex_after_address 'padding' ':' num_to_end_of_line )? LINE_SPLIT 'tries' ':' NEWLINE ( try_piece )+ LINE_SPLIT 'handlers' ':' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( handler )+ )
            // src/com/riis/decompiler/DexToXML.g:519:4: ( address hex_after_address 'padding' ':' num_to_end_of_line )? LINE_SPLIT 'tries' ':' NEWLINE ( try_piece )+ LINE_SPLIT 'handlers' ':' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( handler )+
            {
            // src/com/riis/decompiler/DexToXML.g:519:4: ( address hex_after_address 'padding' ':' num_to_end_of_line )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0 >= DIGIT && LA40_0 <= IDENT)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:519:5: address hex_after_address 'padding' ':' num_to_end_of_line
                    {
                    pushFollow(FOLLOW_address_in_try_block2350);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_try_block2352);
                    hex_after_address();

                    state._fsp--;


                    match(input,93,FOLLOW_93_in_try_block2354); 

                    match(input,19,FOLLOW_19_in_try_block2356); 

                    pushFollow(FOLLOW_num_to_end_of_line_in_try_block2358);
                    num_to_end_of_line();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_try_block2365); 

            match(input,118,FOLLOW_118_in_try_block2367); 

            match(input,19,FOLLOW_19_in_try_block2369); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_try_block2371); 

            // src/com/riis/decompiler/DexToXML.g:521:4: ( try_piece )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0 >= DIGIT && LA41_0 <= IDENT)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:521:4: try_piece
            	    {
            	    pushFollow(FOLLOW_try_piece_in_try_block2376);
            	    try_piece();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_try_block2382); 

            match(input,67,FOLLOW_67_in_try_block2384); 

            match(input,19,FOLLOW_19_in_try_block2386); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_try_block2388); 

            pushFollow(FOLLOW_address_in_try_block2393);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_try_block2395);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_try_block2397); 

            match(input,19,FOLLOW_19_in_try_block2399); 

            pushFollow(FOLLOW_num_to_end_of_line_in_try_block2401);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:524:4: ( handler )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:524:4: handler
            	    {
            	    pushFollow(FOLLOW_handler_in_try_block2406);
            	    handler();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
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
    // $ANTLR end "try_block"



    // $ANTLR start "try_piece"
    // src/com/riis/decompiler/DexToXML.g:527:1: try_piece : address hex_after_address 'try' num_to_dots num_to_end_of_line address hex_after_address 'catch' proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) ( LINE_SPLIT proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )* ;
    public final void try_piece() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:528:2: ( address hex_after_address 'try' num_to_dots num_to_end_of_line address hex_after_address 'catch' proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) ( LINE_SPLIT proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )* )
            // src/com/riis/decompiler/DexToXML.g:528:4: address hex_after_address 'try' num_to_dots num_to_end_of_line address hex_after_address 'catch' proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) ( LINE_SPLIT proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )*
            {
            pushFollow(FOLLOW_address_in_try_piece2419);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_try_piece2421);
            hex_after_address();

            state._fsp--;


            match(input,120,FOLLOW_120_in_try_piece2423); 

            pushFollow(FOLLOW_num_to_dots_in_try_piece2425);
            num_to_dots();

            state._fsp--;


            pushFollow(FOLLOW_num_to_end_of_line_in_try_piece2427);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_try_piece2432);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_try_piece2434);
            hex_after_address();

            state._fsp--;


            match(input,34,FOLLOW_34_in_try_piece2436); 

            pushFollow(FOLLOW_proto_type_string_in_try_piece2438);
            proto_type_string();

            state._fsp--;


            match(input,15,FOLLOW_15_in_try_piece2440); 

            match(input,23,FOLLOW_23_in_try_piece2442); 

            // src/com/riis/decompiler/DexToXML.g:529:64: ( num_to_comma NEWLINE | num_to_end_of_line )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:529:65: num_to_comma NEWLINE
                    {
                    pushFollow(FOLLOW_num_to_comma_in_try_piece2445);
                    num_to_comma();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_try_piece2447); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:529:88: num_to_end_of_line
                    {
                    pushFollow(FOLLOW_num_to_end_of_line_in_try_piece2451);
                    num_to_end_of_line();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:530:4: ( LINE_SPLIT proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LINE_SPLIT) ) {
                    int LA45_1 = input.LA(2);

                    if ( ((LA45_1 >= DIGIT && LA45_1 <= IDENT)||LA45_1==11||LA45_1==21||LA45_1==24) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:530:5: LINE_SPLIT proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line )
            	    {
            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_try_piece2458); 

            	    pushFollow(FOLLOW_proto_type_string_in_try_piece2460);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,15,FOLLOW_15_in_try_piece2462); 

            	    match(input,23,FOLLOW_23_in_try_piece2464); 

            	    // src/com/riis/decompiler/DexToXML.g:530:42: ( num_to_comma NEWLINE | num_to_end_of_line )
            	    int alt44=2;
            	    alt44 = dfa44.predict(input);
            	    switch (alt44) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:530:43: num_to_comma NEWLINE
            	            {
            	            pushFollow(FOLLOW_num_to_comma_in_try_piece2467);
            	            num_to_comma();

            	            state._fsp--;


            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_try_piece2469); 

            	            }
            	            break;
            	        case 2 :
            	            // src/com/riis/decompiler/DexToXML.g:530:66: num_to_end_of_line
            	            {
            	            pushFollow(FOLLOW_num_to_end_of_line_in_try_piece2473);
            	            num_to_end_of_line();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "try_piece"



    // $ANTLR start "handler"
    // src/com/riis/decompiler/DexToXML.g:533:1: handler : address hex_after_address address 'catch' proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) ( ( ( address hex_after_address ) | LINE_SPLIT ) proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )* ;
    public final void handler() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:534:2: ( address hex_after_address address 'catch' proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) ( ( ( address hex_after_address ) | LINE_SPLIT ) proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )* )
            // src/com/riis/decompiler/DexToXML.g:534:4: address hex_after_address address 'catch' proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) ( ( ( address hex_after_address ) | LINE_SPLIT ) proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )*
            {
            pushFollow(FOLLOW_address_in_handler2488);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_handler2490);
            hex_after_address();

            state._fsp--;


            pushFollow(FOLLOW_address_in_handler2492);
            address();

            state._fsp--;


            match(input,34,FOLLOW_34_in_handler2494); 

            pushFollow(FOLLOW_proto_type_string_in_handler2496);
            proto_type_string();

            state._fsp--;


            match(input,15,FOLLOW_15_in_handler2498); 

            match(input,23,FOLLOW_23_in_handler2500); 

            // src/com/riis/decompiler/DexToXML.g:534:72: ( num_to_comma NEWLINE | num_to_end_of_line )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:534:73: num_to_comma NEWLINE
                    {
                    pushFollow(FOLLOW_num_to_comma_in_handler2503);
                    num_to_comma();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_handler2505); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:534:96: num_to_end_of_line
                    {
                    pushFollow(FOLLOW_num_to_end_of_line_in_handler2509);
                    num_to_end_of_line();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:535:4: ( ( ( address hex_after_address ) | LINE_SPLIT ) proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:535:5: ( ( address hex_after_address ) | LINE_SPLIT ) proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line )
            	    {
            	    // src/com/riis/decompiler/DexToXML.g:535:5: ( ( address hex_after_address ) | LINE_SPLIT )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( ((LA47_0 >= DIGIT && LA47_0 <= IDENT)) ) {
            	        alt47=1;
            	    }
            	    else if ( (LA47_0==LINE_SPLIT) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:535:6: ( address hex_after_address )
            	            {
            	            // src/com/riis/decompiler/DexToXML.g:535:6: ( address hex_after_address )
            	            // src/com/riis/decompiler/DexToXML.g:535:7: address hex_after_address
            	            {
            	            pushFollow(FOLLOW_address_in_handler2518);
            	            address();

            	            state._fsp--;


            	            pushFollow(FOLLOW_hex_after_address_in_handler2520);
            	            hex_after_address();

            	            state._fsp--;


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // src/com/riis/decompiler/DexToXML.g:535:36: LINE_SPLIT
            	            {
            	            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_handler2525); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_proto_type_string_in_handler2528);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,15,FOLLOW_15_in_handler2530); 

            	    match(input,23,FOLLOW_23_in_handler2532); 

            	    // src/com/riis/decompiler/DexToXML.g:535:74: ( num_to_comma NEWLINE | num_to_end_of_line )
            	    int alt48=2;
            	    alt48 = dfa48.predict(input);
            	    switch (alt48) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:535:75: num_to_comma NEWLINE
            	            {
            	            pushFollow(FOLLOW_num_to_comma_in_handler2535);
            	            num_to_comma();

            	            state._fsp--;


            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_handler2537); 

            	            }
            	            break;
            	        case 2 :
            	            // src/com/riis/decompiler/DexToXML.g:535:98: num_to_end_of_line
            	            {
            	            pushFollow(FOLLOW_num_to_end_of_line_in_handler2541);
            	            num_to_end_of_line();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end "handler"



    // $ANTLR start "debug_info"
    // src/com/riis/decompiler/DexToXML.g:538:1: debug_info options {greedy=false; } : LINE_SPLIT 'debug info' NEWLINE ( LINE_SPLIT ( . )* ( NEWLINE )? )+ 'end sequence' NEWLINE ;
    public final void debug_info() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:541:2: ( LINE_SPLIT 'debug info' NEWLINE ( LINE_SPLIT ( . )* ( NEWLINE )? )+ 'end sequence' NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:541:4: LINE_SPLIT 'debug info' NEWLINE ( LINE_SPLIT ( . )* ( NEWLINE )? )+ 'end sequence' NEWLINE
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_debug_info2569); 

            match(input,49,FOLLOW_49_in_debug_info2571); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_debug_info2573); 

            // src/com/riis/decompiler/DexToXML.g:541:36: ( LINE_SPLIT ( . )* ( NEWLINE )? )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LINE_SPLIT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:541:37: LINE_SPLIT ( . )* ( NEWLINE )?
            	    {
            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_debug_info2576); 

            	    // src/com/riis/decompiler/DexToXML.g:541:48: ( . )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        switch ( input.LA(1) ) {
            	        case NEWLINE:
            	            {
            	            alt50=2;
            	            }
            	            break;
            	        case 56:
            	            {
            	            alt50=2;
            	            }
            	            break;
            	        case LINE_SPLIT:
            	            {
            	            alt50=2;
            	            }
            	            break;
            	        case ANY_CHAR:
            	        case DIGIT:
            	        case IDENT:
            	        case WS:
            	        case 10:
            	        case 11:
            	        case 12:
            	        case 13:
            	        case 14:
            	        case 15:
            	        case 16:
            	        case 17:
            	        case 18:
            	        case 19:
            	        case 20:
            	        case 21:
            	        case 22:
            	        case 23:
            	        case 24:
            	        case 25:
            	        case 26:
            	        case 27:
            	        case 28:
            	        case 29:
            	        case 30:
            	        case 31:
            	        case 32:
            	        case 33:
            	        case 34:
            	        case 35:
            	        case 36:
            	        case 37:
            	        case 38:
            	        case 39:
            	        case 40:
            	        case 41:
            	        case 42:
            	        case 43:
            	        case 44:
            	        case 45:
            	        case 46:
            	        case 47:
            	        case 48:
            	        case 49:
            	        case 50:
            	        case 51:
            	        case 52:
            	        case 53:
            	        case 54:
            	        case 55:
            	        case 57:
            	        case 58:
            	        case 59:
            	        case 60:
            	        case 61:
            	        case 62:
            	        case 63:
            	        case 64:
            	        case 65:
            	        case 66:
            	        case 67:
            	        case 68:
            	        case 69:
            	        case 70:
            	        case 71:
            	        case 72:
            	        case 73:
            	        case 74:
            	        case 75:
            	        case 76:
            	        case 77:
            	        case 78:
            	        case 79:
            	        case 80:
            	        case 81:
            	        case 82:
            	        case 83:
            	        case 84:
            	        case 85:
            	        case 86:
            	        case 87:
            	        case 88:
            	        case 89:
            	        case 90:
            	        case 91:
            	        case 92:
            	        case 93:
            	        case 94:
            	        case 95:
            	        case 96:
            	        case 97:
            	        case 98:
            	        case 99:
            	        case 100:
            	        case 101:
            	        case 102:
            	        case 103:
            	        case 104:
            	        case 105:
            	        case 106:
            	        case 107:
            	        case 108:
            	        case 109:
            	        case 110:
            	        case 111:
            	        case 112:
            	        case 113:
            	        case 114:
            	        case 115:
            	        case 116:
            	        case 117:
            	        case 118:
            	        case 119:
            	        case 120:
            	        case 121:
            	        case 122:
            	        case 123:
            	        case 124:
            	        case 125:
            	        case 126:
            	        case 127:
            	        case 128:
            	        case 129:
            	        case 130:
            	        case 131:
            	        case 132:
            	        case 133:
            	        case 134:
            	            {
            	            alt50=1;
            	            }
            	            break;

            	        }

            	        switch (alt50) {
            	    	case 1 :
            	    	    // src/com/riis/decompiler/DexToXML.g:541:48: .
            	    	    {
            	    	    matchAny(input); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);


            	    // src/com/riis/decompiler/DexToXML.g:541:51: ( NEWLINE )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==NEWLINE) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:541:51: NEWLINE
            	            {
            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_debug_info2581); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            match(input,56,FOLLOW_56_in_debug_info2586); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_debug_info2588); 

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
    // $ANTLR end "debug_info"



    // $ANTLR start "annotations_directory_block"
    // src/com/riis/decompiler/DexToXML.g:547:1: annotations_directory_block : ( annotations_directory )* ;
    public final void annotations_directory_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:548:2: ( ( annotations_directory )* )
            // src/com/riis/decompiler/DexToXML.g:548:4: ( annotations_directory )*
            {
            // src/com/riis/decompiler/DexToXML.g:548:4: ( annotations_directory )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:548:4: annotations_directory
            	    {
            	    pushFollow(FOLLOW_annotations_directory_in_annotations_directory_block2603);
            	    annotations_directory();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "annotations_directory_block"



    // $ANTLR start "annotations_directory"
    // src/com/riis/decompiler/DexToXML.g:551:1: annotations_directory : LINE_SPLIT element 'annotations directory' NEWLINE address hex_after_address 'class_annotations_off:' num_to_end_of_line address hex_after_address 'fields_size:' num_to_end_of_line address hex_after_address 'methods_size:' num_to_end_of_line address hex_after_address 'parameters_size:' num_to_end_of_line ( field_annotations )? ( method_annotations )? empty_line ;
    public final void annotations_directory() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:552:2: ( LINE_SPLIT element 'annotations directory' NEWLINE address hex_after_address 'class_annotations_off:' num_to_end_of_line address hex_after_address 'fields_size:' num_to_end_of_line address hex_after_address 'methods_size:' num_to_end_of_line address hex_after_address 'parameters_size:' num_to_end_of_line ( field_annotations )? ( method_annotations )? empty_line )
            // src/com/riis/decompiler/DexToXML.g:552:4: LINE_SPLIT element 'annotations directory' NEWLINE address hex_after_address 'class_annotations_off:' num_to_end_of_line address hex_after_address 'fields_size:' num_to_end_of_line address hex_after_address 'methods_size:' num_to_end_of_line address hex_after_address 'parameters_size:' num_to_end_of_line ( field_annotations )? ( method_annotations )? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotations_directory2616); 

            pushFollow(FOLLOW_element_in_annotations_directory2618);
            element();

            state._fsp--;


            match(input,31,FOLLOW_31_in_annotations_directory2620); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotations_directory2622); 

            pushFollow(FOLLOW_address_in_annotations_directory2627);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotations_directory2629);
            hex_after_address();

            state._fsp--;


            match(input,37,FOLLOW_37_in_annotations_directory2631); 

            pushFollow(FOLLOW_num_to_end_of_line_in_annotations_directory2633);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_annotations_directory2638);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotations_directory2640);
            hex_after_address();

            state._fsp--;


            match(input,64,FOLLOW_64_in_annotations_directory2642); 

            pushFollow(FOLLOW_num_to_end_of_line_in_annotations_directory2644);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_annotations_directory2649);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotations_directory2651);
            hex_after_address();

            state._fsp--;


            match(input,89,FOLLOW_89_in_annotations_directory2653); 

            pushFollow(FOLLOW_num_to_end_of_line_in_annotations_directory2655);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_annotations_directory2660);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotations_directory2662);
            hex_after_address();

            state._fsp--;


            match(input,96,FOLLOW_96_in_annotations_directory2664); 

            pushFollow(FOLLOW_num_to_end_of_line_in_annotations_directory2666);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:558:4: ( field_annotations )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LINE_SPLIT) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==63) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:558:4: field_annotations
                    {
                    pushFollow(FOLLOW_field_annotations_in_annotations_directory2675);
                    field_annotations();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:559:4: ( method_annotations )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LINE_SPLIT) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==88) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:559:4: method_annotations
                    {
                    pushFollow(FOLLOW_method_annotations_in_annotations_directory2681);
                    method_annotations();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_empty_line_in_annotations_directory2691);
            empty_line();

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
    // $ANTLR end "annotations_directory"



    // $ANTLR start "method_annotations"
    // src/com/riis/decompiler/DexToXML.g:564:1: method_annotations : LINE_SPLIT 'methods:' NEWLINE ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'method_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+ ;
    public final void method_annotations() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:565:2: ( LINE_SPLIT 'methods:' NEWLINE ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'method_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+ )
            // src/com/riis/decompiler/DexToXML.g:565:4: LINE_SPLIT 'methods:' NEWLINE ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'method_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_method_annotations2702); 

            match(input,88,FOLLOW_88_in_method_annotations2704); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_annotations2706); 

            // src/com/riis/decompiler/DexToXML.g:566:3: ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'method_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==LINE_SPLIT) ) {
                    int LA56_1 = input.LA(2);

                    if ( ((LA56_1 >= DIGIT && LA56_1 <= IDENT)||LA56_1==11||LA56_1==21||LA56_1==24) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:566:4: LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'method_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line
            	    {
            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_method_annotations2711); 

            	    pushFollow(FOLLOW_proto_type_string_in_method_annotations2713);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,19,FOLLOW_19_in_method_annotations2715); 

            	    pushFollow(FOLLOW_proto_type_string_in_method_annotations2717);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_method_annotations2719); 

            	    pushFollow(FOLLOW_address_in_method_annotations2724);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_method_annotations2726);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,87,FOLLOW_87_in_method_annotations2728); 

            	    pushFollow(FOLLOW_num_to_end_of_line_in_method_annotations2730);
            	    num_to_end_of_line();

            	    state._fsp--;


            	    pushFollow(FOLLOW_address_in_method_annotations2735);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_method_annotations2737);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,32,FOLLOW_32_in_method_annotations2739); 

            	    pushFollow(FOLLOW_num_to_end_of_line_in_method_annotations2741);
            	    num_to_end_of_line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
    // $ANTLR end "method_annotations"



    // $ANTLR start "field_annotations"
    // src/com/riis/decompiler/DexToXML.g:571:1: field_annotations : LINE_SPLIT 'fields:' NEWLINE ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'field_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+ ;
    public final void field_annotations() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:572:2: ( LINE_SPLIT 'fields:' NEWLINE ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'field_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+ )
            // src/com/riis/decompiler/DexToXML.g:572:4: LINE_SPLIT 'fields:' NEWLINE ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'field_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_field_annotations2754); 

            match(input,63,FOLLOW_63_in_field_annotations2756); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_field_annotations2758); 

            // src/com/riis/decompiler/DexToXML.g:573:3: ( LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'field_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==LINE_SPLIT) ) {
                    int LA57_1 = input.LA(2);

                    if ( ((LA57_1 >= DIGIT && LA57_1 <= IDENT)||LA57_1==11||LA57_1==21||LA57_1==24) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:573:4: LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE address hex_after_address 'field_idx:' num_to_end_of_line address hex_after_address 'annotations_off:' num_to_end_of_line
            	    {
            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_field_annotations2763); 

            	    pushFollow(FOLLOW_proto_type_string_in_field_annotations2765);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,19,FOLLOW_19_in_field_annotations2767); 

            	    pushFollow(FOLLOW_proto_type_string_in_field_annotations2769);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_field_annotations2771); 

            	    pushFollow(FOLLOW_address_in_field_annotations2776);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_field_annotations2778);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,62,FOLLOW_62_in_field_annotations2780); 

            	    pushFollow(FOLLOW_num_to_end_of_line_in_field_annotations2782);
            	    num_to_end_of_line();

            	    state._fsp--;


            	    pushFollow(FOLLOW_address_in_field_annotations2787);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_field_annotations2789);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,32,FOLLOW_32_in_field_annotations2791); 

            	    pushFollow(FOLLOW_num_to_end_of_line_in_field_annotations2793);
            	    num_to_end_of_line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
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
    // $ANTLR end "field_annotations"



    // $ANTLR start "type_list_block"
    // src/com/riis/decompiler/DexToXML.g:582:1: type_list_block : ( type_list )+ ;
    public final void type_list_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:583:2: ( ( type_list )+ )
            // src/com/riis/decompiler/DexToXML.g:583:4: ( type_list )+
            {
            // src/com/riis/decompiler/DexToXML.g:583:4: ( type_list )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==LINE_SPLIT) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==24) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:583:4: type_list
            	    {
            	    pushFollow(FOLLOW_type_list_in_type_list_block2810);
            	    type_list();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // $ANTLR end "type_list_block"



    // $ANTLR start "type_list"
    // src/com/riis/decompiler/DexToXML.g:586:1: type_list : LINE_SPLIT element 'type_list' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address num_to_slashes proto_type_string NEWLINE )+ empty_line ( address hex_after_address NEWLINE )? ;
    public final void type_list() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:587:2: ( LINE_SPLIT element 'type_list' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address num_to_slashes proto_type_string NEWLINE )+ empty_line ( address hex_after_address NEWLINE )? )
            // src/com/riis/decompiler/DexToXML.g:587:4: LINE_SPLIT element 'type_list' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address num_to_slashes proto_type_string NEWLINE )+ empty_line ( address hex_after_address NEWLINE )?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_type_list2823); 

            pushFollow(FOLLOW_element_in_type_list2825);
            element();

            state._fsp--;


            match(input,126,FOLLOW_126_in_type_list2827); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_list2829); 

            pushFollow(FOLLOW_address_in_type_list2834);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_type_list2836);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_type_list2838); 

            match(input,19,FOLLOW_19_in_type_list2840); 

            pushFollow(FOLLOW_num_to_end_of_line_in_type_list2842);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:589:4: ( address hex_after_address num_to_slashes proto_type_string NEWLINE )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0 >= DIGIT && LA59_0 <= IDENT)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:589:5: address hex_after_address num_to_slashes proto_type_string NEWLINE
            	    {
            	    pushFollow(FOLLOW_address_in_type_list2848);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_type_list2850);
            	    hex_after_address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_num_to_slashes_in_type_list2852);
            	    num_to_slashes();

            	    state._fsp--;


            	    pushFollow(FOLLOW_proto_type_string_in_type_list2854);
            	    proto_type_string();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_type_list2856); 

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


            pushFollow(FOLLOW_empty_line_in_type_list2863);
            empty_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:591:4: ( address hex_after_address NEWLINE )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0 >= DIGIT && LA60_0 <= IDENT)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:591:5: address hex_after_address NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_type_list2869);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_type_list2871);
                    hex_after_address();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_type_list2873); 

                    }
                    break;

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
    // $ANTLR end "type_list"



    // $ANTLR start "string_data_block"
    // src/com/riis/decompiler/DexToXML.g:598:1: string_data_block : LINE_SPLIT 'string_data:' NEWLINE ( string_data )+ ;
    public final void string_data_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:599:2: ( LINE_SPLIT 'string_data:' NEWLINE ( string_data )+ )
            // src/com/riis/decompiler/DexToXML.g:599:4: LINE_SPLIT 'string_data:' NEWLINE ( string_data )+
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_string_data_block2891); 

            match(input,111,FOLLOW_111_in_string_data_block2893); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_string_data_block2895); 

            // src/com/riis/decompiler/DexToXML.g:600:4: ( string_data )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0 >= DIGIT && LA61_0 <= IDENT)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:600:4: string_data
            	    {
            	    pushFollow(FOLLOW_string_data_in_string_data_block2900);
            	    string_data();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // $ANTLR end "string_data_block"



    // $ANTLR start "string_data"
    // src/com/riis/decompiler/DexToXML.g:603:1: string_data : address hex_after_address 'utf16_size:' num_to_end_of_line address hex_after_address quoted_string NEWLINE ( address hex_after_address NEWLINE )* empty_line ;
    public final void string_data() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:604:2: ( address hex_after_address 'utf16_size:' num_to_end_of_line address hex_after_address quoted_string NEWLINE ( address hex_after_address NEWLINE )* empty_line )
            // src/com/riis/decompiler/DexToXML.g:604:4: address hex_after_address 'utf16_size:' num_to_end_of_line address hex_after_address quoted_string NEWLINE ( address hex_after_address NEWLINE )* empty_line
            {
            pushFollow(FOLLOW_address_in_string_data2913);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_string_data2915);
            hex_after_address();

            state._fsp--;


            match(input,128,FOLLOW_128_in_string_data2917); 

            pushFollow(FOLLOW_num_to_end_of_line_in_string_data2919);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_string_data2924);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_string_data2926);
            hex_after_address();

            state._fsp--;


            pushFollow(FOLLOW_quoted_string_in_string_data2928);
            quoted_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_string_data2930); 

            // src/com/riis/decompiler/DexToXML.g:606:4: ( address hex_after_address NEWLINE )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0 >= DIGIT && LA62_0 <= IDENT)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:606:5: address hex_after_address NEWLINE
            	    {
            	    pushFollow(FOLLOW_address_in_string_data2936);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_string_data2938);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_string_data2940); 

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            pushFollow(FOLLOW_empty_line_in_string_data2947);
            empty_line();

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
    // $ANTLR end "string_data"



    // $ANTLR start "byte_data_block"
    // src/com/riis/decompiler/DexToXML.g:614:1: byte_data_block : LINE_SPLIT 'byte_data:' NEWLINE ( byte_data )* ;
    public final void byte_data_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:615:2: ( LINE_SPLIT 'byte_data:' NEWLINE ( byte_data )* )
            // src/com/riis/decompiler/DexToXML.g:615:4: LINE_SPLIT 'byte_data:' NEWLINE ( byte_data )*
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_byte_data_block2963); 

            match(input,33,FOLLOW_33_in_byte_data_block2965); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_byte_data_block2967); 

            // src/com/riis/decompiler/DexToXML.g:616:4: ( byte_data )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:616:4: byte_data
            	    {
            	    pushFollow(FOLLOW_byte_data_in_byte_data_block2972);
            	    byte_data();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // $ANTLR end "byte_data_block"



    // $ANTLR start "byte_data"
    // src/com/riis/decompiler/DexToXML.g:619:1: byte_data : LINE_SPLIT element 'debug info' NEWLINE address hex_after_address 'line_start:' num_to_end_of_line address hex_after_address 'parameters_size:' num_to_end_of_line ( address hex_after_address 'parameter' param NEWLINE )* address hex_after_address address 'prologue end' NEWLINE ( address hex_after_address ( address )? 'line' ( '=' )? num_to_end_of_line ( address hex_after_address address 'advance pc' NEWLINE )? )* address hex_after_address 'end sequence' NEWLINE empty_line ;
    public final void byte_data() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:620:2: ( LINE_SPLIT element 'debug info' NEWLINE address hex_after_address 'line_start:' num_to_end_of_line address hex_after_address 'parameters_size:' num_to_end_of_line ( address hex_after_address 'parameter' param NEWLINE )* address hex_after_address address 'prologue end' NEWLINE ( address hex_after_address ( address )? 'line' ( '=' )? num_to_end_of_line ( address hex_after_address address 'advance pc' NEWLINE )? )* address hex_after_address 'end sequence' NEWLINE empty_line )
            // src/com/riis/decompiler/DexToXML.g:620:4: LINE_SPLIT element 'debug info' NEWLINE address hex_after_address 'line_start:' num_to_end_of_line address hex_after_address 'parameters_size:' num_to_end_of_line ( address hex_after_address 'parameter' param NEWLINE )* address hex_after_address address 'prologue end' NEWLINE ( address hex_after_address ( address )? 'line' ( '=' )? num_to_end_of_line ( address hex_after_address address 'advance pc' NEWLINE )? )* address hex_after_address 'end sequence' NEWLINE empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_byte_data2985); 

            pushFollow(FOLLOW_element_in_byte_data2987);
            element();

            state._fsp--;


            match(input,49,FOLLOW_49_in_byte_data2989); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_byte_data2991); 

            pushFollow(FOLLOW_address_in_byte_data2996);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_byte_data2998);
            hex_after_address();

            state._fsp--;


            match(input,76,FOLLOW_76_in_byte_data3000); 

            pushFollow(FOLLOW_num_to_end_of_line_in_byte_data3002);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_byte_data3007);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_byte_data3009);
            hex_after_address();

            state._fsp--;


            match(input,96,FOLLOW_96_in_byte_data3011); 

            pushFollow(FOLLOW_num_to_end_of_line_in_byte_data3013);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:623:4: ( address hex_after_address 'parameter' param NEWLINE )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:623:5: address hex_after_address 'parameter' param NEWLINE
            	    {
            	    pushFollow(FOLLOW_address_in_byte_data3019);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_byte_data3021);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,94,FOLLOW_94_in_byte_data3023); 

            	    pushFollow(FOLLOW_param_in_byte_data3025);
            	    param();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_byte_data3027); 

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            pushFollow(FOLLOW_address_in_byte_data3034);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_byte_data3036);
            hex_after_address();

            state._fsp--;


            pushFollow(FOLLOW_address_in_byte_data3038);
            address();

            state._fsp--;


            match(input,97,FOLLOW_97_in_byte_data3040); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_byte_data3042); 

            // src/com/riis/decompiler/DexToXML.g:625:4: ( address hex_after_address ( address )? 'line' ( '=' )? num_to_end_of_line ( address hex_after_address address 'advance pc' NEWLINE )? )*
            loop68:
            do {
                int alt68=2;
                alt68 = dfa68.predict(input);
                switch (alt68) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:625:5: address hex_after_address ( address )? 'line' ( '=' )? num_to_end_of_line ( address hex_after_address address 'advance pc' NEWLINE )?
            	    {
            	    pushFollow(FOLLOW_address_in_byte_data3048);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_byte_data3050);
            	    hex_after_address();

            	    state._fsp--;


            	    // src/com/riis/decompiler/DexToXML.g:625:31: ( address )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( ((LA65_0 >= DIGIT && LA65_0 <= IDENT)) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:625:31: address
            	            {
            	            pushFollow(FOLLOW_address_in_byte_data3052);
            	            address();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    match(input,75,FOLLOW_75_in_byte_data3055); 

            	    // src/com/riis/decompiler/DexToXML.g:625:47: ( '=' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==22) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:625:47: '='
            	            {
            	            match(input,22,FOLLOW_22_in_byte_data3057); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_num_to_end_of_line_in_byte_data3060);
            	    num_to_end_of_line();

            	    state._fsp--;


            	    // src/com/riis/decompiler/DexToXML.g:626:5: ( address hex_after_address address 'advance pc' NEWLINE )?
            	    int alt67=2;
            	    alt67 = dfa67.predict(input);
            	    switch (alt67) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:626:6: address hex_after_address address 'advance pc' NEWLINE
            	            {
            	            pushFollow(FOLLOW_address_in_byte_data3067);
            	            address();

            	            state._fsp--;


            	            pushFollow(FOLLOW_hex_after_address_in_byte_data3069);
            	            hex_after_address();

            	            state._fsp--;


            	            pushFollow(FOLLOW_address_in_byte_data3071);
            	            address();

            	            state._fsp--;


            	            match(input,29,FOLLOW_29_in_byte_data3073); 

            	            match(input,NEWLINE,FOLLOW_NEWLINE_in_byte_data3075); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            pushFollow(FOLLOW_address_in_byte_data3084);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_byte_data3086);
            hex_after_address();

            state._fsp--;


            match(input,56,FOLLOW_56_in_byte_data3088); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_byte_data3090); 

            pushFollow(FOLLOW_empty_line_in_byte_data3095);
            empty_line();

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
    // $ANTLR end "byte_data"



    // $ANTLR start "param"
    // src/com/riis/decompiler/DexToXML.g:631:1: param : ( '<' )? ( IDENT )+ ( '>' )? ( ( IDENT )+ )? ;
    public final void param() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:632:2: ( ( '<' )? ( IDENT )+ ( '>' )? ( ( IDENT )+ )? )
            // src/com/riis/decompiler/DexToXML.g:632:4: ( '<' )? ( IDENT )+ ( '>' )? ( ( IDENT )+ )?
            {
            // src/com/riis/decompiler/DexToXML.g:632:4: ( '<' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==21) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:632:4: '<'
                    {
                    match(input,21,FOLLOW_21_in_param3107); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:632:9: ( IDENT )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==IDENT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:632:9: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_param3110); 

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);


            // src/com/riis/decompiler/DexToXML.g:632:16: ( '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==23) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:632:16: '>'
                    {
                    match(input,23,FOLLOW_23_in_param3113); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:632:21: ( ( IDENT )+ )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==IDENT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:632:22: ( IDENT )+
                    {
                    // src/com/riis/decompiler/DexToXML.g:632:22: ( IDENT )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==IDENT) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:632:22: IDENT
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_param3117); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "param"



    // $ANTLR start "annotations_block"
    // src/com/riis/decompiler/DexToXML.g:639:1: annotations_block : ( annotation )* ;
    public final void annotations_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:640:2: ( ( annotation )* )
            // src/com/riis/decompiler/DexToXML.g:640:4: ( annotation )*
            {
            // src/com/riis/decompiler/DexToXML.g:640:4: ( annotation )*
            loop74:
            do {
                int alt74=2;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:640:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations_block3137);
            	    annotation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end "annotations_block"



    // $ANTLR start "annotation"
    // src/com/riis/decompiler/DexToXML.g:643:1: annotation : LINE_SPLIT element IDENT NEWLINE address hex_after_address 'visibility:' word_to_end_of_line address hex_after_address 'type_idx:' num_to_slashes proto_type_string NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( annotation_element )* empty_line ;
    public final void annotation() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:644:2: ( LINE_SPLIT element IDENT NEWLINE address hex_after_address 'visibility:' word_to_end_of_line address hex_after_address 'type_idx:' num_to_slashes proto_type_string NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( annotation_element )* empty_line )
            // src/com/riis/decompiler/DexToXML.g:644:4: LINE_SPLIT element IDENT NEWLINE address hex_after_address 'visibility:' word_to_end_of_line address hex_after_address 'type_idx:' num_to_slashes proto_type_string NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( annotation_element )* empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation3150); 

            pushFollow(FOLLOW_element_in_annotation3152);
            element();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_annotation3154); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation3156); 

            pushFollow(FOLLOW_address_in_annotation3161);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotation3163);
            hex_after_address();

            state._fsp--;


            match(input,131,FOLLOW_131_in_annotation3165); 

            pushFollow(FOLLOW_word_to_end_of_line_in_annotation3167);
            word_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_annotation3172);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotation3174);
            hex_after_address();

            state._fsp--;


            match(input,125,FOLLOW_125_in_annotation3176); 

            pushFollow(FOLLOW_num_to_slashes_in_annotation3178);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_annotation3180);
            proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation3182); 

            pushFollow(FOLLOW_address_in_annotation3187);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotation3189);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_annotation3191); 

            match(input,19,FOLLOW_19_in_annotation3193); 

            pushFollow(FOLLOW_num_to_end_of_line_in_annotation3195);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:649:4: ( annotation_element )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==LINE_SPLIT) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==54) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:649:4: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_annotation3203);
            	    annotation_element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            pushFollow(FOLLOW_empty_line_in_annotation3213);
            empty_line();

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
    // $ANTLR end "annotation"



    // $ANTLR start "annotation_element"
    // src/com/riis/decompiler/DexToXML.g:654:1: annotation_element : LINE_SPLIT 'elements' element ':' NEWLINE address hex_after_address 'name_idx:' num_to_slashes word_to_end_of_line ( address hex_after_address IDENT ':' IDENT num_to_end_of_line | address hex_after_address IDENT ':' IDENT NEWLINE | address hex_after_address IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | address hex_after_address IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE ) ( address hex_after_address NEWLINE )* ;
    public final void annotation_element() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:655:2: ( LINE_SPLIT 'elements' element ':' NEWLINE address hex_after_address 'name_idx:' num_to_slashes word_to_end_of_line ( address hex_after_address IDENT ':' IDENT num_to_end_of_line | address hex_after_address IDENT ':' IDENT NEWLINE | address hex_after_address IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | address hex_after_address IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE ) ( address hex_after_address NEWLINE )* )
            // src/com/riis/decompiler/DexToXML.g:655:4: LINE_SPLIT 'elements' element ':' NEWLINE address hex_after_address 'name_idx:' num_to_slashes word_to_end_of_line ( address hex_after_address IDENT ':' IDENT num_to_end_of_line | address hex_after_address IDENT ':' IDENT NEWLINE | address hex_after_address IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | address hex_after_address IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE ) ( address hex_after_address NEWLINE )*
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_annotation_element3225); 

            match(input,54,FOLLOW_54_in_annotation_element3227); 

            pushFollow(FOLLOW_element_in_annotation_element3229);
            element();

            state._fsp--;


            match(input,19,FOLLOW_19_in_annotation_element3231); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_element3233); 

            pushFollow(FOLLOW_address_in_annotation_element3238);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_annotation_element3240);
            hex_after_address();

            state._fsp--;


            match(input,90,FOLLOW_90_in_annotation_element3242); 

            pushFollow(FOLLOW_num_to_slashes_in_annotation_element3244);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_word_to_end_of_line_in_annotation_element3246);
            word_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:657:4: ( address hex_after_address IDENT ':' IDENT num_to_end_of_line | address hex_after_address IDENT ':' IDENT NEWLINE | address hex_after_address IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | address hex_after_address IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )
            int alt78=4;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:657:7: address hex_after_address IDENT ':' IDENT num_to_end_of_line
                    {
                    pushFollow(FOLLOW_address_in_annotation_element3254);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_annotation_element3256);
                    hex_after_address();

                    state._fsp--;


                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3258); 

                    match(input,19,FOLLOW_19_in_annotation_element3260); 

                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3262); 

                    pushFollow(FOLLOW_num_to_end_of_line_in_annotation_element3264);
                    num_to_end_of_line();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:658:7: address hex_after_address IDENT ':' IDENT NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_annotation_element3272);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_annotation_element3274);
                    hex_after_address();

                    state._fsp--;


                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3276); 

                    match(input,19,FOLLOW_19_in_annotation_element3278); 

                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3280); 

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_element3282); 

                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToXML.g:659:7: address hex_after_address IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_annotation_element3290);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_annotation_element3292);
                    hex_after_address();

                    state._fsp--;


                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3294); 

                    match(input,19,FOLLOW_19_in_annotation_element3296); 

                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3298); 

                    pushFollow(FOLLOW_proto_type_string_in_annotation_element3300);
                    proto_type_string();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToXML.g:659:67: ( ':' proto_type_string )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==19) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // src/com/riis/decompiler/DexToXML.g:659:68: ':' proto_type_string
                            {
                            match(input,19,FOLLOW_19_in_annotation_element3303); 

                            pushFollow(FOLLOW_proto_type_string_in_annotation_element3305);
                            proto_type_string();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_element3309); 

                    }
                    break;
                case 4 :
                    // src/com/riis/decompiler/DexToXML.g:660:7: address hex_after_address IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_annotation_element3317);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_annotation_element3319);
                    hex_after_address();

                    state._fsp--;


                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3321); 

                    match(input,19,FOLLOW_19_in_annotation_element3323); 

                    match(input,IDENT,FOLLOW_IDENT_in_annotation_element3325); 

                    match(input,133,FOLLOW_133_in_annotation_element3327); 

                    // src/com/riis/decompiler/DexToXML.g:660:53: (~ '}' )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0 >= ANY_CHAR && LA77_0 <= 133)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:
                    	    {
                    	    if ( (input.LA(1) >= ANY_CHAR && input.LA(1) <= 133) ) {
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
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);


                    match(input,134,FOLLOW_134_in_annotation_element3335); 

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_element3337); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:662:4: ( address hex_after_address NEWLINE )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0 >= DIGIT && LA79_0 <= IDENT)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:662:5: address hex_after_address NEWLINE
            	    {
            	    pushFollow(FOLLOW_address_in_annotation_element3349);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_annotation_element3351);
            	    hex_after_address();

            	    state._fsp--;


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_annotation_element3353); 

            	    }
            	    break;

            	default :
            	    break loop79;
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
    // $ANTLR end "annotation_element"



    // $ANTLR start "encoded_array_block"
    // src/com/riis/decompiler/DexToXML.g:669:1: encoded_array_block : ( encoded_array )* ;
    public final void encoded_array_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:670:2: ( ( encoded_array )* )
            // src/com/riis/decompiler/DexToXML.g:670:4: ( encoded_array )*
            {
            // src/com/riis/decompiler/DexToXML.g:670:4: ( encoded_array )*
            loop80:
            do {
                int alt80=2;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:670:4: encoded_array
            	    {
            	    pushFollow(FOLLOW_encoded_array_in_encoded_array_block3370);
            	    encoded_array();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "encoded_array_block"



    // $ANTLR start "encoded_array"
    // src/com/riis/decompiler/DexToXML.g:673:1: encoded_array : LINE_SPLIT element 'encoded array' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address element IDENT (~ NEWLINE )* NEWLINE )+ empty_line ;
    public final void encoded_array() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:674:2: ( LINE_SPLIT element 'encoded array' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address element IDENT (~ NEWLINE )* NEWLINE )+ empty_line )
            // src/com/riis/decompiler/DexToXML.g:674:4: LINE_SPLIT element 'encoded array' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( address hex_after_address element IDENT (~ NEWLINE )* NEWLINE )+ empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_encoded_array3383); 

            pushFollow(FOLLOW_element_in_encoded_array3385);
            element();

            state._fsp--;


            match(input,55,FOLLOW_55_in_encoded_array3387); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_encoded_array3389); 

            pushFollow(FOLLOW_address_in_encoded_array3394);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_encoded_array3396);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_encoded_array3398); 

            match(input,19,FOLLOW_19_in_encoded_array3400); 

            pushFollow(FOLLOW_num_to_end_of_line_in_encoded_array3402);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:676:4: ( address hex_after_address element IDENT (~ NEWLINE )* NEWLINE )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0 >= DIGIT && LA82_0 <= IDENT)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:676:5: address hex_after_address element IDENT (~ NEWLINE )* NEWLINE
            	    {
            	    pushFollow(FOLLOW_address_in_encoded_array3408);
            	    address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_hex_after_address_in_encoded_array3410);
            	    hex_after_address();

            	    state._fsp--;


            	    pushFollow(FOLLOW_element_in_encoded_array3412);
            	    element();

            	    state._fsp--;


            	    match(input,IDENT,FOLLOW_IDENT_in_encoded_array3414); 

            	    // src/com/riis/decompiler/DexToXML.g:676:45: (~ NEWLINE )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( ((LA81_0 >= ANY_CHAR && LA81_0 <= LINE_SPLIT)||(LA81_0 >= WS && LA81_0 <= 134)) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // src/com/riis/decompiler/DexToXML.g:
            	    	    {
            	    	    if ( (input.LA(1) >= ANY_CHAR && input.LA(1) <= LINE_SPLIT)||(input.LA(1) >= WS && input.LA(1) <= 134) ) {
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
            	    	    break loop81;
            	        }
            	    } while (true);


            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_encoded_array3422); 

            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);


            pushFollow(FOLLOW_empty_line_in_encoded_array3429);
            empty_line();

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
    // $ANTLR end "encoded_array"



    // $ANTLR start "class_data_block"
    // src/com/riis/decompiler/DexToXML.g:684:1: class_data_block : ( class_data )+ ;
    public final void class_data_block() throws RecognitionException {
        fout.printXML("<classes>");
        try {
            // src/com/riis/decompiler/DexToXML.g:688:2: ( ( class_data )+ )
            // src/com/riis/decompiler/DexToXML.g:688:4: ( class_data )+
            {
            // src/com/riis/decompiler/DexToXML.g:688:4: ( class_data )+
            int cnt83=0;
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==LINE_SPLIT) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==24) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:688:4: class_data
            	    {
            	    pushFollow(FOLLOW_class_data_in_class_data_block3462);
            	    class_data();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
            } while (true);


            }

            fout.printXML("</classes>");
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
    // $ANTLR end "class_data_block"



    // $ANTLR start "class_data"
    // src/com/riis/decompiler/DexToXML.g:697:1: class_data : LINE_SPLIT element 'class' 'data' 'for' id0= proto_type_string NEWLINE address hex_after_address 'static_fields_size:' id1= num_to_end_of_line address hex_after_address 'instance_fields_size:' id2= num_to_end_of_line address hex_after_address 'direct_methods_size:' id3= num_to_end_of_line address hex_after_address 'virtual_methods_size:' id4= num_to_end_of_line ( static_fields )? ( instance_fields )? ( direct_methods )? ( virtual_methods )? ( address hex_after_address NEWLINE )? empty_line ;
    public final void class_data() throws RecognitionException {
        DexToXMLParser.proto_type_string_return id0 =null;

        DexToXMLParser.num_to_end_of_line_return id1 =null;

        DexToXMLParser.num_to_end_of_line_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.num_to_end_of_line_return id4 =null;


        fout.printXML("<class>");
        try {
            // src/com/riis/decompiler/DexToXML.g:701:2: ( LINE_SPLIT element 'class' 'data' 'for' id0= proto_type_string NEWLINE address hex_after_address 'static_fields_size:' id1= num_to_end_of_line address hex_after_address 'instance_fields_size:' id2= num_to_end_of_line address hex_after_address 'direct_methods_size:' id3= num_to_end_of_line address hex_after_address 'virtual_methods_size:' id4= num_to_end_of_line ( static_fields )? ( instance_fields )? ( direct_methods )? ( virtual_methods )? ( address hex_after_address NEWLINE )? empty_line )
            // src/com/riis/decompiler/DexToXML.g:701:4: LINE_SPLIT element 'class' 'data' 'for' id0= proto_type_string NEWLINE address hex_after_address 'static_fields_size:' id1= num_to_end_of_line address hex_after_address 'instance_fields_size:' id2= num_to_end_of_line address hex_after_address 'direct_methods_size:' id3= num_to_end_of_line address hex_after_address 'virtual_methods_size:' id4= num_to_end_of_line ( static_fields )? ( instance_fields )? ( direct_methods )? ( virtual_methods )? ( address hex_after_address NEWLINE )? empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_class_data3496); 

            pushFollow(FOLLOW_element_in_class_data3498);
            element();

            state._fsp--;


            match(input,36,FOLLOW_36_in_class_data3500); 

            match(input,46,FOLLOW_46_in_class_data3502); 

            match(input,66,FOLLOW_66_in_class_data3504); 

            pushFollow(FOLLOW_proto_type_string_in_class_data3508);
            id0=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_class_data3510); 

            pushFollow(FOLLOW_address_in_class_data3517);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_data3519);
            hex_after_address();

            state._fsp--;


            match(input,109,FOLLOW_109_in_class_data3521); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_data3525);
            id1=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_data3530);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_data3532);
            hex_after_address();

            state._fsp--;


            match(input,73,FOLLOW_73_in_class_data3534); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_data3538);
            id2=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_data3543);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_data3545);
            hex_after_address();

            state._fsp--;


            match(input,53,FOLLOW_53_in_class_data3547); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_data3551);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_class_data3556);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_class_data3558);
            hex_after_address();

            state._fsp--;


            match(input,130,FOLLOW_130_in_class_data3560); 

            pushFollow(FOLLOW_num_to_end_of_line_in_class_data3564);
            id4=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<class_name>" + (id0!=null?input.toString(id0.start,id0.stop):null) + "</class_name>");
            	   fout.printXML("<static_fields_size>" + (id1!=null?input.toString(id1.start,id1.stop):null).trim() + "</static_fields_size>");
            	   fout.printXML("<instance_fields_size>" + (id2!=null?input.toString(id2.start,id2.stop):null).trim() + "</instance_fields_size>");
            	   fout.printXML("<direct_methods_size>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</direct_methods_size>");
            	   fout.printXML("<virtual_methods_size>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</virtual_methods_size>");
            	   
            	   staticFieldsSize = Integer.parseInt((id1!=null?input.toString(id1.start,id1.stop):null).trim(), 16);
            	   instanceFieldsSize = Integer.parseInt((id2!=null?input.toString(id2.start,id2.stop):null).trim(), 16);
            	   directMethodsSize = Integer.parseInt((id3!=null?input.toString(id3.start,id3.stop):null).trim(), 16);
            	   virtualMethodsSize = Integer.parseInt((id4!=null?input.toString(id4.start,id4.stop):null).trim(), 16);

            // src/com/riis/decompiler/DexToXML.g:719:4: ( static_fields )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==LINE_SPLIT) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==108) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:719:4: static_fields
                    {
                    pushFollow(FOLLOW_static_fields_in_class_data3583);
                    static_fields();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:720:4: ( instance_fields )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LINE_SPLIT) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==72) ) {
                    alt85=1;
                }
            }
            switch (alt85) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:720:4: instance_fields
                    {
                    pushFollow(FOLLOW_instance_fields_in_class_data3589);
                    instance_fields();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:721:4: ( direct_methods )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LINE_SPLIT) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==52) ) {
                    alt86=1;
                }
            }
            switch (alt86) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:721:4: direct_methods
                    {
                    pushFollow(FOLLOW_direct_methods_in_class_data3595);
                    direct_methods();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:722:4: ( virtual_methods )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LINE_SPLIT) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==129) ) {
                    alt87=1;
                }
            }
            switch (alt87) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:722:4: virtual_methods
                    {
                    pushFollow(FOLLOW_virtual_methods_in_class_data3601);
                    virtual_methods();

                    state._fsp--;


                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:724:4: ( address hex_after_address NEWLINE )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0 >= DIGIT && LA88_0 <= IDENT)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:724:5: address hex_after_address NEWLINE
                    {
                    pushFollow(FOLLOW_address_in_class_data3612);
                    address();

                    state._fsp--;


                    pushFollow(FOLLOW_hex_after_address_in_class_data3614);
                    hex_after_address();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_class_data3616); 

                    }
                    break;

            }


            pushFollow(FOLLOW_empty_line_in_class_data3623);
            empty_line();

            state._fsp--;


            }

            fout.printXML("</class>");
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
    // $ANTLR end "class_data"



    // $ANTLR start "static_fields"
    // src/com/riis/decompiler/DexToXML.g:728:1: static_fields : LINE_SPLIT 'static_fields:' NEWLINE ( static_field )+ {...}?;
    public final void static_fields() throws RecognitionException {
        fout.printXML("<static_fields>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:732:2: ( LINE_SPLIT 'static_fields:' NEWLINE ( static_field )+ {...}?)
            // src/com/riis/decompiler/DexToXML.g:732:4: LINE_SPLIT 'static_fields:' NEWLINE ( static_field )+ {...}?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_static_fields3650); 

            match(input,108,FOLLOW_108_in_static_fields3652); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_static_fields3654); 

            // src/com/riis/decompiler/DexToXML.g:733:4: ( static_field )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==LINE_SPLIT) ) {
                    int LA89_1 = input.LA(2);

                    if ( (LA89_1==24) ) {
                        alt89=1;
                    }


                }


                switch (alt89) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:733:5: static_field
            	    {
            	    pushFollow(FOLLOW_static_field_in_static_fields3660);
            	    static_field();

            	    state._fsp--;


            	     n++; 

            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            if ( !(( n == staticFieldsSize )) ) {
                throw new FailedPredicateException(input, "static_fields", " n == staticFieldsSize ");
            }

            }

            fout.printXML("</static_fields>");
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
    // $ANTLR end "static_fields"



    // $ANTLR start "static_field"
    // src/com/riis/decompiler/DexToXML.g:736:1: static_field : LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'field_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums ;
    public final void static_field() throws RecognitionException {
        String id0 =null;

        DexToXMLParser.proto_type_string_return id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.access_modifiers_with_nums_return id4 =null;


        fout.printXML("<static_field>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:740:2: ( LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'field_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums )
            // src/com/riis/decompiler/DexToXML.g:740:4: LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'field_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_static_field3695); 

            pushFollow(FOLLOW_element_in_static_field3699);
            id0=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_static_field3703);
            id1=proto_type_string();

            state._fsp--;


            match(input,19,FOLLOW_19_in_static_field3705); 

            pushFollow(FOLLOW_proto_type_string_in_static_field3709);
            id2=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_static_field3711); 

            pushFollow(FOLLOW_address_in_static_field3716);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_static_field3718);
            hex_after_address();

            state._fsp--;


            match(input,62,FOLLOW_62_in_static_field3720); 

            pushFollow(FOLLOW_num_to_end_of_line_in_static_field3724);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_static_field3729);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_static_field3731);
            hex_after_address();

            state._fsp--;


            match(input,28,FOLLOW_28_in_static_field3733); 

            pushFollow(FOLLOW_access_modifiers_with_nums_in_static_field3737);
            id4=access_modifiers_with_nums();

            state._fsp--;


            fout.printXML("<id>" + id0 + "</id>\n" +
            	  				 "<name>" + (id1!=null?input.toString(id1.start,id1.stop):null) + "</name>\n" +
            	  				 "<type>" + (id2!=null?input.toString(id2.start,id2.stop):null) + "</type>\n" +
            	  				 "<field_id>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</field_id>\n" +
            	  				 "<access_flags>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</access_flags>\n");

            }

            fout.printXML("</static_field>");
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
    // $ANTLR end "static_field"



    // $ANTLR start "instance_fields"
    // src/com/riis/decompiler/DexToXML.g:751:1: instance_fields : LINE_SPLIT 'instance_fields:' NEWLINE ( instance_field )+ {...}?;
    public final void instance_fields() throws RecognitionException {
        fout.printXML("<instance_fields>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:755:2: ( LINE_SPLIT 'instance_fields:' NEWLINE ( instance_field )+ {...}?)
            // src/com/riis/decompiler/DexToXML.g:755:4: LINE_SPLIT 'instance_fields:' NEWLINE ( instance_field )+ {...}?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_instance_fields3774); 

            match(input,72,FOLLOW_72_in_instance_fields3776); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_instance_fields3778); 

            // src/com/riis/decompiler/DexToXML.g:756:4: ( instance_field )+
            int cnt90=0;
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==LINE_SPLIT) ) {
                    int LA90_1 = input.LA(2);

                    if ( (LA90_1==24) ) {
                        alt90=1;
                    }


                }


                switch (alt90) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:756:5: instance_field
            	    {
            	    pushFollow(FOLLOW_instance_field_in_instance_fields3784);
            	    instance_field();

            	    state._fsp--;


            	     n++; 

            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
            } while (true);


            if ( !(( n == instanceFieldsSize )) ) {
                throw new FailedPredicateException(input, "instance_fields", " n == instanceFieldsSize ");
            }

            }

            fout.printXML("</instance_fields>");
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
    // $ANTLR end "instance_fields"



    // $ANTLR start "instance_field"
    // src/com/riis/decompiler/DexToXML.g:759:1: instance_field : LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'field_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums ;
    public final void instance_field() throws RecognitionException {
        String id0 =null;

        DexToXMLParser.proto_type_string_return id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.access_modifiers_with_nums_return id4 =null;


        fout.printXML("<instance_field>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:763:2: ( LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'field_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums )
            // src/com/riis/decompiler/DexToXML.g:763:4: LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'field_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_instance_field3819); 

            pushFollow(FOLLOW_element_in_instance_field3823);
            id0=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_instance_field3827);
            id1=proto_type_string();

            state._fsp--;


            match(input,19,FOLLOW_19_in_instance_field3829); 

            pushFollow(FOLLOW_proto_type_string_in_instance_field3833);
            id2=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_instance_field3835); 

            pushFollow(FOLLOW_address_in_instance_field3840);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_instance_field3842);
            hex_after_address();

            state._fsp--;


            match(input,62,FOLLOW_62_in_instance_field3844); 

            pushFollow(FOLLOW_num_to_end_of_line_in_instance_field3848);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_instance_field3853);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_instance_field3855);
            hex_after_address();

            state._fsp--;


            match(input,28,FOLLOW_28_in_instance_field3857); 

            pushFollow(FOLLOW_access_modifiers_with_nums_in_instance_field3861);
            id4=access_modifiers_with_nums();

            state._fsp--;


            fout.printXML("<id>" + id0 + "</id>\n" +
            	  				 "<name>" + (id1!=null?input.toString(id1.start,id1.stop):null) + "</name>\n" +
            	  				 "<type>" + (id2!=null?input.toString(id2.start,id2.stop):null) + "</type>\n" +
            	  				 "<field_id>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</field_id>\n" +
            	  				 "<access_flags>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</access_flags>\n");

            }

            fout.printXML("</instance_field>");
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
    // $ANTLR end "instance_field"



    // $ANTLR start "direct_methods"
    // src/com/riis/decompiler/DexToXML.g:774:1: direct_methods : LINE_SPLIT 'direct_methods:' NEWLINE ( direct_method )+ {...}?;
    public final void direct_methods() throws RecognitionException {
        fout.printXML("<direct_methods>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:778:2: ( LINE_SPLIT 'direct_methods:' NEWLINE ( direct_method )+ {...}?)
            // src/com/riis/decompiler/DexToXML.g:778:4: LINE_SPLIT 'direct_methods:' NEWLINE ( direct_method )+ {...}?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_direct_methods3898); 

            match(input,52,FOLLOW_52_in_direct_methods3900); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_direct_methods3902); 

            // src/com/riis/decompiler/DexToXML.g:779:4: ( direct_method )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==LINE_SPLIT) ) {
                    int LA91_1 = input.LA(2);

                    if ( (LA91_1==24) ) {
                        alt91=1;
                    }


                }


                switch (alt91) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:779:5: direct_method
            	    {
            	    pushFollow(FOLLOW_direct_method_in_direct_methods3908);
            	    direct_method();

            	    state._fsp--;


            	     n++; 

            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
            } while (true);


            if ( !(( n == directMethodsSize )) ) {
                throw new FailedPredicateException(input, "direct_methods", " n == directMethodsSize ");
            }

            }

            fout.printXML("</direct_methods>");
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
    // $ANTLR end "direct_methods"



    // $ANTLR start "direct_method"
    // src/com/riis/decompiler/DexToXML.g:782:1: direct_method : LINE_SPLIT id0= element id1= proto_type_string ( DIGIT )* ':' id2= proto_type_string NEWLINE address hex_after_address 'method_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'code_off:' id5= num_to_end_of_line ;
    public final void direct_method() throws RecognitionException {
        String id0 =null;

        DexToXMLParser.proto_type_string_return id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.access_modifiers_with_nums_return id4 =null;

        DexToXMLParser.num_to_end_of_line_return id5 =null;


        fout.printXML("<direct_method>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:786:2: ( LINE_SPLIT id0= element id1= proto_type_string ( DIGIT )* ':' id2= proto_type_string NEWLINE address hex_after_address 'method_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'code_off:' id5= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:786:4: LINE_SPLIT id0= element id1= proto_type_string ( DIGIT )* ':' id2= proto_type_string NEWLINE address hex_after_address 'method_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'code_off:' id5= num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_direct_method3943); 

            pushFollow(FOLLOW_element_in_direct_method3947);
            id0=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_direct_method3951);
            id1=proto_type_string();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:786:49: ( DIGIT )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==DIGIT) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:786:49: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_direct_method3953); 

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_direct_method3956); 

            pushFollow(FOLLOW_proto_type_string_in_direct_method3960);
            id2=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_direct_method3962); 

            pushFollow(FOLLOW_address_in_direct_method3967);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_direct_method3969);
            hex_after_address();

            state._fsp--;


            match(input,87,FOLLOW_87_in_direct_method3971); 

            pushFollow(FOLLOW_num_to_end_of_line_in_direct_method3975);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_direct_method3980);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_direct_method3982);
            hex_after_address();

            state._fsp--;


            match(input,28,FOLLOW_28_in_direct_method3984); 

            pushFollow(FOLLOW_access_modifiers_with_nums_in_direct_method3988);
            id4=access_modifiers_with_nums();

            state._fsp--;


            pushFollow(FOLLOW_address_in_direct_method3993);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_direct_method3995);
            hex_after_address();

            state._fsp--;


            match(input,45,FOLLOW_45_in_direct_method3997); 

            pushFollow(FOLLOW_num_to_end_of_line_in_direct_method4001);
            id5=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<id>" + id0 + "</id>\n" +
            	  				 "<name>" + fout.encodeXML((id1!=null?input.toString(id1.start,id1.stop):null)) + "</name>\n" +
            	  				 "<proto>" + (id2!=null?input.toString(id2.start,id2.stop):null) + "</proto>\n" +
            	  				 "<method_id>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</method_id>\n" +
            	  				 "<access_flags>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</access_flags>\n" +
            	  				 "<code_offset>" + (id5!=null?input.toString(id5.start,id5.stop):null).trim() + "</code_offset>\n");

            }

            fout.printXML("</direct_method>");
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
    // $ANTLR end "direct_method"



    // $ANTLR start "virtual_methods"
    // src/com/riis/decompiler/DexToXML.g:799:1: virtual_methods : LINE_SPLIT 'virtual_methods:' NEWLINE ( virtual_method )+ {...}?;
    public final void virtual_methods() throws RecognitionException {
        fout.printXML("<virtual_methods>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:803:2: ( LINE_SPLIT 'virtual_methods:' NEWLINE ( virtual_method )+ {...}?)
            // src/com/riis/decompiler/DexToXML.g:803:4: LINE_SPLIT 'virtual_methods:' NEWLINE ( virtual_method )+ {...}?
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_virtual_methods4038); 

            match(input,129,FOLLOW_129_in_virtual_methods4040); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_virtual_methods4042); 

            // src/com/riis/decompiler/DexToXML.g:804:4: ( virtual_method )+
            int cnt93=0;
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==LINE_SPLIT) ) {
                    int LA93_2 = input.LA(2);

                    if ( (LA93_2==24) ) {
                        alt93=1;
                    }


                }


                switch (alt93) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:804:5: virtual_method
            	    {
            	    pushFollow(FOLLOW_virtual_method_in_virtual_methods4048);
            	    virtual_method();

            	    state._fsp--;


            	     n++; 

            	    }
            	    break;

            	default :
            	    if ( cnt93 >= 1 ) break loop93;
                        EarlyExitException eee =
                            new EarlyExitException(93, input);
                        throw eee;
                }
                cnt93++;
            } while (true);


            if ( !(( n == virtualMethodsSize )) ) {
                throw new FailedPredicateException(input, "virtual_methods", " n == virtualMethodsSize ");
            }

            }

            fout.printXML("</virtual_methods>");
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
    // $ANTLR end "virtual_methods"



    // $ANTLR start "virtual_method"
    // src/com/riis/decompiler/DexToXML.g:807:1: virtual_method : LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'method_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'code_off:' id5= num_to_end_of_line ;
    public final void virtual_method() throws RecognitionException {
        String id0 =null;

        DexToXMLParser.proto_type_string_return id1 =null;

        DexToXMLParser.proto_type_string_return id2 =null;

        DexToXMLParser.num_to_end_of_line_return id3 =null;

        DexToXMLParser.access_modifiers_with_nums_return id4 =null;

        DexToXMLParser.num_to_end_of_line_return id5 =null;


        fout.printXML("<virtual_method>"); int n = 0;
        try {
            // src/com/riis/decompiler/DexToXML.g:811:2: ( LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'method_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'code_off:' id5= num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:811:4: LINE_SPLIT id0= element id1= proto_type_string ':' id2= proto_type_string NEWLINE address hex_after_address 'method_idx:' id3= num_to_end_of_line address hex_after_address 'access_flags:' id4= access_modifiers_with_nums address hex_after_address 'code_off:' id5= num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_virtual_method4083); 

            pushFollow(FOLLOW_element_in_virtual_method4087);
            id0=element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_virtual_method4091);
            id1=proto_type_string();

            state._fsp--;


            match(input,19,FOLLOW_19_in_virtual_method4093); 

            pushFollow(FOLLOW_proto_type_string_in_virtual_method4097);
            id2=proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_virtual_method4099); 

            pushFollow(FOLLOW_address_in_virtual_method4104);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_virtual_method4106);
            hex_after_address();

            state._fsp--;


            match(input,87,FOLLOW_87_in_virtual_method4108); 

            pushFollow(FOLLOW_num_to_end_of_line_in_virtual_method4112);
            id3=num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_virtual_method4117);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_virtual_method4119);
            hex_after_address();

            state._fsp--;


            match(input,28,FOLLOW_28_in_virtual_method4121); 

            pushFollow(FOLLOW_access_modifiers_with_nums_in_virtual_method4125);
            id4=access_modifiers_with_nums();

            state._fsp--;


            pushFollow(FOLLOW_address_in_virtual_method4130);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_virtual_method4132);
            hex_after_address();

            state._fsp--;


            match(input,45,FOLLOW_45_in_virtual_method4134); 

            pushFollow(FOLLOW_num_to_end_of_line_in_virtual_method4138);
            id5=num_to_end_of_line();

            state._fsp--;


            fout.printXML("<id>" + id0 + "</id>\n" +
            	  				 "<name>" + fout.encodeXML((id1!=null?input.toString(id1.start,id1.stop):null)) + "</name>\n" +
            	  				 "<proto>" + (id2!=null?input.toString(id2.start,id2.stop):null) + "</proto>\n" +
            	  				 "<method_id>" + (id3!=null?input.toString(id3.start,id3.stop):null).trim() + "</method_id>\n" +
            	  				 "<access_flags>" + (id4!=null?input.toString(id4.start,id4.stop):null).trim() + "</access_flags>\n" +
            	  				 "<code_offset>" + (id5!=null?input.toString(id5.start,id5.stop):null).trim() + "</code_offset>\n");

            }

            fout.printXML("</virtual_method>");
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
    // $ANTLR end "virtual_method"



    // $ANTLR start "map_block"
    // src/com/riis/decompiler/DexToXML.g:828:1: map_block : LINE_SPLIT IDENT ':' NEWLINE LINE_SPLIT element IDENT 'list' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( map )+ empty_line ;
    public final void map_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:829:2: ( LINE_SPLIT IDENT ':' NEWLINE LINE_SPLIT element IDENT 'list' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( map )+ empty_line )
            // src/com/riis/decompiler/DexToXML.g:829:4: LINE_SPLIT IDENT ':' NEWLINE LINE_SPLIT element IDENT 'list' NEWLINE address hex_after_address IDENT ':' num_to_end_of_line ( map )+ empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_map_block4162); 

            match(input,IDENT,FOLLOW_IDENT_in_map_block4164); 

            match(input,19,FOLLOW_19_in_map_block4166); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_map_block4168); 

            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_map_block4177); 

            pushFollow(FOLLOW_element_in_map_block4179);
            element();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_map_block4181); 

            match(input,79,FOLLOW_79_in_map_block4183); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_map_block4185); 

            pushFollow(FOLLOW_address_in_map_block4190);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_map_block4192);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_map_block4194); 

            match(input,19,FOLLOW_19_in_map_block4196); 

            pushFollow(FOLLOW_num_to_end_of_line_in_map_block4198);
            num_to_end_of_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:834:4: ( map )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==LINE_SPLIT) ) {
                    int LA94_1 = input.LA(2);

                    if ( (LA94_1==24) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:834:4: map
            	    {
            	    pushFollow(FOLLOW_map_in_map_block4207);
            	    map();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);


            pushFollow(FOLLOW_empty_line_in_map_block4217);
            empty_line();

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
    // $ANTLR end "map_block"



    // $ANTLR start "map"
    // src/com/riis/decompiler/DexToXML.g:839:1: map : LINE_SPLIT element ( IDENT | 'type_list' ) IDENT NEWLINE address hex_after_address 'type:' num_to_slashes word_to_end_of_line address hex_after_address 'unused:' num_to_end_of_line address hex_after_address IDENT ':' num_to_end_of_line address hex_after_address 'offset:' num_to_end_of_line ;
    public final void map() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:840:2: ( LINE_SPLIT element ( IDENT | 'type_list' ) IDENT NEWLINE address hex_after_address 'type:' num_to_slashes word_to_end_of_line address hex_after_address 'unused:' num_to_end_of_line address hex_after_address IDENT ':' num_to_end_of_line address hex_after_address 'offset:' num_to_end_of_line )
            // src/com/riis/decompiler/DexToXML.g:840:4: LINE_SPLIT element ( IDENT | 'type_list' ) IDENT NEWLINE address hex_after_address 'type:' num_to_slashes word_to_end_of_line address hex_after_address 'unused:' num_to_end_of_line address hex_after_address IDENT ':' num_to_end_of_line address hex_after_address 'offset:' num_to_end_of_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_map4228); 

            pushFollow(FOLLOW_element_in_map4230);
            element();

            state._fsp--;


            if ( input.LA(1)==IDENT||input.LA(1)==126 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,IDENT,FOLLOW_IDENT_in_map4240); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_map4242); 

            pushFollow(FOLLOW_address_in_map4247);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_map4249);
            hex_after_address();

            state._fsp--;


            match(input,121,FOLLOW_121_in_map4251); 

            pushFollow(FOLLOW_num_to_slashes_in_map4253);
            num_to_slashes();

            state._fsp--;


            pushFollow(FOLLOW_word_to_end_of_line_in_map4255);
            word_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_map4260);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_map4262);
            hex_after_address();

            state._fsp--;


            match(input,127,FOLLOW_127_in_map4264); 

            pushFollow(FOLLOW_num_to_end_of_line_in_map4266);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_map4271);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_map4273);
            hex_after_address();

            state._fsp--;


            match(input,IDENT,FOLLOW_IDENT_in_map4275); 

            match(input,19,FOLLOW_19_in_map4277); 

            pushFollow(FOLLOW_num_to_end_of_line_in_map4279);
            num_to_end_of_line();

            state._fsp--;


            pushFollow(FOLLOW_address_in_map4284);
            address();

            state._fsp--;


            pushFollow(FOLLOW_hex_after_address_in_map4286);
            hex_after_address();

            state._fsp--;


            match(input,91,FOLLOW_91_in_map4288); 

            pushFollow(FOLLOW_num_to_end_of_line_in_map4290);
            num_to_end_of_line();

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
    // $ANTLR end "map"



    // $ANTLR start "method_code_index_block"
    // src/com/riis/decompiler/DexToXML.g:851:1: method_code_index_block : LINE_SPLIT IDENT 'code' 'index:' NEWLINE empty_line ( method_code_index )+ empty_line ;
    public final void method_code_index_block() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:852:2: ( LINE_SPLIT IDENT 'code' 'index:' NEWLINE empty_line ( method_code_index )+ empty_line )
            // src/com/riis/decompiler/DexToXML.g:852:4: LINE_SPLIT IDENT 'code' 'index:' NEWLINE empty_line ( method_code_index )+ empty_line
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_method_code_index_block4306); 

            match(input,IDENT,FOLLOW_IDENT_in_method_code_index_block4308); 

            match(input,43,FOLLOW_43_in_method_code_index_block4310); 

            match(input,69,FOLLOW_69_in_method_code_index_block4312); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_code_index_block4314); 

            pushFollow(FOLLOW_empty_line_in_method_code_index_block4319);
            empty_line();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:855:4: ( method_code_index )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==LINE_SPLIT) ) {
                    int LA95_1 = input.LA(2);

                    if ( (LA95_1==24) ) {
                        alt95=1;
                    }


                }


                switch (alt95) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:855:4: method_code_index
            	    {
            	    pushFollow(FOLLOW_method_code_index_in_method_code_index_block4328);
            	    method_code_index();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
            } while (true);


            pushFollow(FOLLOW_empty_line_in_method_code_index_block4338);
            empty_line();

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
    // $ANTLR end "method_code_index_block"



    // $ANTLR start "method_code_index"
    // src/com/riis/decompiler/DexToXML.g:860:1: method_code_index : LINE_SPLIT element proto_type_string ( DIGIT )* ':' proto_type_string NEWLINE ;
    public final void method_code_index() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:861:2: ( LINE_SPLIT element proto_type_string ( DIGIT )* ':' proto_type_string NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:861:4: LINE_SPLIT element proto_type_string ( DIGIT )* ':' proto_type_string NEWLINE
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_method_code_index4350); 

            pushFollow(FOLLOW_element_in_method_code_index4352);
            element();

            state._fsp--;


            pushFollow(FOLLOW_proto_type_string_in_method_code_index4354);
            proto_type_string();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:861:41: ( DIGIT )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==DIGIT) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:861:41: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_method_code_index4356); 

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_method_code_index4359); 

            pushFollow(FOLLOW_proto_type_string_in_method_code_index4361);
            proto_type_string();

            state._fsp--;


            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_code_index4363); 

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
    // $ANTLR end "method_code_index"


    public static class proto_type_string_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "proto_type_string"
    // src/com/riis/decompiler/DexToXML.g:868:1: proto_type_string : ( proto_type_package | proto_type_package ( '.' ( '$' )? proto_type_package )+ | '(' ( proto_type_package )* ')' proto_type_package );
    public final DexToXMLParser.proto_type_string_return proto_type_string() throws RecognitionException {
        DexToXMLParser.proto_type_string_return retval = new DexToXMLParser.proto_type_string_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToXML.g:869:2: ( proto_type_package | proto_type_package ( '.' ( '$' )? proto_type_package )+ | '(' ( proto_type_package )* ')' proto_type_package )
            int alt100=3;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:869:4: proto_type_package
                    {
                    pushFollow(FOLLOW_proto_type_package_in_proto_type_string4380);
                    proto_type_package();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:870:4: proto_type_package ( '.' ( '$' )? proto_type_package )+
                    {
                    pushFollow(FOLLOW_proto_type_package_in_proto_type_string4385);
                    proto_type_package();

                    state._fsp--;


                    // src/com/riis/decompiler/DexToXML.g:870:23: ( '.' ( '$' )? proto_type_package )+
                    int cnt98=0;
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==16) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:870:24: '.' ( '$' )? proto_type_package
                    	    {
                    	    match(input,16,FOLLOW_16_in_proto_type_string4388); 

                    	    // src/com/riis/decompiler/DexToXML.g:870:28: ( '$' )?
                    	    int alt97=2;
                    	    int LA97_0 = input.LA(1);

                    	    if ( (LA97_0==10) ) {
                    	        alt97=1;
                    	    }
                    	    switch (alt97) {
                    	        case 1 :
                    	            // src/com/riis/decompiler/DexToXML.g:870:28: '$'
                    	            {
                    	            match(input,10,FOLLOW_10_in_proto_type_string4390); 

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_proto_type_package_in_proto_type_string4393);
                    	    proto_type_package();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt98 >= 1 ) break loop98;
                                EarlyExitException eee =
                                    new EarlyExitException(98, input);
                                throw eee;
                        }
                        cnt98++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // src/com/riis/decompiler/DexToXML.g:871:4: '(' ( proto_type_package )* ')' proto_type_package
                    {
                    match(input,11,FOLLOW_11_in_proto_type_string4405); 

                    // src/com/riis/decompiler/DexToXML.g:871:8: ( proto_type_package )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( ((LA99_0 >= DIGIT && LA99_0 <= IDENT)||LA99_0==21||LA99_0==24) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // src/com/riis/decompiler/DexToXML.g:871:8: proto_type_package
                    	    {
                    	    pushFollow(FOLLOW_proto_type_package_in_proto_type_string4407);
                    	    proto_type_package();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    match(input,12,FOLLOW_12_in_proto_type_string4410); 

                    pushFollow(FOLLOW_proto_type_package_in_proto_type_string4412);
                    proto_type_package();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "proto_type_string"



    // $ANTLR start "proto_type_package"
    // src/com/riis/decompiler/DexToXML.g:874:1: proto_type_package : ( '[' )? ( class_ident '/' )* class_ident ( '[' ']' )? ( ';' )? ;
    public final void proto_type_package() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:875:2: ( ( '[' )? ( class_ident '/' )* class_ident ( '[' ']' )? ( ';' )? )
            // src/com/riis/decompiler/DexToXML.g:875:4: ( '[' )? ( class_ident '/' )* class_ident ( '[' ']' )? ( ';' )?
            {
            // src/com/riis/decompiler/DexToXML.g:875:4: ( '[' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==24) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:875:4: '['
                    {
                    match(input,24,FOLLOW_24_in_proto_type_package4426); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:875:9: ( class_ident '/' )*
            loop102:
            do {
                int alt102=2;
                alt102 = dfa102.predict(input);
                switch (alt102) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:875:10: class_ident '/'
            	    {
            	    pushFollow(FOLLOW_class_ident_in_proto_type_package4430);
            	    class_ident();

            	    state._fsp--;


            	    match(input,17,FOLLOW_17_in_proto_type_package4432); 

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            pushFollow(FOLLOW_class_ident_in_proto_type_package4436);
            class_ident();

            state._fsp--;


            // src/com/riis/decompiler/DexToXML.g:875:40: ( '[' ']' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==24) ) {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==26) ) {
                    alt103=1;
                }
            }
            switch (alt103) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:875:41: '[' ']'
                    {
                    match(input,24,FOLLOW_24_in_proto_type_package4439); 

                    match(input,26,FOLLOW_26_in_proto_type_package4440); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:875:50: ( ';' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==20) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:875:50: ';'
                    {
                    match(input,20,FOLLOW_20_in_proto_type_package4444); 

                    }
                    break;

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
    // $ANTLR end "proto_type_package"



    // $ANTLR start "class_ident"
    // src/com/riis/decompiler/DexToXML.g:878:1: class_ident : ( ident_brackets | DIGIT ) ( '$' ( ident_brackets | DIGIT ) )* ;
    public final void class_ident() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:879:2: ( ( ident_brackets | DIGIT ) ( '$' ( ident_brackets | DIGIT ) )* )
            // src/com/riis/decompiler/DexToXML.g:879:4: ( ident_brackets | DIGIT ) ( '$' ( ident_brackets | DIGIT ) )*
            {
            // src/com/riis/decompiler/DexToXML.g:879:4: ( ident_brackets | DIGIT )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==IDENT||LA105_0==21) ) {
                alt105=1;
            }
            else if ( (LA105_0==DIGIT) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:879:5: ident_brackets
                    {
                    pushFollow(FOLLOW_ident_brackets_in_class_ident4458);
                    ident_brackets();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:879:20: DIGIT
                    {
                    match(input,DIGIT,FOLLOW_DIGIT_in_class_ident4460); 

                    }
                    break;

            }


            // src/com/riis/decompiler/DexToXML.g:879:27: ( '$' ( ident_brackets | DIGIT ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==10) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:879:28: '$' ( ident_brackets | DIGIT )
            	    {
            	    match(input,10,FOLLOW_10_in_class_ident4464); 

            	    // src/com/riis/decompiler/DexToXML.g:879:32: ( ident_brackets | DIGIT )
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==IDENT||LA106_0==21) ) {
            	        alt106=1;
            	    }
            	    else if ( (LA106_0==DIGIT) ) {
            	        alt106=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 106, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // src/com/riis/decompiler/DexToXML.g:879:33: ident_brackets
            	            {
            	            pushFollow(FOLLOW_ident_brackets_in_class_ident4467);
            	            ident_brackets();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // src/com/riis/decompiler/DexToXML.g:879:48: DIGIT
            	            {
            	            match(input,DIGIT,FOLLOW_DIGIT_in_class_ident4469); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
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
    // $ANTLR end "class_ident"



    // $ANTLR start "ident_brackets"
    // src/com/riis/decompiler/DexToXML.g:882:1: ident_brackets : ( IDENT | '<' IDENT '>' );
    public final void ident_brackets() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:883:2: ( IDENT | '<' IDENT '>' )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==IDENT) ) {
                alt108=1;
            }
            else if ( (LA108_0==21) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // src/com/riis/decompiler/DexToXML.g:883:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_ident_brackets4484); 

                    }
                    break;
                case 2 :
                    // src/com/riis/decompiler/DexToXML.g:884:4: '<' IDENT '>'
                    {
                    match(input,21,FOLLOW_21_in_ident_brackets4489); 

                    match(input,IDENT,FOLLOW_IDENT_in_ident_brackets4491); 

                    match(input,23,FOLLOW_23_in_ident_brackets4493); 

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
    // $ANTLR end "ident_brackets"



    // $ANTLR start "address"
    // src/com/riis/decompiler/DexToXML.g:887:1: address : ( DIGIT | IDENT )+ ':' ;
    public final void address() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:888:2: ( ( DIGIT | IDENT )+ ':' )
            // src/com/riis/decompiler/DexToXML.g:888:4: ( DIGIT | IDENT )+ ':'
            {
            // src/com/riis/decompiler/DexToXML.g:888:4: ( DIGIT | IDENT )+
            int cnt109=0;
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( ((LA109_0 >= DIGIT && LA109_0 <= IDENT)) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:
            	    {
            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
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
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
            } while (true);


            match(input,19,FOLLOW_19_in_address4511); 

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
    // $ANTLR end "address"



    // $ANTLR start "access_modifiers"
    // src/com/riis/decompiler/DexToXML.g:891:1: access_modifiers returns [String modifiers] : (id1= ( IDENT ( LINE_SPLIT IDENT )* ) ) NEWLINE ;
    public final String access_modifiers() throws RecognitionException {
        String modifiers = null;


        Token id1=null;

         modifiers = ""; 
        try {
            // src/com/riis/decompiler/DexToXML.g:893:2: ( (id1= ( IDENT ( LINE_SPLIT IDENT )* ) ) NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:893:4: (id1= ( IDENT ( LINE_SPLIT IDENT )* ) ) NEWLINE
            {
            // src/com/riis/decompiler/DexToXML.g:893:4: (id1= ( IDENT ( LINE_SPLIT IDENT )* ) )
            // src/com/riis/decompiler/DexToXML.g:893:5: id1= ( IDENT ( LINE_SPLIT IDENT )* )
            {
            // src/com/riis/decompiler/DexToXML.g:893:9: ( IDENT ( LINE_SPLIT IDENT )* )
            // src/com/riis/decompiler/DexToXML.g:893:10: IDENT ( LINE_SPLIT IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_access_modifiers4538); 

            // src/com/riis/decompiler/DexToXML.g:893:16: ( LINE_SPLIT IDENT )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==LINE_SPLIT) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:893:17: LINE_SPLIT IDENT
            	    {
            	    match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_access_modifiers4541); 

            	    match(input,IDENT,FOLLOW_IDENT_in_access_modifiers4543); 

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }


             modifiers = (id1!=null?id1.getText():null); 

            }


            match(input,NEWLINE,FOLLOW_NEWLINE_in_access_modifiers4551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return modifiers;
    }
    // $ANTLR end "access_modifiers"



    // $ANTLR start "hex_after_address"
    // src/com/riis/decompiler/DexToXML.g:896:1: hex_after_address returns [String hexAfterAddress] : (id1= ( DIGIT | IDENT ) )+ LINE_SPLIT ;
    public final String hex_after_address() throws RecognitionException {
        String hexAfterAddress = null;


        Token id1=null;

         hexAfterAddress = ""; 
        try {
            // src/com/riis/decompiler/DexToXML.g:898:2: ( (id1= ( DIGIT | IDENT ) )+ LINE_SPLIT )
            // src/com/riis/decompiler/DexToXML.g:898:4: (id1= ( DIGIT | IDENT ) )+ LINE_SPLIT
            {
            // src/com/riis/decompiler/DexToXML.g:898:4: (id1= ( DIGIT | IDENT ) )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0 >= DIGIT && LA111_0 <= IDENT)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:898:5: id1= ( DIGIT | IDENT )
            	    {
            	    id1=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	     hexAfterAddress += (id1!=null?id1.getText():null); 

            	    }
            	    break;

            	default :
            	    if ( cnt111 >= 1 ) break loop111;
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
            } while (true);


            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_hex_after_address4586); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return hexAfterAddress;
    }
    // $ANTLR end "hex_after_address"


    public static class num_to_end_of_line_return extends ParserRuleReturnScope {
        public String numToEndOfLine;
    };


    // $ANTLR start "num_to_end_of_line"
    // src/com/riis/decompiler/DexToXML.g:901:1: num_to_end_of_line returns [String numToEndOfLine] : (id1= ( DIGIT | IDENT ) )+ NEWLINE ;
    public final DexToXMLParser.num_to_end_of_line_return num_to_end_of_line() throws RecognitionException {
        DexToXMLParser.num_to_end_of_line_return retval = new DexToXMLParser.num_to_end_of_line_return();
        retval.start = input.LT(1);


        Token id1=null;

         retval.numToEndOfLine = ""; 
        try {
            // src/com/riis/decompiler/DexToXML.g:903:2: ( (id1= ( DIGIT | IDENT ) )+ NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:903:4: (id1= ( DIGIT | IDENT ) )+ NEWLINE
            {
            // src/com/riis/decompiler/DexToXML.g:903:4: (id1= ( DIGIT | IDENT ) )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( ((LA112_0 >= DIGIT && LA112_0 <= IDENT)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:903:5: id1= ( DIGIT | IDENT )
            	    {
            	    id1=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	     retval.numToEndOfLine += (id1!=null?id1.getText():null); 

            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);


            match(input,NEWLINE,FOLLOW_NEWLINE_in_num_to_end_of_line4621); 

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
    // $ANTLR end "num_to_end_of_line"



    // $ANTLR start "num_to_slashes"
    // src/com/riis/decompiler/DexToXML.g:906:1: num_to_slashes returns [String numToSlashes] : (id1= ( DIGIT | IDENT ) )+ '//' ;
    public final String num_to_slashes() throws RecognitionException {
        String numToSlashes = null;


        Token id1=null;

         numToSlashes = ""; 
        try {
            // src/com/riis/decompiler/DexToXML.g:908:2: ( (id1= ( DIGIT | IDENT ) )+ '//' )
            // src/com/riis/decompiler/DexToXML.g:908:4: (id1= ( DIGIT | IDENT ) )+ '//'
            {
            // src/com/riis/decompiler/DexToXML.g:908:4: (id1= ( DIGIT | IDENT ) )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0 >= DIGIT && LA113_0 <= IDENT)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:908:5: id1= ( DIGIT | IDENT )
            	    {
            	    id1=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	     numToSlashes += (id1!=null?id1.getText():null); 

            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);


            match(input,18,FOLLOW_18_in_num_to_slashes4656); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return numToSlashes;
    }
    // $ANTLR end "num_to_slashes"



    // $ANTLR start "num_to_dots"
    // src/com/riis/decompiler/DexToXML.g:911:1: num_to_dots : ( DIGIT | IDENT )+ '.' '.' ;
    public final void num_to_dots() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:912:2: ( ( DIGIT | IDENT )+ '.' '.' )
            // src/com/riis/decompiler/DexToXML.g:912:4: ( DIGIT | IDENT )+ '.' '.'
            {
            // src/com/riis/decompiler/DexToXML.g:912:4: ( DIGIT | IDENT )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( ((LA114_0 >= DIGIT && LA114_0 <= IDENT)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:
            	    {
            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
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
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
            } while (true);


            match(input,16,FOLLOW_16_in_num_to_dots4675); 

            match(input,16,FOLLOW_16_in_num_to_dots4676); 

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
    // $ANTLR end "num_to_dots"



    // $ANTLR start "num_to_comma"
    // src/com/riis/decompiler/DexToXML.g:915:1: num_to_comma : ( DIGIT | IDENT )+ ',' ;
    public final void num_to_comma() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:916:2: ( ( DIGIT | IDENT )+ ',' )
            // src/com/riis/decompiler/DexToXML.g:916:4: ( DIGIT | IDENT )+ ','
            {
            // src/com/riis/decompiler/DexToXML.g:916:4: ( DIGIT | IDENT )+
            int cnt115=0;
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( ((LA115_0 >= DIGIT && LA115_0 <= IDENT)) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:
            	    {
            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
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
            	    if ( cnt115 >= 1 ) break loop115;
                        EarlyExitException eee =
                            new EarlyExitException(115, input);
                        throw eee;
                }
                cnt115++;
            } while (true);


            match(input,14,FOLLOW_14_in_num_to_comma4695); 

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
    // $ANTLR end "num_to_comma"



    // $ANTLR start "word_to_end_of_line"
    // src/com/riis/decompiler/DexToXML.g:919:1: word_to_end_of_line returns [String wordToEndOfLine] : (id1= IDENT )+ NEWLINE ;
    public final String word_to_end_of_line() throws RecognitionException {
        String wordToEndOfLine = null;


        Token id1=null;

         wordToEndOfLine = ""; 
        try {
            // src/com/riis/decompiler/DexToXML.g:921:2: ( (id1= IDENT )+ NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:921:4: (id1= IDENT )+ NEWLINE
            {
            // src/com/riis/decompiler/DexToXML.g:921:4: (id1= IDENT )+
            int cnt116=0;
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==IDENT) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:921:5: id1= IDENT
            	    {
            	    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_word_to_end_of_line4720); 

            	     wordToEndOfLine += (id1!=null?id1.getText():null); 

            	    }
            	    break;

            	default :
            	    if ( cnt116 >= 1 ) break loop116;
                        EarlyExitException eee =
                            new EarlyExitException(116, input);
                        throw eee;
                }
                cnt116++;
            } while (true);


            match(input,NEWLINE,FOLLOW_NEWLINE_in_word_to_end_of_line4726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return wordToEndOfLine;
    }
    // $ANTLR end "word_to_end_of_line"



    // $ANTLR start "empty_line"
    // src/com/riis/decompiler/DexToXML.g:924:1: empty_line : LINE_SPLIT NEWLINE ;
    public final void empty_line() throws RecognitionException {
        try {
            // src/com/riis/decompiler/DexToXML.g:925:2: ( LINE_SPLIT NEWLINE )
            // src/com/riis/decompiler/DexToXML.g:925:4: LINE_SPLIT NEWLINE
            {
            match(input,LINE_SPLIT,FOLLOW_LINE_SPLIT_in_empty_line4738); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_empty_line4740); 

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
    // $ANTLR end "empty_line"



    // $ANTLR start "element"
    // src/com/riis/decompiler/DexToXML.g:928:1: element returns [String elementNum] : '[' (id1= ( DIGIT | IDENT ) )+ ']' ;
    public final String element() throws RecognitionException {
        String elementNum = null;


        Token id1=null;

         elementNum = ""; 
        try {
            // src/com/riis/decompiler/DexToXML.g:930:2: ( '[' (id1= ( DIGIT | IDENT ) )+ ']' )
            // src/com/riis/decompiler/DexToXML.g:930:4: '[' (id1= ( DIGIT | IDENT ) )+ ']'
            {
            match(input,24,FOLLOW_24_in_element4761); 

            // src/com/riis/decompiler/DexToXML.g:930:8: (id1= ( DIGIT | IDENT ) )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( ((LA117_0 >= DIGIT && LA117_0 <= IDENT)) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:930:9: id1= ( DIGIT | IDENT )
            	    {
            	    id1=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= IDENT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	     elementNum += (id1!=null?id1.getText():null); 

            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


            match(input,26,FOLLOW_26_in_element4776); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return elementNum;
    }
    // $ANTLR end "element"



    // $ANTLR start "quoted_string"
    // src/com/riis/decompiler/DexToXML.g:933:1: quoted_string returns [String stringContents] : id1= quoted_string_internal ;
    public final String quoted_string() throws RecognitionException {
        String stringContents = null;


        DexToXMLParser.quoted_string_internal_return id1 =null;


        try {
            // src/com/riis/decompiler/DexToXML.g:934:2: (id1= quoted_string_internal )
            // src/com/riis/decompiler/DexToXML.g:934:4: id1= quoted_string_internal
            {
            pushFollow(FOLLOW_quoted_string_internal_in_quoted_string4794);
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
    // src/com/riis/decompiler/DexToXML.g:938:1: quoted_string_internal : '\\\"' (~ '\\\"' )* '\\\"' ;
    public final DexToXMLParser.quoted_string_internal_return quoted_string_internal() throws RecognitionException {
        DexToXMLParser.quoted_string_internal_return retval = new DexToXMLParser.quoted_string_internal_return();
        retval.start = input.LT(1);


        try {
            // src/com/riis/decompiler/DexToXML.g:939:2: ( '\\\"' (~ '\\\"' )* '\\\"' )
            // src/com/riis/decompiler/DexToXML.g:939:4: '\\\"' (~ '\\\"' )* '\\\"'
            {
            match(input,25,FOLLOW_25_in_quoted_string_internal4810); 

            // src/com/riis/decompiler/DexToXML.g:939:9: (~ '\\\"' )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( ((LA118_0 >= ANY_CHAR && LA118_0 <= 24)||(LA118_0 >= 26 && LA118_0 <= 134)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToXML.g:
            	    {
            	    if ( (input.LA(1) >= ANY_CHAR && input.LA(1) <= 24)||(input.LA(1) >= 26 && input.LA(1) <= 134) ) {
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
            	    break loop118;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_quoted_string_internal4818); 

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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA102 dfa102 = new DFA102(this);
    static final String DFA12_eotS =
        "\7\uffff";
    static final String DFA12_eofS =
        "\7\uffff";
    static final String DFA12_minS =
        "\1\7\1\30\3\5\2\uffff";
    static final String DFA12_maxS =
        "\1\7\1\30\1\6\1\32\1\36\2\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\2\3",
            "\2\3\23\uffff\1\4",
            "\2\5\4\uffff\1\5\11\uffff\1\5\2\uffff\1\5\5\uffff\1\6",
            "",
            ""
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
            return "()* loopback of 423:4: ( annotation_set )*";
        }
    }
    static final String DFA16_eotS =
        "\132\uffff";
    static final String DFA16_eofS =
        "\132\uffff";
    static final String DFA16_minS =
        "\2\5\1\uffff\2\5\1\72\1\30\2\5\1\23\2\5\1\7\1\u0083\2\6\1\7\1\171"+
        "\2\5\1\10\1\6\1\10\3\5\1\32\1\10\2\5\1\27\2\5\1\6\2\5\1\10\1\6\2"+
        "\10\1\6\2\5\1\10\1\6\2\10\4\5\1\27\1\5\1\10\1\6\1\10\1\27\1\uffff"+
        "\2\5\1\32\1\10\1\27\1\5\1\6\5\5\1\32\1\10\1\27\2\10\1\6\3\10\1\27"+
        "\1\10\1\6\3\10\1\27\1\5\1\27\2\10";
    static final String DFA16_maxS =
        "\1\7\1\23\1\uffff\1\6\1\7\1\72\1\30\1\6\1\32\1\23\1\6\1\10\1\7\1"+
        "\u0083\1\6\1\10\1\7\1\171\1\30\1\25\1\30\1\6\2\30\2\25\1\32\1\20"+
        "\1\7\1\30\1\27\1\25\1\30\1\6\3\30\1\6\1\30\1\24\1\33\1\30\1\25\1"+
        "\30\1\6\2\30\2\25\1\32\1\30\1\27\1\25\1\30\1\6\1\30\1\27\1\uffff"+
        "\2\25\1\32\1\20\1\27\1\30\1\6\3\30\2\25\1\32\1\10\1\27\2\30\1\6"+
        "\1\30\1\24\1\30\1\27\1\30\1\6\1\30\1\24\1\30\1\27\1\30\1\27\2\30";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\66\uffff\1\1\40\uffff";
    static final String DFA16_specialS =
        "\132\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\1\1\2",
            "\2\1\14\uffff\1\3",
            "",
            "\2\4",
            "\2\4\1\5",
            "\1\6",
            "\1\7",
            "\2\10",
            "\2\10\23\uffff\1\11",
            "\1\12",
            "\2\13",
            "\2\13\1\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\17\1\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\26\1\24\4\uffff\1\27\11\uffff\1\25\2\uffff\1\23",
            "\1\26\1\24\16\uffff\1\25",
            "\1\34\1\uffff\1\30\5\uffff\1\35\1\31\2\uffff\1\33\3\uffff\1"+
            "\32",
            "\1\36",
            "\1\34\1\uffff\1\30\5\uffff\1\35\1\31\2\uffff\1\33\3\uffff\1"+
            "\32",
            "\1\42\1\40\5\uffff\1\43\10\uffff\1\41\2\uffff\1\37",
            "\1\46\1\44\16\uffff\1\45",
            "\1\26\1\24\16\uffff\1\25",
            "\1\47",
            "\1\34\7\uffff\1\35",
            "\2\2\1\50",
            "\1\55\1\53\3\uffff\1\51\12\uffff\1\54\2\uffff\1\52",
            "\1\56",
            "\1\42\1\40\16\uffff\1\41",
            "\1\42\1\40\3\uffff\1\57\1\uffff\1\43\4\uffff\1\60\2\uffff\1"+
            "\62\1\41\2\uffff\1\61",
            "\1\63",
            "\1\42\1\40\3\uffff\1\57\1\uffff\1\43\4\uffff\1\60\2\uffff\1"+
            "\62\1\41\2\uffff\1\61",
            "\1\67\1\65\16\uffff\1\66\2\uffff\1\64",
            "\1\34\1\uffff\1\30\5\uffff\1\35\1\31\2\uffff\1\33\3\uffff\1"+
            "\32",
            "\1\70",
            "\1\34\1\uffff\1\30\5\uffff\1\35\1\31\2\uffff\1\33\3\uffff\1"+
            "\32",
            "\1\34\7\uffff\1\35\3\uffff\1\33",
            "\1\2\1\uffff\1\2\17\uffff\1\2\2\uffff\1\71",
            "\1\55\1\53\16\uffff\1\54\2\uffff\1\52",
            "\1\55\1\53\16\uffff\1\54",
            "\1\34\1\uffff\1\72\5\uffff\1\35\1\73\2\uffff\1\75\3\uffff\1"+
            "\74",
            "\1\76",
            "\1\34\1\uffff\1\72\5\uffff\1\35\1\73\2\uffff\1\75\3\uffff\1"+
            "\74",
            "\1\34\1\uffff\1\30\5\uffff\1\35\1\31\2\uffff\1\33\3\uffff\1"+
            "\32",
            "\1\101\1\77\16\uffff\1\100",
            "\1\42\1\40\16\uffff\1\41",
            "\1\42\1\40\16\uffff\1\41\4\uffff\1\102",
            "\1\42\1\40\5\uffff\1\43\10\uffff\1\41\2\uffff\1\37",
            "\1\103",
            "\1\67\1\65\16\uffff\1\66",
            "\1\34\1\uffff\1\104\6\uffff\1\105\2\uffff\1\107\3\uffff\1\106",
            "\1\110",
            "\1\34\1\uffff\1\104\6\uffff\1\105\2\uffff\1\107\3\uffff\1\106",
            "\1\111",
            "",
            "\1\114\1\112\16\uffff\1\113",
            "\1\55\1\53\16\uffff\1\54",
            "\1\115",
            "\1\34\7\uffff\1\35",
            "\1\116",
            "\1\42\1\40\3\uffff\1\57\1\uffff\1\43\4\uffff\1\60\2\uffff\1"+
            "\62\1\41\2\uffff\1\61",
            "\1\117",
            "\1\42\1\40\3\uffff\1\57\1\uffff\1\43\4\uffff\1\60\2\uffff\1"+
            "\62\1\41\2\uffff\1\61",
            "\1\42\1\40\5\uffff\1\43\7\uffff\1\62\1\41\2\uffff\1\37",
            "\1\42\1\40\3\uffff\1\57\1\uffff\1\43\4\uffff\1\60\2\uffff\1"+
            "\62\1\41\2\uffff\1\61",
            "\1\122\1\120\16\uffff\1\121",
            "\1\67\1\65\16\uffff\1\66",
            "\1\123",
            "\1\34",
            "\1\124",
            "\1\34\1\uffff\1\30\5\uffff\1\35\1\31\2\uffff\1\33\3\uffff\1"+
            "\32",
            "\1\34\1\uffff\1\72\5\uffff\1\35\1\73\2\uffff\1\75\3\uffff\1"+
            "\74",
            "\1\125",
            "\1\34\1\uffff\1\72\5\uffff\1\35\1\73\2\uffff\1\75\3\uffff\1"+
            "\74",
            "\1\34\7\uffff\1\35\3\uffff\1\75",
            "\1\34\1\uffff\1\72\5\uffff\1\35\1\73\2\uffff\1\75\3\uffff\1"+
            "\74",
            "\1\126",
            "\1\34\1\uffff\1\104\6\uffff\1\105\2\uffff\1\107\3\uffff\1\106",
            "\1\127",
            "\1\34\1\uffff\1\104\6\uffff\1\105\2\uffff\1\107\3\uffff\1\106",
            "\1\34\13\uffff\1\107",
            "\1\34\1\uffff\1\104\6\uffff\1\105\2\uffff\1\107\3\uffff\1\106",
            "\1\130",
            "\1\42\1\40\3\uffff\1\57\1\uffff\1\43\4\uffff\1\60\2\uffff\1"+
            "\62\1\41\2\uffff\1\61",
            "\1\131",
            "\1\34\1\uffff\1\72\5\uffff\1\35\1\73\2\uffff\1\75\3\uffff\1"+
            "\74",
            "\1\34\1\uffff\1\104\6\uffff\1\105\2\uffff\1\107\3\uffff\1\106"
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
            return "437:4: ( address hex_after_address 'entries' element ':' num_to_end_of_line LINE_SPLIT 'visibility:' word_to_end_of_line LINE_SPLIT 'type:' proto_type_string NEWLINE LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line LINE_SPLIT IDENT ':' name_type )?";
        }
    }
    static final String DFA20_eotS =
        "\7\uffff";
    static final String DFA20_eofS =
        "\7\uffff";
    static final String DFA20_minS =
        "\1\7\1\30\3\5\2\uffff";
    static final String DFA20_maxS =
        "\1\7\1\30\1\6\1\32\1\176\2\uffff";
    static final String DFA20_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\7\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\2",
            "\2\3",
            "\2\3\23\uffff\1\4",
            "\2\6\4\uffff\1\6\11\uffff\1\6\2\uffff\1\6\6\uffff\1\5\136\uffff"+
            "\1\5",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()+ loopback of 458:4: ( code_item )+";
        }
    }
    static final String DFA27_eotS =
        "\21\uffff";
    static final String DFA27_eofS =
        "\21\uffff";
    static final String DFA27_minS =
        "\4\5\2\uffff\4\5\3\4\1\uffff\2\4\1\uffff";
    static final String DFA27_maxS =
        "\1\7\1\23\1\166\1\6\2\uffff\1\7\1\135\1\23\1\6\3\u0086\1\uffff\2"+
        "\u0086\1\uffff";
    static final String DFA27_acceptS =
        "\4\uffff\1\3\1\1\7\uffff\1\2\2\uffff\1\1";
    static final String DFA27_specialS =
        "\21\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\1\1\2",
            "\2\1\14\uffff\1\3",
            "\2\5\1\uffff\1\4\6\uffff\1\5\41\uffff\1\4\104\uffff\1\4",
            "\2\6",
            "",
            "",
            "\2\6\1\7",
            "\2\10\1\uffff\1\4\6\uffff\1\5\115\uffff\1\4",
            "\2\10\14\uffff\1\11",
            "\1\5\1\12",
            "\1\15\2\14\13\15\1\13\164\15",
            "\11\15\1\16\171\15",
            "\1\15\2\14\13\15\1\13\164\15",
            "",
            "\1\15\2\17\u0080\15",
            "\1\15\2\17\1\15\1\20\176\15",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()+ loopback of 494:4: ( ignore_instruction | good_instruction )+";
        }
    }
    static final String DFA28_eotS =
        "\10\uffff";
    static final String DFA28_eofS =
        "\10\uffff";
    static final String DFA28_minS =
        "\2\5\1\10\1\5\2\uffff\1\5\1\10";
    static final String DFA28_maxS =
        "\1\7\1\23\1\166\1\6\2\uffff\1\7\1\135";
    static final String DFA28_acceptS =
        "\4\uffff\1\1\1\2\2\uffff";
    static final String DFA28_specialS =
        "\10\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\1\1\2",
            "\2\1\14\uffff\1\3",
            "\1\5\50\uffff\1\5\104\uffff\1\4",
            "\2\6",
            "",
            "",
            "\2\6\1\7",
            "\1\5\124\uffff\1\4"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "495:4: ( try_block )?";
        }
    }
    static final String DFA35_eotS =
        "\6\uffff";
    static final String DFA35_eofS =
        "\6\uffff";
    static final String DFA35_minS =
        "\2\5\1\uffff\2\5\1\uffff";
    static final String DFA35_maxS =
        "\1\7\1\17\1\uffff\1\23\1\121\1\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA35_specialS =
        "\6\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\2\1\1",
            "\2\3\10\uffff\1\2",
            "",
            "\2\3\14\uffff\1\4",
            "\2\2\45\uffff\1\5\43\uffff\2\5",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "504:1: ignore_instruction : ( LINE_SPLIT address ( 'code-address' | 'local-snapshot' | 'local-start' ) ( . )* NEWLINE ( LINE_SPLIT IDENT ( . )* NEWLINE )* | ( LINE_SPLIT | address hex_after_address ) ( '-' )? address num_to_slashes '+' num_to_end_of_line );";
        }
    }
    static final String DFA32_eotS =
        "\17\uffff";
    static final String DFA32_eofS =
        "\17\uffff";
    static final String DFA32_minS =
        "\1\5\1\uffff\1\5\1\4\1\uffff\4\4\1\uffff\4\4\1\uffff";
    static final String DFA32_maxS =
        "\1\7\1\uffff\1\166\1\u0086\1\uffff\4\u0086\1\uffff\4\u0086\1\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\4\uffff\1\1\4\uffff\1\1";
    static final String DFA32_specialS =
        "\17\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\1\1\2",
            "",
            "\1\1\1\3\1\uffff\1\1\6\uffff\1\1\41\uffff\1\1\104\uffff\1\1",
            "\1\4\2\6\14\4\1\5\163\4",
            "",
            "\1\4\2\10\45\4\1\7\43\4\2\7\65\4",
            "\1\4\2\6\14\4\1\5\163\4",
            "\4\12\1\11\176\12",
            "\1\11\2\10\1\11\1\4\11\11\1\13\164\11",
            "",
            "\4\12\1\11\176\12",
            "\4\11\1\4\4\11\1\14\171\11",
            "\1\11\2\15\1\11\1\4\176\11",
            "\1\16\2\15\u0080\16",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 506:3: ( LINE_SPLIT IDENT ( . )* NEWLINE )*";
        }
    }
    static final String DFA39_eotS =
        "\5\uffff";
    static final String DFA39_eofS =
        "\5\uffff";
    static final String DFA39_minS =
        "\2\4\1\uffff\1\4\1\uffff";
    static final String DFA39_maxS =
        "\2\u0086\1\uffff\1\u0086\1\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA39_specialS =
        "\5\uffff}>";
    static final String[] DFA39_transitionS = {
            "\15\2\1\1\165\2",
            "\1\2\1\3\1\4\u0080\2",
            "",
            "\1\2\1\3\1\4\u0080\2",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "515:23: ( '/' ( DIGIT )* IDENT )?";
        }
    }
    static final String DFA42_eotS =
        "\7\uffff";
    static final String DFA42_eofS =
        "\7\uffff";
    static final String DFA42_minS =
        "\1\5\1\uffff\4\5\1\uffff";
    static final String DFA42_maxS =
        "\1\7\1\uffff\1\23\1\6\1\7\1\10\1\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\4\uffff\1\1";
    static final String DFA42_specialS =
        "\7\uffff}>";
    static final String[] DFA42_transitionS = {
            "\2\2\1\1",
            "",
            "\2\2\14\uffff\1\3",
            "\2\4",
            "\2\4\1\5",
            "\2\6\1\uffff\1\1",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()+ loopback of 524:4: ( handler )+";
        }
    }
    static final String DFA43_eotS =
        "\4\uffff";
    static final String DFA43_eofS =
        "\4\uffff";
    static final String DFA43_minS =
        "\2\5\2\uffff";
    static final String DFA43_maxS =
        "\1\6\1\16\2\uffff";
    static final String DFA43_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA43_specialS =
        "\4\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\1",
            "\2\1\1\uffff\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "529:64: ( num_to_comma NEWLINE | num_to_end_of_line )";
        }
    }
    static final String DFA44_eotS =
        "\4\uffff";
    static final String DFA44_eofS =
        "\4\uffff";
    static final String DFA44_minS =
        "\2\5\2\uffff";
    static final String DFA44_maxS =
        "\1\6\1\16\2\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA44_specialS =
        "\4\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\1",
            "\2\1\1\uffff\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "530:42: ( num_to_comma NEWLINE | num_to_end_of_line )";
        }
    }
    static final String DFA46_eotS =
        "\4\uffff";
    static final String DFA46_eofS =
        "\4\uffff";
    static final String DFA46_minS =
        "\2\5\2\uffff";
    static final String DFA46_maxS =
        "\1\6\1\16\2\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA46_specialS =
        "\4\uffff}>";
    static final String[] DFA46_transitionS = {
            "\2\1",
            "\2\1\1\uffff\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "534:72: ( num_to_comma NEWLINE | num_to_end_of_line )";
        }
    }
    static final String DFA49_eotS =
        "\12\uffff";
    static final String DFA49_eofS =
        "\12\uffff";
    static final String DFA49_minS =
        "\3\5\2\uffff\5\5";
    static final String DFA49_maxS =
        "\1\7\1\61\1\23\2\uffff\1\6\1\7\3\30";
    static final String DFA49_acceptS =
        "\3\uffff\1\2\1\1\5\uffff";
    static final String DFA49_specialS =
        "\12\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\2\1\1",
            "\2\4\1\uffff\1\3\2\uffff\1\4\11\uffff\1\4\2\uffff\1\4\30\uffff"+
            "\1\3",
            "\2\2\14\uffff\1\5",
            "",
            "",
            "\2\6",
            "\2\6\1\7",
            "\1\11\1\10\1\uffff\1\3\2\uffff\1\4\11\uffff\1\4\2\uffff\1\4",
            "\2\3\3\uffff\1\4\4\uffff\3\4\1\uffff\1\3\1\4\3\uffff\1\4",
            "\2\3\3\uffff\1\4\4\uffff\3\4\1\uffff\1\3\1\4\3\uffff\1\4"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 535:4: ( ( ( address hex_after_address ) | LINE_SPLIT ) proto_type_string '-' '>' ( num_to_comma NEWLINE | num_to_end_of_line ) )*";
        }
    }
    static final String DFA48_eotS =
        "\4\uffff";
    static final String DFA48_eofS =
        "\4\uffff";
    static final String DFA48_minS =
        "\2\5\2\uffff";
    static final String DFA48_maxS =
        "\1\6\1\16\2\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA48_specialS =
        "\4\uffff}>";
    static final String[] DFA48_transitionS = {
            "\2\1",
            "\2\1\1\uffff\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "535:74: ( num_to_comma NEWLINE | num_to_end_of_line )";
        }
    }
    static final String DFA53_eotS =
        "\7\uffff";
    static final String DFA53_eofS =
        "\7\uffff";
    static final String DFA53_minS =
        "\1\7\1\30\2\5\1\37\2\uffff";
    static final String DFA53_maxS =
        "\1\7\1\30\1\6\1\32\1\176\2\uffff";
    static final String DFA53_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA53_specialS =
        "\7\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1",
            "\1\2",
            "\2\3",
            "\2\3\23\uffff\1\4",
            "\1\6\136\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 548:4: ( annotations_directory )*";
        }
    }
    static final String DFA63_eotS =
        "\7\uffff";
    static final String DFA63_eofS =
        "\7\uffff";
    static final String DFA63_minS =
        "\1\7\1\30\2\5\1\6\2\uffff";
    static final String DFA63_maxS =
        "\1\7\1\30\1\6\1\32\1\67\2\uffff";
    static final String DFA63_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA63_specialS =
        "\7\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1",
            "\1\2",
            "\2\3",
            "\2\3\23\uffff\1\4",
            "\1\5\35\uffff\1\5\14\uffff\1\6\5\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()* loopback of 616:4: ( byte_data )*";
        }
    }
    static final String DFA64_eotS =
        "\7\uffff";
    static final String DFA64_eofS =
        "\7\uffff";
    static final String DFA64_minS =
        "\5\5\2\uffff";
    static final String DFA64_maxS =
        "\1\6\1\23\1\6\1\7\1\136\2\uffff";
    static final String DFA64_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA64_specialS =
        "\7\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\1",
            "\2\1\14\uffff\1\2",
            "\2\3",
            "\2\3\1\4",
            "\2\5\127\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "()* loopback of 623:4: ( address hex_after_address 'parameter' param NEWLINE )*";
        }
    }
    static final String DFA68_eotS =
        "\7\uffff";
    static final String DFA68_eofS =
        "\7\uffff";
    static final String DFA68_minS =
        "\5\5\2\uffff";
    static final String DFA68_maxS =
        "\1\6\1\23\1\6\1\7\1\113\2\uffff";
    static final String DFA68_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA68_specialS =
        "\7\uffff}>";
    static final String[] DFA68_transitionS = {
            "\2\1",
            "\2\1\14\uffff\1\2",
            "\2\3",
            "\2\3\1\4",
            "\2\6\61\uffff\1\5\22\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "()* loopback of 625:4: ( address hex_after_address ( address )? 'line' ( '=' )? num_to_end_of_line ( address hex_after_address address 'advance pc' NEWLINE )? )*";
        }
    }
    static final String DFA67_eotS =
        "\11\uffff";
    static final String DFA67_eofS =
        "\11\uffff";
    static final String DFA67_minS =
        "\6\5\1\uffff\1\35\1\uffff";
    static final String DFA67_maxS =
        "\1\6\1\23\1\6\1\7\1\113\1\23\1\uffff\1\113\1\uffff";
    static final String DFA67_acceptS =
        "\6\uffff\1\2\1\uffff\1\1";
    static final String DFA67_specialS =
        "\11\uffff}>";
    static final String[] DFA67_transitionS = {
            "\2\1",
            "\2\1\14\uffff\1\2",
            "\2\3",
            "\2\3\1\4",
            "\2\5\61\uffff\1\6\22\uffff\1\6",
            "\2\5\14\uffff\1\7",
            "",
            "\1\10\55\uffff\1\6",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "626:5: ( address hex_after_address address 'advance pc' NEWLINE )?";
        }
    }
    static final String DFA74_eotS =
        "\7\uffff";
    static final String DFA74_eofS =
        "\7\uffff";
    static final String DFA74_minS =
        "\1\7\1\30\2\5\1\6\2\uffff";
    static final String DFA74_maxS =
        "\1\7\1\30\1\6\1\32\1\67\2\uffff";
    static final String DFA74_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA74_specialS =
        "\7\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1",
            "\1\2",
            "\2\3",
            "\2\3\23\uffff\1\4",
            "\1\6\35\uffff\1\5\22\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "()* loopback of 640:4: ( annotation )*";
        }
    }
    static final String DFA78_eotS =
        "\16\uffff";
    static final String DFA78_eofS =
        "\16\uffff";
    static final String DFA78_minS =
        "\4\5\1\6\1\23\1\6\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String DFA78_maxS =
        "\1\6\1\23\1\6\1\7\1\6\1\23\1\6\1\u0085\2\uffff\1\30\1\uffff\1\30"+
        "\1\uffff";
    static final String DFA78_acceptS =
        "\10\uffff\1\2\1\4\1\uffff\1\3\1\uffff\1\1";
    static final String DFA78_specialS =
        "\16\uffff}>";
    static final String[] DFA78_transitionS = {
            "\2\1",
            "\2\1\14\uffff\1\2",
            "\2\3",
            "\2\3\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\14\1\12\1\uffff\1\10\2\uffff\1\13\11\uffff\1\13\2\uffff"+
            "\1\13\154\uffff\1\11",
            "",
            "",
            "\2\15\1\uffff\1\15\1\uffff\1\13\5\uffff\2\13\1\uffff\2\13\3"+
            "\uffff\1\13",
            "",
            "\2\15\1\uffff\1\15\1\uffff\1\13\5\uffff\2\13\1\uffff\2\13\3"+
            "\uffff\1\13",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "657:4: ( address hex_after_address IDENT ':' IDENT num_to_end_of_line | address hex_after_address IDENT ':' IDENT NEWLINE | address hex_after_address IDENT ':' IDENT proto_type_string ( ':' proto_type_string )? NEWLINE | address hex_after_address IDENT ':' IDENT '{' (~ '}' )+ '}' NEWLINE )";
        }
    }
    static final String DFA80_eotS =
        "\7\uffff";
    static final String DFA80_eofS =
        "\7\uffff";
    static final String DFA80_minS =
        "\1\7\1\30\2\5\1\44\2\uffff";
    static final String DFA80_maxS =
        "\1\7\1\30\1\6\1\32\1\67\2\uffff";
    static final String DFA80_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA80_specialS =
        "\7\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\1",
            "\1\2",
            "\2\3",
            "\2\3\23\uffff\1\4",
            "\1\5\22\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()* loopback of 670:4: ( encoded_array )*";
        }
    }
    static final String DFA100_eotS =
        "\24\uffff";
    static final String DFA100_eofS =
        "\24\uffff";
    static final String DFA100_minS =
        "\3\5\1\6\1\5\1\uffff\4\5\2\uffff\1\27\1\5\1\6\3\5\1\27\1\5";
    static final String DFA100_maxS =
        "\1\30\1\25\1\142\1\6\1\142\1\uffff\2\25\1\32\1\142\2\uffff\1\27"+
        "\1\142\1\6\3\142\1\27\1\142";
    static final String DFA100_acceptS =
        "\5\uffff\1\3\4\uffff\1\1\1\2\10\uffff";
    static final String DFA100_specialS =
        "\24\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\4\1\2\4\uffff\1\5\11\uffff\1\3\2\uffff\1\1",
            "\1\4\1\2\16\uffff\1\3",
            "\2\12\1\uffff\1\12\1\uffff\1\6\2\12\1\uffff\2\12\1\13\1\7\1"+
            "\uffff\1\12\1\11\1\12\2\uffff\1\10\111\uffff\1\12",
            "\1\14",
            "\2\12\1\uffff\1\12\1\uffff\1\6\2\12\1\uffff\2\12\1\13\1\7\1"+
            "\uffff\1\12\1\11\1\12\2\uffff\1\10\111\uffff\1\12",
            "",
            "\1\17\1\15\16\uffff\1\16",
            "\1\4\1\2\16\uffff\1\3",
            "\2\12\16\uffff\1\12\4\uffff\1\20",
            "\2\12\1\uffff\1\12\2\uffff\2\12\1\uffff\2\12\1\13\2\uffff\1"+
            "\12\1\uffff\1\12\2\uffff\1\12\111\uffff\1\12",
            "",
            "",
            "\1\21",
            "\2\12\1\uffff\1\12\1\uffff\1\6\2\12\1\uffff\2\12\1\13\1\7\1"+
            "\uffff\1\12\1\11\1\12\2\uffff\1\10\111\uffff\1\12",
            "\1\22",
            "\2\12\1\uffff\1\12\1\uffff\1\6\2\12\1\uffff\2\12\1\13\1\7\1"+
            "\uffff\1\12\1\11\1\12\2\uffff\1\10\111\uffff\1\12",
            "\2\12\1\uffff\1\12\2\uffff\2\12\1\uffff\2\12\1\13\2\uffff\1"+
            "\12\1\11\1\12\2\uffff\1\12\111\uffff\1\12",
            "\2\12\1\uffff\1\12\1\uffff\1\6\2\12\1\uffff\2\12\1\13\1\7\1"+
            "\uffff\1\12\1\11\1\12\2\uffff\1\10\111\uffff\1\12",
            "\1\23",
            "\2\12\1\uffff\1\12\1\uffff\1\6\2\12\1\uffff\2\12\1\13\1\7\1"+
            "\uffff\1\12\1\11\1\12\2\uffff\1\10\111\uffff\1\12"
    };

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "868:1: proto_type_string : ( proto_type_package | proto_type_package ( '.' ( '$' )? proto_type_package )+ | '(' ( proto_type_package )* ')' proto_type_package );";
        }
    }
    static final String DFA102_eotS =
        "\16\uffff";
    static final String DFA102_eofS =
        "\16\uffff";
    static final String DFA102_minS =
        "\2\5\1\6\2\5\2\uffff\1\27\1\5\1\6\2\5\1\27\1\5";
    static final String DFA102_maxS =
        "\1\25\1\142\1\6\1\142\1\25\2\uffff\1\27\1\142\1\6\2\142\1\27\1\142";
    static final String DFA102_acceptS =
        "\5\uffff\1\2\1\1\7\uffff";
    static final String DFA102_specialS =
        "\16\uffff}>";
    static final String[] DFA102_transitionS = {
            "\1\3\1\1\16\uffff\1\2",
            "\2\5\1\uffff\1\5\1\uffff\1\4\2\5\1\uffff\3\5\1\6\1\uffff\3"+
            "\5\2\uffff\1\5\111\uffff\1\5",
            "\1\7",
            "\2\5\1\uffff\1\5\1\uffff\1\4\2\5\1\uffff\3\5\1\6\1\uffff\3"+
            "\5\2\uffff\1\5\111\uffff\1\5",
            "\1\12\1\10\16\uffff\1\11",
            "",
            "",
            "\1\13",
            "\2\5\1\uffff\1\5\1\uffff\1\4\2\5\1\uffff\3\5\1\6\1\uffff\3"+
            "\5\2\uffff\1\5\111\uffff\1\5",
            "\1\14",
            "\2\5\1\uffff\1\5\1\uffff\1\4\2\5\1\uffff\3\5\1\6\1\uffff\3"+
            "\5\2\uffff\1\5\111\uffff\1\5",
            "\2\5\1\uffff\1\5\1\uffff\1\4\2\5\1\uffff\3\5\1\6\1\uffff\3"+
            "\5\2\uffff\1\5\111\uffff\1\5",
            "\1\15",
            "\2\5\1\uffff\1\5\1\uffff\1\4\2\5\1\uffff\3\5\1\6\1\uffff\3"+
            "\5\2\uffff\1\5\111\uffff\1\5"
    };

    static final short[] DFA102_eot = DFA.unpackEncodedString(DFA102_eotS);
    static final short[] DFA102_eof = DFA.unpackEncodedString(DFA102_eofS);
    static final char[] DFA102_min = DFA.unpackEncodedStringToUnsignedChars(DFA102_minS);
    static final char[] DFA102_max = DFA.unpackEncodedStringToUnsignedChars(DFA102_maxS);
    static final short[] DFA102_accept = DFA.unpackEncodedString(DFA102_acceptS);
    static final short[] DFA102_special = DFA.unpackEncodedString(DFA102_specialS);
    static final short[][] DFA102_transition;

    static {
        int numStates = DFA102_transitionS.length;
        DFA102_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA102_transition[i] = DFA.unpackEncodedString(DFA102_transitionS[i]);
        }
    }

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = DFA102_eot;
            this.eof = DFA102_eof;
            this.min = DFA102_min;
            this.max = DFA102_max;
            this.accept = DFA102_accept;
            this.special = DFA102_special;
            this.transition = DFA102_transition;
        }
        public String getDescription() {
            return "()* loopback of 875:9: ( class_ident '/' )*";
        }
    }
 

    public static final BitSet FOLLOW_header_in_rule66 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_string_ids_block_in_rule78 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_type_ids_block_in_rule83 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_proto_ids_block_in_rule88 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_ids_block_in_rule93 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_method_ids_block_in_rule98 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_class_defs_block_in_rule103 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_annotation_set_block_in_rule112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_code_items_block_in_rule121 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_annotations_directory_block_in_rule127 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_type_list_block_in_rule132 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_string_data_block_in_rule137 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_byte_data_block_in_rule142 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_annotations_block_in_rule147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_encoded_array_block_in_rule152 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_class_data_block_in_rule161 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_map_block_in_rule170 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_method_code_index_block_in_rule175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signature_block_in_header205 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_pointer_block_in_header210 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_header215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_magic_in_signature_block232 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_checksum_in_signature_block237 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_signature_in_signature_block242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_magic253 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_magic255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_magic257 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_quoted_string_in_magic261 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_magic263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_checksum279 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_checksum283 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_checksum285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_checksum287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_signature303 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_signature307 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_signature309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_signature311 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_signature316 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_signature320 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_signature322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_size_in_pointer_block342 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_header_size_in_pointer_block347 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_endian_tag_in_pointer_block352 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_link_size_in_pointer_block357 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_link_offset_in_pointer_block362 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_map_offset_in_pointer_block367 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_string_ids_size_in_pointer_block372 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_string_ids_offset_in_pointer_block377 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_type_ids_size_in_pointer_block382 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_type_ids_offset_in_pointer_block387 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_proto_ids_size_in_pointer_block392 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_proto_ids_offset_in_pointer_block397 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_field_ids_size_in_pointer_block402 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_field_ids_offset_in_pointer_block407 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_method_ids_size_in_pointer_block412 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_method_ids_offset_in_pointer_block417 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_class_defs_size_in_pointer_block422 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_class_defs_offset_in_pointer_block427 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_data_size_in_pointer_block432 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_data_offset_in_pointer_block437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_file_size449 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_file_size451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_file_size453 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_file_size457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_header_size473 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_header_size475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_header_size477 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_header_size481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_endian_tag497 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_endian_tag499 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_endian_tag501 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_endian_tag505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_link_size521 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_link_size523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_link_size525 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_link_size529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_link_offset545 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_link_offset547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_link_offset549 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_link_offset553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_map_offset569 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_map_offset571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_map_offset573 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_map_offset577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_string_ids_size593 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_string_ids_size595 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_string_ids_size597 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_string_ids_size601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_string_ids_offset617 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_string_ids_offset619 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_string_ids_offset621 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_string_ids_offset625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_type_ids_size641 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_type_ids_size643 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_type_ids_size645 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_type_ids_size649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_type_ids_offset665 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_type_ids_offset667 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_type_ids_offset669 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_type_ids_offset673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_proto_ids_size689 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_proto_ids_size691 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_proto_ids_size693 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_proto_ids_size697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_proto_ids_offset713 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_proto_ids_offset715 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_proto_ids_offset717 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_proto_ids_offset721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_field_ids_size737 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_ids_size739 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_field_ids_size741 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_ids_size745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_field_ids_offset761 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_ids_offset763 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_field_ids_offset765 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_ids_offset769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_method_ids_size784 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_ids_size786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_method_ids_size788 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_ids_size792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_method_ids_offset808 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_ids_offset810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_method_ids_offset812 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_ids_offset816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_class_defs_size831 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_defs_size833 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_class_defs_size835 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_defs_size839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_class_defs_offset854 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_defs_offset856 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_class_defs_offset858 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_defs_offset862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_data_size877 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_data_size879 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_data_size881 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_data_size885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_data_offset900 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_data_offset902 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_data_offset904 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_data_offset908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_string_ids_block943 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_string_ids_block945 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_string_ids_block947 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_string_id_in_string_ids_block953 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_string_ids_block965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_string_id978 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_string_id982 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_quoted_string_in_string_id986 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_string_id988 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_string_id993 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_string_id995 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_string_id997 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_string_id1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_type_ids_block1036 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_type_ids_block1038 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_type_ids_block1040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_type_id_in_type_ids_block1046 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_type_ids_block1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_type_id1071 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_type_id1075 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_type_id1079 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_type_id1081 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_type_id1086 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_type_id1088 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_type_id1090 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_type_id1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_proto_ids_block1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_proto_ids_block1131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_proto_ids_block1133 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_proto_id_in_proto_ids_block1139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_proto_ids_block1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_proto_id1164 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_proto_id1168 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_proto_id1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_proto_id1172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_proto_id1174 = new BitSet(new long[]{0x0000000001205860L});
    public static final BitSet FOLLOW_14_in_proto_id1177 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_proto_id1180 = new BitSet(new long[]{0x0000000001205860L});
    public static final BitSet FOLLOW_12_in_proto_id1184 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_proto_id1186 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_proto_id1191 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_proto_id1193 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_proto_id1195 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_proto_id1197 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_quoted_string_in_proto_id1201 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_proto_id1203 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_proto_id1208 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_proto_id1210 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_proto_id1212 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_proto_id1214 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_proto_id1218 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_proto_id1220 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_proto_id1226 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_proto_id1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_proto_id1230 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_proto_id1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_field_ids_block1268 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_field_ids_block1270 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_field_ids_block1272 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_id_in_field_ids_block1278 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_field_ids_block1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_field_id1302 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_field_id1306 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_field_id1310 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_field_id1312 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_field_id1316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_field_id1318 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_field_id1323 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_id1325 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_field_id1327 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_id1329 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_field_id1334 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_id1336 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_field_id1338 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_id1340 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_field_id1345 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_id1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_field_id1349 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_id1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_method_ids_block1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_method_ids_block1391 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_method_ids_block1393 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_method_id_in_method_ids_block1399 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_method_ids_block1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_method_id1424 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_method_id1428 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_method_id1432 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_DIGIT_in_method_id1434 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_method_id1437 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_method_id1441 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_method_id1443 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_method_id1448 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_id1450 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_method_id1452 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_id1454 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_method_id1459 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_id1461 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_method_id1463 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_id1465 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_method_id1470 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_id1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_method_id1474 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_id1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_class_defs_block1514 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_class_defs_block1516 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_defs_block1518 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_class_def_in_class_defs_block1524 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_class_defs_block1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_class_def1547 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_class_def1551 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_class_def1555 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_def1557 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1561 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1563 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_class_def1565 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_def1569 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1573 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1575 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_class_def1577 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_access_modifiers_with_nums_in_class_def1581 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1585 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1587 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_class_def1589 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_class_def1591 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_class_def1595 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_def1597 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1601 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_class_def1605 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_def1609 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_class_def1614 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_class_def1616 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_def1618 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_address_in_class_def1624 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1626 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_class_def1628 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_class_def1630 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_class_def1634 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_def1636 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1640 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1642 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_class_def1644 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_def1648 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1652 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1654 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_class_def1656 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_def1660 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_def1664 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_def1666 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_class_def1668 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_def1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_modifiers_in_access_modifiers_with_nums1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_access_modifiers_with_nums1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set_block1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_annotation_set_block1709 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_set_block1711 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_annotation_set_in_annotation_set_block1716 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1729 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_annotation_set1731 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_annotation_set1733 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_set1735 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation_set1740 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_set1742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1744 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_set1746 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotation_set1748 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation_set1757 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_set1759 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_annotation_set1761 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_annotation_set1763 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_set1765 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotation_set1767 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_annotation_set1774 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_to_end_of_line_in_annotation_set1776 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1781 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_annotation_set1783 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation_set1785 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_set1787 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1797 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_set1799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1801 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation_set1803 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_19_in_annotation_set1806 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation_set1808 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_set1812 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1820 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_set1824 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_annotation_set1828 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_134_in_annotation_set1836 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_set1838 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_address_in_annotation_set1851 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_set1853 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_annotation_set1855 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_annotation_set1857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_set1859 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotation_set1861 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_annotation_set1868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_to_end_of_line_in_annotation_set1870 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1875 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_annotation_set1877 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation_set1879 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_set1881 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1886 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_annotation_set1888 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1890 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotation_set1892 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_set1897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_set1899 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_set1901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_name_type_in_annotation_set1903 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_empty_line_in_annotation_set1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_name_type1929 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_word_to_end_of_line_in_name_type1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_name_type1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_item_in_code_items_block1969 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_code_item1996 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_code_item1998 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_code_item2002 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_DIGIT_in_code_item2004 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_code_item2007 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_code_item2009 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_code_item2011 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_code_item2016 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2018 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_code_item2020 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_code_item2024 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_code_item2029 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_code_item2033 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_code_item2037 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_code_item2042 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_code_item2046 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_code_item2050 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_code_item2055 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2057 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_code_item2059 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_code_item2063 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_code_item2068 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2070 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_code_item2072 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_code_item2076 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_code_item2081 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_code_item2085 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_code_item2089 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_code_item2107 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_code_item2109 = new BitSet(new long[]{0x0000000001204860L});
    public static final BitSet FOLLOW_14_in_code_item2112 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_code_item2115 = new BitSet(new long[]{0x0000000001204960L});
    public static final BitSet FOLLOW_NEWLINE_in_code_item2119 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_bytecode_in_code_item2127 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_address_in_code_item2134 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_code_item2138 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_code_item2145 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_code_item2151 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_code_item2153 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_code_item2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignore_instruction_in_bytecode2185 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_good_instruction_in_bytecode2189 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_try_block_in_bytecode2196 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_debug_info_in_bytecode2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_good_instruction2215 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_good_instruction2217 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_good_instruction2219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_instruction_in_good_instruction2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_ignore_instruction2239 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_ignore_instruction2241 = new BitSet(new long[]{0x0000100000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_ignore_instruction2243 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_NEWLINE_in_ignore_instruction2254 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_ignore_instruction2259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_ignore_instruction2261 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_NEWLINE_in_ignore_instruction2266 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_ignore_instruction2274 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_address_in_ignore_instruction2278 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_ignore_instruction2280 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_15_in_ignore_instruction2283 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_ignore_instruction2286 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_ignore_instruction2288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ignore_instruction2290 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_ignore_instruction2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_ident_in_instruction2303 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_NEWLINE_in_instruction2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_instruction_ident2320 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_15_in_instruction_ident2323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_instruction_ident2325 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_17_in_instruction_ident2330 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_DIGIT_in_instruction_ident2332 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_IDENT_in_instruction_ident2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_address_in_try_block2350 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_try_block2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_try_block2354 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_try_block2356 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_try_block2358 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_try_block2365 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_try_block2367 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_try_block2369 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_try_block2371 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_try_piece_in_try_block2376 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_try_block2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_try_block2384 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_try_block2386 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_try_block2388 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_try_block2393 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_try_block2395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_try_block2397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_try_block2399 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_try_block2401 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_handler_in_try_block2406 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_try_piece2419 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_try_piece2421 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_try_piece2423 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_dots_in_try_piece2425 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_try_piece2427 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_try_piece2432 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_try_piece2434 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_try_piece2436 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_try_piece2438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_try_piece2440 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_try_piece2442 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_comma_in_try_piece2445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_try_piece2447 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_try_piece2451 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_try_piece2458 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_try_piece2460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_try_piece2462 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_try_piece2464 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_comma_in_try_piece2467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_try_piece2469 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_try_piece2473 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_address_in_handler2488 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_handler2490 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_handler2492 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_handler2494 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_handler2496 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_handler2498 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_handler2500 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_comma_in_handler2503 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_handler2505 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_handler2509 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_address_in_handler2518 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_handler2520 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_handler2525 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_handler2528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_handler2530 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_handler2532 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_comma_in_handler2535 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_handler2537 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_handler2541 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_debug_info2569 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_debug_info2571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_debug_info2573 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_debug_info2576 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_NEWLINE_in_debug_info2581 = new BitSet(new long[]{0x0100000000000080L});
    public static final BitSet FOLLOW_56_in_debug_info2586 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_debug_info2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_directory_in_annotations_directory_block2603 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotations_directory2616 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_annotations_directory2618 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_annotations_directory2620 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotations_directory2622 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotations_directory2627 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotations_directory2629 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_annotations_directory2631 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotations_directory2633 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotations_directory2638 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotations_directory2640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_annotations_directory2642 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotations_directory2644 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotations_directory2649 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotations_directory2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_annotations_directory2653 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotations_directory2655 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotations_directory2660 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotations_directory2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_annotations_directory2664 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotations_directory2666 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_annotations_in_annotations_directory2675 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_method_annotations_in_annotations_directory2681 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_annotations_directory2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_method_annotations2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_method_annotations2704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_method_annotations2706 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_method_annotations2711 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_method_annotations2713 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_method_annotations2715 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_method_annotations2717 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_method_annotations2719 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_method_annotations2724 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_annotations2726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_method_annotations2728 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_annotations2730 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_method_annotations2735 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_method_annotations2737 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_method_annotations2739 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_method_annotations2741 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_field_annotations2754 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_field_annotations2756 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_field_annotations2758 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_field_annotations2763 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_field_annotations2765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_field_annotations2767 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_field_annotations2769 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_field_annotations2771 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_field_annotations2776 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_annotations2778 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_field_annotations2780 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_annotations2782 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_field_annotations2787 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_field_annotations2789 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_field_annotations2791 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_field_annotations2793 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_type_list_in_type_list_block2810 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_type_list2823 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_type_list2825 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_type_list2827 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_type_list2829 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_type_list2834 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_type_list2836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_type_list2838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_type_list2840 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_type_list2842 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_type_list2848 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_type_list2850 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_type_list2852 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_type_list2854 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_type_list2856 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_empty_line_in_type_list2863 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_type_list2869 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_type_list2871 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_type_list2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_string_data_block2891 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_string_data_block2893 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_string_data_block2895 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_string_data_in_string_data_block2900 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_string_data2913 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_string_data2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_string_data2917 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_string_data2919 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_string_data2924 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_string_data2926 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_quoted_string_in_string_data2928 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_string_data2930 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_address_in_string_data2936 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_string_data2938 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_string_data2940 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_empty_line_in_string_data2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_byte_data_block2963 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_byte_data_block2965 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_byte_data_block2967 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_byte_data_in_byte_data_block2972 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_byte_data2985 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_byte_data2987 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_byte_data2989 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_byte_data2991 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data2996 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data2998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_byte_data3000 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_byte_data3002 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3007 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_byte_data3011 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_byte_data3013 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3019 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data3021 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_byte_data3023 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_param_in_byte_data3025 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_byte_data3027 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3034 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data3036 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3038 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_byte_data3040 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_byte_data3042 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3048 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data3050 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000800L});
    public static final BitSet FOLLOW_address_in_byte_data3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_byte_data3055 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_22_in_byte_data3057 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_byte_data3060 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3067 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data3069 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3071 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_byte_data3073 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_byte_data3075 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_byte_data3084 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_byte_data3086 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_byte_data3088 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_byte_data3090 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_byte_data3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_param3107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_param3110 = new BitSet(new long[]{0x0000000000800042L});
    public static final BitSet FOLLOW_23_in_param3113 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_param3117 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_annotation_in_annotations_block3137 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation3150 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_annotation3152 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation3154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation3156 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation3161 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation3163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_annotation3165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_to_end_of_line_in_annotation3167 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation3172 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation3174 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_annotation3176 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_annotation3178 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation3180 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation3182 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation3187 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation3189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation3191 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation3193 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotation3195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_annotation_element_in_annotation3203 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_annotation3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_annotation_element3225 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_annotation_element3227 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_annotation_element3229 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_element3231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_element3233 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation_element3238 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_element3240 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_annotation_element3242 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_annotation_element3244 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_to_end_of_line_in_annotation_element3246 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_annotation_element3254 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_element3256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_element3260 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3262 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_annotation_element3264 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_annotation_element3272 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_element3274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3276 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_element3278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3280 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_element3282 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_annotation_element3290 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_element3292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3294 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_element3296 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3298 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation_element3300 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_19_in_annotation_element3303 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_annotation_element3305 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_element3309 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_annotation_element3317 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_element3319 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_annotation_element3323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_annotation_element3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_annotation_element3327 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_134_in_annotation_element3335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_element3337 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_address_in_annotation_element3349 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_annotation_element3351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_annotation_element3353 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_encoded_array_in_encoded_array_block3370 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_encoded_array3383 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_encoded_array3385 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_encoded_array3387 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_encoded_array3389 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_encoded_array3394 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_encoded_array3396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_encoded_array3398 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_encoded_array3400 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_encoded_array3402 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_encoded_array3408 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_encoded_array3410 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_encoded_array3412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_encoded_array3414 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_NEWLINE_in_encoded_array3422 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_empty_line_in_encoded_array3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_data_in_class_data_block3462 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_class_data3496 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_class_data3498 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_class_data3500 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_class_data3502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_class_data3504 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_class_data3508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_data3510 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_data3517 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_data3519 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_class_data3521 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_data3525 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_data3530 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_data3532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_class_data3534 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_data3538 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_data3543 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_data3545 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_class_data3547 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_data3551 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_class_data3556 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_data3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_class_data3560 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_class_data3564 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_static_fields_in_class_data3583 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_instance_fields_in_class_data3589 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_direct_methods_in_class_data3595 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_virtual_methods_in_class_data3601 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_address_in_class_data3612 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_class_data3614 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_class_data3616 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_class_data3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_static_fields3650 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_static_fields3652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_static_fields3654 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_static_field_in_static_fields3660 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_static_field3695 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_static_field3699 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_static_field3703 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_static_field3705 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_static_field3709 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_static_field3711 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_static_field3716 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_static_field3718 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_static_field3720 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_static_field3724 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_static_field3729 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_static_field3731 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_static_field3733 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_access_modifiers_with_nums_in_static_field3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_instance_fields3774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_instance_fields3776 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_instance_fields3778 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_instance_field_in_instance_fields3784 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_instance_field3819 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_instance_field3823 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_instance_field3827 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_instance_field3829 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_instance_field3833 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_instance_field3835 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_instance_field3840 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_instance_field3842 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_instance_field3844 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_instance_field3848 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_instance_field3853 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_instance_field3855 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instance_field3857 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_access_modifiers_with_nums_in_instance_field3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_direct_methods3898 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_direct_methods3900 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_direct_methods3902 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_direct_method_in_direct_methods3908 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_direct_method3943 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_direct_method3947 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_direct_method3951 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_DIGIT_in_direct_method3953 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_direct_method3956 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_direct_method3960 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_direct_method3962 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_direct_method3967 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_direct_method3969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_direct_method3971 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_direct_method3975 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_direct_method3980 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_direct_method3982 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_direct_method3984 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_access_modifiers_with_nums_in_direct_method3988 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_direct_method3993 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_direct_method3995 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_direct_method3997 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_direct_method4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_virtual_methods4038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_virtual_methods4040 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_virtual_methods4042 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_virtual_method_in_virtual_methods4048 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_virtual_method4083 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_virtual_method4087 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_virtual_method4091 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_virtual_method4093 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_virtual_method4097 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_virtual_method4099 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_virtual_method4104 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_virtual_method4106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_virtual_method4108 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_virtual_method4112 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_virtual_method4117 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_virtual_method4119 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_virtual_method4121 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_access_modifiers_with_nums_in_virtual_method4125 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_virtual_method4130 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_virtual_method4132 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_virtual_method4134 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_virtual_method4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_map_block4162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_map_block4164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_map_block4166 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_map_block4168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_map_block4177 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_map_block4179 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_map_block4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_map_block4183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_map_block4185 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_map_block4190 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_map_block4192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_map_block4194 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_map_block4196 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_map_block4198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_map_in_map_block4207 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_map_block4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_map4228 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_map4230 = new BitSet(new long[]{0x0000000000000040L,0x4000000000000000L});
    public static final BitSet FOLLOW_set_in_map4232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_map4240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_map4242 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_map4247 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_map4249 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_map4251 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_slashes_in_map4253 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_to_end_of_line_in_map4255 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_map4260 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_map4262 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_map4264 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_map4266 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_map4271 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_map4273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_map4275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_map4277 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_map4279 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_address_in_map4284 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_hex_after_address_in_map4286 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_map4288 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_num_to_end_of_line_in_map4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_method_code_index_block4306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_method_code_index_block4308 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_method_code_index_block4310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_method_code_index_block4312 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_method_code_index_block4314 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_method_code_index_block4319 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_method_code_index_in_method_code_index_block4328 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_empty_line_in_method_code_index_block4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_method_code_index4350 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_element_in_method_code_index4352 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_method_code_index4354 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_DIGIT_in_method_code_index4356 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_method_code_index4359 = new BitSet(new long[]{0x0000000001200860L});
    public static final BitSet FOLLOW_proto_type_string_in_method_code_index4361 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_method_code_index4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proto_type_package_in_proto_type_string4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proto_type_package_in_proto_type_string4385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_proto_type_string4388 = new BitSet(new long[]{0x0000000001200460L});
    public static final BitSet FOLLOW_10_in_proto_type_string4390 = new BitSet(new long[]{0x0000000001200060L});
    public static final BitSet FOLLOW_proto_type_package_in_proto_type_string4393 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11_in_proto_type_string4405 = new BitSet(new long[]{0x0000000001201060L});
    public static final BitSet FOLLOW_proto_type_package_in_proto_type_string4407 = new BitSet(new long[]{0x0000000001201060L});
    public static final BitSet FOLLOW_12_in_proto_type_string4410 = new BitSet(new long[]{0x0000000001200060L});
    public static final BitSet FOLLOW_proto_type_package_in_proto_type_string4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_proto_type_package4426 = new BitSet(new long[]{0x0000000000200060L});
    public static final BitSet FOLLOW_class_ident_in_proto_type_package4430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_proto_type_package4432 = new BitSet(new long[]{0x0000000000200060L});
    public static final BitSet FOLLOW_class_ident_in_proto_type_package4436 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_proto_type_package4439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_proto_type_package4440 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_proto_type_package4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_brackets_in_class_ident4458 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_DIGIT_in_class_ident4460 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_class_ident4464 = new BitSet(new long[]{0x0000000000200060L});
    public static final BitSet FOLLOW_ident_brackets_in_class_ident4467 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_DIGIT_in_class_ident4469 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_ident_brackets4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ident_brackets4489 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_ident_brackets4491 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ident_brackets4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_address4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_access_modifiers4538 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_access_modifiers4541 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_access_modifiers4543 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_NEWLINE_in_access_modifiers4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_hex_after_address4576 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_hex_after_address4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_num_to_end_of_line4611 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_NEWLINE_in_num_to_end_of_line4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_num_to_slashes4646 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_18_in_num_to_slashes4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_num_to_dots4675 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_num_to_dots4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_num_to_comma4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_word_to_end_of_line4720 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_NEWLINE_in_word_to_end_of_line4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_SPLIT_in_empty_line4738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_empty_line4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_element4761 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_element4766 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_26_in_element4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_internal_in_quoted_string4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_quoted_string_internal4810 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_25_in_quoted_string_internal4818 = new BitSet(new long[]{0x0000000000000002L});

}