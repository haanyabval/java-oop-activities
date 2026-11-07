// Take Home 3: Ordering System (Take Home, p. 68)
package page68;

import java.util.*;

// =====================================================
// Step 2: INHERITANCE – Drink Subclass
// =====================================================
class Drink extends Product {
    private String size; // Small, Medium, Large
    public Drink(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }
    public String getSize() { return size; }
    @Override
    public void displayInfo() {
        System.out.println(getName() + " (Drink) - ₱" + getPrice() +
                " x " + getQuantity() +
                " | Size: " + size);
    }
}
