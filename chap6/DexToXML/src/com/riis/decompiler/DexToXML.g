grammar DexToXML;

options {
	language = Java;
}

@header {
	package com.riis.decompiler;
}

@lexer::header {
	package com.riis.decompiler;
}

//These hold information about what we'll expect from the dex
@members {
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
}

//
// Main rule for the whole file
//-----------------------------
rule 
	@init {fout.printXML("<root>"); }	
	@after {fout.printXML("</root>"); fout.close(); }	
	
	: header	  
	  
	  string_ids_block
	  type_ids_block
	  proto_ids_block
	  field_ids_block
	  method_ids_block
	  class_defs_block
	  
	  annotation_set_block
	  
	  code_items_block

	  annotations_directory_block
	  type_list_block
	  string_data_block
	  byte_data_block
	  annotations_block
	  encoded_array_block
	  
	  class_data_block
	  
	  map_block
	  method_code_index_block
	;
	
//
// Dex header
//----------------------------
header
	@init {fout.printXML("<header>"); }	
	@after {fout.printXML("</header>"); }
	
	: signature_block
	  pointer_block
	  empty_line
	;
	
	
//
// Signature block
//----------------------------
signature_block
	: magic
	  checksum
	  signature
	;

magic
	: address hex_after_address 'magic:' id=quoted_string NEWLINE
		{fout.printXML("<magic>" + id + "</magic>"); }
	;
	
checksum
	: address id=hex_after_address 'checksum' NEWLINE
		{fout.printXML("<checksum>" + id + "</checksum>"); }
	;
	
signature
	: address id1=hex_after_address 'signature' NEWLINE
	  address id2=hex_after_address	NEWLINE
		{fout.printXML("<signature>" + id1 + id2 + "</signature>"); }
	;	
	
//
// Pointer block, parses into the fields
//----------------------------
pointer_block
	: file_size
	  header_size
	  endian_tag
	  link_size
	  link_offset
	  map_offset
	  string_ids_size
	  string_ids_offset
	  type_ids_size
	  type_ids_offset
	  proto_ids_size
	  proto_ids_offset
	  field_ids_size
	  field_ids_offset
	  method_ids_size
	  method_ids_offset
	  class_defs_size
	  class_defs_offset
	  data_size
	  data_offset
	;
	
