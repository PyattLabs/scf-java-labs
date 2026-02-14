# Lab 08: Array Practice

## Overview
Build a set of array utility methods to practice declaring, filling, and processing arrays.

## Objectives
- Declare and create arrays
- Fill arrays from user input
- Process arrays with loops (sum, average, max, min)
- Search arrays for a value
- Use `length` property correctly

## Setup
```bash
cd ~/scf-java-labs/labs/week8-arrays
micro ArrayPractice.java
```

## Instructions

Open `ArrayPractice.java` and complete each `TODO` section:

### Part 1: Fill and Print
1. **`fillArray(Scanner, int)`** — Read `n` doubles from user, return the array
2. **`printArray(double[])`** — Print all elements with index labels

### Part 2: Compute
3. **`sum(double[])`** — Return the sum of all elements
4. **`average(double[])`** — Return the average
5. **`max(double[])`** — Return the largest element
6. **`min(double[])`** — Return the smallest element

### Part 3: Search and Count
7. **`countAbove(double[], double threshold)`** — Count elements above threshold
8. **`contains(double[], double target)`** — Return true if target is in the array

### Part 4: Main
9. Use your methods in `main` to demonstrate they work

## Testing Your Code
```bash
javac ArrayPractice.java
java ArrayPractice
```

**Sample run:**
```
How many scores? 5
Score 1: 85
Score 2: 92
Score 3: 78
Score 4: 95
Score 5: 88

[0]: 85.0
[1]: 92.0
[2]: 78.0
[3]: 95.0
[4]: 88.0

Sum: 438.0
Average: 87.6
Max: 95.0
Min: 78.0
Above 90: 2
Contains 78.0: true
Contains 99.0: false
```

## Submission
- Show your working program to the instructor before leaving lab
- Commit and push to your repo

## Key Concepts
- **Index**: position in array, starts at 0
- **length**: number of elements (NOT last index)
- **Off-by-one**: using `<=` instead of `<` in loop condition causes crash
- **Default values**: `double` arrays initialize to 0.0
