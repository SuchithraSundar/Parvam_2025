package com.typecastingInJava;

public class TypeCastingInJava {
	public static void main(String[] args) {
		/*
		 * Type Casting:
		 * -------------
		 * conversion of one datatype to another datatype
		 * 
		 * 2 ways:
		 * 
		 * 1. implicit type  casting 
		 * --------------------------
		 *  *lowest order datatype to highest order datatype
		 *  byte -> short -> int -> long -> float -> double
		 *  
		 * 2. explicit type casting
		 * --------------------------
		 * * highest order datatype to lowest order datatype
		 * double -> float -> long -> int -> short -> byte
		 * 
		 * */
		
		
		//1. implicit type  casting 
				 // byte to short
		        byte x = 20;
		        short x1 = x;
		        System.out.println("Byte: " + x);
		        System.out.println("Short: " + x1);
		        System.out.println();
		
		        // short to int
		        short s = 100;
		        int s1 = s;
		        System.out.println("Short: " + s);
		        System.out.println("Int: " + s1);
		        System.out.println();
		
		        // int to long
		        int a = 10;
		        long a2 = a;
		        System.out.println("Int: " + a);
		        System.out.println("Long: " + a2);
		        System.out.println();
		
		        // long to float
		        long l = 1000L;
		        float l1 = l;
		        System.out.println("Long: " + l);
		        System.out.println("Float: " + l1);
		        System.out.println();
		
		        // float to double
		        float f = 5.5f;
		        double f1 = f;
		        System.out.println("Float: " + f);
		        System.out.println("Double: " + f1);
		        System.out.println();
		        
		        // char to int
		        char c = 'A';
		        int c1 = c; // Implicit conversion (ASCII value)
		        System.out.println("Char: " + c);
		        System.out.println("Int (ASCII): " + c1);
		        System.out.println();
        
        
        
        // 2. Explicit Type Casting (Narrowing)
		        
		        // long to int
		        long a3 = 10;
		        int a4 = (int) a3;
		        System.out.println("Long: " + a3);
		        System.out.println("Int: " + a4);
		        System.out.println();
		
		        // int to short
		        int b = 150;
		        short b1 = (short) b;
		        System.out.println("Int: " + b);
		        System.out.println("Short: " + b1);
		        System.out.println();
		
		        // short to byte
		        short s2 = 130; // Overflow risk, byte range is -128 to 127
		        byte s3 = (byte) s2;
		        System.out.println("Short: " + s2);
		        System.out.println("Byte: " + s3);
		        System.out.println();
		
		        // double to float
		        double d = 99.99;
		        float d1 = (float) d;
		        System.out.println("Double: " + d);
		        System.out.println("Float: " + d1);
		        System.out.println();
		
		        // float to long
		        float f2 = 88.88f;
		        long f3 = (long) f2;
		        System.out.println("Float: " + f2);
		        System.out.println("Long: " + f3);
		        System.out.println();
		
		        // int to char
		        int c2 = 66; // ASCII for 'B'
		        char c3 = (char) c2;
		        System.out.println("Int: " + c2);
		        System.out.println("Char: " + c3);
		        System.out.println();	}
}
