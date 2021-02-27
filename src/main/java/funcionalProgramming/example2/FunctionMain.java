package funcionalProgramming.example2;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {

        int increasedNumber = incrementByOneFuncion(1);
        System.out.println(increasedNumber);

        //So after we declare a funcional interface FUNCTION we can do like this:
        increasedNumber = incrementByOneFunction.apply(1);
        System.out.println(increasedNumber);

        // we want to do some additional logic with the same variable;
        // after additiona we want to multiply by 2;

        int number = incrementByOneFunction.andThen(multiplyNumberBy2).andThen(subtractFiveNumber).apply(3);
        System.out.println(number);
    }

    /**
     * Normal function in java
     * Takes ONE argument
     * Returns ONE result
     * @param number
     * @return
     */
    private static int incrementByOneFuncion(int number) {
        return number + 1;
    }
    /**
     * This time, let's create a Funcion (funcional interface)
     * We ahve to declare Input and Output type
     */
    private static Function<Integer, Integer> incrementByOneFunction = number -> number +1;
    private static Function<Integer, Integer> multiplyNumberBy2 = number -> number * 2;
    private static Function<Integer, Integer> subtractFiveNumber = number -> number - 5;

}
