// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Encapsulation;

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountName("Cash Wallet");
        acc.setBalance(1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Account: " + acc.getAccountName());
        System.out.println("Final Balance: ₱" + acc.getBalance());
    }
}
