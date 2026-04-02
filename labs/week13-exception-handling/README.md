# Week 13 Lab — Exception Handling
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## Objectives

- Use `try`, `catch`, and `finally` blocks
- Catch specific exception types
- Throw exceptions manually with `throw`
- Understand checked vs unchecked exceptions
- Bridge into Assignment 12 (array bounds exception handling)

---

## Background

Programs fail. The question is whether they fail gracefully or catastrophically.

Exception handling lets you anticipate failure points, catch them, and respond — instead of crashing. Java's exception system is built on a class hierarchy. Every exception is an object.
```
Throwable
├── Error          (don't catch these)
└── Exception
    ├── IOException            (checked)
    ├── RuntimeException       (unchecked)
    │   ├── ArithmeticException
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── NumberFormatException
    └── ...
```

---

## Starter Code

**Download:** [ExceptionLab.java](labs/week13-exception-handling/ExceptionLab.java ':ignore')

---

## Your Tasks

### Step 1 — Catch an ArrayIndexOutOfBoundsException
Open `ExceptionLab.java`. The first method deliberately accesses an invalid array index. Wrap it in a try-catch.

### Step 2 — Catch a NumberFormatException
The second method tries to parse user input as an integer. Wrap it so bad input prints an error instead of crashing.

### Step 3 — Use finally
Add a `finally` block to the second method that always prints `"Input attempt complete."` whether or not an exception occurred.

### Step 4 — Throw manually
The third method receives an age value. If age is negative, throw an `IllegalArgumentException` with a descriptive message.

### Step 5 — Multiple catch blocks
The fourth method can throw either `ArithmeticException` or `ArrayIndexOutOfBoundsException`. Write separate catch blocks for each.

### Step 6 — Compile and run
```bash
javac ExceptionLab.java
java ExceptionLab
```

---

## Demo Requirement

When called on, you must:
1. Screen-share your terminal
2. Compile and run live
3. Explain the difference between a checked and unchecked exception
4. Explain what `finally` guarantees

---

## What's Next

Once you finish the lab, move to **[Assignment 12 — Array Bounds](assignments/assignment12-arraybounds/assignment12-the-players.md)**.
