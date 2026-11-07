// Laboratory Take Home: Bank Account (Abstraction) and Hierarchical Inheritance (Laboratory Activity Take Home, p. 65)
package page65;

// ===============================
// Main Program (ATM Simulation)
// ===============================
public class MainAccount {
    public static void main(String[] args) {
        // Create account objects
        SavingsAccount sa = new SavingsAccount(5000);
        CheckingAccount ca = new CheckingAccount(3000);
        // Display initial balances
        System.out.println("=== ACCOUNT INITIAL BALANCES ===");
        sa.displayBalance();
        ca.displayBalance();
        System.out.println();
        // SAMPLE TRANSACTIONS
        System.out.println("=== PERFORMING TRANSACTIONS ===");
        sa.deposit(1000);
        sa.withdraw(700);
        System.out.println();
        ca.deposit(500);
        ca.withdraw(4000); // Will show insufficient funds
        System.out.println();
        // Final output
        System.out.println("=== FINAL ACCOUNT BALANCES ===");
        sa.displayBalance();
        ca.displayBalance();
    }
}
