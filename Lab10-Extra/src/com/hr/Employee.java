package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

//     CONSTRUCTORS
//
//
//
public Employee(String name) {
    this.name = name;
}

// BUSINESS METHODS
    /*
     * OPTION 4: try-catch, but then throw a different one.
     * We are "nesting" the underlying 'cause' exception into a higher-level,
     * more HR-oriented
     */
    public void goToWork() throws WorkException {
        Car c = new Car("TK421", "Tesla" , "Model 3");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop(); // Important to stop() the Car, no matter what
        }

    }



    /*
     * OPTION 3: try-catch "respond" in some way, and then re-throw.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TK421", "Tesla" , "Model 3");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Email sent to Lisa Herbold to complain.");
            throw e;
        }
        finally {
            c.stop(); // Important to stop() the Car, no matter what
        }

    }
     */

    /*
     * OPTION 2: "punt," i.e. don't handle any thrown exception at all.
     * Because the exception
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TK421", "Tesla" , "Model 3");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop(); // Important to stop() the Car, no matter what
        }

    }
    */
    /*
     * OPTION 1: try-catch and handle any thrown exception
     *
     */
    //    public void goToWork() {
//        Car c = new Car("TK421", "Tesla" , "Model 3");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        }
//        catch (DestinationUnreachableException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            c.stop(); // Important to stop() the Car, no matter what
//        }
//
//
//        System.out.println("Arrived at work");
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}