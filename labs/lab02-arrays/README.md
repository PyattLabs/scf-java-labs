# Lab 2: Introduction to Arrays

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Learn how to declare, initialize, and access array elements. This lab prepares you for Assignment 3 (Rock-Paper-Scissors).

---

## What is an Array?

An **array** holds multiple values of the same type in a single variable.

Instead of:
```java
String choice0 = "Scissor";
String choice1 = "Rock";
String choice2 = "Paper";
```

Use an array:
```java
String[] choices = {"Scissor", "Rock", "Paper"};
```

---

## Array Basics

### Declaring an Array

```java
// Declare and initialize in one line
int[] scores = {90, 85, 78, 92, 88};

// Or declare first, then fill
String[] names = new String[3];
names[0] = "Alice";
names[1] = "Bob";
names[2] = "Charlie";
```

### Accessing Elements

Arrays are **zero-indexed** — the first element is at index 0.

```java
String[] choices = {"Scissor", "Rock", "Paper"};

System.out.println(choices[0]);  // Scissor
System.out.println(choices[1]);  // Rock
System.out.println(choices[2]);  // Paper
```

### Array Length

```java
String[] choices = {"Scissor", "Rock", "Paper"};
System.out.println(choices.length);  // 3
```

---

## Compile and Run

```bash
javac ArrayPractice.java
java ArrayPractice
```

---

## Checklist Before Leaving Lab

- [ ] I can declare an array with initial values
- [ ] I can access elements by index (starting at 0)
- [ ] I understand .length gives the array size
- [ ] I can loop through an array
- [ ] I understand how arrays will be used in Rock-Paper-Scissors

---

*This lab is instructor-authored intellectual property.*
