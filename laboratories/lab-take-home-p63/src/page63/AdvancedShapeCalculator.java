// Laboratory Take Home: Shape Calculator (Laboratory Activity Take Home, p. 63)
package page63;

// ==================================================================
//                 CHILD CLASS → METHOD OVERRIDING
// ==================================================================
class AdvancedShapeCalculator extends ShapeCalculator {
    @Override
    double area(double length, double width) {
        System.out.println("[Overridden] Calculating rectangle area...");
        return super.area(length, width);
    }
    @Override
    double area(double radius) {
        System.out.println("[Overridden] Calculating circle area...");
        return super.area(radius);
    }
}
