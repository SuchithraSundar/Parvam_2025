package com.Collection.java;

public class CollectionInJava {

	public static void main(String[] args) {
		/*
		 * Why  we need collection:
		 * ------------------------
		 *to over come drawbacks  of array we have to go for collection
		 *
		 * drawback of array:
		 * ------------------
		 * 1. fixed size
		 * 2. same data type elements can only store
		 * 3. we can't reduce 
		 * 
		 *  
		 * merits of array:
		 * ----------------
		 * 1.random access
		 * 2. type safety: the elements inside the array is based on the data type
		 * 3. type casting ; to print elements in array, no need to perform type casting
		 * 
		 * 
		 * */
		
		int [] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		//arra[1]="hello";// here we can't pass string value to the array index 1 as the given array is based on int datatype
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//System.out.println((int)arr[1]);//no need to perform typecasting

	}

}
