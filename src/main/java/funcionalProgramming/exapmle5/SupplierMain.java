package funcionalProgramming.exapmle5;

import java.util.function.Supplier;

public class SupplierMain {
    /**
     *
     * Supplier functional interface
     * DOES NOT take any arbuments BUT produces the RESULT (Has a return type)
     * NOTE: Consumer is the opposite
     */
    public static void main(String[] args) {
        /**
         * Regular approach
         */

        System.out.println(getDBConnectionURL.get());
    }

    private static Supplier<String> getDBConnectionURL = () -> "jdbs:localhost:5432/userDB";

    private static String getDBConnectionURL() {
        return "jdbs:localhost:5432/userDB";
    }
}
