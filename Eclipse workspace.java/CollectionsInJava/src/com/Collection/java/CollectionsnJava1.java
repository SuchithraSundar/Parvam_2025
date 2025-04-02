package com.Collection.java;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsnJava1 {

	public static void main(String[] args) {
		/*
		 * Collection --> root interface in collection framework
		 * Collections --> it will provides some of the utility methods to work with collection 
		 * 
		 * 
		 * Collection:
		 * -----------
		 * *When we represent a group of individual object as single entity  then we  should go for collection
		 * * there is root  interface in collection framework that is Collection
		 * *this will  provide some of built in methods to work with any collection class
		 * 
		 * we cann't create object for interface,so does for collection as it is interface,so we need to use certain methods for implementation
		 *  to create object
		 *  */
		
		//Collection collecction = new Collection();//incorrect way
		// here the collection is object that we created which will calls the tostring
		Collection collection = new ArrayList();
		collection.add(10);//it will directly converting int 10 primitive datatype to collection object
		collection.add("suchi");
		collection.add(10.89);
		collection.remove(10);
		collection.clear();
		
		System.out.println(collection);
	}

}
