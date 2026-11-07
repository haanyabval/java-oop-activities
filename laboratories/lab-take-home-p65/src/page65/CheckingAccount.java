// Laboratory Take Home: Bank Account (Abstraction) and Hierarchical Inheritance (Laboratory Activity Take Home, p. 65)
package page65;

// ===============================
// Checking Account
// ===============================
class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Checking Deposit Successful: ₱" + amount);
    }
    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Checking Withdrawal Failed: Insufficient Funds.");
        } else {
            balance -= amount;
            System.out.println("Checking Withdrawal Successful: ₱" + amount);
        }
    }
}
