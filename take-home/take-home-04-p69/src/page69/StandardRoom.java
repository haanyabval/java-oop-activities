// Take Home 4: Hotel Reservation System (Take Home, p. 69)
package page69;

import java.util.*;

// ================================================
// INHERITANCE – Standard Room
// ================================================
class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber, "Standard Room", 1000);
    }
    @Override
    public void displayInfo() {
        System.out.println(getRoomNumber() + " - Standard Room - ₱1000.00/night");
    }
}
