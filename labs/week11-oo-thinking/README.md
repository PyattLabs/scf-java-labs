# Week 11 Lab — MyString Wrapper Class
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## Objectives

- Design a class that wraps a primitive type
- Write instance methods that operate on a stored value
- Understand the difference between mutable and immutable class design
- Bridge into Assignment 10 (MyInteger)

---

## Background

Java's `String` class is a wrapper around character data. It gives you methods like `.length()`, `.toUpperCase()`, and `.contains()` — none of which modify the original string. They return new values.

Today you will build your own wrapper class: `MyString`. It stores a single `String` value and exposes methods to inspect and transform it.

---

## Starter Code

**Download:** [MyString.java](labs/week11-oo-thinking/MyString.java ':ignore')

---

## Your Tasks

### Step 1 — Examine the class skeleton
Open `MyString.java` in your terminal editor. Read every comment before writing a single line of code.
```bash
micro MyString.java
```

### Step 2 — Implement `getValue()`
Return the stored `value` field.

### Step 3 — Implement `length()`
Return the number of characters in the stored string. Do not use `.length()` directly — call it on your field.

### Step 4 — Implement `toUpperCase()`
Return the stored string in all uppercase. Do not modify `value` — return a new string.

### Step 5 — Implement `reverse()`
Return the stored string reversed. Loop through it character by character.

### Step 6 — Implement `isPalindrome()`
A palindrome reads the same forwards and backwards. Use your `reverse()` method.

### Step 7 — Implement `contains(String sub)`
Return `true` if the stored string contains `sub`, `false` otherwise.

### Step 8 — Compile and test
```bash
javac MyString.java
java MyString
```

Expected output:
```
Value: racecar
Length: 7
Uppercase: RACECAR
Reversed: racecar
Is palindrome: true
Contains 'ace': true
Contains 'xyz': false
```

---

## Demo Requirement

When called on, you must:
1. Screen-share your terminal
2. Show `MyString.java` open in `micro`
3. Compile and run live
4. Explain one method you wrote in your own words

---

## What's Next

Once you finish the lab, move to **[Assignment 10 — MyInteger](assignments/assignment10-myinteger/assignment10-the-players.md)**.

The pattern is the same — a wrapper class for an `int`. The methods are more complex.
