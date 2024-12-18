import java.util.Scanner;

class BankAccount {
    // Attributes of the bank account
    private int acc_no;
    private String acc_holder_name;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(int acc_no, String acc_holder_name, double balance) {
        this.acc_no = acc_no;
        this.acc_holder_name = acc_holder_name;
        this.balance = balance;
    }

    // Getter and Setter methods for acc_no
    public int getAccNo() {
        return acc_no;
    }

    public void setAccNo(int acc_no) {
        this.acc_no = acc_no;
    }

    // Getter and Setter methods for acc_holder_name
    public String getAccHolderName() {
        return acc_holder_name;
    }

    public void setAccHolderName(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    // Getter and Setter methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Number: " + acc_no);
        System.out.println("Account Holder Name: " + acc_holder_name);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a bank account object
        BankAccount account = new BankAccount(101, "John Doe", 500.00);

        // Display initial account details
        account.displayAccountDetails();

        // Depositing money
        System.out.print("\nEnter amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdrawing money
        System.out.print("\nEnter amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display updated account details
        account.displayAccountDetails();

        scanner.close();
    }
}
