/* Write a Java program that reads an integer from the console. The program should attempt
to divide 100 by the input integer.
Use a try-catch block to handle potential ArithmeticException (division by zero).
Inside the try block, print the result of the division.
In the catch block, print an appropriate error message.
Finally, in the finally block, print a message indicating that the program has finished. 
  */

import java.util.Scanner;

public class DivisionProgram 
{

    public static void main(String[] args) 
  {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        try 
        {
            // Prompt the user for an integer input
            System.out.print("Enter an integer to divide 100 by: ");
            int divisor = scanner.nextInt();

            // Attempt the division
            int result = 100 / divisor;

            // Print the result of the division
            System.out.println("100 divided by " + divisor + " is: " + result);
        } 
        catch (ArithmeticException e) 
        {
            // Catch the exception if division by zero occurs
            System.out.println("Error: Division by zero is not allowed.");
        } 
        finally 
        {
            // This block always executes, regardless of whether an exception occurred or not
            System.out.println("Program has finished.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
