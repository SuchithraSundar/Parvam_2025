package com.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateInJava {

	public static void main(String[] args) {
		/*
		 * Predicate:
		 * ----------
		 *  it will holds a condition
		 *  predicate has one method called test which takes only one parameter and returns the output values as  boolean 
		 *  */
		
		//to find the number is even or odd
		Predicate<Integer> p = (a) -> a % 2 == 0;
		
		System.out.println(p.test(21));

	}

}
