package funcionalProgramming.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /**
         * Imperative programming approach (or standard approach)
         */
        List<Person> people = Arrays.asList(
                new Person("Tom", Gender.MALE),
                new Person("Harry", Gender.MALE),
                new Person("Ron", Gender.MALE),
                new Person("Mike", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Suzan", Gender.FEMALE),
                new Person("Lucy", Gender.FEMALE),
                new Person("Ammy", Gender.FEMALE)
        );
        /**
         * In imperative (standartinis) programming we define every single detail in order to achiev result
         * Eg. Define a list, define list for filteres products, iterate through list, add found items to
         * filtered list and finaly print out the list.
         */
        List<Person> females = new ArrayList<Person>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
            for (Person female : females) {
                System.out.println(female);
            }
            females.forEach(System.out::println);  // Funkcinio programavimo pavyzdys

            System.out.println("=====DECLARATIVE APPROACH=====");
            /**
             * Declarative programming or funcional style programming.
             */
            List<Person> females2 = people.stream()
                    .filter(person1 -> Gender.FEMALE.equals(person.getGender()))
                    .collect(Collectors.toList());
            females2.forEach(System.out::println);

            /**
             * Optimized way
             */
            System.out.println("DECLARATIVE APPROACH TO FIND ALL MALES");
            Predicate<Person> personPredicate = person1 -> Gender.MALE.equals(person.getGender());
            people.stream().filter(personPredicate).forEach(System.out::println);

            Predicate<Person> personPredicate1 = person1 -> Gender.FEMALE.equals(person.getGender());
            people.stream().filter(personPredicate1).forEach(System.out::println);

            System.out.println("USING FUNCION FUNCIONAL INTERFACE");
           /* Function<Person, String> personNameToUppercase = person -> person.getName().toUpperCase();
            // Using variables as argument defining PREDICATE and FUNCION
            people.stream().filter(personPredicate).map(personNameToUppercase).forEach(System.out::println);
            // Using inline variables with expressions defining PREDICATE and FUNCION.
            List<Person> naujasListas = people.stream().filter(person -> Gender.MALE.equals(person.getGender()))
                    .map(person -> person.getName(). toUpperCase().coll)
        }*/
        }
    }
}

