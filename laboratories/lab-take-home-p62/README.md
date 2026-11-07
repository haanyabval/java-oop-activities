# Laboratory Take Home: Vehicle and Car (Inheritance)

**Source:** Laboratory Activity Take Home, p. 62
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates inheritance in Java, showing how the Car class inherits properties (brand and speed) from the parent Vehicle class while adding its own attributes (type and price) and methods.

## Files

| File | Class |
|------|-------|
| [Vehicle.java](src/page62/Vehicle.java) | `page62.Vehicle` |
| [Car.java](src/page62/Car.java) | `page62.Car` |
| [MainVehicle.java](src/page62/MainVehicle.java) | `page62.MainVehicle` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page62.MainVehicle
```