file_size
	: address hex_after_address 'file_size:' id1=num_to_end_of_line
		{fout.printXML("<file_size>" + $id1.text.trim() + "</file_size>");
		  fileSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
header_size
	: address hex_after_address 'header_size:' id1=num_to_end_of_line
		{fout.printXML("<header_size>" + $id1.text.trim() + "</header_size>");
		  headerSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
endian_tag
	: address hex_after_address 'endian_tag:' id1=num_to_end_of_line
		{fout.printXML("<endian_tag>" + $id1.text.trim() + "</endian_tag>");
		  headerSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
link_size
	: address hex_after_address 'link_size:' id1=num_to_end_of_line
		{fout.printXML("<link_size>" + $id1.text.trim() + "</link_size>");
		  linkSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
link_offset
	: address hex_after_address 'link_off:' id1=num_to_end_of_line
		{fout.printXML("<link_offset>" + $id1.text.trim() + "</link_offset>");
		  linkOffset = Integer.parseInt($id1.text.trim(), 16);}
	;
	
map_offset
	: address hex_after_address 'map_off:' id1=num_to_end_of_line
		{fout.printXML("<map_offset>" + $id1.text.trim() + "</map_offset>");
		  mapOffset = Integer.parseInt($id1.text.trim(), 16);}
	;
	
string_ids_size
	: address hex_after_address 'string_ids_size:' id1=num_to_end_of_line
		{fout.printXML("<string_ids_size>" + $id1.text.trim() + "</string_ids_size>");
		  stringIdsSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
string_ids_offset
	: address hex_after_address 'string_ids_off:' id1=num_to_end_of_line
		{fout.printXML("<string_ids_offset>" + $id1.text.trim() + "</string_ids_offset>");
		  stringIdsOffset = Integer.parseInt($id1.text.trim(), 16);}
	;
	
type_ids_size
	: address hex_after_address 'type_ids_size:' id1=num_to_end_of_line
		{fout.printXML("<type_ids_size>" + $id1.text.trim() + "</type_ids_size>");
		  typeIdsSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
type_ids_offset
	: address hex_after_address 'type_ids_off:' id1=num_to_end_of_line
		{fout.printXML("<type_ids_offset>" + $id1.text.trim() + "</type_ids_offset>");
		  typeIdsOffset = Integer.parseInt($id1.text.trim(), 16);}
	;
	
proto_ids_size
	: address hex_after_address 'proto_ids_size:' id1=num_to_end_of_line
		{fout.printXML("<proto_ids_size>" + $id1.text.trim() + "</proto_ids_size>");
		  protoIdsSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
proto_ids_offset
	: address hex_after_address 'proto_ids_off:' id1=num_to_end_of_line
		{fout.printXML("<proto_ids_offset>" + $id1.text.trim() + "</proto_ids_offset>");
		  protoIdsOffset = Integer.parseInt($id1.text.trim(), 16);}
	;
	
field_ids_size
	: address hex_after_address 'field_ids_size:' id1=num_to_end_of_line
		{fout.printXML("<field_ids_size>" + $id1.text.trim() + "</field_ids_size>");
		  fieldIdsSize = Integer.parseInt($id1.text.trim(), 16);}
	;
	
field_ids_offset
	: address hex_after_address 'field_ids_off:' id1=num_to_end_of_line
		{fout.printXML("<field_ids_offset>" + $id1.text.trim() + "</field_ids_offset>");
		  fieldIdsOffset = Integer.parseInt($id1.text.trim(), 16);}
	;

method_ids_size
	: address hex_after_address 'method_ids_size:' id1=num_to_end_of_line
		{fout.printXML("<method_ids_size>" + $id1.text.trim() + "</method_ids_size>");
		 methodIdsSize = Integer.parseInt($id1.text.trim(), 16);}
 ;
 
method_ids_offset
	: address hex_after_address 'method_ids_off:' id1=num_to_end_of_line
		{fout.printXML("<method_ids_offset>" + $id1.text.trim() + "</method_ids_offset>");
		  methodIdsOffset = Integer.parseInt($id1.text.trim(), 16);}
 ;

class_defs_size
	: address hex_after_address 'class_defs_size:' id1=num_to_end_of_line
		{fout.printXML("<class_defs_size>" + $id1.text.trim() + "</class_defs_size>");
		  classDefsSize = Integer.parseInt($id1.text.trim(), 16);}
 ;

class_defs_offset
	: address hex_after_address 'class_defs_off:' id1=num_to_end_of_line
		{fout.printXML("<class_defs_offset>" + $id1.text.trim() + "</class_defs_offset>");
		  classDefsOffset = Integer.parseInt($id1.text.trim(), 16);}
 ;

data_size
	: address hex_after_address 'data_size:' id1=num_to_end_of_line
		{fout.printXML("<data_size>" + $id1.text.trim() + "</data_size>");
		  dataSize = Integer.parseInt($id1.text.trim(), 16);}
 ;

data_offset
	: address hex_after_address 'data_off:' id1=num_to_end_of_line
		{fout.printXML("<data_offset>" + $id1.text.trim() + "</data_offset>");
		  dataOffset = Integer.parseInt($id1.text.trim(), 16);}
 ;


//
// String ids block
//----------------------------
string_ids_block
	@init {fout.printXML("<string_ids>"); int n = 0;}	
	@after {fout.printXML("</string_ids>");}	
	
	: LINE_SPLIT 'string_ids:' NEWLINE
	  (string_id { n++; } )+ { n == stringIdsSize }?
	  empty_line
	;
	
string_id	
	: LINE_SPLIT id1=element id2=quoted_string NEWLINE
	  address hex_after_address 'string_data_off:' id3=num_to_end_of_line
		{fout.printXML("<string>\n<id>" + id1 + "</id>\n<address>" + $id3.text.trim() + "</address>\n<contents>" + fout.encodeXML(id2) + "</contents>\n</string>"); }
	;


//
// Type ids block
//----------------------------
type_ids_block
	@init {fout.printXML("<type_ids>"); int n = 0;}	
	@after {fout.printXML("</type_ids>");}
		
	: LINE_SPLIT 'type_ids:' NEWLINE
	  (type_id { n++; } )+ { n == typeIdsSize }?
	  empty_line
	;
	
type_id	
	: LINE_SPLIT id1=element id2=proto_type_string NEWLINE
	  address hex_after_address 'descriptor_idx:' id3=num_to_end_of_line
		{fout.printXML("<type>\n<id>" + id1 + "</id>\n<string_id>" 
		  		+ $id3.text.trim() + "</string_id>\n<string>" + $id2.text + "</string>\n</type>");}
	;


//
// Proto ids block
//----------------------------
proto_ids_block
	@init {fout.printXML("<proto_ids>"); int n = 0;}	
	@after {fout.printXML("</proto_ids>"); }
		
	: LINE_SPLIT 'proto_ids:' NEWLINE
	  (proto_id { n++; } )+ { n == protoIdsSize}?
	  empty_line
	;
	
proto_id	
	: LINE_SPLIT id1=element proto_type_string 'proto' '(' (','? proto_type_string)* ')' NEWLINE
	  address hex_after_address 'shorty_idx:' num_to_slashes id2=quoted_string NEWLINE
	  address hex_after_address 'return_type_idx:' num_to_slashes id3=proto_type_string NEWLINE 
	  address hex_after_address 'parameters_off:' num_to_end_of_line
		 {fout.printXML("<proto>\n<id>" + id1 + "</id>\n<string>" 
		   		+ id2 + "</string>\n<signature>" + $id3.text.trim() + "</signature>\n</proto>");}
	;


//
// Field ids block
//----------------------------
field_ids_block
	@init  {fout.printXML("<field_ids>"); int n = 0;}	
	@after {fout.printXML("</field_ids>");}
	
	: LINE_SPLIT 'field_ids:' NEWLINE
	  (field_id { n++; } )* { n == fieldIdsSize }?
	  empty_line
	;
	
field_id
	: LINE_SPLIT id1=element id2=proto_type_string ':' id3=proto_type_string NEWLINE
	  address hex_after_address 'class_idx:' num_to_end_of_line
	  address hex_after_address 'type_idx:' num_to_end_of_line
	  address hex_after_address 'name_idx:' num_to_end_of_line
		 {fout.printXML("<field>\n<id>" + id1 + "</id>\n<name>" 
		   		+ $id2.text + "</name>\n<type>" + $id3.text + "</type>\n</field>");}
	
	;


//
// Method ids block
//----------------------------
method_ids_block
	@init {fout.printXML("<method_ids>"); int n = 0; }	
	@after {fout.printXML("</method_ids>"); }	
	
	: LINE_SPLIT 'method_ids:' NEWLINE
	  (method_id { n++; } )+ { n == methodIdsSize }?
	  empty_line
	;
	
method_id	
	: LINE_SPLIT id1=element id2=proto_type_string DIGIT* ':' id3=proto_type_string NEWLINE
	  address hex_after_address 'class_idx:' num_to_end_of_line
	  address hex_after_address 'proto_idx:' num_to_end_of_line
	  address hex_after_address 'name_idx:' num_to_end_of_line
		 {fout.printXML("<method>\n<id>" + id1 + "</id>\n<name>" 
		   		+ fout.encodeXML($id2.text) + "</name>\n<proto>" + fout.encodeXML($id3.text) + "</proto>\n</method>");}
	
	;


//
// Class defs block
//----------------------------
class_defs_block
	@init {fout.printXML("<class_defs>"); int n = 0; }	
	@after {fout.printXML("</class_defs>"); }	
	
	: LINE_SPLIT 'class_defs:' NEWLINE
	  (class_def { n++; } )+ { n == classDefsSize }?
	  empty_line
	;

class_def
	: LINE_SPLIT id1=element id2=proto_type_string NEWLINE
	 address hex_after_address 'class_idx:' id3=num_to_end_of_line
	 address hex_after_address 'access_flags:' id4=access_modifiers_with_nums
	 address hex_after_address 'superclass_idx:' num_to_slashes id5=proto_type_string NEWLINE
	 address hex_after_address 'interfaces_off:' id6=num_to_end_of_line
	 (LINE_SPLIT proto_type_string NEWLINE)*
	 address hex_after_address 'source_file_idx:' num_to_slashes id7=proto_type_string NEWLINE
	 address hex_after_address 'annotations_off:' id8=num_to_end_of_line
	 address hex_after_address 'class_data_off:' id9=num_to_end_of_line
	 address hex_after_address 'static_values_off:' id10=num_to_end_of_line
	 	{fout.printXML("<class_def>\n" 
 		 			 +"<class_id>" + id1 + "</class_id>\n"
 		 			 +"<class_name>" + $id2.text.trim() + "</class_name>\n"
 		 			 +"<type_id>" + $id3.text.trim() + "</type_id>\n" 		 
 		 			 +"<access_flags>" + $id4.text.trim() + "</access_flags>\n"
 		 			 +"<superclass_id>" + $id5.text.trim() + "</superclass_id>\n"
 		 			 +"<interfaces_offset>" + $id6.text.trim() + "</interfaces_offset>\n"
 		 			 +"<source_file_id>" + $id7.text.trim() + "</source_file_id>\n"
 		 			 +"<annotations_offset>" + $id8.text.trim() + "</annotations_offset>\n"
 		 			 +"<class_data_offset>" + $id9.text.trim() + "</class_data_offset>\n"
 		 			 +"<static_values_offset>" + $id10.text.trim() + "</static_values_offset>\n"
 		 			 +"</class_def>"); }
	;

access_modifiers_with_nums
	: access_modifiers | num_to_end_of_line
	;
//
// Annotation set block
//----------------------------
annotation_set_block
	//Don't print anything, it isn't needed in the XML
	: LINE_SPLIT 'word_data:' NEWLINE
	  annotation_set*
	;
	
annotation_set
	: LINE_SPLIT element 'annotation set' NEWLINE
	  address hex_after_address IDENT ':' num_to_end_of_line
	 
	  (address hex_after_address 'entries' element ':' num_to_end_of_line
	  LINE_SPLIT 'visibility:' word_to_end_of_line
	  LINE_SPLIT 'type:' proto_type_string NEWLINE
	  (  LINE_SPLIT IDENT ':' IDENT proto_type_string (':' proto_type_string)? NEWLINE
	   | LINE_SPLIT IDENT ':' IDENT '{' (~'}')+ '}' NEWLINE)?
//	   | LINE_SPLIT IDENT ':' IDENT '{' (','? value_array_element)+ '}' NEWLINE)?
	  
	  (address hex_after_address 'entries' element ':' num_to_end_of_line
	  LINE_SPLIT 'visibility:' word_to_end_of_line
	  LINE_SPLIT 'type:' proto_type_string NEWLINE
	  LINE_SPLIT 'accessFlags:' IDENT num_to_end_of_line
	  LINE_SPLIT IDENT ':' name_type)?)+
	  
	  empty_line?
	;
	
name_type
	: IDENT (word_to_end_of_line | NEWLINE)
	;
	
	
//
// Code items block
//----------------------------
code_items_block
	@init {fout.printXML("<code_items>"); }	
	@after {fout.printXML("</code_items>"); }
	
	: code_item+
	;

code_item
	@init {fout.printXML("<code_item>"); }	
	@after {fout.printXML("</code_item>"); }
	
	: LINE_SPLIT element id1=proto_type_string DIGIT* ':' proto_type_string NEWLINE
	  address hex_after_address 'registers_size:' id2=num_to_end_of_line
	  address hex_after_address 'ins_size:' id3=num_to_end_of_line
	  address hex_after_address 'outs_size:' id4=num_to_end_of_line
	  address hex_after_address 'tries_size:' id5=num_to_end_of_line
	  address hex_after_address 'debug_off:' id6=num_to_end_of_line
	  address hex_after_address 'insns_size:' id7=num_to_end_of_line
	  
	   {fout.printXML("<method_name>" + fout.encodeXML($id1.text) + "</method_name>\n"
 		 			 +"<registers_size>" + $id2.text.trim() + "</registers_size>\n"
 		 			 +"<ins_size>" + $id3.text.trim() + "</ins_size>\n" 		 
 		 			 +"<outs_size>" + $id4.text.trim() + "</outs_size>\n"
 		 			 +"<tries_size>" + $id5.text.trim() + "</tries_size>\n"
 		 			 +"<debug_off>" + $id6.text.trim() + "</debug_off>\n"
 		 			 +"<insns_size>" + $id7.text.trim() + "</insns_size>\n"); }

 	  (LINE_SPLIT 'throws' (','? proto_type_string)+ NEWLINE)?

	  bytecode

	  (address hex_after_address NEWLINE)?
	  empty_line
	  (address hex_after_address NEWLINE)?
	;
	
bytecode
	@init {fout.printXML("<bytecode>"); }	
	@after {fout.printXML("</bytecode>"); }
	
	: (ignore_instruction | good_instruction)+
	  try_block?
	  debug_info?
	;
	
good_instruction
	: address hex_after_address address id1=instruction
		{fout.println("<insn>" + fout.encodeXML($id1.text.trim()) + "</insn>");}
	;
	
ignore_instruction
	: LINE_SPLIT address ('code-address'|'local-snapshot'|'local-start') .* NEWLINE
		(LINE_SPLIT IDENT .* NEWLINE)*
	| (LINE_SPLIT | address hex_after_address) '-'? address num_to_slashes '+' num_to_end_of_line
	;

instruction
	: instruction_ident .* NEWLINE
	;
	
instruction_ident
	: IDENT ('-' IDENT)* ('/' DIGIT* IDENT)?
	;
	
try_block
	: (address hex_after_address 'padding' ':' num_to_end_of_line)?
	  LINE_SPLIT 'tries' ':' NEWLINE
	  try_piece+
	  LINE_SPLIT 'handlers' ':' NEWLINE
	  address hex_after_address IDENT ':' num_to_end_of_line
	  handler+
	;
	
try_piece
	: address hex_after_address 'try' num_to_dots num_to_end_of_line
	  address hex_after_address 'catch' proto_type_string '-' '>' (num_to_comma NEWLINE | num_to_end_of_line)
	  (LINE_SPLIT proto_type_string '-' '>' (num_to_comma NEWLINE | num_to_end_of_line))*
	;
	
handler
	: address hex_after_address address 'catch' proto_type_string '-' '>' (num_to_comma NEWLINE | num_to_end_of_line)
	  (((address hex_after_address) | LINE_SPLIT) proto_type_string '-' '>' (num_to_comma NEWLINE | num_to_end_of_line))*
	;
	
debug_info
	options { greedy = false; }

	: LINE_SPLIT 'debug info' NEWLINE (LINE_SPLIT .* NEWLINE?)+ 'end sequence' NEWLINE
	;
	
//
// Annotations directory block
//----------------------------
annotations_directory_block
	: annotations_directory*
	;
	
annotations_directory
	: LINE_SPLIT element 'annotations directory' NEWLINE
	  address hex_after_address 'class_annotations_off:' num_to_end_of_line
	  address hex_after_address 'fields_size:' num_to_end_of_line
	  address hex_after_address 'methods_size:' num_to_end_of_line
	  address hex_after_address 'parameters_size:' num_to_end_of_line
	  
	  field_annotations?
	  method_annotations?
	  
	  empty_line
	;

method_annotations
	: LINE_SPLIT 'methods:' NEWLINE
	 (LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE
	  address hex_after_address 'method_idx:' num_to_end_of_line
	  address hex_after_address 'annotations_off:' num_to_end_of_line)+
	;

field_annotations
	: LINE_SPLIT 'fields:' NEWLINE
	 (LINE_SPLIT proto_type_string ':' proto_type_string NEWLINE
	  address hex_after_address 'field_idx:' num_to_end_of_line
	  address hex_after_address 'annotations_off:' num_to_end_of_line)+
	;


//
// Type list block
//----------------------------
type_list_block
	: type_list+
	;
	
type_list
	: LINE_SPLIT element 'type_list' NEWLINE
	  address hex_after_address IDENT ':' num_to_end_of_line
	  (address hex_after_address num_to_slashes proto_type_string NEWLINE)+
	  empty_line
	  (address hex_after_address NEWLINE)?
	;

	
//
// String data block
//----------------------------
string_data_block
	: LINE_SPLIT 'string_data:' NEWLINE
	  string_data+
	;
	
string_data
	: address hex_after_address 'utf16_size:' num_to_end_of_line
	  address hex_after_address quoted_string NEWLINE
	  (address hex_after_address NEWLINE)*
	  empty_line
	;
	

//
// Byte data block
//----------------------------
byte_data_block
	: LINE_SPLIT 'byte_data:' NEWLINE
	  byte_data*
	;
	
byte_data
	: LINE_SPLIT element 'debug info' NEWLINE
	  address hex_after_address 'line_start:' num_to_end_of_line
	  address hex_after_address 'parameters_size:' num_to_end_of_line
	  (address hex_after_address 'parameter' param NEWLINE)*
	  address hex_after_address address 'prologue end' NEWLINE
	  (address hex_after_address address? 'line' '='? num_to_end_of_line
	   (address hex_after_address address 'advance pc' NEWLINE)?)*
	  address hex_after_address 'end sequence' NEWLINE
	  empty_line
	;
	
param
	: '<'? IDENT+ '>'? (IDENT+)?
	;
	
	
//
// Annotations block
//----------------------------
annotations_block
	: annotation*
	;
	
annotation
	: LINE_SPLIT element IDENT NEWLINE
	  address hex_after_address 'visibility:' word_to_end_of_line
	  address hex_after_address 'type_idx:' num_to_slashes proto_type_string NEWLINE
	  address hex_after_address IDENT ':' num_to_end_of_line
	 
	  annotation_element*
	  
	  empty_line
	;
	
annotation_element
	: LINE_SPLIT 'elements' element ':' NEWLINE
	  address hex_after_address 'name_idx:' num_to_slashes word_to_end_of_line
	  (  address hex_after_address IDENT ':' IDENT num_to_end_of_line
	   | address hex_after_address IDENT ':' IDENT NEWLINE
	   | address hex_after_address IDENT ':' IDENT proto_type_string (':' proto_type_string)? NEWLINE
	   | address hex_after_address IDENT ':' IDENT '{' (~'}')+ '}' NEWLINE)
	   
	  (address hex_after_address NEWLINE)*
	;


//
// Encoded array block
//----------------------------
encoded_array_block
	: encoded_array*
	;
	
encoded_array
	: LINE_SPLIT element 'encoded array' NEWLINE
	  address hex_after_address IDENT ':' num_to_end_of_line
	  (address hex_after_address element IDENT (~NEWLINE)* NEWLINE)+
	  empty_line
	;
	
	
//
// Class data block
//----------------------------
class_data_block
	@init {fout.printXML("<classes>");}	
	@after {fout.printXML("</classes>");}	
	
	: class_data+
	;
	
//	@init {fout.printXML("<classes>"); int n = 0;}	
//	@after {fout.printXML("</classes>");}	
//	
//	: (class_data { n++; } )+ { n == classDefsSize }?
//	;

class_data
	@init {fout.printXML("<class>");}	
	@after {fout.printXML("</class>");}
	
	: LINE_SPLIT element 'class' 'data' 'for' id0=proto_type_string NEWLINE
	
	  address hex_after_address 'static_fields_size:' id1=num_to_end_of_line
	  address hex_after_address 'instance_fields_size:' id2=num_to_end_of_line
	  address hex_after_address 'direct_methods_size:' id3=num_to_end_of_line
	  address hex_after_address 'virtual_methods_size:' id4=num_to_end_of_line
	  
	  {fout.printXML("<class_name>" + $id0.text + "</class_name>");
	   fout.printXML("<static_fields_size>" + $id1.text.trim() + "</static_fields_size>");
	   fout.printXML("<instance_fields_size>" + $id2.text.trim() + "</instance_fields_size>");
	   fout.printXML("<direct_methods_size>" + $id3.text.trim() + "</direct_methods_size>");
	   fout.printXML("<virtual_methods_size>" + $id4.text.trim() + "</virtual_methods_size>");
	   
	   staticFieldsSize = Integer.parseInt($id1.text.trim(), 16);
	   instanceFieldsSize = Integer.parseInt($id2.text.trim(), 16);
	   directMethodsSize = Integer.parseInt($id3.text.trim(), 16);
	   virtualMethodsSize = Integer.parseInt($id4.text.trim(), 16);}
	   
	  static_fields?
	  instance_fields?
	  direct_methods?
	  virtual_methods?
	  
	  (address hex_after_address NEWLINE)?
	  empty_line
	;

static_fields
	@init {fout.printXML("<static_fields>"); int n = 0;}	
	@after {fout.printXML("</static_fields>");}	
	
	: LINE_SPLIT 'static_fields:' NEWLINE
	  (static_field { n++; } )+ { n == staticFieldsSize }?
	;
	
static_field
	@init {fout.printXML("<static_field>"); int n = 0;}	
	@after {fout.printXML("</static_field>");}	
	
	: LINE_SPLIT id0=element id1=proto_type_string ':' id2=proto_type_string NEWLINE
	  address hex_after_address 'field_idx:' id3=num_to_end_of_line
	  address hex_after_address 'access_flags:' id4=access_modifiers_with_nums
	  
	  {fout.printXML("<id>" + id0 + "</id>\n" +
	  				 "<name>" + $id1.text + "</name>\n" +
	  				 "<type>" + $id2.text + "</type>\n" +
	  				 "<field_id>" + $id3.text.trim() + "</field_id>\n" +
	  				 "<access_flags>" + $id4.text.trim() + "</access_flags>\n");}
	;
	
instance_fields
	@init {fout.printXML("<instance_fields>"); int n = 0;}	
	@after {fout.printXML("</instance_fields>");}	
	
	: LINE_SPLIT 'instance_fields:' NEWLINE
	  (instance_field { n++; } )+ { n == instanceFieldsSize }?
	;
	
instance_field
	@init {fout.printXML("<instance_field>"); int n = 0;}	
	@after {fout.printXML("</instance_field>");}	
	
	: LINE_SPLIT id0=element id1=proto_type_string ':' id2=proto_type_string NEWLINE
	  address hex_after_address 'field_idx:' id3=num_to_end_of_line
	  address hex_after_address 'access_flags:' id4=access_modifiers_with_nums
	  
	  {fout.printXML("<id>" + id0 + "</id>\n" +
	  				 "<name>" + $id1.text + "</name>\n" +
	  				 "<type>" + $id2.text + "</type>\n" +
	  				 "<field_id>" + $id3.text.trim() + "</field_id>\n" +
	  				 "<access_flags>" + $id4.text.trim() + "</access_flags>\n");}
	;
	
direct_methods
	@init {fout.printXML("<direct_methods>"); int n = 0;}	
	@after {fout.printXML("</direct_methods>");}	
	
	: LINE_SPLIT 'direct_methods:' NEWLINE
	  (direct_method { n++; } )+ { n == directMethodsSize }?
	;
	
direct_method
	@init {fout.printXML("<direct_method>"); int n = 0;}	
	@after {fout.printXML("</direct_method>");}	
	
	: LINE_SPLIT id0=element id1=proto_type_string DIGIT* ':' id2=proto_type_string NEWLINE
	  address hex_after_address 'method_idx:' id3=num_to_end_of_line
	  address hex_after_address 'access_flags:' id4=access_modifiers_with_nums
	  address hex_after_address 'code_off:' id5=num_to_end_of_line
	  
	  {fout.printXML("<id>" + id0 + "</id>\n" +
	  				 "<name>" + fout.encodeXML($id1.text) + "</name>\n" +
	  				 "<proto>" + $id2.text + "</proto>\n" +
	  				 "<method_id>" + $id3.text.trim() + "</method_id>\n" +
	  				 "<access_flags>" + $id4.text.trim() + "</access_flags>\n" +
	  				 "<code_offset>" + $id5.text.trim() + "</code_offset>\n");}
	;
	
virtual_methods
	@init {fout.printXML("<virtual_methods>"); int n = 0;}	
	@after {fout.printXML("</virtual_methods>");}	
	
	: LINE_SPLIT 'virtual_methods:' NEWLINE
	  (virtual_method { n++; } )+ { n == virtualMethodsSize }?
	;
	
virtual_method
	@init {fout.printXML("<virtual_method>"); int n = 0;}	
	@after {fout.printXML("</virtual_method>");}	
	
	: LINE_SPLIT id0=element id1=proto_type_string ':' id2=proto_type_string NEWLINE
	  address hex_after_address 'method_idx:' id3=num_to_end_of_line
	  address hex_after_address 'access_flags:' id4=access_modifiers_with_nums
	  address hex_after_address 'code_off:' id5=num_to_end_of_line
	  
	  {fout.printXML("<id>" + id0 + "</id>\n" +
	  				 "<name>" + fout.encodeXML($id1.text) + "</name>\n" +
	  				 "<proto>" + $id2.text + "</proto>\n" +
	  				 "<method_id>" + $id3.text.trim() + "</method_id>\n" +
	  				 "<access_flags>" + $id4.text.trim() + "</access_flags>\n" +
	  				 "<code_offset>" + $id5.text.trim() + "</code_offset>\n");}
	;


//
// Map block
//----------------------------
map_block
	: LINE_SPLIT IDENT ':' NEWLINE
	  
	  LINE_SPLIT element IDENT 'list' NEWLINE
	  address hex_after_address IDENT ':' num_to_end_of_line
	  
	  map+
	  
	  empty_line
	;

map
	: LINE_SPLIT element (IDENT | 'type_list') IDENT NEWLINE
	  address hex_after_address 'type:' num_to_slashes word_to_end_of_line
	  address hex_after_address 'unused:' num_to_end_of_line
	  address hex_after_address IDENT ':' num_to_end_of_line
	  address hex_after_address 'offset:' num_to_end_of_line	
	;


//
// Method code index block
//----------------------------
method_code_index_block
	: LINE_SPLIT IDENT 'code' 'index:' NEWLINE
	  empty_line
	  
	  method_code_index+
	  
	  empty_line
	;
	
method_code_index
	: LINE_SPLIT element proto_type_string DIGIT* ':' proto_type_string NEWLINE
	;
	

//
// Utility parser rules
//----------------------------
proto_type_string 
	: proto_type_package
	| proto_type_package ('.' '$'? proto_type_package)+     
	| '(' proto_type_package* ')' proto_type_package 	// append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	;
	
proto_type_package
	: '['? (class_ident '/')* class_ident ('['']')? ';'?
	;
	
class_ident
	: (ident_brackets|DIGIT) ('$' (ident_brackets|DIGIT))*
	;
	
ident_brackets
	: IDENT
	| '<' IDENT '>'
	;

address
	: (DIGIT|IDENT)+ ':' 
	;
	
access_modifiers returns [String modifiers]
	@init { $modifiers = ""; }
	: (id1=(IDENT (LINE_SPLIT IDENT)*) { $modifiers = $id1.text; }) NEWLINE
	;
	
hex_after_address returns [String hexAfterAddress]
	@init { $hexAfterAddress = ""; }
	: (id1=(DIGIT|IDENT) { $hexAfterAddress += $id1.text; })+ LINE_SPLIT
	;
	
num_to_end_of_line returns [String numToEndOfLine]
	@init { $numToEndOfLine = ""; }
	: (id1=(DIGIT|IDENT) { $numToEndOfLine += $id1.text; })+ NEWLINE
	;
	
num_to_slashes returns [String numToSlashes]
	@init { $numToSlashes = ""; }
	: (id1=(DIGIT|IDENT) { $numToSlashes += $id1.text; })+ '//'
	;
	
num_to_dots
	: (DIGIT|IDENT)+ '.''.'
	;
	
num_to_comma
	: (DIGIT|IDENT)+ ','
	;
	
word_to_end_of_line returns [String wordToEndOfLine]
	@init { $wordToEndOfLine = ""; }
	: (id1=IDENT { $wordToEndOfLine += $id1.text; })+ NEWLINE
	;
	
empty_line
	: LINE_SPLIT NEWLINE
	;

element returns [String elementNum]
	@init { $elementNum = ""; }
	: '[' (id1=(DIGIT|IDENT) { $elementNum += $id1.text; })+ ']'
	;
	
quoted_string returns [String stringContents]
	: id1=quoted_string_internal
		{ $stringContents = $id1.text.replace("\"", ""); }
	;
	
quoted_string_internal
	: '\"' (~'\"')* '\"'
	;
	
NEWLINE:				'\r''\n' | '\r' | '\n';
LINE_SPLIT:				'|';

DIGIT:					'0'..'9';

IDENT:					('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

WS:						(' ' | '\t' | '\f' | ',')+ {$channel = HIDDEN;};
ANY_CHAR:				.;