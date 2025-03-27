package concrete_pojo;

class Persons{
	private String name;
	private int age;
	private double marks;
	
	//all args constructor
	public Persons(String name, int age, double marks) {
		super();
		System.out.println("All args constructor");
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	//no args constructor
	public Persons() {
		super();
		System.out.println("No args constructor");
	}

	//toString
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	//Getter And Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
	
	
	
	
}

public class PojoClass {

	public static void main(String[] args) {
		/*
		 * POJO Class:
		 * *plain old java object(POJO)
		 * 
		 * rules:
		 * =====
		 * 1. The class is should not extends or implements any class or interface
		 * 2. Every field (states/properties) should be private
		 * 3. All args constructor
		 * 4. No-args Constructor
		 * 5. toString()
		 * Getter and Setter public methods
		 * */

		Persons p1 =new Persons("Suchi",23,405);
		System.out.println(p1);
		
		Persons p2 =new Persons();
		System.out.println(p2);
		
	}

}
