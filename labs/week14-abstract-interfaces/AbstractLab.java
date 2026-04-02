/**
 * AbstractLab.java
 * COP 2250 - Week 14 Lab
 * Abstract Classes and Interfaces
 *
 * Name:
 * Date:
 *
 * All code goes in this one file for the lab.
 * In real projects each class lives in its own file.
 */

// -------------------------------------------------------
// STEP 1 - Define the Resizable interface
// One method: void resize(double factor)
// -------------------------------------------------------
// interface Resizable {
//
// }

// -------------------------------------------------------
// STEP 2 - Abstract class Shape
// Fields: private String color
// Abstract: getArea(), getPerimeter()
// Concrete: toString() returns color + area
// -------------------------------------------------------
// abstract class Shape {
//
// }

// -------------------------------------------------------
// STEP 3 - Circle extends Shape implements Resizable
// Field: private double radius
// resize(factor): radius = radius * factor
// -------------------------------------------------------
// class Circle extends Shape implements Resizable {
//
// }

// -------------------------------------------------------
// STEP 4 - Rectangle extends Shape implements Resizable
// Fields: private double width, height
// resize(factor): multiply both width and height by factor
// -------------------------------------------------------
// class Rectangle extends Shape implements Resizable {
//
// }

// -------------------------------------------------------
// STEP 5 - Test driver
// -------------------------------------------------------
public class AbstractLab {
    public static void main(String[] args) {
        // Circle c = new Circle("red", 5.0);
        // System.out.println("--- Circle ---");
        // System.out.printf("Area: %.2f%n", c.getArea());
        // System.out.printf("Perimeter: %.2f%n", c.getPerimeter());
        // c.resize(2.0);
        // System.out.println("After resize(2.0):");
        // System.out.printf("Area: %.2f%n", c.getArea());

        // Rectangle r = new Rectangle("blue", 4.0, 6.0);
        // System.out.println("\n--- Rectangle ---");
        // System.out.printf("Area: %.2f%n", r.getArea());
        // System.out.printf("Perimeter: %.2f%n", r.getPerimeter());
        // r.resize(2.0);
        // System.out.println("After resize(2.0):");
        // System.out.printf("Area: %.2f%n", r.getArea());
    }
}
