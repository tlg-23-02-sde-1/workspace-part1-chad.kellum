package gov.research;

import java.util.*;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 36;
        ages[1] = 37;
        System.out.println(ages); //toString does not produce the ages in the array
        System.out.println(Arrays.toString(ages)); // this one does, must import package to help run
        System.out.println();

        double[] prices = {9.99, 37.49, 49.96, 32.5};
        System.out.println("prices has length: " + prices.length);
        System.out.printf("The prices are %s\n", prices);
        System.out.println(Arrays.toString(prices));
        System.out.println();

        String[] names = {"chad", "lyndsey", "finn", "kupo"};
        System.out.println(Arrays.toString(names));
        System.out.println();

        for (String name : names){
            System.out.println(name);
        }
    }

}