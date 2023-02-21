/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new Executive("Lyndsey", LocalDate.of(1984, 5, 5), 1000000));
        dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24), 32, 30.0));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 120000.0));
        dept.addEmployee(new SalariedEmployee("Chad", LocalDate.of(2023, 2, 6), 100000.0));
        dept.addEmployee(new HourlyEmployee("Jay", LocalDate.of(2011, 6, 15), 40.0, 40.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all Employees
        System.out.println("\n Pay all employees:");
        dept.payEmployee();

        // holiday break
        System.out.println("\n Take mandatory vacation time");
        dept.holidayBreak();
    }
}