package funcionalProgramming.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate functional interface represents single argument function that returns a boolean value.
 */
public class PredicateMain {

    public static void main(String[] args) {
        /**
         * Regularapproach
         */
        System.out.println(isPhoneNumberValid("+37065432456"));

        /**
         * Predicate approach
         */
        System.out.println(isPhoneNumberValid.test("+37065432456"));
        List<String> eilutes = new ArrayList<>();
        eilutes.add("+370654876456");
        eilutes.add("+370637890456");
        eilutes.add("+371654876456");

        eilutes.stream().filter(phoneNumber->phoneNumber.startsWith("+371")).forEach(System.out::println);

    }
    private static Predicate<String> isPhoneNumberValid = number -> number.startsWith("+370") && number.length() == 12;

    private static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+370") && phoneNumber.length() == 12;
    }

}
