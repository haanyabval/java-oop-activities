// Take Home 2: Login System (Take Home, p. 67)
package page67;

import java.util.*;

// =========================
// 5. MAIN PROGRAM
// =========================
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginApp system = new LoginApp();
        System.out.println("======= LOGIN SYSTEM =======");
        System.out.print("Enter Username: ");
        String username = sc.nextLine().trim();
        System.out.print("Enter Password: ");
        String password = sc.nextLine().trim();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("[X] Error: Fields cannot be empty.");
            return;
        }
        // Ask if admin
        System.out.print("Are you an admin? (yes/no): ");
        String choice = sc.nextLine().trim().toLowerCase();
        if (choice.equals("yes")) {
            System.out.print("Enter Admin Level (1–5): ");
            int adminLevel = sc.nextInt();
            boolean adminResult = system.authenticateAdmin(username, password, adminLevel);
            if (!adminResult) {
                System.out.println("[X] Invalid Admin Credentials.");
            }
        } else {
            boolean result = system.authenticate(username, password);
            if (!result) {
                System.out.println("[X] Invalid Username or Password.");
            }
        }
        sc.close();
    }
}
