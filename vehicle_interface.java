/* Create an interface named Vehicle with the following methods:
 void start();
 void stop();
Add a default method void show() that prints &quot;Showing the Vehicle&quot;. Implement two classes,
Car and Bike, that implement the Vehicle interface. Override the start and stop methods to
print relevant messages. */

// Vehicle Interface
public interface Vehicle {

    // Abstract method to start the vehicle
    void start();

    // Abstract method to stop the vehicle
    void stop();

    // Default method to show vehicle information
    default void show() {
        System.out.println("Showing the Vehicle");
    }
}


// Car class implements the Vehicle interface
public class Car implements Vehicle {

    // Override the start method for Car
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    // Override the stop method for Car
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}


// Bike class implements the Vehicle interface
public class Bike implements Vehicle {

    // Override the start method for Bike
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    // Override the stop method for Bike
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}


public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Demonstrate the start, stop, and show methods
        car.start();     // Output: Car is starting.
        car.stop();      // Output: Car is stopping.
        car.show();      // Output: Showing the Vehicle

        bike.start();    // Output: Bike is starting.
        bike.stop();     // Output: Bike is stopping.
        bike.show();     // Output: Showing the Vehicle
    }
}


