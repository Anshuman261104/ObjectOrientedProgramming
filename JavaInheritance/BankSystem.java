//Sample Problem 1: Bank Account Types
//Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
//Tasks:
//Define a base class BankAccount with attributes like accountNumber and balance.
//Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
//Implement a method displayAccountType() in each subclass to specify the account type.
//Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

// Base class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display common account info
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // call BankAccount constructor
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int duration; // in months

    // Constructor
    FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountInfo();
        System.out.println("Duration: " + duration + " months");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        // Create Savings Account
        SavingsAccount savings = new SavingsAccount("SAV123", 5000.0, 4.5);
        savings.displayAccountType();
        System.out.println("-----------------------");

        // Create Checking Account
        CheckingAccount checking = new CheckingAccount("CHK456", 3000.0, 1000.0);
        checking.displayAccountType();
        System.out.println("-----------------------");

        // Create Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 10000.0, 12);
        fd.displayAccountType();
    }
}
