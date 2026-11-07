// Laboratory Take Home: Market Shoes (Laboratory Activity Take Home, p. 61)
package page61;

import java.util.Scanner;

// MAIN CLASS
public class ShoppingShoes {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Shoe Brand: ");
      String brand = sc.nextLine();
      System.out.println("Enter Shoe Size: ");
      double size = sc.nextDouble();
      sc.nextLine(); // consume newline
      System.out.println("Enter Shoe Color: ");
      String color = sc.nextLine();
      System.out.println("Enter Shoe Price: ");
      double price = sc.nextDouble();
      sc.nextLine();
      System.out.println("Enter Payment Method (Cash/Card/GCash): ");
      String payment = sc.nextLine();
      // Create object
      MarketShoes mshoe = new MarketShoes (brand, size, color, price, payment);
      // Display details
      mshoe.displayInfo();
      sc.close();
  }
}
