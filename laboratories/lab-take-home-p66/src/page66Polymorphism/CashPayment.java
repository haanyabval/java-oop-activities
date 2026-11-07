// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Polymorphism;

class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₱" + amount + " using CASH.");
    }
}
