// Laboratory Take Home: Fruit Selling (Encapsulation) (Laboratory Activity Take Home, p. 56)
package page56;

import java.util.Scanner;

// CLASS: Fruit
class Fruit {
  // Private variables (Encapsulation)
  private String fruitName;
  private double price;
  private int quantity;
  // Constructor
  public Fruit(String fruitName, double price, int quantity) {
      this.fruitName = fruitName;
      this.price = price;
      this.quantity = quantity;
  }
  // Getters
  public String getFruitName() {
      return fruitName;
  }
  public double getPrice() {
      return price;
  }
  public int getQuantity() {
      return quantity;
  }
  // Setters
  public void setFruitName(String fruitName) {
      this.fruitName = fruitName;
  }
  public void setPrice(double price) {
      this.price = price;
  }
  public void setQuantity(int quantity) {
      this.quantity = quantity;
  }
  // Method to compute total cost
  public double computeTotal() {
      return price * quantity;
  }
  // Display method
  public void displayInfo() {
      System.out.println("Fruit Name: " + fruitName);
      System.out.println("Price per Piece: ₱" + price);
      System.out.println("Quantity: " + quantity);
      System.out.println("Total Cost: ₱" + computeTotal());
      System.out.println("---------------------------");
  }
}
