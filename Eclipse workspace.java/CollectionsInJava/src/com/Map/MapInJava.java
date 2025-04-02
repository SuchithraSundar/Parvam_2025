package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInJava {
	public static void main(String[] args) {
		/*
		 * Map:
		 * ----
		 * When we represent a group of individual object as single entity
		 * in the form of key-value pair then we go for map interface
		 * 
		 * map doesn't support duplicate values, instead it replace existing value with new value
		 * 
		 *methods:
		 **put --> to add elements to map
		 **remove --> to remove element from map checks whether specific key and values are present in map or not
		 **contains --> to check whether the value is present or not in the map
		 *
		 * */
		//1. HashMap
			System.out.println("HashMap");
			Map<Integer,String> map = new HashMap<>();
			map.put(1, "Suchi");
			map.put(2, "Kavya");//it will replaced by sharu value as these have same key
			map.put(2, "Sharu");
			map.put(3, "Mady");
			System.out.println(map);
			map.remove(3);
			System.out.println(map);
			System.out.println(map.containsKey(3));//it will give error as the third key value are removed
			System.out.println(map.containsValue("Mady"));
			System.out.println();
			
			
		//TreeMap
			System.out.println("TreeMap");
			Map<Integer,String> map1 = new TreeMap<>();
			map1.put(1, "Ani");
			map1.put(2, "Noel");//it will replaced by smitha value as these have same key
			map1.put(2, "Smitha");
			map1.put(3, "Bharath");
			System.out.println(map1);
			map1.remove(3);
			System.out.println(map1);
			System.out.println(map1.containsKey(3));//it will give error as the third key value are removed
			System.out.println(map1.containsValue("Mady"));
			
	}

}
