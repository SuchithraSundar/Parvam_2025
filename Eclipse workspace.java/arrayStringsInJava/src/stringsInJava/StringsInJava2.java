package stringsInJava;

public class StringsInJava2 {

	public static void main(String[] args) {
		/*
		 * String Methods:
		 * 1.equals
		 * 2.equalsIgnoreccase
		 * 3.==(reference)
		 * 4.compareTo
		 * 5.concat
		 * 6.touppercase
		 * 7.tolowercase
		 * 8.trim()
		 * 9.startswith
		 * 10.endswith
		 * 11.strip
		 * 12.IsBlank()
		 * */
		
		String str1 =new String("Hello World");
		String str2 =new String("hello world");
		String str3 =new String("          Suchithra          S");
		
		//1.equals
		System.out.println("equals: "+str1.equals(str2));//false
		
		//2.equalsIgnoreccase
		System.out.println("equalsIgnoreccase: "+str1.equalsIgnoreCase(str2));//true
		
		//3. ==
		System.out.println("== : "+str1==str2);//false
		
		//4.concat
		System.out.println("concat: "+str1.concat(" ").concat(str2));
		
		//5.touppercase
		System.out.println("touupercase: "+str1.toUpperCase());
		System.out.println("touupercase: "+str2.toUpperCase());
		
		//6.tolowercase
		System.out.println("tolowercase: "+str1.toLowerCase());
		
		//7. trim()
		System.out.println("trim: "+str3.trim());
		
		//8.startswith
		System.out.println("startswith: "+str2.startsWith("h"));//true
		
		//9.endswith
		System.out.println("endswith: "+str3.endsWith("S"));//true
		
		//10.strip
		System.out.println("strip: "+str3.strip());//similar to trim()
		
		//11.IsBlank()
		System.out.println("IsBlank: "+str1.isBlank());//false
		
		//12.compareTo
		System.out.println("compareTo: "+str1.compareTo(str2));
		

	}

}
