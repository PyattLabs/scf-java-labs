# Week 10 Lab — Objects and Classes

## Overview

This week we move from arrays into **object-oriented programming**. You will define your own class, give it data fields and methods, and create objects from it. This is the foundation for everything that follows in Java.

We will follow the `Circle` class example from Section 9.2 of the Liang textbook and then practice building a similar class from scratch.

---

## Concepts Covered

- Defining a class with data fields
- Writing constructors (no-arg and parameterized)
- Writing instance methods (`getArea()`, `getPerimeter()`)
- Creating objects with `new`
- Accessing fields and calling methods on objects
- Separating class definition from test code

---

## Starter Code

Download the lab starter file and place it in your `week10/` working directory:

**[Download RectanglePractice.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week10-objects-classes/RectanglePractice.java)**
```
mkdir -p ~/cop2250/week10
cd ~/cop2250/week10
curl -O https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week10-objects-classes/RectanglePractice.java
```

---

## Lab Tasks

Open `RectanglePractice.java` and complete each TODO in order.

1. **TODO 1** — Add the `width` and `height` data fields with default values of `1.0`
2. **TODO 2** — Complete the no-arg constructor
3. **TODO 3** — Complete the parameterized constructor
4. **TODO 4** — Implement `getArea()`
5. **TODO 5** — Implement `getPerimeter()`
6. **TODO 6** — In `main`, create a rectangle with width `5.0` and height `10.0` and print its area and perimeter

Run your code after each TODO — do not wait until the end.

Compile and run:
```
javac RectanglePractice.java
java RectanglePractice
```

---

## Expected Output
```
Default rectangle — width: 1.0, height: 1.0
Area: 1.0  |  Perimeter: 4.0

Custom rectangle — width: 5.0, height: 10.0
Area: 50.0  |  Perimeter: 30.0
```

---

## What's Next

When you finish the lab, move on to [Assignment 9](../../assignments/assignment9-rectangle/assignment9-the-players.md) — you will build a Rectangle_YI class and a separate test program to submit for a grade.
