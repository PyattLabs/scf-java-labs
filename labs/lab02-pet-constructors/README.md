# Lab 2: Pet Class with Constructors

**COP2250 Java Programming | Week 3**

## Overview

Build on your Pet class from Week 1. Add constructors, private fields, and encapsulation.

## Learning Objectives

- Create constructors to initialize objects
- Use private fields (encapsulation)
- Write getter and setter methods
- Understand `this` keyword

## Your Task

### 1. Complete `Pet.java`

Add:
- **Private fields**: `name`, `age`, `type`
- **Constructor**: `Pet(String name, int age, String type)`
- **Getters**: `getName()`, `getAge()`, `getType()`
- **Setter**: `setAge(int age)`
- **Methods**: `speak()`, `haveBirthday()`

### 2. Complete `PetShop.java`

- Create 3 pets using the constructor
- Call `speak()` on each
- Call `haveBirthday()` on one pet
- Print the updated age using `getAge()`

## Expected Output
```
Buddy (Dog, 3 years old) says: Woof!
Luna (Cat, 5 years old) says: Meow!
Tweety (Bird, 1 years old) says: Chirp!

Buddy had a birthday!
Buddy is now 4 years old.
```

## Terminal Commands
```bash
javac Pet.java PetShop.java
java PetShop
```

## Key Concepts

### Constructor
```java
public Pet(String name, int age, String type) {
    this.name = name;
    this.age = age;
    this.type = type;
}
```

### Private Fields + Getter
```java
private int age;

public int getAge() {
    return age;
}
```

### The `this` Keyword
- Refers to the current object
- Distinguishes field from parameter when names match

## Submission

1. Complete the code
2. Compile and run — verify output matches
3. Push to GitHub
4. Share repo link
