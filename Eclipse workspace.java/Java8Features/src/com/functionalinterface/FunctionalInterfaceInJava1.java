package com.functionalinterface;

@FunctionalInterface
interface Interface2{
	public void display();
}

@FunctionalInterface
interface Interface3{
	public int string(String s);
}

@FunctionalInterface
interface Interface4{
	public int add(int a, int b);
}


public class FunctionalInterfaceInJava1 {

	public static void main(String[] args) {
		//with lambda expressions
		//int a = 10;
		 Interface2 i2 = ()-> System.out.println("Hello World");
		 i2.display();
		 
		//String Length
		Interface3 i3 = s->s.length();
		int str = i3.string("Suchithra");
		System.out.println("String length is: "+str);
		
		//addition of two numbers
		Interface4 i4 = (a,b) -> a+b ;
		int add = i4.add(10, 20);
		System.out.println("Addition of two num: "+add);

	}

}
