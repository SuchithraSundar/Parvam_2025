package com.functionalinterface;

@FunctionalInterface
interface Interface1{
	public void display();
}

class Display implements Interface1{

	@Override
	public void display() {
		System.out.println("Hello World");	
	}
}

public class FunctionalInterfaceInJava {

	public static void main(String[] args) {
		
		//without lambda expressions
		Display display =new Display();
		display.display();

	}

}
