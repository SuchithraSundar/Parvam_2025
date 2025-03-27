package Introduction_to_java.first_program;

import java.util.Scanner;

public class UserInputValues {

	public static void main(String[] args) {
//		int stdAge = 0;
//		System.out.println("Enter the age: ");
//		Scanner sc = new Scanner(System.in);
//		stdAge = sc.nextInt();
//		System.out.println("The age of student is : "+stdAge);
//		
//		short stdAge1 = 0;
//		System.out.println("Enter the age1: ");
//		Scanner sc1 = new Scanner(System.in);
//		stdAge1 = sc1.nextShort();
//		System.out.println("The age of student is: "+stdAge1);
//		
//		byte  stdAge2 = 0;
//		System.out.println("Enter the age2: ");
//		Scanner sc2 = new Scanner(System.in);
//		stdAge2 = sc2.nextByte();
//		System.out.println("The age of student is: "+stdAge2);
//	
//		
//		long stdAge3 = 0;
//		System.out.println("Enter the age3: ");
//		Scanner sc3 = new Scanner(System.in);
//		stdAge3 = sc3.nextLong();
//		System.out.println("The age of student is: "+stdAge3);
//		
//		float stdAge4 = 0;
//		System.out.println("Enter the age4: ");
//		Scanner sc4 = new Scanner(System.in);
//		stdAge4 = sc4.nextFloat();
//		System.out.println("The age of student is: "+stdAge4);
		
		double stdAge5 = 0;
		System.out.println("Enter the age5: ");
		Scanner sc5 = new Scanner(System.in);
		stdAge5 = sc5.nextDouble();
		System.out.println("The age of student is: "+stdAge5);
		
		//before printing char we need to use buffering that is nextLine();
		
		sc5.nextLine();
		
		System.out.println("Enter your name: ");
		char name = sc5.nextLine().charAt(0);
		System.out.println("Name is: "+name);
		
		
		
		
		
	}

}
