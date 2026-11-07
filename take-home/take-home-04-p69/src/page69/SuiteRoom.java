// Take Home 4: Hotel Reservation System (Take Home, p. 69)
package page69;

import java.util.*;

// ================================================
// INHERITANCE – Suite Room
// ================================================
class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber) {
        super(roomNumber, "Suite Room", 2500);
    }
    @Override
    public void displayInfo() {
        System.out.println(getRoomNumber() + " - Suite Room - ₱2500.00/night (Lounge Access)");
    }
}
