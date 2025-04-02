package inheritence;


class Student{
	//states
	public int age = 23;
	public String name = "Kavya";
	public double marks = 405.00;
	
	//actions
	public void isplaying() {
		System.out.println(this.name+ " is playing");
	}
	
	public void issleeping() {
		System.out.println(this.name+ " is sleeping");
	}
}

public class ClassObjectInJava {

public static void main(String[] args) {
	
	//object creation for Student class
	Student std1 = new Student();
	System.out.println(std1.name);
	System.out.println(std1.age);
	System.out.println(std1.marks);
	std1.isplaying();
	std1.issleeping();
	
	/*
	 * class :
	 * =======
	 * *class will represent the state and behaviour of an object
	 * for class we can only provide two access specifier that  are public and default(abstract & final)
	 * state -> property
	 * behaviour -> action
	 * 
	 * 
	 * object:
	 * =======
	 * *object is a implementation of class(state and action)
	 * example: 
	 * ========
	 * Student
	 * 
	 * property:
	 * ========
	 * USN
	 * name
	 * branch
	 * 
	 * action:
	 * ======
	 * isplaying()
	 * issleeping()
	 * 
	 * 
	 * how to declare class and object
	 * ===============================
	 * class class_name{
	 * 		state
	 * 		action
	 * }
	 * 
	 * ex:
	 * class Student{
	 * 		property:
	 * 		public int age =30;
	 * 
	 * 		action:
	 * 		public void isPlaying(){
	 * 		syso("The student is playing")
	 * 		}
	 * }
	 * Student std1 = new Student();
	 * System.out.println(std1.age);
	 * std1.isplaying();
	 * std1.issleeping();
	 * 
	 *  
	 *  
	 *  */

		
}

}
