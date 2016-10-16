package com.riis.decompiler;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class JavaOutput {

	private FileOutputStream fout = null;
	private BufferedWriter bw = null;
	
	private int tabLevel;
	
	public JavaOutput(String filename) {
		tabLevel = 0;
		try {
			fout = new FileOutputStream(filename);
			bw = new BufferedWriter(new OutputStreamWriter(fout));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printJava(String java) {
		String[] javaLines = java.split("\n");
		for(int i = 0; i < javaLines.length; i++) {
			println(javaLines[i]);
		}
	}
	
	public void write(String words) {
		try {
			bw.write(words);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print(String words) {
		try {
			bw.write(autoTabJava(words));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void println(String words) {
		try {
			bw.write(autoTabJava(words) + "\n");
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
	
	private String autoTabJava(String original) {
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
		if(text.matches(".*\\{.*"))
			tabsToAdd++;
		if(text.matches(".*\\}.*"))
			tabsToAdd--;
		
		return tabsToAdd;
	}
}
