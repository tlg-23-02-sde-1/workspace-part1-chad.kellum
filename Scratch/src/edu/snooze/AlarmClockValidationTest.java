package edu.snooze;

/*
 * Test class focused on validation testing.
 * We will do BVT (Boundary Value Testing) for snoozeInterval:
 * range 1-20 (inclusive)
 * need to check on the boundaries
 * 0, 1 and 20, 21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1); // should "stick" i.e., the edu.snooze.AlarmClock has a value of 1 and no error message
        System.out.println("The snooze interval is: " + clock.getSnoozeInterval()); //Should be 1

        clock.setSnoozeInterval(20); // should "stick" and no error message
        System.out.println("The snooze interval is: " + clock.getSnoozeInterval()); // Should be 20

        clock.setSnoozeInterval(0); // should be error message and refer back to the previous accepted value (20)
        clock.setSnoozeInterval(21); //should be error message and refer back to the previous accepted value (20)
        System.out.println("The snooze interval is: " + clock.getSnoozeInterval());// should still be 20

    }
}