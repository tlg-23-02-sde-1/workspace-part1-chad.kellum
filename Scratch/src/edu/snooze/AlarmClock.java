package edu.snooze;

/*
 * System or "business class" to model the workings of an alarm clock.
 * This class definition has no main() method - most classes don't
 */
class AlarmClock {
//class-level ("static") fields
    // there is only one copy of these, and they live up in that class-wide common area
    // NOT in each instance (edu.snooze.AlarmClock object)
    public static final int MIN_INTERVAL = 1; //static means shared (in the class level common area) "class constants"
    public static final int MAX_INTERVAL = 20; //final means fixed
    // attributes or properties are synonyms of the following
    // fields or instance variables
    // usually declared at the top of the class definition
    private int snoozeInterval = 5; // Default will be 0 unless specified
    private int repeat = 10;

    // constructors
    public AlarmClock() {
        // sync time
    }
    public AlarmClock(int snoozeInterval) {
        this();                                // delegate to the setter
        setSnoozeInterval(snoozeInterval);
    }
    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);
        setRepeat(repeat);
    }

    // functions are what the object can do
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval()+ " minutes");
    }

    // accessor methods - provide controlled access to the object's internal (private) data

    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    // data constraint: must be 1-20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    ", Must be in range " + MIN_INTERVAL + "-" + MAX_INTERVAL);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "edu.snooze.AlarmClock: snoozeInterval=" + getSnoozeInterval() + ", repeat = " + getRepeat();
    }
}