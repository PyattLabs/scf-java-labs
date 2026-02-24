// ============================================
// LAB 07: Method Practice
// COP2250 Java Programming
// Kevin Pyatt, Ph.D. | Pyatt Labs
// ============================================

import java.util.Scanner;

public class MethodPractice {

    // ---- METHOD 1: displaySortedNumbers ----
    // TODO: Write a public static void method called displaySortedNumbers
    // Parameters: double num1, double num2, double num3
    // It should print all three numbers in increasing order on one line
    // Hint: Use if/else to find min, mid, max
    //       Or use Math.min() and Math.max()


    // ---- METHOD 2: sumDigits ----
    // TODO: Write a public static int method called sumDigits
    // Parameter: long n
    // Returns: the sum of all digits in n
    // Hint: Use n % 10 to get the last digit
    //       Use n / 10 to remove the last digit
    //       Use a while loop
    //       Handle negative numbers with Math.abs()


    // ---- MAIN METHOD ----
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test displaySortedNumbers
        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        // TODO: Call displaySortedNumbers with n1, n2, n3

        System.out.println();

        // Test sumDigits
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        // TODO: Call sumDigits and print the result
        // Expected output: "Sum of digits: X"

        input.close();
    }
}
