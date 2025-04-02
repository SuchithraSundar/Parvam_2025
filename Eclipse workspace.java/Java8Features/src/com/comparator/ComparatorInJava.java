package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class funInterface implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		//return o1-o2;//ascending order
		return o2-o1;//descending order
	}

}


public class ComparatorInJava {
	public static void main(String[] args) {
		/*
		 * Comparator is FunctionalInterface which has only one abstract method compare which used to compare the two objects*/
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(12);
	list.add(2);
	list.add(30);
	list.add(3);
	System.out.println("without lambda expression:");
	Collections.sort(list, new funInterface());
	System.out.println(list);
	System.out.println();
	
	System.out.println("with lambda expression:");
	Collections.sort(list,(o1,o2)-> o1-o2);//ascending order
//	Collections.sort(list,(o1,o2)-> o2-o1);//descending order
	System.out.println(list);
	
	
	
	}

}
