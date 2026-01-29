# Lab 4: Introduction to Arrays

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Learn how to declare, initialize, and access array elements. This lab prepares you for Assignment 4 (Rock-Paper-Scissors).

---

## Part 1: What is an Array?

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

## Part 2: Array Basics

### Declaring an Array

```java
// Declare and initialize in one line
int[] scores = {90, 85, 78, 92, 88};

// Or declare first, then fill
String[] names = new String[3];  // Creates array with 3 empty slots
names[0] = "Alice";
names[1] = "Bob";
names[2] = "Charlie";
```

### Accessing Elements

Arrays are **zero-indexed** — the first element is at index `0`.

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

## Part 3: Hands-On Exercise

Create a new file called `ArrayPractice.java`:

```java
public class ArrayPractice {
    public static void main(String[] args) {
        // TODO 1: Create an array of 5 integers representing test scores
        
        
        // TODO 2: Print the first score (index 0)
        
        
        // TODO 3: Print the last score (use .length - 1)
        
        
        // TODO 4: Calculate and print the average of all scores
        // Hint: Use a loop to add them up
        
        
        // TODO 5: Create a String array with 3 color names
        
        
        // TODO 6: Print each color using a for loop
        
    }
}
```

---

## Part 4: The Bridge to Rock-Paper-Scissors

In Assignment 4, you'll use an array to store the game choices:

```java
String[] choices = {"Scissor", "Rock", "Paper"};
//                     0          1        2
```

The computer picks a random number (0, 1, or 2) and uses it as an index:

```java
import java.util.Random;

Random rand = new Random();
int computerChoice = rand.nextInt(3);  // Returns 0, 1, or 2

System.out.println("Computer chose: " + choices[computerChoice]);
```

The user enters 0, 1, or 2, and you use that as an index too:

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Enter 0 (Scissor), 1 (Rock), or 2 (Paper): ");
int userChoice = input.nextInt();

System.out.println("You chose: " + choices[userChoice]);
```

---

## Compile & Run

```bash
javac ArrayPractice.java
java ArrayPractice
```

---

## Checklist Before Leaving Lab

- [ ] I can declare an array with initial values
- [ ] I can access elements by index (starting at 0)
- [ ] I understand `.length` gives the array size
- [ ] I can loop through an array
- [ ] I understand how arrays will be used in Rock-Paper-Scissors

---

## Next: Assignment 4

Rock-Paper-Scissors — use arrays, Random, and conditionals to build the game.

---

*This lab is instructor-authored intellectual property.*
