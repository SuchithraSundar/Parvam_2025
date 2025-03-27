package AssignmentInJava;

interface Animal{
	public void eat();
	public void makeSound();
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eats pedegree");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Dog barks");
		
	}
	
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat eats pedegree");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Cat meows");
		
	}
	
}

public class AnimalInterface {
	public static void main(String[] args) {
		
	Dog dog = new Dog();
	dog.eat();
	dog.makeSound();
	
	System.out.println();
	
	Cat cat = new Cat();
	cat.eat();
	cat.makeSound();
	}

}
