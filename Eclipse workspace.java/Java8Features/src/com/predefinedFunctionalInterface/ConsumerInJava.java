package com.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInJava {
	public static void main(String[] args) {
		/*
		 *Consumer:
		 *---------
		 *it will consume value but won't return anything
		 *accept() --> to consume any value by user it has method 
		 **/
		
		Consumer<String> c = (s)-> System.out.println(s);
		c.accept("Suchithra");
	}

}
