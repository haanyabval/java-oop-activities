// Take Home 4: Hotel Reservation System (Take Home, p. 69)
package page69;

import java.util.*;

// ================================================
// ENCAPSULATION – Parent Room Class
// ================================================
class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
    // Getters
    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
    // Polymorphism (overridden in subclasses)
    public void displayInfo() {
        System.out.println(roomNumber + " - " + roomType + " - ₱" + pricePerNight + "/night");
    }
}
