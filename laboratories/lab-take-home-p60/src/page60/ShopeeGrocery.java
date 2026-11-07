// Laboratory Take Home: Shopee Grocery (Laboratory Activity Take Home, p. 60)
package page60;

import java.util.Scanner;

// CLASS: ShoppingGrocery
class ShopeeGrocery {
  // Private attributes for encapsulation
  private String groceryName;
  private double price;
  private int quantity;
  private double totalCost;
  // Constructor
  public ShopeeGrocery(String groceryName, double price, int quantity) {
      this.groceryName = groceryName;
      this.price = price;
      this.quantity = quantity;
      this.totalCost = computeTotal();
  }
  // Getters
  public String getGroceryName() {
      return groceryName;
  }
  public double getPrice() {
      return price;
  }
  public int getQuantity() {
      return quantity;
  }
  public double getTotalCost() {
      return totalCost;
  }
  // Setters
  public void setGroceryName(String groceryName) {
      this.groceryName = groceryName;
  }
  public void setPrice(double price) {
      this.price = price;
  }
  public void setQuantity(int quantity) {
      this.quantity = quantity;
  }
  // Compute method
  public double computeTotal() {
      return price * quantity;
  }
  // Display grocery details
  public void displayInfo() {
      System.out.println("Item: " + groceryName);
      System.out.println("Price: ₱" + price);
      System.out.println("Quantity: " + quantity);
      System.out.println("Total Cost: ₱" + computeTotal());
      System.out.println("---------------------------");
  }
}
