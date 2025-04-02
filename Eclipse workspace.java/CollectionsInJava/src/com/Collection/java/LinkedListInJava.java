package com.Collection.java;


import java.util.LinkedList;
import java.util.List;


public class LinkedListInJava {
	public static void main(String[] args) {
		/*
		 * LinkedList:
		 * -----------
		 * *linked list underline data structure is doubly linked list
		 * *Linked List underline data structure as Dynamic array( which means that arraylist uses dynamic array as internal DS)
		 * *Linked List allow duplicate values
		 * *Linked List allow the random access(using index values)
		 * *Linked List will allow  null values
		 * *Linked List will preserve the order of insertion
		 * */
		
		/*
		 * Difference between ArrayList and LinkedList:
		 * 
		 * 1.data structure
		 * *linkedlist -> doubly linked list
		 * *arraylist -> Dynamic array
		 * 
		 *  
		 * 2.memory:
		 * *linked list will occupy more memory(as it have 3 nodes)
		 * *arraylist will occupy less memory
		 * 
		 * 3.deletion
		 * *when ever there is a continuous operation on deletion we should go for linkedlist 
		 * *when ever there is a continuous operation on deletion then  we shouldn't go for arraylist
		 * 
		 * 4.Insertion:
		 * *when ever there is a continuous operation on insertion we should go for linkedlist    
		 * *when ever there is a continuous operation on insertion we shouldn't  go for arraylist 
		 * 
		 * 5.memory allocation:
		 * *linked list - more efficient memory allocation
		 * *array list - less efficient memory allocation
		 *  */
		List<Integer> list = new LinkedList<Integer>();
		list.add(45);
		list.add(45);
		list.add(null);
		list.add(23);
		list.add(30);
		System.out.println(list);
		System.out.println(list.get(3));
		
	}

}
