package final_this_super;

class  Person1{
	public String name;
	public int age;
	
	//no args(default)
	public Person1() {
		System.out.println("Default Constructor");
	}

	//all args 
	public Person1(String name, int age) {
		this();
		System.out.println("All args Constructor");
		this.name = name;
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void display() {
		this.sayHello();
		System.out.println("Name is: "+this.name);
		System.out.println("Age is: "+this.age);
	}

}

public class ThisInJava {
	
public static void main(String[] args) {
	/*
	 * This Keyword:
	 * ============
	 * *1. used to refer instance variables in  current class
	 * *2. used to refer current class constructor
	 * *3. used to refer method in current class
	 * */
	
	Person1 p1 = new Person1("Suchithra",23);
	p1.display();
}
}
