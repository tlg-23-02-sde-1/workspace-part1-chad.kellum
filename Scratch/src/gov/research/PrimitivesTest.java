package gov.research;

class PrimitivesTest {

    public static void main(String[] args) {

        int age = 36;
        System.out.println("The age is: " + age);

        long population = 7_000_000_000L;
        System.out.println("The population is: " + population);

        double height = 170.18;
        System.out.println("My height is: " + height);

        boolean isTall = true;
        System.out.println("I am tall? " + isTall);

        char grade = 'B';
        System.out.println("I got a " + grade + " on the test.");

        String sentence = "My favorite word is \"belly\"";
        System.out.println(sentence);

        int i = 18;
        System.out.println(i);

        int j = i;
        System.out.println(j);

        i++; // i is 19. what is j? Still 18
        System.out.println(i);
        System.out.println(j);

        int n = 3;
        System.out.println(n++);

        ++n;
        System.out.println(n);

    }
}