// Take Home 4: Hotel Reservation System (Take Home, p. 69)
package page69;

import java.util.*;

// ================================================
// MAIN PROGRAM – MENU + PAYMENT
// ================================================
public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Available rooms
        Room[] rooms = {
            new StandardRoom(101),
            new DeluxeRoom(102),
            new SuiteRoom(103)
        };
        int choice;
        boolean running = true;
        System.out.println("\nWelcome to RTU Hotel Reservation System\n");
        while (running) {
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit Program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Rooms\n");
                    for (Room room : rooms) {
                        room.displayInfo(); // Polymorphism
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("\nEnter Room Number: ");
                    int roomNum = sc.nextInt();
                    Room selectedRoom = null;
                    // Search room
                    for (Room room : rooms) {
                        if (room.getRoomNumber() == roomNum) {
                            selectedRoom = room;
                            break;
                        }
                    }
                    if (selectedRoom == null) {
                        System.out.println("Invalid Room Number.\n");
                        break;
                    }
                    System.out.print("Enter number of nights: ");
                    int nights = sc.nextInt();
                    CustomerReservation reservation =
                            new CustomerReservation(selectedRoom, nights);
                    // Summary
                    System.out.println("\nReservation Summary");
                    System.out.println("Room: " + selectedRoom.getRoomType());
                    System.out.println("Nights: " + nights);
                    double total = reservation.calculateTotal();
                    System.out.println("Total: ₱" + total);
                    // Payment
                    double payment;
                    do {
                        System.out.print("\nEnter payment amount: ");
                        payment = sc.nextDouble();
                        if (payment < total) {
                            System.out.println("Insufficient payment. Please try again.");
                        }
                    } while (payment < total);
                    double change = payment - total;
                    System.out.println("\nPayment accepted. Change: ₱" + change);
                    System.out.println("Reservation Confirmed! Thank you for booking with RTU Hotel.\n");
                    break;
                case 3:
                    System.out.println("Thank you for using RTU Hotel Reservation System!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        }
        sc.close();
    }
}
