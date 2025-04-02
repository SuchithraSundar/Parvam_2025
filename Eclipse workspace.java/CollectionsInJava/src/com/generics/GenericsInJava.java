package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	public static void main(String[] args) {
		/*
		 * Generics :
		 * ----------
		 * to provide the type safety  and to avoid the type casting in the collection then we should go for generic
		 * before java 8 we need to provide type of element within <> ,after no need
		 * can we create class for generic---> yes we can 
		 * Syntax:
		 * list<type of object> 
		 * */
		
		
		char []  arr = {'a','b','c'};//it provide type safety
		char firstEle =arr[0];//without type casting (not required)
		System.out.println(firstEle);
		
		
		//without generic
		List arr1 = new ArrayList();//there is no type safety as we can store different datatypes
		arr1.add(12);
		arr1.add("hello");
		arr1.add(10.34);
		int value = (int) arr1.get(0);//explicit type casting
		System.out.println(value);
		
		
		//generic 
		List<Integer> list =  new ArrayList<>();//type safety
		list.add(12);
		list.add(124);
		//list.add(10.23);//we can't add this element as it is double value
		int a = list.get(1);//there is no  concept of type casting
		System.out.println(a);
		System.out.println(list);
	}

}
