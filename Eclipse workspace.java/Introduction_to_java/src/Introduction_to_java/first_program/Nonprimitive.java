package Introduction_to_java.first_program;

import java.util.Scanner;

public class Nonprimitive {
	
	
	/*
	 * Array
	 * 
	 * String
	 * 
	 * 1. array:
	 * <datatype>[] arrayaname = {};
	 * 
	 * 
	 * 2. string:
	 *  String name  = "";
	 *  */

	public static void main(String[] args) {
//		int [] array1 = {1,2,3,4,5,6};
//		System.out.println(array1[3]);
//		
//		
//		String name = "Suchithra";
//		System.out.println(name);
		
//		System.out.println("enter your data: ");
//		Scanner sc = new Scanner(System.in);
//		sc.next();
//		sc.nextLine();
		
		
		
		
//		System.out.println("Enter your name: ");
//		Scanner sc1 = new Scanner(System.in);
//		String name =sc.nextLine().charAt(0)
//		System.out.println(name);
//		
		
		
		String name = " ";
		System.out.println("Enter name:");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("The Student name is: "+name);
		
		byte age = 0;
		System.out.println("Enter age:");
		Scanner sc1 = new Scanner(System.in);
		age = sc1.nextByte();
		System.out.println("The Student age is: "+age);
		
		double marks = 0;
		System.out.println("Enter marks:");
		Scanner sc2 = new Scanner(System.in);
		marks = sc2.nextDouble();
		System.out.println("The Student marks is: "+marks);
	
		char gender = 0;
		System.out.println("Enter gender: ");
		Scanner sc3 = new Scanner(System.in);
		gender = sc3.nextLine().charAt(0);
		System.out.println("The Student gender is: "+gender);
		
		String  address = " ";
		System.out.println("Enter address:");
		Scanner sc4 = new Scanner(System.in);
		address = sc4.nextLine();
		System.out.println("The Student address is: "+address);
		
		String branch = " ";
		System.out.println("Enter branch:");
		Scanner sc5 = new Scanner(System.in);
		branch = sc5.nextLine();
		System.out.println("The Student branch is: "+ branch);
		
		

	}

}
