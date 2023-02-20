package gov.abacus;

/*
 * This is an "all-static" class, i.e., class definition with nothing but static methods. These are called from the client as a Calculator.methodName().
 */

import java.util.Arrays;

class Calculator {

    /**
     * Returns the arithmetic mean (average) of the supplied integers.
     * mean()
     * average()
     * avg()
     */
    public static double average(int first, int... rest) {
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum += value; // sum = sum + value

        }

        result = sum / (rest.length + 1);
        return result;

    }

    public static double add(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static boolean isEven(int value) {
        return value % 2 == 0; // % is called mod. It is like division which will check if there is a remainder.
        // checking to see if number is even or odd. If it is it will say true.
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
    /**
     * Returns a random integer between 1 and 14 (inclusive).
     *
     * HINT: see a class called in the Java API (package java.lang).
     * Look for a helpful method here to get you started.
     * NOTE: these methods in the math class are "static," which means you call them as so:
     * Math.methodName()
     */
    public static int randomInt(){
        return randomInt(1,14); // delegate to min-max version with a 1 and 14
    }
    public static int randomInt(int max) {
        return  randomInt(1, max);
    }
    /**
     * Returns a random integer between 'min' and 'max' (inclusive).
     * We use the same method name as above for simplicity from the client perspective.
     * That is, the client has two flavors of randomInt to choose from.
     * This is called method overloading.
     */
    public static int randomInt(int min, int max) { // example 5 to 75
        int result = 0;

        double rand = Math.random();       //0.000000 to 0.999999
        double scaled = (rand * (max - min + 1)) + min; // 5.000000 to 75.999999

        result = (int) scaled;

        return result;
    }


}