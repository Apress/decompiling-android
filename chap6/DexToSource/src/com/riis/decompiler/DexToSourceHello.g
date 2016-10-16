grammar DexToSourceHello;

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
	@after {fout.printJava("}"); fout.close();}
	
	: class_name source constructor methods+
	;
	
class_name
	: CLASS f1=flags id2=package_ SUPER id3=package_
		{fout.printJava("package " + $id2.result.substring(0, $id2.result.lastIndexOf('.')) + ";\n ");
		
		 String className = $id2.result.substring($id2.result.lastIndexOf('.')+1, $id2.result.length());
		 
		 fout.printJava($f1.text + " class " + className + " extends " + $id3.result + " {\n ");}
	;
	
flags
	: flag+
	;
	
flag returns [String flag_result]
	: f1='public'
		{flag_result += $f1.text;}
	;
	
package_ returns [String result]
	: id1=package_internal
		{$result = $id1.text.replace("/", ".").replace(";", "");
		 if($result.startsWith("L")) { 
		 	$result = $result.substring(1, $result.length());
		 }
		}
	;
	
package_internal
	: 'L'? IDENT ('/' IDENT)* ('/' '<init>')? ';'?
	;
	
source
	: SOURCE IDENT '.java'
	;
	
constructor
	: METHODSTRT f1=flags INIT p1=params r1=return_
	  scrap*
	  
	  invoke_direct ';' '<init>' params return_
	  RETURN_VOID
	  
	  METHODEND
	;
	
params returns [String result]
	: '(' {$result = "(";} (id1=package_ {$result += $id1.result;})* ')' {$result += ")";}
	;
	
return_ returns [String result]
	: 'V' {$result = "void";}
	;
	
invoke_direct
	: INVOKE_DIRECT regs ',' package_
	;
	
regs
	: '{' reg+ '}'
	;
	
reg
	: 'v' DIGIT
	;
	
methods
	: method_start scrap* invoke_super scrap* invoke_virtual_content scrap* method_end
	;
	
method_start
	: METHODSTRT f1=flags id1=IDENT p1=params r1=return_
		{fout.printJava($f1.text + " " + $r1.result + " " + $id1.text +
						$p1.result.replace(")", "") + " " + $p1.result.substring($p1.result.lastIndexOf('.')+1, $p1.result.length()).toLowerCase() + " {");}
	;
	
invoke_super
	: INVOKE_SUPER param ',' package_ ';' id1=IDENT id2=params return_
		{fout.printJava("super." + $id1.text + "(" + $id2.result.substring($id2.result.lastIndexOf('.')+1, $id2.result.length()).toLowerCase() + ";");}
	;
	
param
	: '{' reg '}'
	| '{' reg ',' reg '}'
	;
	
invoke_virtual_content
	: id1=constant id2=invoke_virtual
		{fout.printJava(id2 + "(" + id1 + ");");}
	;

constant returns [String number]
	@init {$number = "";}
	: const_ reg ',' (id1=DIGIT {$number += $id1.text;})+
	;

invoke_virtual returns [String name]
	: INVOKE_VIRTUAL param ',' package_ ';' id1=IDENT params return_
		{$name = $id1.text;}
	;
	
method_end
	@after {fout.printJava("}\n ");}
	
	: METHODEND
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
	| RETURN_VOID
	| ';' 'parameter[' DIGIT ']' ':' reg params
	;
	
CLASS:				'.class';
PUBLIC:				'public';
STATIC:				'static';
FINAL:				'final';
SUPER:				'.super';
SOURCE:				'.source';
METHODSTRT:			'.method';
METHODEND:			'.end method';
INIT:				'<init>';
LIMIT:				'.limit';
REGISTERS:			'registers';
LINE:				'.line';

INVOKE_DIRECT:		'invoke-direct';
INVOKE_SUPER:		'invoke-super';
INVOKE_VIRTUAL:		'invoke-virtual';
RETURN_VOID:		'return-void';
CONST_4:			'const/4';
CONST_16:			'const/16';
CONST_HIGH_16:		'const/high16';
DIGIT:				('0'..'9')+;
IDENT:				('a'..'z'|'A'..'Z')+;

COMMENT:			'//' ~( '\r' | '\n' )* {$channel = HIDDEN;};
WS:					(' ' | '\t' | '\n' | '\r' | '\f' | ',')+ {$channel = HIDDEN;};
