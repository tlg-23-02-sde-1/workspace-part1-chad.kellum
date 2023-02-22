package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;

    // constructors
    public SalariedEmployee() {
        super();  // constructor chaining. This super is automatically put in the ctor whether it is visible or not.
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public SalariedEmployee(String name, LocalDate hireDate, double salary){
        this(name, hireDate); // delegate to neighboring ctor for name, hireDate
        setSalary(salary);    // handle salary myself, by delegating to setter
    }
    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary. Monthly pay is " + (getSalary() / 12) + " (before taxes!)" );
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    @Override
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    // accessor methods

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }

    @Override
    public void payTaxes() {
        double taxes = salary * SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes " + taxes);
    }
}