// Take Home 2: Login System (Take Home, p. 67)
package page67;

import java.util.*;

// =========================
// 4. LoginApp (Implements Abstraction)
// =========================
class LoginApp extends LoginSystem {
    private List<User> users = new ArrayList<>();
    public LoginApp() {
        // Sample Data (1 admin + 2 users)
        users.add(new User("user1", "pass1"));
        users.add(new User("user2", "pass2"));
        users.add(new AdminUser("admin", "admin123", 5));
    }
    @Override
    public boolean authenticate(String username, String password) {
        for (User u : users) {
            if (u.login(username, password)) {
                u.displayInfo();
                displayWelcomeMessage();
                return true;
            }
        }
        return false;
    }
    @Override
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Login System!");
    }
    // Admin login handler
    public boolean authenticateAdmin(String username, String password, int adminLevel) {
        for (User u : users) {
            if (u instanceof AdminUser) {
                AdminUser admin = (AdminUser) u;
                if (admin.login(username, password, adminLevel)) {
                    System.out.println("Admin Access Granted!");
                    admin.displayAdminInfo();
                    displayWelcomeMessage();
                    return true;
                }
            }
        }
        return false;
    }
}
