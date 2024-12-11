/* Design a class Shape with a method calculateArea(). Implement method
overloading to calculate areas of different shapes (circle, rectangle, square) based
on their specific parameters. */

public class Shape {
    // Constant for PI
    private static final double PI = Math.PI;

    // Method to calculate area of a circle using radius
    public double calculateArea(double radius) {
        double circleArea = PI * radius * radius;
        System.out.println("Circle Area:");
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.2f\n", circleArea);
        return circleArea;
    }

    // Method to calculate area of a rectangle using length and width
    public double calculateArea(double length, double width) {
        double rectangleArea = length * width;
        System.out.println("Rectangle Area:");
        System.out.printf("Length: %.2f\n", length);
        System.out.printf("Width: %.2f\n", width);
        System.out.printf("Area: %.2f\n", rectangleArea);
        return rectangleArea;
    }

    // Method to calculate area of a square using side length
    public double calculateArea(int side) {
        double squareArea = side * side;
        System.out.println("Square Area:");
        System.out.printf("Side: %d\n", side);
        System.out.printf("Area: %.2f\n", squareArea);
        return squareArea;
    }

    // Demonstration method
    public static void main(String[] args) {
        // Create an instance of Shape
        Shape shapeCalculator = new Shape();

        // Calculate and display areas of different shapes
        System.out.println("\n--- Area Calculations ---");
        
        // Circle area calculation
        System.out.println("\nCircle Calculation:");
        shapeCalculator.calculateArea(5.0);
        
        // Rectangle area calculation
        System.out.println("\nRectangle Calculation:");
        shapeCalculator.calculateArea(4.5, 7.2);
        
        // Square area calculation
        System.out.println("\nSquare Calculation:");
        shapeCalculator.calculateArea(6);
    }
}
