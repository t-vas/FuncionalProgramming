package funcionalProgramming.example3;

import funcionalProgramming.example2.BiFunctionMain;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Consumer functional interface
 * Accepts ONE argument and returns NO result. (nuo zodzio - Consume - vartoti)
 * Acts like a void function, without return type.
 */

public class ConsumerMain {
    public static void main(String[] args) {
        /**
         * Regular approach (imperative)
         */
        Customer customer = new Customer("Maria", "+37055643245");
        greetCustomer(customer);

        /**
         * Functional programming approach
         */
        greetConsumer.accept(customer);
        greetCustomerBiConsumer.accept(customer, false);
    }
    //Regular method
    private static void greetCustomer(Customer customer) {
        System.out.println("Hello, " + customer.getName() + ", thanks for registering your number: "
        + customer.getPhoneNumber());
    }

    // Consumer functional interface approach
    private static Consumer<Customer> greetConsumer = customer -> System.out.println("Hello, " + customer.getName()
            + ", thanks for registering your number: "
            + customer.getPhoneNumber());

    private static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = ((customer, showPhone) ->
            System.out.println("Hello, " + customer.getName() + ", thanks for registering " + (showPhone ? customer.getPhoneNumber() : "*********")));

}
class Customer {
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
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