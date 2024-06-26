package com.jahid.assignment.assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary for Kaif: ");
        double kaifSalary = scanner.nextDouble();
        TaxPayer kaif = new Kaif(kaifSalary);
        
        System.out.print("Enter your salary for Aazen: ");
        double aazenSalary = scanner.nextDouble();
        TaxPayer aazen = new Aazen(aazenSalary);

        System.out.println("Tax calculation by Kaif:");
        kaif.displayTax();

        System.out.println("Tax calculation by Aazen:");
        aazen.displayTax();

        scanner.close();
    }
}
