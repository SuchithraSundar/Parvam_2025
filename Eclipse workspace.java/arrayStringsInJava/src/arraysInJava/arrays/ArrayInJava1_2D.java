package arraysInJava.arrays;

import java.util.Scanner;

public class ArrayInJava1_2D {
	public static void main(String[] args) {
		/*
		 * 2D array
		 * */
		int [][] arr = new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no of rows and columns: ");
	     int row = sc.nextInt();
	     int col =sc.nextInt();
	     
	     int [] [] arr1 = new int [row][col];
	     
	     for(int i=0;i<row;i++) {
	    	 for(int j=0;j<col;j++) {
	    		 arr1[i][j]=sc.nextInt();
	    	 }
	     }
	     System.out.println("Array elements are: ");
	     for(int i=0;i<row;i++) {
	    	 for(int j=0;j<col;j++) {
	    		System.out.print(arr1[i][j]+" ");
	    	 }
	    	  System.out.println();	  
	     }
	  
	}

}
