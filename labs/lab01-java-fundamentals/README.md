# Lab 01: Java Fundamentals & Project Structure

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Write a program that calculates the area and perimeter of a rectangle.

---

## Requirements

- Width = 4.5
- Height = 7.9

**Formulas:**
- Area = width × height
- Perimeter = 2 × (width + height)

---

## Starter Code
```java
public class RectangleCalculator {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        // Use printf to format to 2 decimal places
        System.out.printf("Width: %.2f%n", width);
        System.out.printf("Height: %.2f%n", height);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
    }
}
```

---

## Expected Output
```
Width: 4.50
Height: 7.90
Area: 35.55
Perimeter: 24.80
```

---

## Why printf?

Without formatting:
```
Area: 35.550000000000004
```

With `printf("%.2f")`:
```
Area: 35.55
```

The `.2f` means "2 decimal places, floating point."

---

## Compile and Run
```bash
javac RectangleCalculator.java
java RectangleCalculator
```

---

## Topics Covered

- Java syntax
- Variables and data types (double)
- Arithmetic operators
- Formatted output (printf)
- Terminal compilation

---

© 2026 Kevin Pyatt, Ph.D. | Pyatt Labs
