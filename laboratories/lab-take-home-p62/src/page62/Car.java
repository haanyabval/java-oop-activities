// Laboratory Take Home: Vehicle and Car (Inheritance) (Laboratory Activity Take Home, p. 62)
package page62;

	// Child class
	class Car extends Vehicle {
	    String type;
	    double price;
	    // Constructor using super() to call parent constructor
	    public Car(String brand, int speed, String type, double price) {
	        super(brand, speed);
	        this.type = type;
	        this.price = price;
	    }
	    // Method to display information
	    public void displayInfo() {
	        System.out.println("===== CAR DETAILS =====");
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed + " km/h");
	        System.out.println("Type: " + type);
	        System.out.println("Price: ₱" + price);
	        System.out.println("=======================");
	    }
	}
