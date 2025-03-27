package stringsInJava;

public class StringsInJava {

	public static void main(String[] args) {
		/*
		 * Strings
		 * =======
		 * Strings are immutable,but we can reassign the values
		 * it is group of characters
		 * ex : table
		 * need to enclose within "".
		 * 
		 * how to declare the string:
		 * ===========================
		 * 
		 * 1.using string literals
		 * String var_name ="string_name";
		 * 
		 * using new keyword
		 * String var_name = new String("string_name");
		 * */
		
		String str1 = "String1";//reference str1 is constant
		String str2 = new String("String1");//reference str2 is object
		String str3 = "String1";//reference str3 is constant
		String str4 = new String("String1");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));//check for values---true
		System.out.println(str1==str2);//check for reference/address---false as the references are differ
		
		System.out.println(str1==str3);//true
		System.out.println(str1.equals(str3));//true as the values are same
		
		System.out.println(str2==str4);//false
		System.out.println(str2.equals(str4));//true as the values are same
		
		//we cannot change the values of string  once it declared,but we can reassign the values for string using string method
		String str5 = new String("String5");
		str5 = str5.concat("Hello");
		System.out.println(str5);
		

	}

}
