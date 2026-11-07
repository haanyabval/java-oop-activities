# Laboratory Take Home: Shape Calculator

**Source:** Laboratory Activity Take Home, p. 63
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates polymorphism in Java, using method overloading to handle multiple versions of the area and perimeter methods for different shapes, and method overriding in the AdvancedShapeCalculator subclass to customize behavior for specific shape calculations.

## Files

| File | Class |
|------|-------|
| [ShapeCalculator.java](src/page63/ShapeCalculator.java) | `page63.ShapeCalculator` |
| [AdvancedShapeCalculator.java](src/page63/AdvancedShapeCalculator.java) | `page63.AdvancedShapeCalculator` |
| [MainCalculator.java](src/page63/MainCalculator.java) | `page63.MainCalculator` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page63.MainCalculator
```
