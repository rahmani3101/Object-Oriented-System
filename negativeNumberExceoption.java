/* 
Write a Java program that takes two integer inputs from the user. If any of the inputs is
negative, throw a NegativeNumberException. Otherwise, calculate and print the sum of
the two numbers. 
*/


// Custom Exception class NegativeNumberException
public class NegativeNumberException extends Exception {

    // Default constructor with a default message
    public NegativeNumberException() {
        super("Negative number encountered!");
    }

    // Constructor with a custom message
    public NegativeNumberException(String message) {
        super(message);
    }
}


import java.util.Scanner;

public class SumCalculator {

    // Method to calculate the sum of two numbers
    public static int calculateSum(int num1, int num2) throws NegativeNumberException {
        if (num1 < 0 || num2 < 0) {
            // If any number is negative, throw a NegativeNumberException
            throw new NegativeNumberException("Error: Negative number encountered. Cannot perform the calculation.");
        }
        // Return the sum if both numbers are non-negative
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to input two integers
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Attempt to calculate the sum
            int result = calculateSum(num1, num2);
            System.out.println("The sum is: " + result);
        } catch (NegativeNumberException e) {
            // Catch and handle the NegativeNumberException
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
