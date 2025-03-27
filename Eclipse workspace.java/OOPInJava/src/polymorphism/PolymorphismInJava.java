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
		 * types:
		 * =====
		 * 1. method-overriding(need two class):
		 * ------------------------------------
		 * *it is also called as dynamic polymorphism/ runtime polymorphis
		 * *when we don't need implementation of Parent class then we can override that by our own implementation inside child class
		 * 
		 * 2. method-overloading(need one class):
		 * --------------------------------------
		 * *it is also called as compiletime polymorphism/static polymorphism /static binding 
		 * *it refers to overloading one class with different parameters
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
