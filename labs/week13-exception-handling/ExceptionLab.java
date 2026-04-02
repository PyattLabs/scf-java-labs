/**
 * ExceptionLab.java
 * COP 2250 - Week 13 Lab
 * Exception Handling
 *
 * Read each method. Wrap or throw exceptions as instructed.
 * Uncomment main calls as you complete each step.
 */
import java.util.Scanner;

public class ExceptionLab {

    // -------------------------------------------------------
    // STEP 1 - Catch ArrayIndexOutOfBoundsException
    // Wrap the array access in try-catch.
    // Print "Caught: " + the exception message on error.
    // -------------------------------------------------------
    public static void step1() {
        int[] numbers = {10, 20, 30};
        // This will crash -- wrap it
        System.out.println(numbers[5]);
    }

    // -------------------------------------------------------
    // STEP 2 & 3 - NumberFormatException + finally
    // Wrap Integer.parseInt() in try-catch.
    // Add a finally block that always prints:
    // "Input attempt complete."
    // -------------------------------------------------------
    public static void step2(String input) {
        int value = Integer.parseInt(input);
        System.out.println("Parsed: " + value);
    }

    // -------------------------------------------------------
    // STEP 4 - Throw manually
    // If age < 0, throw IllegalArgumentException.
    // Message: "Age cannot be negative: " + age
    // -------------------------------------------------------
    public static void step4(int age) {
        System.out.println("Age is: " + age);
    }

    // -------------------------------------------------------
    // STEP 5 - Multiple catch blocks
    // This method may throw ArithmeticException (divide by zero)
    // or ArrayIndexOutOfBoundsException (bad index).
    // Write separate catch blocks for each.
    // -------------------------------------------------------
    public static void step5(int index, int divisor) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[index] / divisor);
    }

    // -------------------------------------------------------
    // MAIN
    // -------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("--- Step 1 ---");
        // step1();

        System.out.println("\n--- Step 2 & 3 ---");
        // step2("42");
        // step2("abc");

        System.out.println("\n--- Step 4 ---");
        // step4(25);
        // step4(-5);

        System.out.println("\n--- Step 5 ---");
        // step5(1, 2);    // normal
        // step5(1, 0);    // ArithmeticException
        // step5(9, 2);    // ArrayIndexOutOfBoundsException
    }
}
