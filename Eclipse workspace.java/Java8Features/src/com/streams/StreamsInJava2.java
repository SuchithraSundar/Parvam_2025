package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava2 {
	public static void main(String[] args) {
		
		System.out.println("UpperCase");
		List<String> list = Arrays.asList("fname","lname","branch","address");
		List<String> uppercase= list.stream().map((s)-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Uppercase: " +uppercase);
		
		System.out.println();
		
		System.out.println("LowerCase");
		List<String> list1 = Arrays.asList("SUCHITHRA","S","CSE","HASSAN");
		List<String> lowercase= list1.stream().map((s)-> s.toLowerCase()).collect(Collectors.toList());
		System.out.println("Lowercase: "+lowercase);
	}
}
