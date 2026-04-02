# Assignment 11 — Triangle
**COP 2250 — Java Programming** | Pyatt Labs @ SCF

---

## The Problem

Design a class named `Triangle` that extends `GeometricObject` (Liang 11.1).

A `GeometricObject` starter file is provided. Do not modify it.

---

## The Players

### `GeometricObject` (provided — do not modify)

| Member | Type | Description |
|---|---|---|
| `color` | `private String` | Color of the object |
| `filled` | `private boolean` | Whether the object is filled |
| `dateCreated` | `private java.util.Date` | Date object was created |
| `GeometricObject()` | constructor | Default: white, not filled |
| `GeometricObject(String color, boolean filled)` | constructor | Sets color and filled |
| `getColor()` | `String` | Returns color |
| `setColor(String)` | `void` | Sets color |
| `isFilled()` | `boolean` | Returns filled |
| `setFilled(boolean)` | `void` | Sets filled |
| `getDateCreated()` | `java.util.Date` | Returns date created |
| `toString()` | `String` | Returns color, filled, dateCreated |

---

### `Triangle extends GeometricObject` (you build this)

| Member | Type | Description |
|---|---|---|
| `side1` | `private double` | First side, default 1.0 |
| `side2` | `private double` | Second side, default 1.0 |
| `side3` | `private double` | Third side, default 1.0 |
| `Triangle()` | constructor | Default: all sides 1.0 |
| `Triangle(double, double, double)` | constructor | Sets all three sides |
| `getSide1()` | `double` | Returns side1 |
| `getSide2()` | `double` | Returns side2 |
| `getSide3()` | `double` | Returns side3 |
| `getArea()` | `double` | Heron's formula |
| `getPerimeter()` | `double` | Sum of three sides |
| `toString()` | `String` | Calls super + adds side info |

---

## Heron's Formula
```
s = (side1 + side2 + side3) / 2
area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
```

---

## The Rules

- `Triangle` must use `extends GeometricObject`
- Both constructors must call `super()` appropriately
- `toString()` must call `super.toString()` and append triangle-specific info
- `main` must create two Triangle objects and print area, perimeter, and toString for each

---

## Demo Requirement

You must screen-share and:
1. Open `Triangle.java` in your editor
2. Compile all files and run live — no pre-compiled `.class` files
3. Explain what `super()` does in your Triangle constructor
4. Explain the difference between overriding and overloading

---

## Submission

Submit `Triangle.java` via Canvas by the due date.
`GeometricObject.java` does not need to be submitted.

---

## Starter Code

**Download:** [Triangle.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment11-triangle/Triangle.java)

**Download:** [GeometricObject.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment11-triangle/GeometricObject.java)
