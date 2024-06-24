package com.jahid.assignment.assignment3;

//Continent.java
public class Continent {
	 private String name;
	 private double area; // in square kilometers
	 private int population;
	
	 public Continent(String name, double area, int population) {
	     this.name = name;
	     this.area = area;
	     this.population = population;
	 }
	
	 public String getName() {
	     return name;
	 }
	
	 public void setName(String name) {
	     this.name = name;
	 }
	
	 public double getArea() {
	     return area;
	 }
	
	 public void setArea(double area) {
	     this.area = area;
	 }
	
	 public int getPopulation() {
	     return population;
	 }
	
	 public void setPopulation(int population) {
	     this.population = population;
	 }
	
	 @Override
	 public String toString() {
	     return "Continent: " + name + ", Area: " + area + " sq km, Population: " + population;
	 }
}
