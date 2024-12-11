/* Design a Vehicle base class with a method drive(). Derive classes Car, Bike,
and Truck from Vehicle. Override the drive() method in each derived class to
simulate different driving behaviors. */

public class Vehicle {
    // Protected instance variables that can be inherited
    protected String brand;
    protected String model;
    protected int speed;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Base method to be overridden by child classes
    public void drive() {
        System.out.println("Generic vehicle is moving.");
    }

    // Method to accelerate
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Vehicle accelerating. Current speed: " + speed + " km/h");
    }

    // Method to brake
    public void brake(int decrement) {
        speed = Math.max(0, speed - decrement);
        System.out.println("Vehicle braking. Current speed: " + speed + " km/h");
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}

// Car class inheriting from Vehicle
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    // Overridden drive method with car-specific behavior
    @Override
    public void drive() {
        System.out.println("Car " + brand + " " + model + " is driving smoothly on the road.");
        System.out.println("It has " + numDoors + " doors and provides comfortable ride.");
    }

    // Additional car-specific method
    public void honk() {
        System.out.println("Car honks: Beep! Beep!");
    }
}

// Bike class inheriting from Vehicle
class Bike extends Vehicle {
    private boolean hasSidecar;

    public Bike(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    // Overridden drive method with bike-specific behavior
    @Override
    public void drive() {
        System.out.println("Bike " + brand + " " + model + " is navigating through traffic.");
        if (hasSidecar) {
            System.out.println("This bike has a sidecar for extra passenger.");
        }
    }

    // Additional bike-specific method
    public void wheelie() {
        System.out.println("Bike performing a wheelie!");
    }
}

// Truck class inheriting from Vehicle
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, double loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    // Overridden drive method with truck-specific behavior
    @Override
    public void drive() {
        System.out.println("Truck " + brand + " " + model + " is hauling cargo.");
        System.out.println("Load capacity: " + loadCapacity + " tons");
    }

    // Additional truck-specific method
    public void loadCargo(double weight) {
        if (weight <= loadCapacity) {
            System.out.println("Loading " + weight + " tons of cargo.");
        } else {
            System.out.println("Cannot load. Exceeds truck's capacity.");
        }
    }
}

// Main class to demonstrate vehicle behaviors
public class VehicleDemo {
    public static void main(String[] args) {
        // Create different vehicles
        Vehicle car = new Car("Toyota", "Camry", 4);
        Vehicle bike = new Bike("Harley-Davidson", "Sportster", false);
        Vehicle truck = new Truck("Volvo", "FH Series", 25.5);

        // Demonstrate polymorphic behavior
        System.out.println("\n--- Vehicle Demonstrations ---");
        
        // Drive method calls
        System.out.println("\nDriving Car:");
        car.drive();
        car.accelerate(50);
        car.brake(20);

        System.out.println("\nDriving Bike:");
        bike.drive();
        bike.accelerate(30);
        bike.brake(10);

        System.out.println("\nDriving Truck:");
        truck.drive();
        truck.accelerate(20);
        truck.brake(5);

        // Demonstrate type-specific methods
        System.out.println("\n--- Vehicle-Specific Methods ---");
        ((Car)car).honk();
        ((Bike)bike).wheelie();
        ((Truck)truck).loadCargo(20.0);
    }
}
