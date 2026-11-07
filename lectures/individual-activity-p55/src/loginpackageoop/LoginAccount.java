// Individual Activity: Login System (Individual Activity, p. 55)
package loginpackageoop;

import java.util.Scanner;

// CLASS: LoginAccount
class LoginAccount {
    // Private attributes for encapsulation
    private String username;
    private String password;
    // Constructor
    public LoginAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Setters (to change username and password)
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // Getters
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    // Validation method
    public boolean validateLogin(String inputUser, String inputPass) {
        return username.equals(inputUser) && password.equals(inputPass);
    }
}
