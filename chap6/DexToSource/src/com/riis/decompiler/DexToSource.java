package com.riis.decompiler;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class DexToSource {
	public static JavaOutput fout;
		
	public static void main(String[] args) throws RecognitionException, IOException {
		if(args.length != 2) {
			System.out.println("Incorrect arguments, please specify a file and type of grammar (casting, hello, or wordpress) to use.");
			return;
		}
		
		String filePath = args[0];
		
		if(!filePath.substring(filePath.lastIndexOf("."), filePath.length()).equals(".ddx")) {
			System.out.println("File specified is not valid.");
		}
	
		fout = new JavaOutput(filePath.replace(".ddx", ".java"));
		
		if(args[1].equals("casting")) {
			DexToSourceCastingLexer lexer = new DexToSourceCastingLexer(new ANTLRFileStream(filePath));
			TokenStream tokenStream = new CommonTokenStream(lexer);
			DexToSourceCastingParser parser = new DexToSourceCastingParser(tokenStream);
			parser.rule();
		} else if(args[1].equals("hello")) {
			DexToSourceHelloLexer lexer = new DexToSourceHelloLexer(new ANTLRFileStream(filePath));
			TokenStream tokenStream = new CommonTokenStream(lexer);
			DexToSourceHelloParser parser = new DexToSourceHelloParser(tokenStream);
			parser.rule();
		} else if(args[1].equals("wordpress")) {
			DexToSourceWordpressLexer lexer = new DexToSourceWordpressLexer(new ANTLRFileStream(filePath));
			TokenStream tokenStream = new CommonTokenStream(lexer);
			DexToSourceWordpressParser parser = new DexToSourceWordpressParser(tokenStream);
			parser.rule();
		} else {
			System.out.println("Incorrect arguments, please specify a file and type of grammar (casting, hello, or wordpress) to use.");
		}
	}
}