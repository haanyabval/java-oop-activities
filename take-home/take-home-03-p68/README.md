# Take Home 3: Ordering System

**Source:** Take Home, p. 68
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates a restaurant ordering system that uses encapsulation to manage product details, inheritance to differentiate food and drink items, abstraction to define a general order structure, and polymorphism to display product information while allowing users to select items, calculate the total, and process payment.

## Files

| File | Class |
|------|-------|
| [Order.java](src/page68/Order.java) | `page68.Order` |
| [Product.java](src/page68/Product.java) | `page68.Product` |
| [Food.java](src/page68/Food.java) | `page68.Food` |
| [Drink.java](src/page68/Drink.java) | `page68.Drink` |
| [CustomerOrder.java](src/page68/CustomerOrder.java) | `page68.CustomerOrder` |
| [OrderingSystem.java](src/page68/OrderingSystem.java) | `page68.OrderingSystem` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page68.OrderingSystem
```
