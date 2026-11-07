# Take Home 4: Hotel Reservation System

**Source:** Take Home, p. 69
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program simulates a hotel reservation system that uses encapsulation to manage room details, inheritance to define different room types, abstraction to calculate total reservation costs, and polymorphism to display room information, allowing customers to view rooms, book a stay, and process payments.

## Files

| File | Class |
|------|-------|
| [Reservation.java](src/page69/Reservation.java) | `page69.Reservation` |
| [Room.java](src/page69/Room.java) | `page69.Room` |
| [StandardRoom.java](src/page69/StandardRoom.java) | `page69.StandardRoom` |
| [DeluxeRoom.java](src/page69/DeluxeRoom.java) | `page69.DeluxeRoom` |
| [SuiteRoom.java](src/page69/SuiteRoom.java) | `page69.SuiteRoom` |
| [CustomerReservation.java](src/page69/CustomerReservation.java) | `page69.CustomerReservation` |
| [HotelReservationSystem.java](src/page69/HotelReservationSystem.java) | `page69.HotelReservationSystem` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page69.HotelReservationSystem
```
