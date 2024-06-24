package com.jahid.assignment.assignment3;

public class Main {
    public static void main(String[] args) {
    	  Continent asia = new Continent("Asia", 44579000, 46000000);
          Continent europe = new Continent("Europe", 10180000, 7460000);

          Country japan = new Country("Japan", 377975, 12580000, "Tokyo", "Japanese", "Yen");
          Country germany = new Country("Germany", 357022, 831000, "Berlin", "German", "Euro");

          State washingtonDc = new State("USA", 9833517, 3310000, "Washington, D.C.", "English", "Dollar", "Jay Inslee", "Seattle", 39);
          State newDelhi = new State("India", 3287263, 13934090, "New Delhi", "Hindi", "Rupee", "Arvind Kejriwal", "Mumbai", 28);

          System.out.println(asia);
          System.out.println(europe);
          System.out.println(japan);
          System.out.println(germany);
          System.out.println(washingtonDc);
          System.out.println(newDelhi);
    }
}