package com.nit.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Candidate {
	private String name;
	private int age;
	private String gender;
	private String country;
	private String userId;
	private String[] languageList;

	public String[] getLanguageList() {
		return languageList;
	}

	public void setLanguageList(String[] languageList) {
		this.languageList = languageList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getListedCountry() {
		return new Country().getListedCountry();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LinkedList<String> getLANGUAGELIST() {
		return new Language().getLANGUAGELIST();
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + ", gender=" + gender + ", country=" + country + ", userId="
				+ userId + ", languageList=" + Arrays.toString(languageList) + "]";
	}
	
	
}
