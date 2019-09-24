//Association is a relationship between two separate classes and the association can be of any type say one to one, one to many
package test.practise.littleAdvance;

class Car {
	int carId;
	String carName;

	Car(int carId, String carName) {
		this.carId = carId;
		this.carName = carName;
	}
}

class Drive extends Car {
	String driverName;

	Drive(String driverName, int carId, String carName) {
		super(carId, carName); // super keyword is used if we have to use parent
								// class variable
		this.driverName = driverName;
	}

	void display() {
		System.out.println("Diver and CarInfo: " + driverName + " is driving " + carName + " " + "of CarID:" + carId);
	}
}

class Association {
	public static void main(String[] args) {
		Drive D = new Drive("Mahesh", 9999, "BMW");
		D.display();
	}
}