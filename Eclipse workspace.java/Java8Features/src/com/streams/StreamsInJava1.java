package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8,9,10,11,12,13,14,15);
		 Stream<Integer> stream= list.stream().filter(x->x>10);//source.intermediate_opearation stored in stream variable
		 long res = stream.count();//termination operation count stored in res variable...so here the stream ends
		 System.out.println(res);
		 
//		 List<Integer> result= stream.collect(Collectors.toList());/*it will give error as the stream is already ended with termination operation count above,
//		 So we can't reuse the already used stream once after its termination operation ended*/
//		 System.out.println(result);
//		 
//		 long res1 = stream.count();
//		 System.out.println(res1);
//		  
	}
}
