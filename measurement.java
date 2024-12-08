/* Write a program that creates two classes one is Measurement and another is the main method
class. Measurement class contain km, meter, milimeter in decimal and a constructor and three
methods; first method will return the round off kilometer, the second method will return the round
off meter and third method will return the round off milimeter. Takes the values and display
them. */

import java.util.Scanner;

class Measurement {
    // Attributes to store kilometers, meters, and millimeters as decimal values
    private double km;
    private double meter;
    private double millimeter;

    // Constructor to initialize the values
    public Measurement(double km, double meter, double millimeter) {
        this.km = km;
        this.meter = meter;
        this.millimeter = millimeter;
    }

    // Method to return the round-off value of kilometers
    public int getRoundedKilometers() {
        return (int) Math.round(km); // Rounds off and converts to int
    }

    // Method to return the round-off value of meters
    public int getRoundedMeters() {
        return (int) Math.round(meter); // Rounds off and converts to int
    }

    // Method to return the round-off value of millimeters
    public int getRoundedMillimeters() {
        return (int) Math.round(millimeter); // Rounds off and converts to int
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for kilometers, meters, and millimeters
        System.out.print("Enter the value for kilometers (decimal): ");
        double km = scanner.nextDouble();

        System.out.print("Enter the value for meters (decimal): ");
        double meter = scanner.nextDouble();

        System.out.print("Enter the value for millimeters (decimal): ");
        double millimeter = scanner.nextDouble();

        // Create a Measurement object using the input values
        Measurement measurement = new Measurement(km, meter, millimeter);

        // Display the rounded values
        System.out.println("\nRounded Kilometers: " + measurement.getRoundedKilometers());
        System.out.println("Rounded Meters: " + measurement.getRoundedMeters());
        System.out.println("Rounded Millimeters: " + measurement.getRoundedMillimeters());

        scanner.close();
    }
}
