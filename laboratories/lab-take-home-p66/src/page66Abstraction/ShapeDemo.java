// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Abstraction;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape r = new Rectangle(5, 10);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}
