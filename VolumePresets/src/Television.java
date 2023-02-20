/*
 *Business class to model the workings of a television set
 * No main() method here.
 */

class Television {
    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};
    public static int getInstanceCount() {
        return instanceCount;
    }
// --------------------------------------------------------------------------------------------------------------------
     // properties go here: FIELDS or INSTANCE VARIRABLES
    private String brand; // default will be null for String, and 0 for int.
    private Integer volume; //
    private DisplayType display = DisplayType.LED; // Null by default.
    private VolumeLevel loudness;

    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1
    }
    public Television(String brand){
        this();
        setBrand(brand);
    }
    public Television(String brand, Integer volume) {
        this(brand);
        setVolume(volume);
    }
    public Television(String brand, VolumeLevel loudness){
        this(brand);
        setVolumeLevel(loudness);
    }
    public Television(String brand, Integer volume, DisplayType display, VolumeLevel volumeLevel) {
        this(brand, volume, VolumeLevel loudness);
        setDisplay(display);
    }


    // functions or operations, called methods: BUSINESS METHODS

    public void turnOn() {
        // call private method for this task
//        boolean isConnected = verifyInternetConnection(); Does not work, just an example
        System.out.println("Your " + getBrand() + " is now on, and your volume is " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down your " + getBrand() + " TV. Goodbye");
    }

    // ACCESSOR METHODS - provide "controlled access" to the object's internal (private) data


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

//        switch (brand){
//            case "Samsung":
//            case "LG":
//            case "Sony":
//            case "Toshiba":
//                this.brand = brand;
//                break;
//            default:
//                System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, Sony, Toshiba");
//        }
        if (brand.equalsIgnoreCase (VALID_BRANDS[0]) ||
                brand.equals(VALID_BRANDS[1]) ||
                brand.equals(VALID_BRANDS[2]) ||
                brand.equals(VALID_BRANDS[3])){
            this.brand = brand;
            System.out.println("Acceptable TV Brand");
        }

        else {
            System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, Sony, Toshiba");
        }
    }

    public int getVolume() {
        return volume;
    }
    // data constraint: must be  [0-100]
    public void setVolume(int volume) {

        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME ) {
            this.volume = volume;
            System.out.println("The volume is within range of 0-100.");
        }
        else {
//            System.out.println("Invalid volume " + volume  + ". Volume must be in " + MIN_VOLUME + "-" + MAX_VOLUME);
            System.out.printf("Invalid volume %s, valid range %s-%s\n", volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public VolumeLevel getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(VolumeLevel volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation (obviously)
    }
    //TOSTRING
    public String toString() {

        return String.format("Television: brand=%s, volume=%s, display=%s\n", getBrand(), getVolume(), getDisplay());
//        return "Television: brand=" + getBrand() + ", volume=" + getVolume() + ", display type=" + getDisplay();
    }

// ctrl + / will change lines of code into comments. We did this to show inheritance of the toString() method.

}
