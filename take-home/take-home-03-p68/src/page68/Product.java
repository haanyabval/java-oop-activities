// Take Home 3: Ordering System (Take Home, p. 68)
package page68;

import java.util.*;

// =====================================================
// Step 1: ENCAPSULATION – Product Class
// =====================================================
class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    // Setters
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    // Polymorphism (Overridden by subclasses)
    public void displayInfo() {
        System.out.println(name + " - ₱" + price + " x " + quantity);
    }
}
