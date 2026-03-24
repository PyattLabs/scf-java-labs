/**
 * RectanglePractice.java
 * COP 2250 -- Week 10 Lab
 * Objects and Classes
 *
 * Follow each TODO in order.
 * Compile and run after completing each one.
 *
 * Compile: javac RectanglePractice.java
 * Run:     java RectanglePractice
 */

// ============================================================
// TODO 1: Define the RectangleLab class here (outside of main)
//         Add two double data fields: width and height
//         Initialize both to 1.0 as default values
// ============================================================

// TODO 2: Write a no-arg constructor
//         Field defaults handle initialization -- body can be empty

// TODO 3: Write a parameterized constructor that accepts width and height

// TODO 4: Write a getArea() method that returns width * height

// TODO 5: Write a getPerimeter() method that returns 2 * (width + height)

// ============================================================

public class RectanglePractice {

    public static void main(String[] args) {

        // Default rectangle (uses no-arg constructor)
        RectangleLab r1 = new RectangleLab();
        System.out.println("Default rectangle -- width: " + r1.width + ", height: " + r1.height);
        System.out.println("Area: " + r1.getArea() + "  |  Perimeter: " + r1.getPerimeter());
        System.out.println();

        // TODO 6: Create a rectangle with width 5.0 and height 10.0
        //         Print its width, height, area, and perimeter
        //         Match the format of the output above

    }
}
