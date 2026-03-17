# Lab 09: Matrix Practice

## Overview
Build a set of methods to practice declaring, creating, and processing two-dimensional arrays (matrices).

## Objectives
- Declare and create 2D arrays
- Access elements using row and column indices
- Use nested loops to traverse a matrix
- Compute row sums, column sums, and matrix totals
- Find the maximum value in a matrix

## Starter Code
[Download MatrixPractice.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week9-multidim-arrays/MatrixPractice.java)

## Setup
```bash
cd ~/scf-java-labs/labs/week9-multidim-arrays
micro MatrixPractice.java
```

## Instructions
Open `MatrixPractice.java` and complete each `TODO` section:

### Part 1: Create and Print
1. **`fillMatrix(Scanner, int rows, int cols)`** — Read values from user, return the filled 2D array
2. **`printMatrix(double[][])`** — Print the matrix with row/column formatting

### Part 2: Row and Column Operations
3. **`sumRow(double[][], int rowIndex)`** — Return the sum of all elements in a specified row
4. **`sumColumn(double[][], int columnIndex)`** — Return the sum of all elements in a specified column

### Part 3: Whole Matrix Operations
5. **`total(double[][])`** — Return the sum of ALL elements in the matrix
6. **`maxValue(double[][])`** — Return the largest element in the entire matrix

### Part 4: Main
7. Use your methods in `main` to demonstrate they all work with a 3-by-4 matrix

## Testing Your Code
```bash
javac MatrixPractice.java
java MatrixPractice
```

**Sample run:**
```
Enter values for a 3x4 matrix:
[0][0]: 1.0
[0][1]: 2.0
[0][2]: 3.0
[0][3]: 4.0
[1][0]: 5.0
[1][1]: 6.0
[1][2]: 7.0
[1][3]: 8.0
[2][0]: 9.0
[2][1]: 10.0
[2][2]: 11.0
[2][3]: 12.0

Matrix:
   1.0   2.0   3.0   4.0
   5.0   6.0   7.0   8.0
   9.0  10.0  11.0  12.0

Row 0 sum: 10.0
Row 1 sum: 26.0
Row 2 sum: 42.0
Column 0 sum: 15.0
Column 1 sum: 18.0
Column 2 sum: 21.0
Column 3 sum: 24.0
Total: 78.0
Max: 12.0
```

## Submission
- Show your working program to the instructor before leaving lab
- Commit and push to your repo

## Key Concepts
- **2D array declaration**: `double[][] m = new double[rows][cols]`
- **Row count**: `m.length`
- **Column count**: `m[0].length`
- **Element access**: `m[row][col]` — row first, then column
- **Nested loops**: outer loop over rows, inner loop over columns
- **Column traversal**: fix the column index, loop over all rows

---

## What's Next?
Once you've completed this lab and demonstrated it to the instructor, you're ready for **Assignment 8: Sum of Columns**. You'll use the same `sumColumn` logic — write the method, read a 3-by-4 matrix, and display the sum of each column.

[Go to Assignment 8 →](../../assignments/assignment8-sumcolumn/assignment8-the-players.md)
