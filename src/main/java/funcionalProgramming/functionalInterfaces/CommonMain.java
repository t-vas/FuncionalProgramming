package funcionalProgramming.functionalInterfaces;

import funcionalProgramming.example1.Gender;
import funcionalProgramming.example1.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CommonMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tom", Gender.MALE),
                new Person("Harry", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Lucy", Gender.FEMALE),
                new Person("Gordon", Gender.MALE),
                new Person("Suzan", Gender.FEMALE),
                new Person("Danny", Gender.MALE),
                new Person("Ann", Gender.FEMALE)
        );
        System.out.println("Function FUNCTION interface");
        int increasedNumber = incrementByOneFunction.apply(1);
        System.out.println(increasedNumber);
        //So after we declare a functional interface FUNCTION we can do like this:
        increasedNumber = incrementByOneFunction.apply(1);
        System.out.println(increasedNumber);
        //we want to do some additional logic with the same variable
        //after addition we want to multiply it by 2
        int number = incrementByOneFunction.andThen(multiplyNumberBy2).andThen(subtractFiveFromNumber).apply(3);
        System.out.println(number);
        System.out.println("Functional BiFUNCTION interface");
        System.out.println(incrementByOneAndMultiply.apply(13, 2));
        System.out.println(calculateTwoPersonNameLength.apply(
                new Person("Tom", Gender.MALE),
                new Person("Darius", Gender.MALE))
        );
        System.out.println("Functional CONSUMER interface");
        Customer2 customer = new Customer2("Maria", "+370684156456");
        greetCustomer.accept(customer);
        greetCustomerBiConsumer.accept(customer, true);
        greetCustomerBiConsumer.accept(customer, false);
        System.out.println("Functional PREDICATE interface");
        System.out.println(isPhoneNumberValid.test("+37065125418"));
        List<String> eilutes = new ArrayList<>();
        eilutes.add("+37065125418");
        eilutes.add("+37065121565");
        eilutes.add("+37165564564");
        eilutes.stream().filter(phoneNumber -> phoneNumber.startsWith("+371")).forEach(System.out::println);
    }
    private static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    private static Function<Integer, Integer> multiplyNumberBy2 = number -> number * 2;
    private static Function<Integer, Integer> subtractFiveFromNumber = number -> number - 5;
    private static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (numberToProcess, multiplyBy) -> (numberToProcess + 1) * multiplyBy;
    private static BiFunction<Person, Person, Integer> calculateTwoPersonNameLength =
            ((person, person2) -> person.getName().length() + person2.getName().length());
    private static Consumer<Customer2> greetCustomer = customer -> System.out.println("Hello, " + customer.getName()
            + ", thanks for registering your number: "
            + customer.getPhoneNumber());
    private static BiConsumer<Customer2, Boolean> greetCustomerBiConsumer = ((customer, showPhone) ->
            System.out.println("Hello, " + customer.getName() + ", thanks for registering " + (showPhone ? customer.getPhoneNumber() : "*********")));
    private static Predicate<String> isPhoneNumberValid = number ->  number.startsWith("+370") && number.length() == 12;
}
class Customer2 {
    private String name;
    private String phoneNumber;
    public Customer2(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}