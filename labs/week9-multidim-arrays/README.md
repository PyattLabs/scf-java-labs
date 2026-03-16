# Lab 09: Matrix Practice

## Overview
Build a set of methods to practice declaring, creating, and processing two-dimensional arrays (matrices).

## Objectives
- Declare and create 2D arrays
- Access elements using row and column indices
- Use nested loops to traverse a matrix
- Compute row sums, column sums, and matrix totals
- Find the maximum value in a matrix

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
