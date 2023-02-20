/*
 *Business class to model the workings of a television set
 * No main() method here.
 */

import java.util.Arrays;

class Television {
    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"}; // a better way to do this is with an enum
    public static int getInstanceCount() {
        return instanceCount;
    }
// --------------------------------------------------------------------------------------------------------------------
     // properties go here: FIELDS or INSTANCE VARIABLES
    private String brand; // default will be null for String, and 0 for int.
    private int volume; //
    private DisplayType display = DisplayType.LED; // Null by default.

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
    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
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
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand: " + brand + ", valid brands are " + Arrays.toString(VALID_BRANDS));
        }
    }
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
        // data constraints: must be Samsung, Sony, LG, Toshiba
        public static boolean isValidBrand(String brand) {
            boolean valid = false;

            for (String validBrand : VALID_BRANDS) {
                if (validBrand.equalsIgnoreCase(brand)) {
                    valid = true;
                    break; // If you have a match, then exit the loop
                }

            }
            return valid;
        }


//        if (brand.equals(VALID_BRANDS[0]) ||  // This is not a good way to do this because I would have to write extra lines of code for every addition.
//                brand.equals(VALID_BRANDS[1]) ||
//                brand.equals(VALID_BRANDS[2]) ||
//                brand.equals(VALID_BRANDS[3])){
//            this.brand = brand;
//            System.out.println("Acceptable TV Brand");
//        }
//
//        else {
//            System.out.println("Invalid brand: " + brand + ", valid brands are " + Arrays.toString(VALID_BRANDS));
//        }



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
