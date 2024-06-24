package com.jahid.assignment.assignment3;

//Country.java
public class Country extends Continent {
	 private String capital;
	 private String officialLanguage;
	 private String currency;
	
	 public Country(String name, double area, int population, String capital, String officialLanguage, String currency) {
	     super(name, area, population);
	     this.capital = capital;
	     this.officialLanguage = officialLanguage;
	     this.currency = currency;
	 }
	
	 public String getCapital() {
	     return capital;
	 }
	
	 public void setCapital(String capital) {
	     this.capital = capital;
	 }
	
	 public String getOfficialLanguage() {
	     return officialLanguage;
	 }
	
	 public void setOfficialLanguage(String officialLanguage) {
	     this.officialLanguage = officialLanguage;
	 }
	
	 public String getCurrency() {
	     return currency;
	 }
	
	 public void setCurrency(String currency) {
	     this.currency = currency;
	 }
	
	 @Override
	 public String toString() {
	     return super.toString() + ", Capital: " + capital + ", Official Language: " + officialLanguage + ", Currency: " + currency;
	 }
}