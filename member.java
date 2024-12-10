// Base class 'Member'
class Member {
    // Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor to initialize the Member class
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

// Class 'Employee' inherits from 'Member'
class Employee extends Member {
    // Data member for specialization
    String specialization;

    // Constructor to initialize Employee class and call the base class constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary); // Calling the Member class constructor
        this.specialization = specialization;
    }
}

// Class 'Manager' inherits from 'Member'
class Manager extends Member {
    // Data member for department
    String department;

    // Constructor to initialize Manager class and call the base class constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary); // Calling the Member class constructor
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Main St", 50000, "Software Engineer");

        // Creating a Manager object
        Manager manager = new Manager("Jane Smith", 40, "987-654-3210", "456 Elm St", 80000, "HR");

        // Printing Employee details
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary(); // Printing salary using the inherited method
        System.out.println("Specialization: " + employee.specialization);
        System.out.println();

        // Printing Manager details
        System.out.println("Manager Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary(); // Printing salary using the inherited method
        System.out.println("Department: " + manager.department);
    }
}
