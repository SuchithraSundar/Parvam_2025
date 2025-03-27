package loopingStatement;

public class LoopingStatement {

	public static void main(String[] args) {
		/*
		 * for loop
		 * while loop
		 * do while loop
		 * for each loop
		 * */
		
		//for loop
		System.out.println("For Loop");
		int i = 0;
		for (i=1;i<=5;i++) {
			System.out.println("The Number of iterations: "+i);
		}
		
		//while loop
		System.out.println("While Loop");
		int c = 0;
		while (c <=10) {
			System.out.println(c);
			c++;
		}
		
		
		//do while loop
		System.out.println("Do While Loop");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a<=5);
		
		
		//for each loop
		System.out.println("For  Each Loop");
		int []arr = {1,2,3,4,5};
		for(int b:arr) {
			System.out.println(b);
		}
		
		
		
		//do while
	}

}
