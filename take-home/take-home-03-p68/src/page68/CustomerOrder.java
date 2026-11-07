// Take Home 3: Ordering System (Take Home, p. 68)
package page68;

import java.util.*;

// =====================================================
// Step 4: CustomerOrder (Implements calculateTotal())
// =====================================================
class CustomerOrder extends Order {
    private List<Product> cart = new ArrayList<>();
    public void addProduct(Product p) {
        cart.add(p);
    }
    public List<Product> getCart() { return cart; }
    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }
}
