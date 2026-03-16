/**
 * Assignment 8: Sum of Columns in a Matrix
 *
 * COP2250 Java Programming
 * Kevin Pyatt, Ph.D. | Pyatt Labs
 *
 * Write a method that returns the sum of all elements in a
 * specified column in a matrix. Write a test program that
 * reads a 3-by-4 matrix and displays the sum of each column.
 */

import java.util.Scanner;

public class SumColumn {

    // ============================================
    // ACT 1: THE METHOD
    // ============================================

    // TODO 1: Write the sumColumn method using this exact header:
    //
    //         public static double sumColumn(double[][] m, int columnIndex)
    //
    //         STEP 1a: Declare a double variable called "sum" and set it to 0
    //         STEP 1b: Loop from i = 0 to i < m.length (loop over ROWS)
    //         STEP 1c: Inside the loop: add m[i][columnIndex] to sum
    //         STEP 1d: After the loop: return sum


    // ============================================
    // ACT 2: READ THE MATRIX
    // ============================================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO 2: Declare a 3-by-4 double 2D array called "m"
        //         STEP 2a: double[][] m = new double[3][4];

        // TODO 3: Prompt the user and read values into the matrix
        //         STEP 3a: Print "Enter a 3-by-4 matrix row by row:"
        //         STEP 3b: Use a nested loop (outer = rows, inner = cols)
        //         STEP 3c: Inside the inner loop: m[i][j] = input.nextDouble();

        // ============================================
        // ACT 3: DISPLAY COLUMN SUMS
        // ============================================

        // TODO 4: Loop over each column (0 through 3)
        //         STEP 4a: for (int col = 0; col < 4; col++)
        //         STEP 4b: Call sumColumn(m, col) and store the result
        //         STEP 4c: Print: "Sum of column X is Y.0"

        input.close();
    }
}
