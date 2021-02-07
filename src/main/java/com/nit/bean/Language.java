package com.nit.bean;

import java.util.LinkedList;

public class Language {
	private final LinkedList<String> LANGUAGELIST;

	public Language() {
		LANGUAGELIST = new LinkedList<>();
		LANGUAGELIST.add("JAVA");
		LANGUAGELIST.add("C++");
		LANGUAGELIST.add("C");
		LANGUAGELIST.add(".NET");
		LANGUAGELIST.add("PHP");
		LANGUAGELIST.add("SQL");
		LANGUAGELIST.add("PYTHON");
		LANGUAGELIST.add("HTML");
		LANGUAGELIST.add("JAVASCRIPT");
	}

	public LinkedList<String> getLANGUAGELIST() {
		return LANGUAGELIST;
	}
	
	

}
