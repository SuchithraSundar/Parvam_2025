package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	
	//full args constructor with super keyword
	public NewAnimal(String name, int age) {
		super();
		System.out.println("Parent class Constructor");
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name is: "+this.name);
		System.out.println("Age is: "+this.age);
	}
	
}

class NewDog extends NewAnimal{
	public String eat;

	public NewDog(String name, int age, String eat) {
		super(name, age);
		System.out.println("Child class Constructor");
		this.eat = eat;
	}
	
	public void display() {
		super.display();
		System.out.println("Dog eats: "+this.eat);//using this keyword
		System.out.println("name of dog once again: "+super.name);
		
	}

}
public class SuperInJava {

	public static void main(String[] args) {
		/*
		 * super
		 * =====
		 * *1. used to call super class instance variables
		 * *2. used to call super class constructor
		 * *3. used to call super class method
		 * 
		 * inside constructor super() must be in first line
		 * */

		NewDog newdog = new NewDog("pomoranion",10,"pedegree");
		newdog.display();
		
	}

}
