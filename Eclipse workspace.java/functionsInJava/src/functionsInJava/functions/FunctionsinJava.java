package functionsInJava.functions;

public class FunctionsinJava {
	
	
		// 1. Function does not return a value but accepts parameters
		public void add2(int a, int b) {
			System.out.println("addition:"+(a+b));
		}
		
		// 2. Function returns a value and accepts parameters
		public int add1(int a, int b) {
			return a + b;
		}
		
		// 3. Function returns a value but does not accept parameters
		public int add3() {
			return 405;
		}
		
		// 4. Function does not return a value and does not accept parameters
		public void add4() {
			System.out.println("Function does not return a value and does not accept parameters");
		}
	public static void main(String[] args) {
		/*Functions/Methods in java:
		 * ========================
		 * <access modifier> return_type function_name(parameters){
		 * 		code
		 * }
		 * 
		 * ex: public void add(int a, int b){
		 * 		Syso(a+b);
		 * }
		 * 
		 * two types of functions:
		 * 
		 * 1.built-in-functions: next(),nextLine(),println(),equals()
		 * 
		 * 2.user-defined-functions:
		 * ========================
		 * a.function return a value not accepting parameter
		 * b.function return a value and accept parameter
		 * c.function not return a value but accept parameter
		 * d.function not returning  a value also not accepting parameter
		 * */
		
		
		//Calling functions
		
		 FunctionsinJava obj1 = new  FunctionsinJava();
		 int res = obj1.add1(10, 20);
		 System.out.println("The result is: "+res);
		 
		 obj1.add2(10,20);
		 obj1.add3();
		 System.out.println(obj1.add3());
		 
		 obj1.add4();
		 
	}

}
