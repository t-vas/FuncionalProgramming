package funcionalProgramming.example2;

import funcionalProgramming.example1.Gender;
import funcionalProgramming.example1.Person;

import java.util.function.BiFunction;

public class BiFunctionMain {

    public static void main(String[] args) {
        //Regular approach
        int myNumber = incrementByOneAndMultiply(5, 3);
        System.out.println(myNumber);
        System.out.println(incrementByOneAndMultiply.apply(13,2));

        System.out.println(calculateTwoPersonLenght.apply(
                new Person("Tom", Gender.MALE),
                new Person("John", Gender.MALE)
        ));
    }

    private static int incrementByOneAndMultiply(int numberToProcess, int multiplyBy) {
        return (numberToProcess + 1) * multiplyBy;
    }

    private static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (numberToProcess, multiplyBy) -> (numberToProcess + 1) * multiplyBy;

    private static  BiFunction<Person, Person, Integer> calculateTwoPersonLenght =
            ((person, person2) -> person.getName().length() + person2.getName().length());

}
