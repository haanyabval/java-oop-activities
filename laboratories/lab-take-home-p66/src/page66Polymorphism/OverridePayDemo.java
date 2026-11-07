// Laboratory Take Home: Four OOP Pillars (Laboratory Activity Take Home, p. 66)
package page66Polymorphism;

public class OverridePayDemo {
    public static void main(String[] args) {
        Payment p;
        p = new CashPayment();
        p.pay(500);
        p = new GcashPayment();
        p.pay(1200);
    }
}
