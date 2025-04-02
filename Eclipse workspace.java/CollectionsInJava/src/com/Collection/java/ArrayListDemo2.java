package com.Collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(3);
		list.add(40);
		list.add(12);
		System.out.println("Before sorting: "+list);
		/*
		 * Collections: it is a utility classes that provides methods to work with collection
		 * so  it provides some basic methods like sort, reverse,replace, min-max value check etc*/
		
		//sorting above array list
		Collections.sort(list);
		System.out.println("After sorting: "+list);
		
		//checks for min and max value in array list
		System.out.println("Min value: "+Collections.min(list));
		System.out.println("Max value: "+Collections.max(list));
		
		//reverse of array list
		Collections.reverse(list);
		System.out.println("Reverse of arraylist: "+list);
		
		//replace
		Collections.replaceAll(list, 120, 225);
		System.out.println("replace: "+list);
		

	}

}
