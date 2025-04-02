package final_this_super;

//final with method
// method-overriding:
class Person{
	public final void dancing1() {
		System.out.println("Person is dancing");
	}
}

class Suchithra extends Person{
//	public  void dancing1() {
//		//can't override method with final keyword
//	}
	
}
//final with class

 final class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
}

//class Dog extends Animal{
//	// Dog Class can't extends the Animal class as it uses the final keywords
//}

public class FinalInJava {

	public static void main(String[] args) {
		/*
		 * final -> we can't change the value
		 * used for variables, method, class
		 * *final with variables: the variables value can't be changed
		 * *final with method: we can't override method when  final keyword used in method
		 * *final with class: 
		 * for final method it  is possible to create instances,as we can create the  object
		 * */

		//variables:
		final double PI = 3.14;
		System.out.println(PI);
//		PI = 4.14; // can't redeclare values to PI variable as it used final
//		System.out.println(PI);
		
	}

}
