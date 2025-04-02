package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(31);
		list.add(34);
		list.add(65);
		list.add(74);
		list.add(77);
		
		
		//filter the above list based on odd numbers  using streams and generate list
		//way-1:
//		Stream<Integer> stream = list.stream();
//		List<Integer> numbers = stream.filter((i)->i%2 != 0).collect(Collectors.toList());
//		System.out.println(numbers );
		
		//way-2:
		List<Integer> numbers = list.stream().filter((i)->i%2 != 0).collect(Collectors.toList());
		System.out.println(numbers );
	}

}
