/* Suppose you are asked to model a toy-train ride at an amusement park. Passengers are expected
to pay Rs. 50 for a ticket. Children do not need a ticket. The ticket counter keeps track of the
number of passengers that have gone by, and of the total amount of money collected.
a) Model this ticket-counter with a class called ticket-counter. Use a type unsigned int to
hold the total number of passengers, and a type double to hold the total amount of money
collected.
b) Use a constructor to initialize both of these to 0.
c) Add the following member functions:
i. payingPassenger() that increments the passenger total by 1 and adds Rs. 50 to the
cash total.
ii. childPassenger() that increments the passenger total, but does not add anything to
the cash total.
iii. A member function called display() that display the two totals.
d) Include a program to test this class. The program should allow a ticket-collector to press
one key to count a paying passenger, another key to count a child passenger. By the
pushing a third key the collector can print the total number of passengers, total amount of
cash collected and then exit.
  */

import java.util.Scanner;

class TicketCounter {
    // Data members
    private unsigned int totalPassengers;
    private double totalCash;

    // Constructor to initialize both totals to 0
    public TicketCounter() {
        this.totalPassengers = 0;
        this.totalCash = 0.0;
    }

    // Method to count a paying passenger
    public void payingPassenger() {
        this.totalPassengers++;  // Increment passenger count
        this.totalCash += 50.0;   // Add Rs. 50 to the cash total
    }

    // Method to count a child passenger
    public void childPassenger() {
        this.totalPassengers++;  // Increment passenger count (no change in cash total)
    }

    // Method to display the current totals
    public void display() {
        System.out.println("Total Passengers: " + this.totalPassengers);
        System.out.println("Total Cash Collected: Rs. " + this.totalCash);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketCounter ticketCounter = new TicketCounter();  // Create a new ticket counter
        
        // Instructions for the ticket-collector
        System.out.println("Press 'P' to count a paying passenger.");
        System.out.println("Press 'C' to count a child passenger.");
        System.out.println("Press 'D' to display the totals and exit.");
        
        // Loop to simulate the ticket-collector's actions
        while (true) {
            System.out.print("Enter choice (P for paying passenger, C for child passenger, D for display and exit): ");
            char choice = scanner.next().charAt(0);
            
            switch (choice) {
                case 'P':  // Count paying passenger
                    ticketCounter.payingPassenger();
                    break;
                case 'C':  // Count child passenger
                    ticketCounter.childPassenger();
                    break;
                case 'D':  // Display totals and exit
                    ticketCounter.display();
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;  // Exit the loop and the program
                default:
                    System.out.println("Invalid input! Please enter 'P', 'C', or 'D'.");
            }
        }
    }
}
