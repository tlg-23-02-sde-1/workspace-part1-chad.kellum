package human.being;/*
 * An immutable class. More accurately, this is a class definition written
 * in such a way that instances of it (human.being.Person objects) cannot have their properties
 * changed once created. In short: getters but no setters.
 */

import java.time.LocalDate;
import java.time.Period;

class Person {

    // properties (fields of instance variables)
    private String name;
    private LocalDate birthDate;


    //constructors
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    // accessor methods

    /**
     * Returns the human.being.Person's age in whole years
     *
     * This can be derived from the birthDate and today's date
     * You basically need to get the period of time (in whole years) between
     * the birthDate and today's date
     */
    public int getAge() {
        //return Period.between(getBirthDate(), LocalDate.now()).getYears;
        Period period = Period.between(getBirthDate(), LocalDate.now());
        return period.getYears();
    }
//    private String setName(){
//        boolean nameLength
//    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String toString() {
        return String.format("human.being.Person: name=%s, birthDate=%s, age=%s", getName(),getBirthDate(),getAge());
    }
}