package com.wrapperClasses;

public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * java is a pure  oops or not:
		 * ----------------------------
		 * no (because its primitive data types)
		 * 
		 * primitive datatypes:
		 * --------------------
		 * byte, short, int, long, float, double, char, boolean
		 * 
		 * Sting - it is Non-primitive datatype, we  can create Object for it
		 * ex: String name = new String("Suchi");
		 * 
		 * 
		 * Collection:
		 * *used to store group of individual objects as a single entity
		 * *it only works for objects but not on primitive  datatypes
		 * *to overcome this issues we use classes called WrapperClasses
		 * 
		 *  Wrapper Classes:(for each primmitive data type wrapper classes have built in class they are as follow)
		 *  ---------------
		 *  byte --> Byte
		 *  short --> Short
		 *  int --> Integer
		 *  long --> Long
		 *  float --> Float
		 *  double --> Double
		 *  char --> Character
		 *  boolean --> Boolean
		 *  
		 * */
		
		
		//1.Auto boxing --> from primitive to wrapper
			//integer
			int a =100;
			Integer  i= Integer.valueOf(a);//by using static method valueOf() we can convert any primitive data type to Object
			//Integer i = a;//directly giving primitive data type
			System.out.println("int: "+a);
			System.out.println("Integer: "+i);
			System.out.println("Integer type: "+i.getClass().getName());//getClass.getName -->it gives class name and its package name
			System.out.println();
			
			//byte 
			byte b = 20;
			Byte j = Byte.valueOf(b);
			System.out.println("byte: "+b);
			System.out.println("Byte: "+j);
			System.out.println("Byte type: "+j.getClass().getName());
			System.out.println();
			
			//short
			short c = 40;
			Short k = Short.valueOf(c);
			System.out.println("short: "+c);
			System.out.println("Short: "+k);
			System.out.println("Short type: "+k.getClass().getName());
			System.out.println();
			
			//long
			long d = 50;
			Long l = Long.valueOf(d);
			System.out.println("long: "+d);
			System.out.println("Long: "+l);
			System.out.println("Long type: "+l.getClass().getName());
			System.out.println();
			
			
			 // Float Example
	        float e = 5.5f;
	        Float m = Float.valueOf(e);
	        System.out.println("float: " + e);
	        System.out.println("Float: " + m);
	        System.out.println("Float type: " + m.getClass().getName());
	        System.out.println();

	        // Double Example
	        double f = 10.99;
	        Double n = Double.valueOf(d);
	        System.out.println("double: " + f);
	        System.out.println("Double: " + n);
	        System.out.println("Double type: " + n.getClass().getName());
	        System.out.println();

	        // Character Example
	        char g = 'A';
	        Character o = Character.valueOf(g);
	        System.out.println("char: " + c);
	        System.out.println("Character: " + o);
	        System.out.println("Character type: " + o.getClass().getName());
	        System.out.println();

	        // Boolean Example
	        boolean h = true;
	        Boolean p = Boolean.valueOf(h);
	        System.out.println("boolean: " + h);
	        System.out.println("Boolean: " + p);
	        System.out.println("Boolean type: " + p.getClass().getName());
	 
			
		//2.unboxing --> from wrapper to primitive
//			Integer i1 = 10;
//			int a1 =i1.intValue();
//			//int a1 = i1;//explicit way to convert wrapper to primitive
//			System.out.println("Int: "+a);
//			System.out.println("Integer: "+i1);
//			System.out.println("Integer type: "+i1.getClass().getName());
	        
	        // Long Example
	        Long l1 = 100L;
	        long b1 = l1.longValue();
	        System.out.println("long: " + b1);
	        System.out.println("Long: " + l1);
	        System.out.println("Long type: " + l1.getClass().getName());
	        System.out.println();

	        // Float Example
	        Float f1 = 5.5f;
	        float c1 = f1.floatValue();
	        System.out.println("float: " + c1);
	        System.out.println("Float: " + f1);
	        System.out.println("Float type: " + f1.getClass().getName());
	        System.out.println();

	        // Double Example
	        Double d1 = 10.99;
	        double d2 = d1.doubleValue();
	        System.out.println("double: " + d2);
	        System.out.println("Double: " + d1);
	        System.out.println("Double type: " + d1.getClass().getName());
	        System.out.println();

	        // Character Example
	        Character cObj = 'A';
	        char c2 = cObj.charValue();
	        System.out.println("char: " + c2);
	        System.out.println("Character: " + cObj);
	        System.out.println("Character type: " + cObj.getClass().getName());
	        System.out.println();

	        // Boolean Example
	        Boolean bObj = true;
	        boolean b2 = bObj.booleanValue();
	        System.out.println("boolean: " + b2);
	        System.out.println("Boolean: " + bObj);
	        System.out.println("Boolean type: " + bObj.getClass().getName());
	  
//		
		
	}
}
