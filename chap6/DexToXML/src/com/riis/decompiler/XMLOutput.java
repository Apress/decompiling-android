package com.riis.decompiler;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class XMLOutput {

	private FileOutputStream fout = null;
	private BufferedWriter bw = null;
	
	private int tabLevel;
	
	public XMLOutput(String filename) {
		tabLevel = 0;
		try {
			fout = new FileOutputStream(filename);
			bw = new BufferedWriter(new OutputStreamWriter(fout));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printXML(String xml) {
		String[] xmlLines = xml.split("\n");
		for(int i = 0; i < xmlLines.length; i++) {
			println(xmlLines[i]);
		}
	}
	
	public void print(String words) {
		try {
			bw.write(autoTabXML(words));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void println(String words) {
		try {
			bw.write(autoTabXML(words) + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			bw.close();
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String autoTabXML(String original) {
		StringBuilder text = new StringBuilder(original);
		int tabsToAdd = getTabsToAdd(original);
		
		if(tabsToAdd < 0)
			tabLevel += tabsToAdd;
		
		for(int i = 0; i < tabLevel; i++)
			text.insert(0, '\t');
		
		if(tabsToAdd > 0)
			tabLevel += tabsToAdd;
		
		
		return text.toString();
	}
	
	private int getTabsToAdd(String text) {
		int tabsToAdd = 0;
		if(text.matches(".*<[^/]+>.*"))
			tabsToAdd++;
		if(text.matches(".*</.+>.*"))
			tabsToAdd--;
		
		return tabsToAdd;
	}
	
	public String encodeXML(String rawText) {
		return rawText.replace("&", "&#x0026;").replace("<", "&#x003C;").replace(">", "&#x003E;").replace("\'", "&#x0027;").replace("\"", "&#x0022;");
	}
	
}
