package exceptionInJava;

public class ExceptionInJava_unchecked1 {

	public static void main(String[] args) {
		/*
		 * try  with multiple catches
		 * go from child to parent, not from parent to child 
		 * which means that  if we use Exception inside try with multiple catches then there is no need  to mention other child Exceptions,
		 * so  we need to avoid this*/
		
		int [] arr =new int[2];
		arr[0]=10;
		arr[1]=20;
		
		try {
//			System.out.println(arr[10]);
			System.out.println(10/0);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}
