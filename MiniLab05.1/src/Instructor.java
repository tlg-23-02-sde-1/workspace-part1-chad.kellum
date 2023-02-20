/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Instructor {

    public void doubleIt(int value) {
        value *= 2;  // value = value * 2
        System.out.println("Instructor: I have doubled the value to now be " + value);
    }

    /**
     * NOTE: this method will modify the state of the Marker passed in to be blue.
     * You've been warned!
     */
    public void writeOnBoard(final Marker marker, String message) {
//        marker = new Marker("green"); //can't refer to a new object, but you can change it's color.
        marker.setColor("blue");  // HA!  Whatever it was before, it's blue now!
        System.out.println("Instructor: writing '" + message + "' on the board");
    }
}