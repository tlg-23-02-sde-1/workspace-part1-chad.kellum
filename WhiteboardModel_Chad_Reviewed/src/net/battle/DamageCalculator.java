package net.battle;

// JR: unused, since you say "Math.random()" below
import static java.lang.Math.*;

/*
 * JR: better class name might be just Damage, and method name perhaps = get()
 * Client would say Damage.get().
 *
 * randomInt() flawed, see comments below.
 */
public class DamageCalculator {

    // JR: Infinite recursive call - if you hover over IntelliJ's "suggestion paint":
    //  "Method 'randomInt()' recurses infinitely, and can only end by throwing an exception"
    //  That exception would be a java.lang.StackOverflowError, and the JVM terminates.
    public static int randomInt() {
        return randomInt();
    }

    public static int randomInt(int min, int max) {
        int result = 0;

        double rand = Math.random();
        double scaled = (rand * (max - min + 1)) + min;

        result = (int) scaled;

        return result;
    }


}