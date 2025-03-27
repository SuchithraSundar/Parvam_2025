package control_statement_java;

import java.util.Scanner;

public class Switch2 {
	
	public static void main(String[] args) {
	 
	//advanced switch with arrow function
//	 int day =0;
//	 System.out.println("Enter Day: ");
//	 Scanner sc =new Scanner(System.in);
//	 day = sc.nextInt();
//	 System.out.println("Day is: "+day);
//	 switch(day) {
//		 case 1 -> System.out.println("Monday");
//		 case 2 -> System.out.println("Tuesday");
//		 case 3 -> System.out.println("Wednesday");
//		 case 4 -> System.out.println("Thursday");
//		 case 5 -> System.out.println("Friday");
//		 case 6 -> System.out.println("Saturday");
//		 case 7 -> System.out.println("Sunday");
//		default -> System.out.println("invalid");
//	 }
	 
	 
	
	//practice
	 /*
	  * take user input
	  * check for weekdays and weekend using switch
	  * 1-5 weekdays and 6-7 weekend else invalid*/
	 
	 
	//way-1
//	 int day =0;
//	 System.out.println("Enter Day: ");
//	 Scanner sc =new Scanner(System.in);
//	 day = sc.nextInt();
//	 System.out.println("Day is: "+day);
//	 switch(day) {
//		 case 1 -> System.out.println("Weekdays");
//		 case 2 -> System.out.println("Weekdays");
//		 case 3 -> System.out.println("Weekdays");
//		 case 4 -> System.out.println("Weekdays");
//		 case 5 -> System.out.println("Weekdays");
//		 case 6 -> System.out.println("Weekend");
//		 case 7 -> System.out.println("Weekend");
//		default -> System.out.println("invalid");
//	 }
	 
	 //way-2
	 Scanner cs = new Scanner(System.in);
	 int day1 =cs.nextInt();
//	 switch(day1) {
//	 case 1,2,3,4,5 -> System.out.println("Weekdays");
//	 case 6,7 -> System.out.println("Weekend");
//	 default -> System.out.println("invalid");
//	 }
	 
	 //way-3
	
	 String res = switch(day1) {
	 case 1,2,3,4,5 -> "Weekdays";
	 case 6,7 -> "Weekend";
	 default -> "invalid";
	 };
	 System.out.println("The result is: "+res);
	 
	 

}
}