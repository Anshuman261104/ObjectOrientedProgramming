// Sample Program 1: Bank Account System
//Create a BankAccount class with the following features:
//Static:
//○       A static variable bankName shared across all accounts.
//○       A static method getTotalAccounts() to display the total number of accounts.
//This:
//○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
//Final:
//○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
//Instanceof:
//○       Check if an account object is an instance of the BankAccount class before displaying its details.

// Sample Program 1: Bank Account System

// BankAccount class
class BankAccountSystem {
    // Static variable (shared across all accounts)
    static String bankName = "Global Trust Bank";
    private static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    private final int accountNumber;

    // Instance variable
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccountSystem(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final assignment
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display details (with instanceof check)
    public void displayDetails() {
        if (this instanceof BankAccountSystem) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: " + this.balance);
            System.out.println("-----------------------------");
        }
    }
}

// Main class
public class BankAccount {
    public static void main(String[] args) {
        // Creating accounts
        BankAccountSystem acc1 = new BankAccountSystem("Anshuman Singh", 1001, 5000.75);
        BankAccountSystem acc2 = new BankAccountSystem("Riya Sharma", 1002, 8000.50);

        // Display details
        acc1.displayDetails();
        acc2.displayDetails();

        // Static method usage
        System.out.println("Total Accounts Created: " + BankAccountSystem.getTotalAccounts());
    }
}
