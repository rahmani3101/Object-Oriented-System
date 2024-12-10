/* Create a class Student with public data member name and private data members id and marks.
Write public set and get methods for the private data members. Use a constructor to set id to
211001000000 and marks to 0. Take the last 4 digits of the id from user and construct the full id.
Take the name and marks as input. Display name, full id and marks of 2 students. */

import java.util.Scanner;

class Student {
    // Public data member
    public String name;
    
    // Private data members
    private String id;
    private double marks;

    // Constructor to initialize id to 211001000000 and marks to 0
    public Student() {
        this.id = "211001000000";  // Default part of ID
        this.marks = 0.0;           // Default marks
    }

    // Setter and Getter methods for private data members

    // Set method for id (last 4 digits)
    public void setId(String lastFourDigits) {
        // Constructing the full ID using the provided last 4 digits
        this.id = "211001" + lastFourDigits;
    }

    // Get method for id
    public String getId() {
        return id;
    }

    // Set method for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Get method for marks
    public double getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating two student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Input for student 1
        System.out.println("Enter details for Student 1:");

        System.out.print("Enter name: ");
        student1.name = scanner.nextLine();

        System.out.print("Enter last 4 digits of ID: ");
        String lastFourDigits1 = scanner.nextLine();
        student1.setId(lastFourDigits1);

        System.out.print("Enter marks: ");
        double marks1 = scanner.nextDouble();
        student1.setMarks(marks1);
        scanner.nextLine(); // Consume the newline character left by nextDouble()

        // Input for student 2
        System.out.println("\nEnter details for Student 2:");

        System.out.print("Enter name: ");
        student2.name = scanner.nextLine();

        System.out.print("Enter last 4 digits of ID: ");
        String lastFourDigits2 = scanner.nextLine();
        student2.setId(lastFourDigits2);

        System.out.print("Enter marks: ");
        double marks2 = scanner.nextDouble();

        student2.setMarks(marks2);

        // Displaying details for student 1
        System.out.println("\nDetails of Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Full ID: " + student1.getId());
        System.out.println("Marks: " + student1.getMarks());

        // Displaying details for student 2
        System.out.println("\nDetails of Student 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Full ID: " + student2.getId());
        System.out.println("Marks: " + student2.getMarks());

        scanner.close();
    }
}
