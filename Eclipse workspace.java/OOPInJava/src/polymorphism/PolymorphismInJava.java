package polymorphism;


//1. method-overriding:
class Person{
//	public void dancing() {
//		System.out.println("Person is dancing");
//	}
	
	static void dancing() {
		System.out.println("Person is dancing");
	}
}
class Kavya extends Person{
//	public void dancing() {
//		System.out.println("Kavya is dancing");
//	}
	
	static void dancing() {
		System.out.println("Kavya is dancing");
	}
}

//2. method-overloading:
class Addition{
	public void add(int a, int b) {
		System.out.println("addition of 2 parameter: "+ (a+b));	
	}
	public void add(int a, int b, int c) {
		System.out.println("addition of 3 parameter: "+ (a+b+c));
	}
	
}


public class PolymorphismInJava {

	public static void main(String[] args) {
		/*
		 * polymorphism:
		 * =============
		 * *poly -> many
		 * *morphism -> forms
		 * * it is mechanism that will perform  a different actions
		 * based on the situation
		 * 
		 * The term "Polymorphism" means "many forms",allowing a single method, function, or operator to behave differently based on the context.
		 * 
		 * types:
		 * =====
		 * 1. method-overriding(need two class):
		 * ------------------------------------
		 * *it is also called as dynamic polymorphism/ runtime polymorphism
		 * *when we don't need implementation of Parent class then we can override that by our own implementation inside child class
		 * *Method Overriding occurs when a subclass provides a specific implementation of a method that is already defined in its parent class.
		 * 
		 * static method can't be over
		 * 
		 * **keypoints:
		 * ------------
		 * Overriding happens in inheritance (subclass/child class).
		 * The method name and parameters must be the same as the parent class.
		 * @Override annotation ensures correct overriding.
		 * Runtime polymorphism is achieved through method overriding.
		 *
		 * 2. method-overloading(need one class):
		 * --------------------------------------
		 * *it is also called as compiletime polymorphism/static polymorphism /static binding 
		 * *it refers to overloading one class with different parameters
		 * Method Overloading occurs when multiple methods in the same class have the same name 
		 * but different parameters (different number, type, or order of parameters).
		 * It is determined at compile-time.
		 * 
		 * 
		 * stactic method can be overload
		 * 
		 *  **keypoints:
		 * ------------
		 * Overloading is determined at compile-time.
		 * The method name is the same, but the parameter list differs.
		 * The return type does not matter for overloading.
		 * 
		 * */
		
		
		//1. method-overriding:
		//public method
//		Kavya k = new Kavya();
//		k.dancing();
		
		//static method
		Kavya.dancing();
		
		//2. method-overloading
//		Addition a1 = new Addition();
//		a1.add(10, 20);
//		a1.add(10, 20, 30);
//		
	}
}
