/* Create a custom exception class named NegativeNumberException that extends the
Exception class. This exception should be thrown when a negative number is
encountered in a calculation. */


// Custom Exception class NegativeNumberException
public class NegativeNumberException extends Exception {

    // Default constructor
    public NegativeNumberException() {
        super("A negative number was encountered in the calculation.");
    }

    // Constructor with custom error message
    public NegativeNumberException(String message) {
        super(message);
    }
}


import java.util.Scanner;

public class CalculationProgram {

    // Method that throws NegativeNumberException if a negative number is encountered
    public static int calculate(int a, int b) throws NegativeNumberException {
        if (a < 0 || b < 0) {
            // Throw custom exception if any number is negative
            throw new NegativeNumberException("Negative number detected: " + a + " or " + b);
        }
        // Return the sum if both numbers are non-negative
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Call the calculate method and print the result
            int result = calculate(num1, num2);
            System.out.println("The sum is: " + result);
        } catch (NegativeNumberException e) {
            // Catch and handle the NegativeNumberException
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
