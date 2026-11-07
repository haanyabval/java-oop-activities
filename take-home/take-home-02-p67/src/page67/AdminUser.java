// Take Home 2: Login System (Take Home, p. 67)
package page67;

import java.util.*;

// =========================
// 3. AdminUser Class (Inheritance + Overriding)
// =========================
class AdminUser extends User {
    private int adminLevel;
    public AdminUser(String username, String password, int adminLevel) {
        super(username, password);
        this.adminLevel = adminLevel;
    }
    public int getAdminLevel() { return adminLevel; }
    public void displayAdminInfo() {
        System.out.println("Admin Level: " + adminLevel);
        System.out.println("Privileges: Full System Access.");
    }
    // Override login (Polymorphism - Overriding)
    @Override
    public boolean login(String username, String password, int adminLevel) {
        return getUsername().equals(username) &&
              getPassword().equals(password) &&
              this.adminLevel == adminLevel;
    }
    // Override displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("Admin User Logged In.");
    }
}
