package com.riis.decompiler;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class DexToXML {
	public static XMLOutput fout;

	public static void main(String[] args) throws RecognitionException, IOException {
		if(args.length != 1) {
			System.out.println("Incorrect arguments, please specify a file.");
			return;
		}
		
		String filePath = args[0];
		
		if(!filePath.substring(filePath.lastIndexOf("."), filePath.length()).equals(".dump")) {
			System.out.println("File specified is not valid.");
		}
	
		fout = new XMLOutput(filePath.replace(".dump", ".xml"));
		
		DexToXMLLexer lexer = new DexToXMLLexer(new ANTLRFileStream(filePath));
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DexToXMLParser parser = new DexToXMLParser(tokenStream);
		
		parser.rule();
	}
}