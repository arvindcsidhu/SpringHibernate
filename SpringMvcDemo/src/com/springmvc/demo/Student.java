package com.springmvc.demo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String,String> countryList;
	
	private LinkedHashMap<String,String> favouriteLanguageList;
	
	private LinkedHashMap<String,String> operatingSystemList;
	
	private String favouriteLanguage;
	
	private String operatingSystem;
	

	public Student() {
		
		countryList = new LinkedHashMap<>();
		
		countryList.put("us","usa");
		countryList.put("in","india");
		countryList.put("braz","brazil");
		countryList.put("can","canada");
		
		favouriteLanguageList = new LinkedHashMap<>();
		
		favouriteLanguageList.put("EMBEDDED","EMBEDDED");
		favouriteLanguageList.put("JAVA","JAVA");
		favouriteLanguageList.put("C","C");
		favouriteLanguageList.put("PYTHON","PYTHON");
		
		operatingSystemList = new LinkedHashMap<>();
		operatingSystemList.put("windows","windows");
		operatingSystemList.put("linux","linux");
		operatingSystemList.put("ubuntu","ubuntu");
	
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageList() {
		return favouriteLanguageList;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String, String> getOperatingSystemList() {
		return operatingSystemList;
	}
	
	
	

}
