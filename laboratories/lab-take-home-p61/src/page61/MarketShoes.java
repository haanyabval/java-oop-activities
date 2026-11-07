// Laboratory Take Home: Market Shoes (Laboratory Activity Take Home, p. 61)
package page61;

import java.util.Scanner;

// CLASS: ShopeeGrocery (or Shoppingshoes)
class MarketShoes {
  // Private attributes (Encapsulation)
  private String brand;
  private double size;
  private String color;
  private double price;
  private String payment;
  // Constructor
  public MarketShoes (String brand, double size, String color, double price, String payment) {
      this.brand = brand;
      this.size = size;
      this.color = color;
      this.price = price;
      this.payment = payment;
  }
  // Method to display information
  public void displayInfo() {
      System.out.println("===== SHOE DETAILS =====");
      System.out.println("Brand: " + brand);
      System.out.println("Size: " + size);
      System.out.println("Color: " + color);
      System.out.println("Price: ₱" + price);
      System.out.println("Payment Method: " + payment);
      System.out.println("========================");
  }
}
