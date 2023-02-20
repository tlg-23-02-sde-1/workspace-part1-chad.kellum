package human.being;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Chad", LocalDate.of(1986,7,2));
        System.out.println(p1);
        System.out.printf("%s is %s years old. ", p1.getName(), p1.getAge());
        System.out.printf("What's my age again? %s", p1.getAge());
    }
}