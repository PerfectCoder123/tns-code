package com.jahid.assignment.assignment5;

public class Kaif extends TaxPayer {

    public Kaif(double salary) {
        super(salary);
    }

    public double calculateTax() {
        return salary * 0.15;
    }
}
