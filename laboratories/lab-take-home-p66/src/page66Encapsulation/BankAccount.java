// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Encapsulation;

class BankAccount {
    private String accountName;
    private double balance;
    // GETTERS
    public String getAccountName() { return accountName; }
    public double getBalance() { return balance; }
    // SETTERS
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid starting balance!");
        }
    }
    // CUSTOM METHODS
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₱" + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₱" + amount);
        }
    }
}
