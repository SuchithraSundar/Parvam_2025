package com.Collection.java;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

	public static void main(String[] args) {
		/*
		 * List:
		 * ------
		 * *it is child interface of collection
		 * *it will contain some of built in methods that used inside a list implemented class only
		 * *when we represent a group of individual  object as a single entity,
		 * *where order is preserved and index based access and duplicate is allowed in that time we can use this list
		 *  */
		
		List list = new ArrayList();
		list.add(2);//integer at index 0 
		list.add("hello");//string at index 1
		list.add(10.34);//double at index 2
		System.out.println(list);
		
		//to get string value from above list we use String type conversion
		//String str = list.get(1);//it will give error as it is in primitive datatype so we need to add String type casting to get hello string object)
		String str =(String) list.get(1);
		System.out.println(str);
		
		//to get double value
		double value =(double) list.get(2);
		System.out.println(value);
	}
	

}
