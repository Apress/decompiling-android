grammar DexToSourceCasting;

options {
  language = Java;
}

@header {
	package com.riis.decompiler;
}

@lexer::header {
	package com.riis.decompiler;
}

@members {
	String className;
	String flag_result = "";
	
	JavaOutput fout = DexToSource.fout;
}

rule
	@after {fout.printJava("}"); fout.close();}
	
	: class_name super_ source fields constructor methods+
	;
	
class_name
	: CLASS f1=flags id2=IDENT
		{fout.printJava($f1.text + " class " + $id2.text + " {");
		 className = $id2.text;}
	;
	
super_
	: SUPER package_
	;
	
source
	: SOURCE IDENT '.java'
	;
	
fields
	@after {fout.printJava(" ");}
	
	: field+
	;
	
field
	: FIELD f1=flags id2=IDENT p1=package_ ';' '=' id4=quoted_string
		{fout.printJava($f1.text + " " + $p1.result + " " + $id2.text + " = \"" + $id4.stringContents + "\"" );}
	;
	
constructor
	: METHODSTRT f1=flags INIT p1=params r1=return_
		{fout.printJava($f1.text + " " + className + $p1.result + " {");}
	  scrap* method_end
	;
	
methods
	: method_start scrap* method_end
	| method_start scrap* for_start for_body scrap* for_end method_end
	;
	
method_start
	: METHODSTRT f1=flags id1=IDENT p1=params r1=return_
		{fout.printJava($f1.text + " " + $r1.result + " " + $id1.text + "(" + $p1.result + ") {");}
	;
	
method_end
	@after {fout.printJava("}\n ");}
	
	: METHODEND
	;
	
for_start
	: id1=put_in_reg label id2=put_in_reg if_ge scrap*
		{fout.printJava("for(a = " + $id1.result + "; a < " + $id2.result + "; a++) {");}
	;
	
for_body
	: id1=sget id3=stmt_builder id2=invoke_virtual
		{fout.printJava($id1.result + "." + $id2.result + "(" + $id3.result);}
	;
	
stmt_builder returns [String result]
	: new_instance id1=invoke_move id2=invoke_move id3=invoke_move id4=invoke_move id5=invoke_move
		{$result = "\"" + $id1.result + "\" + " + $id2.result + " + \"" + $id3.result + "\" + " + $id4.result + ");";}
	;
	
invoke_move returns [String result]
	: id1=invoke_virtual move_result
		{$result = $id1.result;}
	| id1=const_string invoke_virtual move_result
		{$result = $id1.result;}
	;
	
move_result
	: MOVE_RESULT_OBJECT reg
	;
	
const_string returns [String result]
	: CONST_STRING reg id1=quoted_string
		{$result = $id1.stringContents;}
	;
	
for_end
	: add_int int_to_char goto_ label scrap*
		{fout.printJava("}");}
	;
	
new_instance
	: NEW_INSTANCE reg package_ scrap*
	;
	
sget returns [String result]
	: SGET_OBJECT reg id1=package_ id2=package_ ';'
		{$result = $id1.result;}
	;
	
invoke_virtual returns [String result]
	: INVOKE_VIRTUAL reg_args id1=package_ ';' params 'V'
		{$result = $id1.result;}
	| INVOKE_VIRTUAL reg_args package_ ';' id1=params package_ ';'
		{if($id1.result.compareTo("I") == 0) { $result = "(int)a"; } else {$result ="(char)a";}}
	;
	
add_int
	: ADD_INT reg reg DIGIT
	;
	
int_to_char
	: INT_TO_CHAR reg reg
	;
	
goto_
	: GOTO label
	;
	
if_ge
	: IF_GE reg reg label
	;
	
put_in_reg returns [String result]
	: const_ reg id1=DIGIT
		{$result = $id1.getText();}
	;
	
reg_args
	: '{' reg+ '}'
	;
	
label
	: LABEL
	| LABEL ':'
	;
	
invoke_direct
	: INVOKE_DIRECT regs package_
	;
	
flags
	: flag+
	;
	
flag returns [String flag_result]
	: f1='public'
		{flag_result += $f1.text;}
	| f1='static'
		{flag_result += $f1.text;}
	| f1='final'
		{flag_result += $f1.text;}
	;
	
params returns [String result]
	: '(' ')'
		{$result = "()";}
	| '(' '[L' id1=package_ ';' ')'
		{$result = $id1.result + " args[]";}
	| '(' id2=IDENT ';' ')'
		{$result = $id2.getText();}
	| IDENT '(' id3=package_ ';' ')'
		{$result=$id3.result;}
	| IDENT '(' id4=IDENT ')'
		{$result = $id4.getText();}
	| IDENT '(' ')'
		{$result = "()";}
	;
	
package_ returns [String result]
	: IDENT '/' IDENT '/' id1=IDENT
		{$result = id1.getText();}
	| IDENT '/' IDENT '/' IDENT '/' id1=IDENT
		{$result = id1.getText();}
	| IDENT '/' IDENT '/' id1=IDENT '.' id2=IDENT
		{$result = id1.getText() + "." + id2.getText();}
	| IDENT '/' IDENT '/' IDENT '/' '<init>'
		{$result = "init";}
	| 'L' IDENT '/' IDENT '/' id1=IDENT
		{$result = $id1.getText();}
	;
	
return_ returns [String result]
	: 'V' {$result = "void";}
	;
	
regs
	: '{' reg+ '}'
	;
	
reg
	: 'v' DIGIT
	;
	
const_
	: CONST_4
	| CONST_16
	| CONST_HIGH_16
	;

scrap
	: LIMIT REGISTERS DIGIT
	| ';' 'this:' reg params
	| LINE DIGIT+
	| invoke_direct ';' '<init>' params return_
	| RETURN_VOID
	| ';' 'parameter[' DIGIT ']' ':' reg params
	;
	
quoted_string returns [String stringContents]
	: id1=quoted_string_internal
		{ $stringContents = $id1.text.replace("\"", ""); }
	;
	
quoted_string_internal
	: '"' (~'"')* '"'
	;
	
CLASS:				'.class';
PUBLIC:				'public';
STATIC:				'static';
FINAL:				'final';
SUPER:				'.super';
SOURCE:				'.source';
FIELD:				'.field';
METHODSTRT:			'.method';
METHODEND:			'.end method';
INIT:				'<init>';
LIMIT:				'.limit';
REGISTERS:			'registers';
LINE:				'.line';

INVOKE_DIRECT:		'invoke-direct';
INVOKE_VIRTUAL:		'invoke-virtual';
MOVE_RESULT_OBJECT:	'move-result-object';
NEW_INSTANCE:		'new-instance';
RETURN_VOID:		'return-void';
IF_GE:				'if-ge';
SGET_OBJECT:		'sget-object';
ADD_INT:			'add-int/lit8';
INT_TO_CHAR:		'int-to-char';
GOTO:				'goto';
CONST_STRING:		'const-string';
CONST_4:			'const/4';
CONST_16:			'const/16';
CONST_HIGH_16:		'const/high16';
DIGIT:				('0'..'9')+;
IDENT:				('a'..'z'|'A'..'Z')+;
LABEL:				'l' ('0'..'9'|'a'..'f')('0'..'9'|'a'..'f')('0'..'9'|'a'..'f');

COMMENT:			'//' ~( '\r' | '\n' )* {$channel = HIDDEN;};
WS:					(' ' | '\t' | '\n' | '\r' | '\f' | ',')+ {$channel = HIDDEN;};
