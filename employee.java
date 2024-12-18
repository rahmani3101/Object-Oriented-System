import java.util.Scanner;

class Employee {
    // Attributes of the Employee
    private String name;
    private int e_id;
    private double salary;
    private double bonus;

    // Constructor to initialize Employee object
    public Employee(String name, int e_id, double salary) {
        this.name = name;
        this.e_id = e_id;
        this.salary = salary;
        this.bonus = 0;  // Initial bonus is 0
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for employee ID (e_id)
    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    // Getter and Setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter methods for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate bonus based on performance rating
    public void calculateBonus(int rating) {
        // Bonus calculation based on performance rating
        switch (rating) {
            case 5:
                bonus = salary * 0.2;  // 20% bonus for excellent performance
                break;
            case 4:
                bonus = salary * 0.15;  // 15% bonus for good performance
                break;
            case 3:
                bonus = salary * 0.1;   // 10% bonus for satisfactory performance
                break;
            case 2:
                bonus = salary * 0.05;  // 5% bonus for below-average performance
                break;
            case 1:
                bonus = 0;  // No bonus for poor performance
                break;
            default:
                System.out.println("Invalid rating! Please enter a rating between 1 and 5.");
                return;
        }
    }

    // Method to display employee details including bonus
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee ID: " + e_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int e_id = scanner.nextInt();
        System.out.print("Enter employee salary: $");
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, e_id, salary);

        // Ask for performance rating
        System.out.print("Enter performance rating (1-5): ");
        int rating = scanner.nextInt();

        // Calculate the bonus based on the rating
        employee.calculateBonus(rating);

        // Display employee details including bonus
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
