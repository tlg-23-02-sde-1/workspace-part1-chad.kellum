package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;
    private double hours;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);  // delegate to neighboring constructor
        setRate(rate);
        setHours(hours);
    }

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
    public String toString() {
        return "Employee: name=" + getName() + ", hireDate=" + getHireDate() + ", rate of pay=" + getRate() +
                ", hours per week=" + getHours();
    }
}