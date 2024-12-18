// Abstract class Employee
public abstract class Employee {
    // Attributes
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method to calculate salary
    public abstract void calculateSalary();

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Concrete subclass RegularEmployee
public class RegularEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor
    public RegularEmployee(String name, double baseSalary, double bonus) {
        super(name);  // Call Employee's constructor
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        calculateSalary();  // Calculate salary when RegularEmployee is created
    }

    // Implement the calculateSalary() method for regular employees
    @Override
    public void calculateSalary() {
        // For regular employees, salary = baseSalary + bonus
        salary = baseSalary + bonus;
    }

    // Getters for baseSalary and bonus
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }
}

// Concrete subclass ContractEmployee
public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);  // Call Employee's constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        calculateSalary();  // Calculate salary when ContractEmployee is created
    }

    // Implement the calculateSalary() method for contract employees
    @Override
    public void calculateSalary() {
        // For contract employees, salary = hourlyRate * hoursWorked
        salary = hourlyRate * hoursWorked;
    }

    // Getters for hourlyRate and hoursWorked
    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create RegularEmployee and ContractEmployee objects
        RegularEmployee regularEmployee = new RegularEmployee("Mohammad Asad Rahmani", 5000, 1000);
        ContractEmployee contractEmployee = new ContractEmployee("Jane Smith", 50, 160);

        // Print the salary and name of the employees
        System.out.println("Regular Employee: Name = " + regularEmployee.getName() + ", Salary = " + regularEmployee.getSalary());
        System.out.println("Contract Employee: Name = " + contractEmployee.getName() + ", Salary = " + contractEmployee.getSalary());
    }
}
