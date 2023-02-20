package edu.snooze;/*
 * The application "main-class" (class with the main() method).
 * Every Java application has ONE main-class, and usually many "business" classes.
 *
 * Here, we will create a few instances of edu.snooze.AlarmClock and give them a basic test drive
 */

class AlarmClockClient {

    // The entry or starting point for every standalone Java application
    // The application "starts here"
    public static void main(String[] args) {
        // create an instance of edu.snooze.AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(AlarmClock.MAX_INTERVAL); // snooze as long as possible each time
        clock1.setRepeat(7);

        // call methods on it
        clock1.snooze();

        // create a second instance (object) of edu.snooze.AlarmClock and set its properties, also
        AlarmClock clock2 = new AlarmClock(10);

        //call methods on it, also
        clock2.snooze();

        // create a third edu.snooze.AlarmClock object, but this time DON'T set its properties
        AlarmClock clock3 = new AlarmClock(10,3);

        clock3.snooze();
        //show their toString() method in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3); // toString is automatically called
    }
}