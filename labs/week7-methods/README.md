# Lab 07: Methods — Method Practice

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Write a program that practices defining and calling methods. You will write two methods and a `main` method that prompts the user and invokes them.

---

## Method 1: displaySortedNumbers

```java
public static void displaySortedNumbers(double num1, double num2, double num3)
```

- Takes three `double` values
- Prints them in **increasing order** on one line
- This is a `void` method — it prints, doesn't return

**Example:**
```
Enter three numbers: 8.5 2.1 6.3
Sorted: 2.1 6.3 8.5
```

---

## Method 2: sumDigits

```java
public static int sumDigits(long n)
```

- Takes a `long` value
- Returns the **sum of its digits**
- Use `% 10` to get last digit, `/ 10` to remove it
- Use a loop

**Example:**
```
Enter an integer: 1234
Sum of digits: 10
```

---

## Terminal Commands

```bash
cd ~/scf-java-labs/labs/week7-methods
javac MethodPractice.java
java MethodPractice
```

---

## Starter Code

**[Download MethodPractice.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week7-methods/MethodPractice.java)**

Right-click → Save Link As

---

## Checklist

- [ ] Program compiles with `javac`
- [ ] `displaySortedNumbers` correctly sorts and prints three doubles
- [ ] `sumDigits` returns the correct sum of digits
- [ ] `main` prompts user and calls both methods
- [ ] Methods are `public static` and defined outside `main`
- [ ] Clean terminal output matching sample runs

---

## Code Walkthrough (Last 15 Minutes)

Picker selects students. You must:
1. Screen share your terminal
2. Compile and run your code live
3. Explain one method: "What does this line do?"

No working code = no lab credit.

---

*This lab is instructor-authored intellectual property.*
