// Individual Activity: Login System (Individual Activity, p. 55)
package loginpackageoop;

import java.util.Scanner;

// MAIN CLASS
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create a LoginAccount object with preset credentials
        LoginAccount account = new LoginAccount("adminUser", "pass123");
        System.out.println("===== JAVA OOP LOGIN SYSTEM =====");
        System.out.print("Enter Username: ");
        String user = input.nextLine();
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        // Validate credentials
        if (account.validateLogin(user, pass)) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome, " + account.getUsername() + "!");
        } else {
            System.out.println("\nInvalid Username or Password. Try Again!");
        }
        // Demonstrate Setters
        System.out.print("\nWould you like to update your credentials? (yes/no): ");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter new username: ");
            String newUser = input.nextLine();
            System.out.print("Enter new password: ");
            String newPass = input.nextLine();
            account.setUsername(newUser);
            account.setPassword(newPass);
            System.out.println("\nYour credentials have been updated!");
            System.out.println("New Username: " + account.getUsername());
            System.out.println("New Password: " + account.getPassword());
        }
        System.out.println("\n===== PROGRAM END =====");
    }
}
