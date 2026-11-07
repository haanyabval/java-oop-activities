// Laboratory Take Home: Bank Account (Abstraction) and Hierarchical Inheritance (Laboratory Activity Take Home, p. 65)
package page65;

// ===============================
// Abstract Class
// ===============================
abstract class BankAccount {
    protected double balance;
    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Abstract methods
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    // Concrete method
    void displayBalance() {
        System.out.println("Current Balance: ₱" + balance);
    }
}
