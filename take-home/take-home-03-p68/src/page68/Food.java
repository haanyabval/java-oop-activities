// Take Home 3: Ordering System (Take Home, p. 68)
package page68;

import java.util.*;

// =====================================================
// Step 2: INHERITANCE – Food Subclass
// =====================================================
class Food extends Product {
    private boolean isSpicy;
    public Food(String name, double price, int quantity, boolean isSpicy) {
        super(name, price, quantity);
        this.isSpicy = isSpicy;
    }
    public boolean isSpicy() { return isSpicy; }
    @Override
    public void displayInfo() {
        System.out.println(getName() + " (Food) - ₱" + getPrice() +
                " x " + getQuantity() +
                " | Spicy: " + (isSpicy ? "Yes" : "No"));
    }
}
