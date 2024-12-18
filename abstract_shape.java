/*Create an abstract Shape class with the following attributes:
● color (String)
● area (double)
Implement abstract methods:
● calculateArea()
Create concrete subclasses Circle and Rectangle */

// Abstract class Shape
public abstract class Shape {
    // Attributes
    protected String color;
    protected double area;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract void calculateArea();

    // Getter for area
    public double getArea() {
        return area;
    }

    // Getter for color
    public String getColor() {
        return color;
    }
}

// Concrete subclass Circle
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color); // Call Shape's constructor
        this.radius = radius;
        calculateArea(); // Calculate area when Circle is created
    }

    // Implement abstract method to calculate area
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius; // Area of the circle: πr²
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}

// Concrete subclass Rectangle
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color); // Call Shape's constructor
        this.length = length;
        this.width = width;
        calculateArea(); // Calculate area when Rectangle is created
    }

    // Implement abstract method to calculate area
    @Override
    public void calculateArea() {
        area = length * width; // Area of the rectangle: length × width
    }

    // Getters for length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle and Rectangle
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        // Print the area and color of the shapes
        System.out.println("Circle: Color = " + circle.getColor() + ", Area = " + circle.getArea());
        System.out.println("Rectangle: Color = " + rectangle.getColor() + ", Area = " + rectangle.getArea());
    }
}
