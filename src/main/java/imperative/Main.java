package imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rock", Gender.MALE),
                new Person("John", Gender.MALE),
                new Person("Taker", Gender.MALE),
                new Person("Leena", Gender.FEMALE)
        );

        System.out.println("// Imperative approach");

        List<Person> females = new ArrayList<>();

        for(Person person : people)
        {
            if(Gender.FEMALE.equals(person.gender))
                females.add(person);
        }

        for(Person person : females)
        {
            System.out.println(person);
        }

        System.out.println("// Declarative approach");

        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);

    }

    private static class Person {

        private final String name;
        private final Gender gender;

        private Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    private enum Gender {
        MALE, FEMALE;
    }
}