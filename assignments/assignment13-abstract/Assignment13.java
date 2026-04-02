/**
 * Assignment13.java
 * COP 2250 - Assignment 13
 * Abstract Classes and Interfaces (Liang Ch. 13)
 *
 * Name:
 * Date:
 *
 * All classes go in this one file.
 */

// -------------------------------------------------------
// STEP 1 - Colorable interface
// One method: void howToColor()
// -------------------------------------------------------
// interface Colorable {
//
// }

// -------------------------------------------------------
// STEP 2 - Abstract class GeometricObject
// private String color
// Constructor: GeometricObject(String color)
// getColor(): returns color
// abstract getArea()
// abstract getPerimeter()
// toString(): returns color, area, perimeter
// -------------------------------------------------------
// abstract class GeometricObject {
//
// }

// -------------------------------------------------------
// STEP 3 - Circle extends GeometricObject implements Colorable
// private double radius
// Constructor: Circle(double radius, String color)
// getArea(), getPerimeter(), howToColor()
// -------------------------------------------------------
// class Circle extends GeometricObject implements Colorable {
//
// }

// -------------------------------------------------------
// STEP 4 - Rectangle extends GeometricObject implements Colorable
// private double width, height
// Constructor: Rectangle(double width, double height, String color)
// getArea(), getPerimeter(), howToColor()
// -------------------------------------------------------
// class Rectangle extends GeometricObject implements Colorable {
//
// }

// -------------------------------------------------------
// STEP 5 - Main: test both classes
// Store in GeometricObject references
// Print toString() and call howToColor() on each
// -------------------------------------------------------
public class Assignment13 {
    public static void main(String[] args) {
        // GeometricObject c = new Circle(5.0, "red");
        // GeometricObject r = new Rectangle(4.0, 6.0, "blue");

        // System.out.println("--- Circle ---");
        // System.out.println(c);
        // ((Colorable) c).howToColor();

        // System.out.println("\n--- Rectangle ---");
        // System.out.println(r);
        // ((Colorable) r).howToColor();
    }
}
