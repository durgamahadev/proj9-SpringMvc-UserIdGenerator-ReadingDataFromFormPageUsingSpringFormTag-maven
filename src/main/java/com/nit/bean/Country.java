package com.nit.bean;

import java.util.HashMap;

public class Country {
	private HashMap<String, String> listedCountry;

	public Country() {
		listedCountry = new HashMap<>();
		listedCountry.put("IN", "INDIA");
		listedCountry.put("PAK", "PAKISTAN");
		listedCountry.put("USA", "UNITED STATE OF AMERICA");
		listedCountry.put("GER", "GERMAN");

	}

	public HashMap<String, String> getListedCountry() {
		return listedCountry;
	}
	
	

}
