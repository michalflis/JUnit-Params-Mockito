package javacollections;

public class Person implements Comparable<Person>{

    private final String firstName;
    private final String sureName;
    private final int yearOfBirth;
    private double height;
    private double weight;

    public Person (String firstName, String sureName, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.yearOfBirth, this.yearOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
