package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class Program {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Elle", "Dorvil", 26));
        person.add(new Person("Sarah", "Vain", 21));
        person.add(new Person("Jake", "Statefarm", 31));
        person.add(new Person("Katie", "Baker", 16));
        person.add(new Person("Billy", "Johnson", 55));
        person.add(new Person("Ashley", "Vargas", 18));
        person.add(new Person("Zack", "Gatsy", 25));
        person.add(new Person("Gail", "Shappe", 75));
        person.add(new Person("Kelley", "Cadet", 13));
        person.add(new Person("Veronica", "Brown", 37));

    }
    public ArrayList<Person> getByFirstName(String firstName) {
        ArrayList<Person> matches = new ArrayList<>();
            for (Person p : person)
                if (p.getFirstName().equalsIgnoreCase(firstName)) {
                    matches.add(p);
                }
            return matches;
    }
}
