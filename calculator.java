/* Create a class Calculator with methods to add, subtract, multiply, and divide
numbers. Implement method overloading to handle different data types (int,
double, float) for each operation. */

public class Calculator {
    // Addition methods
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Integer Addition: " + a + " + " + b + " = " + result);
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        System.out.println("Double Addition: " + a + " + " + b + " = " + result);
        return result;
    }

    public float add(float a, float b) {
        float result = a + b;
        System.out.println("Float Addition: " + a + " + " + b + " = " + result);
        return result;
    }

    // Subtraction methods
    public int subtract(int a, int b) {
        int result = a - b;
        System.out.println("Integer Subtraction: " + a + " - " + b + " = " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        System.out.println("Double Subtraction: " + a + " - " + b + " = " + result);
        return result;
    }

    public float subtract(float a, float b) {
        float result = a - b;
        System.out.println("Float Subtraction: " + a + " - " + b + " = " + result);
        return result;
    }

    // Multiplication methods
    public int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Integer Multiplication: " + a + " * " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        System.out.println("Double Multiplication: " + a + " * " + b + " = " + result);
        return result;
    }

    public float multiply(float a, float b) {
        float result = a * b;
        System.out.println("Float Multiplication: " + a + " * " + b + " = " + result);
        return result;
    }

    // Division methods
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        int result = a / b;
        System.out.println("Integer Division: " + a + " / " + b + " = " + result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        double result = a / b;
        System.out.println("Double Division: " + a + " / " + b + " = " + result);
        return result;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0.0f;
        }
        float result = a / b;
        System.out.println("Float Division: " + a + " / " + b + " = " + result);
        return result;
    }

    // Demonstration method
    public static void main(String[] args) {
        // Create calculator instance
        Calculator calc = new Calculator();

        // Demonstrate method overloading
        System.out.println("\n--- Integer Operations ---");
        calc.add(5, 3);
        calc.subtract(10, 4);
        calc.multiply(6, 7);
        calc.divide(15, 3);

        System.out.println("\n--- Double Operations ---");
        calc.add(5.5, 3.2);
        calc.subtract(10.7, 4.3);
        calc.multiply(6.1, 7.2);
        calc.divide(15.6, 3.2);

        System.out.println("\n--- Float Operations ---");
        calc.add(5.5f, 3.2f);
        calc.subtract(10.7f, 4.3f);
        calc.multiply(6.1f, 7.2f);
        calc.divide(15.6f, 3.2f);

        // Demonstrating automatic type conversion
        System.out.println("\n--- Type Conversion ---");
        calc.add(5, 3.5);  // Mixing int and double
    }
}
