grammar DexToSourceWordpress;

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
	JavaOutput fout = DexToSource.fout;
}

rule
	@after {fout.close();}
	
	: method
	;
	
method
	: method_start scrap* (if_stmt scrap*)+ method_end
	;
	
method_start
	: METHODSTRT f1=flags id1=IDENT p1=params r1=return_
		{fout.print($f1.text + " " + $r1.result + " " + $id1.text + "(");
		
		String[] args = $p1.result.split(";");
		for(int i = 0; i < args.length; i++) {
			fout.print(args[i] + " " + args[i].substring(args[i].lastIndexOf('.')+1, args[i].length()).toLowerCase());
			if(i != args.length-1) { fout.print(", "); }
		}
		
		fout.printJava(") {");}
	;
	
flags
	: flag+
	;
	
flag returns [String flag_result]
	: f1='public'
		{flag_result += $f1.text;}
	| f1='static'
		{flag_result += $f1.text;}
	;
	
params returns [String result]
	@init {$result = "";}
	: '(' (id1=package_ {$result += $id1.result;})* ')'
	;
	
package_ returns [String result]
	: id1=package_internal
		{$result = $id1.text.replace("/", ".");
		 if($result.startsWith("L")) { 
		 	$result = $result.substring(1, $result.length());
		 }
		}
	;
	
package_internal
	: 'L'? IDENT (('/'|'.') (IDENT|HEX_DIGIT)+)* ('/' '<init>')? ';'?
	;
	
return_ returns [String result]
	: 'V' {$result = "void";}
	;
	
if_stmt
	: if_ scrap* id1=new_instance id2=const_string invoke_direct scrap* throw_
		{fout.printJava("throw new " + $id1.result + "(" + $id2.result + ");\n}");}
	| if_ scrap* RETURN_VOID scrap* {fout.printJava("return;\n}");} goto_stmt
;
	
if_
	: IF_NEZ id1=reg ',' 'l' HEX_DIGIT
		{fout.print("if(");
		 if($id1.text.equals("v2")) {
		 	fout.printJava("writer == null ) {");
		 } else {
		 	fout.printJava("string == null ) {");
		 }
		}
	;
	
reg
	: 'v' HEX_DIGIT
	;

new_instance returns [String result]
	: NEW_INSTANCE reg ',' id1=package_
		{$result = $id1.result;}
	;
	
const_string returns [String result]
	: CONST_STRING reg ',' id1=quoted_string
		{$result = $id1.text;}
	;
	
quoted_string
	: '"' (~'"')* '"'
	;
	
invoke_direct
	: INVOKE_DIRECT regs ',' package_
	;
	
regs
	: '{' (','? reg)+ '}'
	;
	
throw_
	: THROW reg
	;
	
goto_stmt
	: id1=sget invoke_virtual[id1] goto_
	;
	
sget returns [String result]
	: SGET reg ',' id1=package_
		{$result = $id1.result.split("\r\n")[0];}
	;

invoke_virtual[String objectName]
	: INVOKE_VIRTUAL param ',' package_ ';' id1=IDENT id2=params return_
		{fout.print(objectName + "." + $id1.text + "(");
		
		 String[] args = $id2.result.split(";");
		 for(int i = 0; i < args.length; i++) {
			fout.write(args[i].substring(args[i].lastIndexOf('.')+1, args[i].length()).toLowerCase().trim());
			if(i != args.length-1) { fout.write(", "); }
		 }
		 
		 fout.write(");\n");
		
		}
	;
	
param
	: '{' (','? reg)+ '}'
	;
	
goto_
	: 'goto' 'l' HEX_DIGIT
	;
	
method_end
	@after {fout.printJava("}\n ");}
	
	: METHODEND
	;

scrap
	: LIMIT REGISTERS HEX_DIGIT
	| ';' 'this:' reg params
	| LINE HEX_DIGIT
	| ';' 'parameter[' HEX_DIGIT ']' ':' reg params
	| ';' '<init>' params return_
	| THROWS package_
	| label
	;
	
label
	: 'l' HEX_DIGIT ':'
	;
	
THROWS:				'.throws';
SUPER:				'.super';
SOURCE:				'.source';
METHODSTRT:			'.method';
METHODEND:			'.end method';
INIT:				'<init>';
LIMIT:				'.limit';
REGISTERS:			'registers';
LINE:				'.line';

CONST_STRING:		'const-string';
IF_NEZ:				'if-nez';
INVOKE_DIRECT:		'invoke-direct';
INVOKE_SUPER:		'invoke-super';
INVOKE_VIRTUAL:		'invoke-virtual';
NEW_INSTANCE:		'new-instance';
RETURN_VOID:		'return-void';
SGET:				'sget-object';
THROW:				'throw';
HEX_DIGIT:			('0'..'9'|'A'..'F'|'a'..'f')+;
IDENT:				('a'..'z'|'A'..'Z'|'_')+;

COMMENT:			'//' ~( '\r' | '\n' )* {$channel = HIDDEN;};
WS:					(' ' | '\t' | '\n' | '\r' | '\f' | ',')+ {$channel = HIDDEN;};

ANYCHAR:			.;