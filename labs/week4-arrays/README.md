# Lab 2: Introduction to Arrays

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Learn how to declare, initialize, and access array elements. This prepares you for Assignment 3 (Rock-Paper-Scissors).

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
int[] scores = {90, 85, 78, 92, 88};
```

### Accessing Elements (zero-indexed)
```java
System.out.println(choices[0]);  // Scissor
System.out.println(choices[1]);  // Rock
System.out.println(choices[2]);  // Paper
```

### Array Length
```java
System.out.println(choices.length);  // 3
```

---

## Compile and Run
```bash
javac ArrayPractice.java
java ArrayPractice
```

---

## Starter Code

**[Download ArrayPractice.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/lab02-arrays/ArrayPractice.java)**

Right-click → Save Link As

---

*This lab is instructor-authored intellectual property.*
