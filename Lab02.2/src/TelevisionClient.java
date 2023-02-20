class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created."); // shows count before instances = 0
        System.out.println(); // prints blank line
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        Television tv2 = new Television("Sony", Television.MAX_VOLUME, DisplayType.CRT);
//        tv2.setBrand("Sony");
//        tv2.setVolume(50);


        Television tv3 = new Television("LG", Television.MIN_VOLUME, DisplayType.OLED);

        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();// prints blank line, better readability
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();
//      verifyInternetConnection(); // this method is private and can't be called by the client

        System.out.println(tv1.toString()); // toString is not needed. It is inferred when you pass an object reference
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(Television.getInstanceCount() + " instances"); // shows the count of instances after the instances have been created = 3
    }
}
