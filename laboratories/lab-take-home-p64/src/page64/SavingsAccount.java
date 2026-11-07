// Laboratory Take Home: Bank Account (Laboratory Activity Take Home, p. 64)
package page64;

// ===============================
// Savings Account
// ===============================
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Deposit Successful: ₱" + amount);
    }
    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Savings Withdrawal Failed: Insufficient Funds.");
        } else {
            balance -= amount;
            System.out.println("Savings Withdrawal Successful: ₱" + amount);
        }
    }
}
