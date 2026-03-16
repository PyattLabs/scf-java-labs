/**
 * MatrixPractice.java
 * COP2250 - Week 9 Lab
 *
 * Practice declaring, filling, and processing two-dimensional arrays.
 * Complete each TODO section below.
 */

import java.util.Scanner;

public class MatrixPractice {

    // ========================================
    // PART 1: CREATE AND PRINT
    // ========================================

    // TODO 1: Define a method called "fillMatrix" that takes a Scanner,
    //         an int rows, and an int cols.
    //         Read (rows * cols) doubles from the user and return the 2D array.
    //         Signature: public static double[][] fillMatrix(Scanner input, int rows, int cols)
    //
    //         Steps inside:
    //         - Create a new double[][] of size [rows][cols]
    //         - Use a nested loop: outer = rows, inner = cols
    //         - Prompt "[row][col]: " for each element
    //         - Return the filled matrix


    // TODO 2: Define a void method called "printMatrix" that takes a double[][]
    //         and prints the matrix row by row.
    //         Signature: public static void printMatrix(double[][] m)
    //
    //         Output format: each element right-aligned in a 6-character field
    //         Hint: System.out.printf("%6.1f", m[i][j]);


    // ========================================
    // PART 2: ROW AND COLUMN OPERATIONS
    // ========================================

    // TODO 3: Define a method called "sumRow" that takes a double[][]
    //         and an int rowIndex, returns the sum of that row.
    //         Signature: public static double sumRow(double[][] m, int rowIndex)
    //
    //         Hint: loop over all columns in the given row


    // TODO 4: Define a method called "sumColumn" that takes a double[][]
    //         and an int columnIndex, returns the sum of that column.
    //         Signature: public static double sumColumn(double[][] m, int columnIndex)
    //
    //         Hint: fix the column index, loop over all ROWS


    // ========================================
    // PART 3: WHOLE MATRIX OPERATIONS
    // ========================================

    // TODO 5: Define a method called "total" that takes a double[][]
    //         and returns the sum of ALL elements in the matrix.
    //         Signature: public static double total(double[][] m)
    //
    //         Hint: use a nested loop OR call sumRow for each row


    // TODO 6: Define a method called "maxValue" that takes a double[][]
    //         and returns the largest element in the entire matrix.
    //         Signature: public static double maxValue(double[][] m)
    //
    //         Hint: initialize max to m[0][0], then check every element


    // ========================================
    // PART 4: MAIN
    // ========================================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        System.out.println("Enter values for a " + rows + "x" + cols + " matrix:");

        // TODO 7a: Call fillMatrix to get a 3x4 matrix from the user

        // TODO 7b: Print a blank line, then print the matrix using printMatrix

        // TODO 7c: Print the sum of each row using sumRow

        // TODO 7d: Print the sum of each column using sumColumn

        // TODO 7e: Print the total and max using your methods

        input.close();
    }
}
