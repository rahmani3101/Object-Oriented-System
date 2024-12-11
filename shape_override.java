/* Create a Shape base class with a method calculateArea(). Derive classes
Circle, Rectangle, and Square from Shape. Override the calculateArea()
method in each derived class to calculate the area specific to the shape. */

// Abstract base class Shape
abstract class Shape {
    // Protected attribute for shape name
    protected String shapeName;

    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract method to calculate area
    // Forces all derived classes to implement their own area calculation
    public abstract double calculateArea();

    // Method to display shape information
    public void displayInfo() {
        System.out.println("Shape: " + shapeName);
        System.out.printf("Area: %.2f\n", calculateArea());
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    // Circle-specific attributes
    private double radius;
    private static final double PI = Math.PI;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Override calculateArea() for circle
    @Override
    public double calculateArea() {
        double area = PI * radius * radius;
        return area;
    }

    // Additional method specific to Circle
    public double getCircumference() {
        return 2 * PI * radius;
    }
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    // Rectangle-specific attributes
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() for rectangle
    @Override
    public double calculateArea() {
        double area = length * width;
        return area;
    }

    // Additional method specific to Rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Square class inheriting from Shape
class Square extends Shape {
    // Square-specific attribute
    private double side;

    // Constructor
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Override calculateArea() for square
    @Override
    public double calculateArea() {
        double area = side * side;
        return area;
    }

    // Additional method specific to Square
    public double getDiagonal() {
        return side * Math.sqrt(2);
    }
}

// Main class to demonstrate shape area calculations
public class ShapeAreaDemo {
    public static void main(String[] args) {
        // Create an array of different shapes
        Shape[] shapes = new Shape[3];
        
        // Initialize different shapes
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.5, 7.2);
        shapes[2] = new Square(6.0);

        // Demonstrate polymorphic behavior
        System.out.println("--- Shape Area Calculations ---");
        
        for (Shape shape : shapes) {
            // Polymorphic method call
            shape.displayInfo();
            
            // Demonstrate additional specific methods
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.printf("Circumference: %.2f\n", circle.getCircumference());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.printf("Perimeter: %.2f\n", rectangle.getPerimeter());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.printf("Diagonal: %.2f\n", square.getDiagonal());
            }
            
            System.out.println(); // Print a blank line for readability
        }
    }
}
