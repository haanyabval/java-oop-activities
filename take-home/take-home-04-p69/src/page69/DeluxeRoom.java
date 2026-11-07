// Take Home 4: Hotel Reservation System (Take Home, p. 69)
package page69;

import java.util.*;

// ================================================
// INHERITANCE – Deluxe Room
// ================================================
class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, "Deluxe Room", 1500);
    }
    @Override
    public void displayInfo() {
        System.out.println(getRoomNumber() + " - Deluxe Room - ₱1500.00/night (Free Breakfast)");
    }
}
