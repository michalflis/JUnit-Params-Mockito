package javacollections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain {

    public static void main (String[] args) {
        Set<Person> personList = new TreeSet<>();
        personList.add(new Person("Michał", "Flis", 1986, 1.72,86.5));
        personList.add(new Person("Jan", "Kowalski", 1975, 2.13,120.4));
        personList.add(new Person("Anna", "Kwiatkowska", 2000, 1.58,55.9));
        personList.add(new Person("Dorota", "Nowak", 1952, 1.62,60.1));

        System.out.println("Osoby uporządkowane od najmłodszej do najstarszej:");
        for (Person person : personList) System.out.println(person.getFirstName() + ", " + person.getYearOfBirth() + " rok.");
        System.out.println();

        Set<Person> personListByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
                        }
        });
        personListByHeight.add(new Person("Michał", "Flis", 1986, 1.72,86.5));
        personListByHeight.add(new Person("Jan", "Kowalski", 1975, 2.13,120.4));
        personListByHeight.add(new Person("Anna", "Kwiatkowska", 2000, 1.58,55.9));
        personListByHeight.add(new Person("Dorota", "Nowak", 1952, 1.62,60.1));

        System.out.println("Osoby uporządkowane od najniższej do najwyższej:");
        for (Person person : personListByHeight) System.out.println(person.getFirstName() + ", " + person.getHeight() + " m.");
        System.out.println();

        Set<Person> personListByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getWeight(), o1.getWeight());
            }
        });
        personListByWeight.add(new Person("Michał", "Flis", 1986, 1.72,86.5));
        personListByWeight.add(new Person("Jan", "Kowalski", 1975, 2.13,120.4));
        personListByWeight.add(new Person("Anna", "Kwiatkowska", 2000, 1.58,55.9));
        personListByWeight.add(new Person("Dorota", "Nowak", 1952, 1.62,60.1));

        System.out.println("Osoby uporządkowane od najcięższej do najlżejszej:");
        for (Person person : personListByWeight) System.out.println(person.getFirstName() + ", " + person.getWeight() + " kg.");
        System.out.println();
    }

}
