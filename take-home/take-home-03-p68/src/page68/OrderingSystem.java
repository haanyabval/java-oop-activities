// Take Home 3: Ordering System (Take Home, p. 68)
package page68;

import java.util.*;

// =====================================================
// Step 5 & 6: MAIN PROGRAM – MENU + PAYMENT
// =====================================================
public class OrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerOrder order = new CustomerOrder();
        // Sample menu items
        Food burger = new Food("Burger", 80, 0, false);
        Food spicyWings = new Food("Spicy Wings", 150, 0, true);
        Drink coke = new Drink("Coke", 25, 0, "Medium");
        Drink icedTea = new Drink("Iced Tea", 35, 0, "Large");
        boolean running = true;
        while (running) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Burger - ₱80");
            System.out.println("2. Spicy Wings - ₱150");
            System.out.println("3. Coke (Medium) - ₱25");
            System.out.println("4. Iced Tea (Large) - ₱35");
            System.out.println("5. Checkout");
            System.out.println("================================");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            int qty;
            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    order.addProduct(new Food("Burger", 80, qty, false));
                    System.out.println("Added to cart!");
                    break;
                case 2:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    order.addProduct(new Food("Spicy Wings", 150, qty, true));
                    System.out.println("Added to cart!");
                    break;
                case 3:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    order.addProduct(new Drink("Coke", 25, qty, "Medium"));
                    System.out.println("Added to cart!");
                    break;
                case 4:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    order.addProduct(new Drink("Iced Tea", 35, qty, "Large"));
                    System.out.println("Added to cart!");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        // ================================
        // CHECKOUT SUMMARY
        // ================================
        System.out.println("\n========== ORDER SUMMARY ==========");
        for (Product p : order.getCart()) {
            p.displayInfo(); // Polymorphism
        }
        double total = order.calculateTotal();
        System.out.println("-----------------------------------");
        System.out.println("TOTAL AMOUNT: ₱" + total);
        // ================================
        // PAYMENT PROCESS
        // ================================
        double payment = 0;
        do {
            System.out.print("\nEnter payment amount: ₱");
            payment = sc.nextDouble();
            if (payment < total) {
                System.out.println("[X] Not enough payment. Please try again.");
            }
        } while (payment < total);
        double change = payment - total;
        System.out.println("Payment accepted!");
        System.out.println("CHANGE: ₱" + change);
        System.out.println("===================================");
        System.out.println("        THANK YOU FOR ORDERING!    ");
        System.out.println("===================================");
        sc.close();
    }
}
