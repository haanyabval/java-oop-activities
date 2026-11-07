// OOP Laboratory - Group Task 5: Login and ATM System (Revised)
import java.util.Scanner;

public class Problem5Revised {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        // Default credentials and initial balance
        String username = "admin";
        String password = "1234";
        double balance = 50000;
        boolean loggedIn = false;

        // ==============================
        // LOGIN SYSTEM
        // ==============================
        while (!loggedIn) {
            int attempts = 3;

            while (attempts > 0 && !loggedIn) {
                System.out.println("\n=== LOGIN PAGE ===");
                System.out.print("Enter username: ");
                String inputUser = data.nextLine();
                System.out.print("Enter password: ");
                String inputPass = data.nextLine();

                if (inputUser.equals(username) && inputPass.equals(password)) {
                    System.out.println("\n [OK] Login Successful!\n");
                    loggedIn = true;
                } else {
                    attempts--;

                    // Identify which credential is incorrect
                    if (!inputUser.equals(username) && !inputPass.equals(password)) {
                        System.out.println(" [X] Both username and password are incorrect.");
                    } else if (!inputUser.equals(username)) {
                        System.out.println(" [X] Incorrect username.");
                    } else if (!inputPass.equals(password)) {
                        System.out.println(" [X] Incorrect password.");
                    }
                    System.out.println("Attempts left: " + attempts + "\n");
                }
            }

            if (!loggedIn) {
                System.out.println("Too many failed login attempts.");
                System.out.print("Do you want to try logging in again? (y/n): ");
                String retry = data.nextLine();

                if (!retry.equalsIgnoreCase("y")) {
                    System.out.println("\nProgram End.");
                    data.close();
                    return;
                }
            }
        }

        // ==============================
        // TRANSACTION MENU
        // ==============================
        boolean running = true;

        while (running) {
            int choice;
            do {
                System.out.println("\n=== ATM MENU ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = data.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\n=== CHECKING BALANCE ===");
                        System.out.printf("Current Balance: %.2f%n", balance);
                        break;
                    case 2:
                        System.out.println("\n=== DEPOSITING MONEY ===");
                        System.out.print("Enter amount to deposit: ");
                        double deposit = data.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.printf(" [OK] Deposit successful. New Balance: %.2f%n", balance);
                        } else {
                            System.out.println(" [X] Invalid deposit amount.");
                        }
                        break;
                    case 3:
                        System.out.println("\n=== WITHDRAWING MONEY ===");
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = data.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.printf(" [OK] Withdrawal successful. New Balance: %.2f%n", balance);
                        } else {
                            System.out.println(" [X] Insufficient balance or invalid amount.");
                        }
                        break;
                    case 4:
                        System.out.println("\n=== EXIT PAGE ===");
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println(" [X] Invalid option. Please try again.");
                        break;
                }

            } while (choice != 4);

            data.nextLine(); // Consume leftover newline

            System.out.print("\nDo you want to transact again? (y/n): ");
            String again = data.nextLine();

            if (!again.equalsIgnoreCase("y")) {
                running = false;
                System.out.println("\nProgram End.");
            }
        }

        data.close();
    }
}
