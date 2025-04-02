package abstraction;

//1. interface
interface Animal{
	public void eat();
}

class Tiger implements Animal{

	@Override
	public void eat() {
		System.out.println("Tiger eats meat");
	}	
}

//2.abstract class - uses abstract keyword to class
abstract class Vehicle{
	//abstract method - no body
	public abstract void start();
	
	//non abstract method - have body
	public void stop() {
		System.out.println("The vehicle is stopped");
	}
}

class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("The Car will start by Key");
		
	}
	
}




public class Abstraction {

	public static void main(String[] args) {
		/*
		 * Abstraction:
		 * =============
		 * it s a process of hiding the implementation and showing only the essential resources
		 * it is not possible to create instances for abstract
		 * 
		 * for abstract method it not possible to create instances,as we can't create the  object
		 * 
		 * 2 ways:
		 * =======
		 * 1.Interfaces(gives 100% abstraction/ hiding)
		 * 2.abstract class(0-100%)
		 * 
		 * */

		
		//1.interface method
		Tiger t = new Tiger();
		t.eat();
		
		//2. abstract method
		Car c = new Car();
		c.start();
		c.stop();
		
	}

}
