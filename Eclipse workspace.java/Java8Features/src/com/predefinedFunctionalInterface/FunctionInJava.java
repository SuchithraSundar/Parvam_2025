package com.predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInJava {

	public static void main(String[] args) {
		/*
		 * Function:
		 * ---------
		 * it will take one parameter and perform action and return value
		 * apply() -> method to take parameter
		 * 
		 * Syntax:
		 * -------
		 * Function<T, R>
		 * -->Here T is data type for which we perform action
		 * -->And R is return type
		 * */
		
		Function<String, Integer> f = (s) -> s.length();
		int res = f.apply("Rishonn Paul");
		System.out.println(res);
		
		Function<Integer, Integer> f1 = (s) -> s*s;
		int res1 = f1.apply(4);
		System.out.println(res1);

	}

}
