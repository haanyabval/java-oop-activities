// Take Home 2: Login System (Take Home, p. 67)
package page67;

import java.util.*;

// =========================
// 1. ABSTRACT CLASS (Abstraction)
// =========================
abstract class LoginSystem {
    public abstract boolean authenticate(String username, String password);
    public abstract void displayWelcomeMessage();
}
