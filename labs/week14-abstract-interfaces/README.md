# Week 14 Lab — Abstract Classes and Interfaces
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## Objectives

- Declare and use abstract classes
- Implement interfaces with `implements`
- Understand the difference between abstract classes and interfaces
- Apply both to a shape hierarchy
- Bridge into Assignment 13

---

## Background

An abstract class cannot be instantiated. It defines shared structure and may contain abstract methods that subclasses must implement.

An interface is a contract. Any class that implements it must provide the specified methods. A class can implement multiple interfaces but can only extend one class.
```
Shape (abstract)
├── Circle implements Resizable
└── Rectangle implements Resizable
```

---

## Starter Code

**Download:** [AbstractLab.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week14-abstract-interfaces/AbstractLab.java)

---

## Your Tasks

### Step 1 — Define the Resizable interface
The interface has one method: `void resize(double factor)`. Scaling a shape multiplies its dimensions by the factor.

### Step 2 — Create abstract class Shape
Fields: `color` (String). Abstract methods: `getArea()`, `getPerimeter()`. Concrete method: `toString()` returns color and area.

### Step 3 — Create Circle extends Shape implements Resizable
Fields: `radius`. Implement `getArea()`, `getPerimeter()`, `resize()`, `toString()`.

### Step 4 — Create Rectangle extends Shape implements Resizable
Fields: `width`, `height`. Implement all required methods.

### Step 5 — Test in main
Create one Circle and one Rectangle. Print area and perimeter. Call `resize(2.0)` on each. Print again. Show the dimensions doubled.

### Step 6 — Compile and run
```bash
javac AbstractLab.java
java AbstractLab
```

---

## Demo Requirement

When called on, you must:
1. Screen-share your terminal
2. Compile and run live
3. Explain the difference between abstract class and interface
4. Explain why a class can implement multiple interfaces but only extend one class

---

## What's Next

**[Assignment 13 — Abstract Classes and Interfaces](assignments/assignment13-abstract/assignment13-the-players.md)**
