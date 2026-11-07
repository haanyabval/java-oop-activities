// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Inheritance;

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        // Parent variable inherited
        System.out.println("Brand: " + myCar.brand);
        // Overridden method
        myCar.start();
        // Parent method
        myCar.stop();
        // Child method
        myCar.honk();
    }
}
