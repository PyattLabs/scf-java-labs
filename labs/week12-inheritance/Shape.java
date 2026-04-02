/**
 * Shape.java
 * COP 2250 - Week 12 Lab
 * Superclass for inheritance exercise
 *
 * READ THIS BEFORE WRITING ANYTHING.
 * You will extend this class — do not modify it.
 */
public class Shape {

    private String color;
    private boolean filled;

    // Default constructor
    public Shape() {
        this.color = "white";
        this.filled = false;
    }

    // Parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public double getArea() { return 0; }
    public double getPerimeter() { return 0; }

    @Override
    public String toString() {
        return "Color: " + color + "\nFilled: " + filled;
    }
}
