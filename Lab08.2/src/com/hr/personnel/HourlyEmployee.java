package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
         super();                   // constructor chaining. This super is automatically put in the ctor whether it is visible or not.
    }


    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);  // delegate to neighboring constructor
        setRate(rate);
        setHours(hours);
    }
    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly, and one week's pay is " +
               (getRate() * getHours()) + " (before taxes!)");
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return super.toString() + ", rate of pay=" + getRate() +
                ", hours per week=" + getHours();
    }
}