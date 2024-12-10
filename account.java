// Class 'Account' to represent a bank account
class Account {
    // Data members
    String name;
    String accountNumber;
    String accountType;
    String address;
    double balance;

    // Constructor to initialize account with name, account number, account type, and initial amount
    public Account(String name, String accountNumber, String accountType, double initialAmount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialAmount;
    }

    // Overloaded constructor to initialize account with name, account number, account type, address, and balance
    public Account(String name, String accountNumber, String accountType, String address, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = (accountType.equals("1") ? "Savings Account" : "Current Account");
        this.address = address;
        this.balance = balance;
    }

    // Method to display account holder's name and other details
    public void displayName() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: " + balance);
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check the current balance after deposits and withdrawals
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Account object using the first constructor
        Account account1 = new Account("John Doe", "12345", "Savings Account", 5000.0);

        // Displaying account details for account1
        account1.displayName();

        // Depositing and withdrawing from account1
        account1.deposit(2000.0);
        account1.withdraw(1500.0);
        account1.checkBalance();
        System.out.println();

        // Creating another Account object using the second constructor
        Account account2 = new Account("Jane Smith", "67890", "1", "456 Elm St", 10000.0);

        // Displaying account details for account2
        account2.displayName();

        // Depositing and withdrawing from account2
        account2.deposit(3000.0);
        account2.withdraw(500.0);
        account2.checkBalance();
    }
}
