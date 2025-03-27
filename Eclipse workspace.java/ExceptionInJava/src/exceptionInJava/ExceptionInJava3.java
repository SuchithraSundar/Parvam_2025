package exceptionInJava;

public class ExceptionInJava3 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid Age");
		}
		else {
			System.out.println("Age is :"+age);
		}
		
	}
	public static void main(String[] args) {
		/*
		 * finally block:
		 * --------------
		 * *This will execute even if Exception occur or not
		 * *where we have to write the closing code like  db connection, file close*/
		
		//finally block without handling exception
//		try {
//			System.out.println(10/0);
//		}finally {
//			System.out.println("This is finally block without handling Exception");
//		}
//		
		
		//finally block with handling exception
//		try {
//			System.out.println(10/0);
//		}catch(Exception e){
//			System.out.println(e);
//		}finally {
//			System.out.println("This is finally block with handling Exception");
//		}
//		
		
		validate(10);
		
	}
	
	

}
