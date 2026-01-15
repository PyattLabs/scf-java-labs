#!/bin/bash

PROJECT_NAME="RectangleApp"
PACKAGE_PATH="src/main/java/com/pyatt/rectangleapp"

mkdir -p "$PROJECT_NAME/$PACKAGE_PATH"

cat > "$PROJECT_NAME/$PACKAGE_PATH/RectangleCalculator.java" <<EOL
package com.pyatt.rectangleapp;

public class RectangleCalculator {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
EOL

cat > "$PROJECT_NAME/.gitignore" <<EOL
*.class
EOL

echo "Project created. Run: cd RectangleApp && make run"
