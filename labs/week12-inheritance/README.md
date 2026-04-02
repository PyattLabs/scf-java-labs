# Week 12 Lab — Inheritance and Polymorphism
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## Objectives

- Extend a superclass using `extends`
- Override methods from a parent class using `@Override`
- Call the parent constructor using `super()`
- Understand method lookup order: subclass first, then superclass
- Build toward Assignment 11 (Triangle extends GeometricObject)

---

## Background

Inheritance lets one class build on top of another. The subclass gets everything the superclass has, and can add or override behavior.
```
GeometricObject
├── Circle
├── Rectangle
└── Triangle  ← you will build this
```

`Triangle` is a `GeometricObject`. It has a color and fill status from the parent. It adds three sides and implements area and perimeter.

---

## Starter Code

**Download:** [Shape.java](labs/week12-inheritance/Shape.java ':ignore')

---

## Your Tasks

### Step 1 — Read the superclass
Open `Shape.java`. It is a simple abstract-style superclass with color, filled, and a `toString()` method. Read it before writing anything.
```bash
cat Shape.java
```

### Step 2 — Create Circle.java
Extend `Shape`. Add a `radius` field. Add a constructor that calls `super(color, filled)`. Implement `getArea()` and `getPerimeter()`.

### Step 3 — Create Rectangle.java
Extend `Shape`. Add `width` and `height` fields. Constructor calls `super()`. Implement `getArea()` and `getPerimeter()`.

### Step 4 — Override toString()
In both `Circle` and `Rectangle`, override `toString()` to include the shape-specific fields on top of the parent output.
```java
@Override
public String toString() {
    return super.toString() + "\nRadius: " + radius;
}
```

### Step 5 — Create ShapeTest.java
Instantiate one `Circle` and one `Rectangle`. Print area, perimeter, and `toString()` for each. Demonstrate that `toString()` shows both parent and child fields.

### Step 6 — Compile and run
```bash
javac Shape.java Circle.java Rectangle.java ShapeTest.java
java ShapeTest
```

---

## Demo Requirement

When called on, you must:
1. Screen-share your terminal
2. Show at least one class open in your editor
3. Compile and run live
4. Explain what `super()` does in your constructor

---

## What's Next

Once you finish the lab, move to **[Assignment 11 — Triangle](assignments/assignment11-triangle/assignment11-the-players.md)**.

Same pattern — extend a provided superclass, implement area and perimeter, override toString().
