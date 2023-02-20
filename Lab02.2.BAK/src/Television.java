/*
 *Business class to model the workings of a television set
 * No main() method here.
 */

class Television {
    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }
// --------------------------------------------------------------------------------------------------------------------
     // properties go here: FIELDS or INSTANCE VARIRABLES
    private String brand = "Toshiba"; // default will be null for String, and 0 for int.
    private int volume = 1; // selected default was 1
    private int oldVolume; // not exposed via get/set methods - internal use only
    private boolean isMuted;

    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1
    }
    public Television(String brand){
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    // functions or operations, called methods: BUSINESS METHODS

    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Your " + getBrand() + " is now on, and your volume is " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down your " + getBrand() + " TV. Goodbye");
    }

    public void mute(){
        if (!isMuted()){  // not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {             // are currently muted
            setVolume(oldVolume);
            isMuted = false;
        }

    }

    // ACCESSOR METHODS - provide "controlled access" to the object's internal (private) data


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals ("Samsung") ||
                brand.equals("LG") ||
                brand.equals("Sony") ||
                brand.equals("Toshiba")){

            this.brand = brand;
            System.out.println("Acceptable TV Brand");
        }

        else {
            System.out.println("TV brand is invalid");
        }
    }

    public int getVolume() {
        return volume;
    }
    // data constraint: must be  [0-100]
    public void setVolume(int volume) {

        if (volume >= MIN_VOLUME && volume <=MAX_VOLUME ) {  // valid
            this.volume = volume;
            isMuted = false;

        }
        else {
            System.out.println("Invalid volume " + volume + ". Volume must be in " + MIN_VOLUME + "-" + MAX_VOLUME);
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

      private boolean verifyInternetConnection() {
        return true; // fake implementation (obviously)
    }
    //TOSTRING
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: brand=" + getBrand() + ", volume=" + volumeString;
    }

// ctrl + / will change lines of code into comments. We did this to show inheritance of the toString() method.

}
