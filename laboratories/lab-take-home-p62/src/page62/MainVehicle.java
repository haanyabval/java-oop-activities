// Laboratory Take Home: Vehicle and Car (Inheritance) (Laboratory Activity Take Home, p. 62)
package page62;

	// Main class
	public class MainVehicle {
	    public static void main(String[] args) {
	        // Create object of Car
	        Car car1 = new Car("Toyota", 230, "Sedan", 1200000);
	        car1.displayInfo();
	        System.out.println();
	        Car car2 = new Car("Ford", 260, "SUV", 1600000);
	        car2.displayInfo();
	    }
	}
