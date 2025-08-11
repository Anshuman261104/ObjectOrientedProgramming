// Program to Simulate an ATM
//Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
//Depositing money.
//Withdrawing money (only if sufficient balance exists).
//Displaying the current balance.


public class SimulateAnATM {
    // Class to represent a Bank Account
    static class BankAccount {
        // Attributes of the BankAccount class
        String accountHolder;
        String accountNumber;
        double balance;

        // Constructor to initialize the attributes
        BankAccount(String accountHolder, String accountNumber, double initialBalance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Method to deposit money into the account
        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: ₹" + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money from the account
        void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: ₹" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance for withdrawal.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        // Method to display the current balance
        void displayBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of BankAccount with initial balance
        BankAccount account = new BankAccount("John Doe", "123456789", 10000.0);

        // Displaying initial balance
        account.displayBalance();

        // Depositing money into the account
        account.deposit(5000.0);

        // Displaying updated balance
        account.displayBalance();

        // Withdrawing money from the account
        account.withdraw(3000.0);

        // Displaying final balance
        account.displayBalance();
    }
}
