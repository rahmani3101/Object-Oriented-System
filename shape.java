// Abstract base class 'Shape' with abstract methods
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to calculate perimeter
    public abstract double calculatePerimeter();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor to initialize the dimensions of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overriding the calculatePerimeter method for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Square class extends Rectangle
class Square extends Rectangle {
    
    // Constructor to initialize the side of the square
    public Square(double side) {
        super(side, side); // A square is just a rectangle with equal sides
    }

    // No need to override calculateArea and calculatePerimeter, as they are inherited from Rectangle
}

// Circle class extends Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding the calculatePerimeter method for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Test class with the main method
public class Test {
    public static void main(String[] args) {
        // Creating objects of Rectangle, Square, and Circle
        Shape rectangle = new Rectangle(5, 3);
        Shape square = new Square(4);
        Shape circle = new Circle(7);

        // Displaying the area and perimeter of each shape
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        
        System.out.println("\nSquare:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
