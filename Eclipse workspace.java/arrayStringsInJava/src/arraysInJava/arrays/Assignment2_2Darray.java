package arraysInJava.arrays;

import java.util.Scanner;

public class Assignment2_2Darray {
	public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no of rows and columns: ");
	     int row = sc.nextInt();
	     int col =sc.nextInt();
	     
	     String [] [] arr = new String [row][col];
	     
	     for(int i=0;i<row;i++) {
	    	 for(int j=0;j<col;j++) {
	    		 arr[i][j]=sc.next();
	    	 }
	     }
	     System.out.println("Array elemnets are: ");
	     for(int i=0;i<row;i++) {
	    	 for(int j=0;j<col;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	 }
	    	  System.out.println();	  
	     }
	  
	     
	     
}
}

