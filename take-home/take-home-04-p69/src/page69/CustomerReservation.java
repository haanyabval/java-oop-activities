// Take Home 4: Hotel Reservation System (Take Home, p. 69)
package page69;

import java.util.*;

// ================================================
// Customer Reservation (implements calculateTotal)
// ================================================
class CustomerReservation extends Reservation {
    private Room room;
    private int nights;
    public CustomerReservation(Room room, int nights) {
        this.room = room;
        this.nights = nights;
    }
    public Room getRoom() { return room; }
    public int getNights() { return nights; }
    @Override
    public double calculateTotal() {
        return room.getPricePerNight() * nights;
    }
}
