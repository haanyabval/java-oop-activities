// Laboratory Take Home: Shape Calculator (Laboratory Activity Take Home, p. 63)
package page63;

// ==================================================================
//                           MAIN PROGRAM
// ==================================================================
public class MainCalculator {
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();
        AdvancedShapeCalculator advCalc = new AdvancedShapeCalculator();
        System.out.println("=== METHOD OVERLOADING ===");
        System.out.println("Rectangle Area: " + calc.area(10, 5));
        System.out.println("Circle Area: " + calc.area(7));
        System.out.println("Triangle Area: " + calc.area(6, 8, true));
        System.out.println("\nRectangle Perimeter: " + calc.perimeter(10, 5));
        System.out.println("Circle Perimeter: " + calc.perimeter(7));
        System.out.println("\n=== METHOD OVERRIDING ===");
        System.out.println("Rectangle Area (Overridden): " + advCalc.area(10, 5));
        System.out.println("Circle Area (Overridden): " + advCalc.area(7));
    }
}
