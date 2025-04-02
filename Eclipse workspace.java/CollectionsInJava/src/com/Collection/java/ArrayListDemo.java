package com.Collection.java;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * ----------
		 * *ArrayList is improved version of array(dynamic array- which means it changes  size of an array whenever the new element added or removed)
		 * *ArrayList underline data structure as Dynamic array( which means that arraylist uses dynamic array as internal DS)
		 * *ArrayList allow duplicate values
		 * *ArrayList allow the random access(using index values)
		 * *ArrayList will allow  null values
		 * *ArrayList will preserve the order of insertion
		 * 
		 * for adding elements to ArrayList we use method-->add()
		 * for removing elements from ArrayList we use method --->remove() : it can be done by either by specifying index value or by element itself
		 *  
		 *  */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// add elements 
		list.add(10);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(56);
		list.add(10);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(56);
		System.out.println(list);
		System.out.println(list.get(3));
		
		//remove value by using index value
		list.remove(0);
		
		//remove value by specific object
		Integer i = 56 ;
		list.remove(i);
		//list.clear();
		System.out.println(list);
		
	}

}
