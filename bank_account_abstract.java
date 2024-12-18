/* Create an abstract BankAccount class with the following attributes:
● accountNumber (String)
● balance (double)
Implement abstract methods:
● deposit(double amount)
● withdraw(double amount)
Create concrete subclasses SavingsAccount and CurrentAccount that inherit from BankAccount
and implement the deposit() and withdraw() methods according to their specific interest rates
and transaction fees. */


// Abstract class BankAccount
public abstract class BankAccount {
    // Attributes
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Abstract method to deposit money
    public abstract void deposit(double amount);

    // Abstract method to withdraw money
    public abstract void withdraw(double amount);

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Concrete subclass SavingsAccount
public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03; // 3% interest rate
    private static final double WITHDRAWAL_FEE = 2.00; // Withdrawal fee

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Implement the deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Implement the withdraw method with a fee
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= (amount + WITHDRAWAL_FEE)) {
            balance -= (amount + WITHDRAWAL_FEE); // Subtract both withdrawal amount and fee
            System.out.println("Withdrawn: " + amount + ", Fee: " + WITHDRAWAL_FEE + ", New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to apply interest on the balance
    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest applied: " + interest + ", New balance: " + balance);
    }
}



// Concrete subclass CurrentAccount
public class CurrentAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50; // Transaction fee

    // Constructor
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Implement the deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Implement the withdraw method with a transaction fee
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= (amount + TRANSACTION_FEE)) {
            balance -= (amount + TRANSACTION_FEE); // Subtract both withdrawal amount and fee
            System.out.println("Withdrawn: " + amount + ", Fee: " + TRANSACTION_FEE + ", New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // Create SavingsAccount and CurrentAccount objects
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.00);
        CurrentAccount currentAccount = new CurrentAccount("CA98765", 3000.00);

        // Deposit and withdraw in the savings account
        savingsAccount.deposit(1500.00);
        savingsAccount.withdraw(1000.00);
        savingsAccount.applyInterest();

        // Deposit and withdraw in the current account
        currentAccount.deposit(2000.00);
        currentAccount.withdraw(500.00);
    }
}
