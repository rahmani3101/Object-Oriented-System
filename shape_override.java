/*  We have to calculate the area of a rectangle, a square and a circle. Create an abstract class
&#39;Shape&#39; with three abstract methods namely &#39;calculateRectangleArea&#39; taking two
parameters, &#39;calculateSquareArea&#39; and &#39;calculateCircleArea&#39; taking one parameter each.
The parameters of &#39;calculateRectangleArea&#39; are its length and breadth, that of
&#39;calculateSquareArea&#39; is its side and that of &#39;calculateCircleArea&#39; is its radius. Now create
a sub-class &#39;Area&#39; containing all the three methods &#39;calculateRectangleArea&#39;,
&#39;calculateSquareArea&#39; and &#39;calculateCircleArea&#39; for printing the area of rectangle, square
and circle respectively. Create reference variable of this abstract class and calculate the
area of the circle, rectangle and square. */

// Abstract base class Shape
abstract class Shape {
    // Abstract methods for calculating areas of different shapes
    public abstract double calculateRectangleArea(double length, double breadth);
    public abstract double calculateSquareArea(double side);
    public abstract double calculateCircleArea(double radius);
}

// Concrete subclass Area implementing the abstract methods
class Area extends Shape {
    // Method to calculate rectangle area
    @Override
    public double calculateRectangleArea(double length, double breadth) {
        double rectangleArea = length * breadth;
        System.out.println("Rectangle Area: " + rectangleArea);
        return rectangleArea;
    }
    
    // Method to calculate square area
    @Override
    public double calculateSquareArea(double side) {
        double squareArea = side * side;
        System.out.println("Square Area: " + squareArea);
        return squareArea;
    }
    
    // Method to calculate circle area
    @Override
    public double calculateCircleArea(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Circle Area: " + circleArea);
        return circleArea;
    }
}

// Main class to demonstrate the area calculations
public class ShapeAreaDemo {
    public static void main(String[] args) {
        // Create a reference variable of the abstract class
        Shape shapeCalculator = new Area();
        
        // Calculate and print areas of different shapes
        System.out.println("Area Calculations:");
        
        // Rectangle area calculation
        shapeCalculator.calculateRectangleArea(5.0, 3.0);
        
        // Square area calculation
        shapeCalculator.calculateSquareArea(4.0);
        
        // Circle area calculation
        shapeCalculator.calculateCircleArea(2.5);
    }
}
