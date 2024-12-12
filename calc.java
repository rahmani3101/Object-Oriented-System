// Calculator Interface
public interface Calculator {
    // Method to add two integers
    int add(int a, int b);

    // Method to subtract two integers
    int subtract(int a, int b);
}

// SimpleCalculator Class implements Calculator interface
public class SimpleCalculator implements Calculator {

    // Implement the add method
    @Override
    public int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    // Implement the subtract method
    @Override
    public int subtract(int a, int b) {
        return a - b; // Return the difference between a and b
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of SimpleCalculator
        SimpleCalculator calculator = new SimpleCalculator();

        // Use the add method
        int sum = calculator.add(10, 5);
        System.out.println("Addition of 10 and 5: " + sum); // Output: 15

        // Use the subtract method
        int difference = calculator.subtract(10, 5);
        System.out.println("Subtraction of 10 and 5: " + difference); // Output: 5
    }
}
