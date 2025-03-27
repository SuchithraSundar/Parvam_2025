package exceptionInJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava_checked {
	
	//recursion
	public static void display() {
		display();
	}

	public static void main(String[] args)  throws FileNotFoundException{
		/*
		 * Exception In Java:
		 * ------------------
		 * *there is a unwanted or un-expected event occur in the program
		 * *when ever there is exception, the normal flow of program  will stops
		 * 
		 * 2 types:
		 * ---------
		 * 1. checked exception(compile time) -> 1.I/O exception, 2.CLassNotFoundException 3.SQLException --->FileNoTFoundException
		 * 2. unchecked  exception(run time) ->1.RuntimeException(arithmeticException & nullpointerException) ---> arrayIndexOutBoundException
		 * 
		 * 
		 * Error:
		 * ------
		 * *it is  a problem where the programmer can't handle it 
		 * ex;  StackOverflowError
		 * 
		 * */
		//Error
		//ExceptionInJava.display();
		
		
		//checked exception:
		//1.try catch
		//2. throws --> it will occur inside main function so we need to mention throw keyword in main 
		
		
		
		//1.try catch:
//		try {
//			PrintWriter printWritter = new PrintWriter("abc.txt");
//			printWritter.println("Hello World");
//			System.out.println("Hello World");
//			printWritter.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		//2.throws
		PrintWriter printWritter = new PrintWriter("throws.txt");
		printWritter.println("Hello World");
		System.out.println("Hello World");
		printWritter.close();
		
	}

}
