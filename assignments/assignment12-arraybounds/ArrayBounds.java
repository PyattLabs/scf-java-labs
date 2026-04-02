/**
 * ArrayBounds.java
 * COP 2250 - Assignment 12
 * Exception Handling (Liang 12.3)
 *
 * Name:
 * Date:
 */
import java.util.Scanner;

public class ArrayBounds {

    // -------------------------------------------------------
    // STEP 1 - Declare a static int array named data
    // Initialize it with values: {1, 2, 3, 4, 5}
    // -------------------------------------------------------
    // static int[] data = ...;

    // -------------------------------------------------------
    // STEP 2 - getElement(int index)
    // Return the element at the given index.
    // Do NOT catch the exception here -- let it propagate.
    // -------------------------------------------------------
    // public static int getElement(int index) {
    //
    // }

    // -------------------------------------------------------
    // STEP 3 - main loop
    // Prompt user for index in a loop until they enter -1.
    // Use try-catch for ArrayIndexOutOfBoundsException.
    // Use try-catch for NumberFormatException.
    // Use finally to print "Attempt complete." every time.
    // -------------------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // while (true) {
        //     System.out.print("Enter an index (or -1 to quit): ");
        //     String input = scanner.nextLine();
        //
        //     // STEP 4 - Check for quit condition first
        //
        //     // STEP 5 - try-catch-finally block
        //     //          parse input, call getElement, print result
        //     //          catch NumberFormatException
        //     //          catch ArrayIndexOutOfBoundsException
        //     //          finally: print "Attempt complete."
        // }

        System.out.println("Goodbye.");
        scanner.close();
    }
}
