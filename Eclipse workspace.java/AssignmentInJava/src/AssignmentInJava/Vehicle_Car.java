package AssignmentInJava;

class Vehicle{
	public String brand;
	public double speed;
	
	public Vehicle(String brand, double speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
	}
	
}

class Car extends Vehicle{
	public int numDoors;

	public Car(String brand, double speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}
	
	public void display() {
		super.display();
		System.out.println("NumDoors: "+numDoors);
	}
}

public class Vehicle_Car {
	public static void main(String[] args) {
		
		Car car = new Car("Tata", 150, 4);
		car.display();
		
	}
}
