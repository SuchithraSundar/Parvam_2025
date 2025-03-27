package arraysInJava.arrays;

import java.util.Scanner;

public class Assignment_1Darray {

	public static void main(String[] args) {
		
		/*write a program to take the user input values
		 * and store inside array and just print it */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		int [] arr =new int[size];
		
		
		System.out.println("enter the values for array: ");
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" th element is: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Array elements are: ");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+" ");
		}
		sc.close();
		

	}

}
