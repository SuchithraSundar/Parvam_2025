package com.Collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		/*
		 * ArrayList Traversing/Iteration  methods:
		 * 1.forloop
		 * 2.foreach loop
		 * 3.forEach() method
		 * 4.iterator method of iterable interface*/
		
		
	List<Integer> list = new ArrayList<>();
	list.add(20);
	list.add(10);
	list.add(3);
	list.add(12);
	
	
	//1. for loop
	for(int i=0; i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	
	//2.for each  loop
	 for  (int i: list) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	//3.forEach method
	list.forEach(i ->System.out.print(i+" "));
	System.out.println();
	 
	
	//iterator method
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext()) {
		//int i = itr.next();
		System.out.print(itr.next()+" ");
	}
	
		
	}

}
