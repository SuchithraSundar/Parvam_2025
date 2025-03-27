package encapsulation;

class Student{
	private String name;
	private int age;
	private double marks;
	
	public Student(String name, int age, double marks) {
		
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public double getMarks() {
//		return marks;
//	}
//	public void setMarks(double marks) {
//		this.marks = marks;
//	}
	
	
}


public class EncapsulationInJava {

	public static void main(String[] args) {
		/*
		 * encapsulation:
		 * ==============
		 * Encapsulation is a mechanism that binding the data info into a single unit
		 * i,e making field(state) */
		
		
		//accessing data using getter and setter:
		
//		Student std1 = new Student();
//		std1.setName("Suchithra S");
//		System.out.println(std1.getName());
//		
//		std1.setAge(23);
//		System.out.println(std1.getAge());
//		
//		std1.setMarks(500);
//		System.out.println(std1.getMarks());
		
		
		//accessing data using  constructor
		Student std1  = new Student("Suchithra", 23, 405.46);
		System.out.println(std1);//it  will give the object address so that we use ToString method
		

	}

}
