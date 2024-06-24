package com.jahid.assignment.assignment3;

//State.java
public class State extends Country {
 private String governor;
 private String largestCity;
 private int numberOfCounties;

 public State(String name, double area, int population, String capital, String officialLanguage, String currency, String governor, String largestCity, int numberOfCounties) {
     super(name, area, population, capital, officialLanguage, currency);
     this.governor = governor;
     this.largestCity = largestCity;
     this.numberOfCounties = numberOfCounties;
 }

 public String getGovernor() {
     return governor;
 }

 public void setGovernor(String governor) {
     this.governor = governor;
 }

 public String getLargestCity() {
     return largestCity;
 }

 public void setLargestCity(String largestCity) {
     this.largestCity = largestCity;
 }

 public int getNumberOfCounties() {
     return numberOfCounties;
 }

 public void setNumberOfCounties(int numberOfCounties) {
     this.numberOfCounties = numberOfCounties;
 }

 @Override
 public String toString() {
     return super.toString() + ", Governor: " + governor + ", Largest City: " + largestCity + ", Number of Counties: " + numberOfCounties;
 }
}