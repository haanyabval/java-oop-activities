// Take Home 2: Login System (Take Home, p. 67)
package page67;

import java.util.*;

// =========================
// 2. User Class (Encapsulation)
// =========================
class User {
    private String username;
    private String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    // Setters
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    // Polymorphism (Method Overloading)
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    public boolean login(String username, String password, int adminLevel) {
        // Normal users do NOT use admin login
        return false;
    }
    public void displayInfo() {
        System.out.println("Regular User Logged In.");
    }
}
