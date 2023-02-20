package gov.abacus;

import java.util.Arrays;

class CalculatorClient {

    public static void main(String[] args) {
       
        double sum = Calculator.add(3.1,5.1);
        double product = Calculator.multiply(3,5);
        double difference = Calculator.subtract(3,5);//okay to pass ints where doubles are expected. It's called and implicit upcast.
        boolean IsEven = Calculator.isEven(3);
        double quotient = Calculator.divide(15,5);

//        System.out.println("The sum is: " + sum);
//        System.out.println("The product of the two factors is: " + product);
//        System.out.println("The difference is: " + Calculator.subtract(3,5));
//        System.out.println("Is the number even? " + Calculator.isEven(10));
//        System.out.println("The quotient is: "+ quotient);
//        System.out.println();
//
//        int damage = Calculator.randomInt();
//        System.out.println("The winner is: " + damage);
//
//        int newWinner = Calculator.randomInt(5, 10);
//        System.out.println("The new winner is: " + newWinner );
//        int [] inputs = {2, 6, 6, 5};
        double average = Calculator.average(2, 6, 6, 5); // Client must pass at least one value.
        System.out.printf("The average of %s=",average );


    }
}