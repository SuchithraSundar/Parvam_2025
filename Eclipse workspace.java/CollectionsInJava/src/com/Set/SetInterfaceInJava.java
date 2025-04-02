package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceInJava {

	public static void main(String[] args) {
		/*
		 * Set:
		 * -----
		 * When we represent a group of individual object as single entity
		 * -->where the insertion order is not preserved
		 * -->duplicate will not allow
		 * then we should go for Set
		 * 
		 * key points:
		 * 1.order is not preserved
		 * 2.duplicate will not allow
		 * 3.random access is there
		 * */
		
		
		//set creation using Set and hashSet constructor
			Set<Integer> set = new HashSet<Integer>();
			set.add(12);//
			set.add(null);
			set.add(12);
			set.add(30);
			set.add(45);
			set.add(30);
			
			//output : [null, 12, 45, 30]-->bcz 12 is and 30 duplicate values
			
			System.out.println(set);
			
		//set creation using List,Array list and then calling it by using HashSet constructor
			List<Integer> list = new ArrayList<Integer>();
			list.add(12);
			list.add(13);
			list.add(34);
			list.add(12);
			list.add(13);
			list.add(34);
			System.out.println("List: "+list);

			Set<Integer> set1 = new HashSet<Integer>(list);
			
			System.out.println("Sets: "+set1);
	}

}
