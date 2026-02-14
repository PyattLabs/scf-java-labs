# Lab 07: Method Practice

## Overview
Build a set of utility methods to practice defining, calling, and returning values from methods.

## Objectives
- Define `void` and value-returning methods
- Pass arguments to parameters
- Use return values in expressions
- Apply method design principles

## Setup
```bash
cd ~/scf-java-labs/labs/week7-methods
micro MethodPractice.java
```

## Instructions

Open `MethodPractice.java` and complete each `TODO` section:

### Part 1: Value-Returning Methods
1. **`max(int, int)`** — Return the larger of two integers
2. **`min(int, int)`** — Return the smaller of two integers
3. **`average(double, double, double)`** — Return the average of three doubles

### Part 2: Void Methods
4. **`printStars(int n)`** — Print a line of `n` asterisks
5. **`printBox(int width, int height)`** — Print a rectangle of asterisks

### Part 3: Putting It Together
6. **`isEven(int)`** — Return `true` if the number is even
7. **`factorial(int)`** — Return the factorial of a non-negative integer
8. Use your methods in `main` to demonstrate they work

## Testing Your Code
```bash
javac MethodPractice.java
java MethodPractice
```

**Expected output pattern:**
```
max(5, 3) = 5
min(5, 3) = 3
average(80, 90, 100) = 90.0
*****
***
***
***
isEven(4) = true
isEven(7) = false
factorial(5) = 120
```

## Submission
- Show your working program to the instructor before leaving lab
- Commit and push to your repo

## Key Concepts
- **Parameter**: variable in method signature (placeholder)
- **Argument**: value passed when calling method (actual value)
- **Return type**: what the method gives back (`int`, `double`, `boolean`, `void`)
- **Scope**: variables inside a method are local to that method
