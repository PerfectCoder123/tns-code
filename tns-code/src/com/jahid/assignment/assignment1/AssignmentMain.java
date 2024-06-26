package com.jahid.assignment.assignment1;

import com.jahid.assignment.assignment1.employees.Developer;
import com.jahid.assignment.assignment1.employees.Manager;
import com.jahid.assignment.assignment1.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the usage of Employee, Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1001, 95000, "HR");
        Developer developer = new Developer("Bob", 1002, 90000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
