// Laboratory Take Home: Fruit Selling (Encapsulation) (Laboratory Activity Take Home, p. 56)
package page56;

import java.util.Scanner;

// MAIN CLASS
public class FruitSelling {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Create at least two fruit objects
      System.out.println("===== FRUIT SELLING PROGRAM =====");
      System.out.print("Enter first fruit name: ");
      String name1 = input.nextLine();
      System.out.print("Enter price per piece: ");
      double price1 = input.nextDouble();
      System.out.print("Enter quantity: ");
      int qty1 = input.nextInt();
      input.nextLine(); // consume newline
      System.out.print("\nEnter second fruit name: ");
      String name2 = input.nextLine();
      System.out.print("Enter price per piece: ");
      double price2 = input.nextDouble();
      System.out.print("Enter quantity: ");
      int qty2 = input.nextInt();

      // Create two fruit objects
      Fruit fruit1 = new Fruit(name1, price1, qty1);
      Fruit fruit2 = new Fruit(name2, price2, qty2);

      // Display information
      System.out.println("\n===== FRUIT SALES SUMMARY =====");
      fruit1.displayInfo();
      fruit2.displayInfo();
      double totalSales = fruit1.computeTotal() + fruit2.computeTotal();
      System.out.println("Total Sales for Both Fruits: ₱" + totalSales);
  }
}
