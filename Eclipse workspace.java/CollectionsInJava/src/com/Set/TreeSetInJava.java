package com.Set;

import java.util.TreeSet;

public class TreeSetInJava {
	public static void main(String[] args) {
		/*
		 * TreeSet is comes under Sorted Set
		 * it will sort the set in either ascending or descending order
		 * TreeSet has  so many constructor*/
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();//by default sort in ascending order
		treeSet.add(2);
		treeSet.add(10);
		treeSet.add(100);
		treeSet.add(12);
		System.out.println(treeSet);
	}

}
