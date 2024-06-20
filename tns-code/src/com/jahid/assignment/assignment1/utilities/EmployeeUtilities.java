package com.jahid.assignment.assignment1.utilities;

import com.jahid.assignment.assignment1.employees.Developer;
import com.jahid.assignment.assignment1.employees.Employee;
import com.jahid.assignment.assignment1.employees.Manager;

/**
 * Utility class for performing operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Prints details of the employee.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }
}
