class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv = new Television();
        tv.setVolume(0);
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1); // error message
        tv.setVolume(101);  // error message
        System.out.println(tv);  // still 100 volume because that was the last valid int.

        System.out.println(); // blank line for readability

        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setBrand("INVALID"); // error message, brand not set
        System.out.println(tv); // should still be Toshiba, since it was the last valid String.

    }
}