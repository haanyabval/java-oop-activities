// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Inheritance;

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println(brand + " (Car) is starting smoothly.");
    }
    public void honk() {
        System.out.println("Car is honking: Beep! Beep!");
    }
}
