// Laboratory Take Home: Shopee Grocery (Laboratory Activity Take Home, p. 60)
package page60;

import java.util.Scanner;

// MAIN CLASS
public class ShoppingGrocery {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("===== SHOPEE GROCERY SYSTEM =====");
      System.out.print("Enter number of grocery items to add: ");
      int n = input.nextInt();
      input.nextLine(); // consume newline
      ShopeeGrocery[] groceries = new ShopeeGrocery[n];
      // Input grocery details
      for (int i = 0; i < n; i++) {
          System.out.println("\nItem #" + (i + 1));
          System.out.print("Enter grocery name: ");
          String name = input.nextLine();
          System.out.print("Enter price: ");
          double price = input.nextDouble();
          System.out.print("Enter quantity: ");
          int qty = input.nextInt();
          input.nextLine(); // consume newline
          groceries[i] = new ShopeeGrocery(name, price, qty);
      }
      // Display all grocery items
      System.out.println("\n===== GROCERY SUMMARY =====");
      double totalAmount = 0;
      for (ShopeeGrocery g : groceries) {
          g.displayInfo();
          totalAmount += g.computeTotal();
      }
      // Display total amount
      System.out.println("TOTAL AMOUNT DUE: ₱" + totalAmount);
      System.out.println("============================");
  }
}
