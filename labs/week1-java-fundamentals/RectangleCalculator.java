public class RectangleCalculator {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.printf("Width: %.2f%n", width);
        System.out.printf("Height: %.2f%n", height);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
    }
}
