# Assignment 9 -- Players Reference

## Rectangle Class (Section 9.2 Pattern)

### The Assignment

Following the Circle class example from Section 9.2, create a class named Rectangle_YI
(replace YI with your actual first and last initials -- e.g., Rectangle_SM).

Your submission file must be named YourName_Chapter9_Assignment1.java
(e.g., Smith_Chapter9_Assignment1.java).

---

## Class: Rectangle_YI

| Member | Type | Details |
|--------|------|---------|
| width | double field | Default value: 1 |
| height | double field | Default value: 1 |
| No-arg constructor | Constructor | Creates a rectangle with width=1, height=1 |
| Parameterized constructor | Constructor | Accepts width and height arguments |
| getArea() | Method returns double | Returns width * height |
| getPerimeter() | Method returns double | Returns 2 * (width + height) |

---

## Test Class: YourName_Chapter9_Assignment1

This is your public class with the main method. It must:

1. Create a Rectangle_YI with width = 4, height = 40
2. Create a Rectangle_YI with width = 3.5, height = 35.9
3. For each rectangle, print in this order:
   - Width
   - Height
   - Area
   - Perimeter

---

## File Structure Rules

- Both classes go in the same .java file
- Only YourName_Chapter9_Assignment1 is public
- Rectangle_YI has no public keyword
- Each class has its own set of braces

---

## Example Output
```
Rectangle 1
Width: 4.0
Height: 40.0
Area: 160.0
Perimeter: 88.0

Rectangle 2
Width: 3.5
Height: 35.9
Area: 125.65000000000001
Perimeter: 78.8
```

---

## Demo Requirement

You must screen-share, compile, and explain your code to receive credit.
Be prepared to answer questions about constructors, data fields, and method return types.
