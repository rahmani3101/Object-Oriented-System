/* Problem: Create an interface Worker with a method void work(). Implement two classes,
Engineer and Artist, both implementing the Worker interface. Write a method
performWork(Worker worker) that takes a Worker object as a parameter and calls its work
method. Demonstrate this in the main method. */

// Worker Interface
public interface Worker {
    // Abstract method for work
    void work();
}

// Engineer class implements Worker interface
public class Engineer implements Worker {

    // Implement the work method for Engineer
    @Override
    public void work() {
        System.out.println("Engineer is designing a building.");
    }
}


// Artist class implements Worker interface
public class Artist implements Worker {

    // Implement the work method for Artist
    @Override
    public void work() {
        System.out.println("Artist is painting a masterpiece.");
    }
}

// Method to perform work, accepts any Worker object
public class WorkerDemo {

    public static void performWork(Worker worker) {
        worker.work();  // Call the work method of the Worker object
    }

    public static void main(String[] args) {
        // Create objects of Engineer and Artist
        Worker engineer = new Engineer();
        Worker artist = new Artist();

        // Demonstrate polymorphism
        performWork(engineer); // Output: Engineer is designing a building.
        performWork(artist);   // Output: Artist is painting a masterpiece.
    }
}
