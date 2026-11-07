// Laboratory Take Home: Shape Calculator (Laboratory Activity Take Home, p. 63)
package page63;

// ==================================================================
//                       BASE CLASS (PARENT)
// ==================================================================
class ShapeCalculator {
    // ===== METHOD OVERLOADING (Area) =====
    // Area of rectangle (length * width)
    double area(double length, double width) {
        return length * width;
    }
    // Area of circle (πr²)
    double area(double radius) {
        return Math.PI * radius * radius;
    }
    // Area of triangle (1/2 * b * h)
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    // ===== METHOD OVERLOADING (Perimeter) =====
    // Perimeter of rectangle
    double perimeter(double length, double width) {
        return 2 * (length + width);
    }
    // Circumference of circle
    double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
