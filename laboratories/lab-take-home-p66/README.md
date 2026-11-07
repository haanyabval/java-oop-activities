# Laboratory Take Home: Four OOP Pillars

**Source:** Laboratory Activity Take Home, p. 66
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates abstraction in Java, using an abstract Shape class to define a general blueprint for different shapes while allowing each subclass (Circle and Rectangle) to implement its own specific area calculation.

## Files

| File | Class |
|------|-------|
| [Shape.java](src/page66Abstraction/Shape.java) | `page66Abstraction.Shape` |
| [Circle.java](src/page66Abstraction/Circle.java) | `page66Abstraction.Circle` |
| [Rectangle.java](src/page66Abstraction/Rectangle.java) | `page66Abstraction.Rectangle` |
| [ShapeDemo.java](src/page66Abstraction/ShapeDemo.java) | `page66Abstraction.ShapeDemo` |
| [BankAccount.java](src/page66Encapsulation/BankAccount.java) | `page66Encapsulation.BankAccount` |
| [BankApp.java](src/page66Encapsulation/BankApp.java) | `page66Encapsulation.BankApp` |
| [Vehicle.java](src/page66Inheritance/Vehicle.java) | `page66Inheritance.Vehicle` |
| [Car.java](src/page66Inheritance/Car.java) | `page66Inheritance.Car` |
| [VehicleDemo.java](src/page66Inheritance/VehicleDemo.java) | `page66Inheritance.VehicleDemo` |
| [Payment.java](src/page66Polymorphism/Payment.java) | `page66Polymorphism.Payment` |
| [CashPayment.java](src/page66Polymorphism/CashPayment.java) | `page66Polymorphism.CashPayment` |
| [GcashPayment.java](src/page66Polymorphism/GcashPayment.java) | `page66Polymorphism.GcashPayment` |
| [OverridePayDemo.java](src/page66Polymorphism/OverridePayDemo.java) | `page66Polymorphism.OverridePayDemo` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page66Abstraction.ShapeDemo
java -cp out page66Encapsulation.BankApp
java -cp out page66Inheritance.VehicleDemo
java -cp out page66Polymorphism.OverridePayDemo
```
