package interfaceInJava;

//interface A{
//	public void methodA();
//}
//
//interface B{
//	public void methodA();
//}
//
//class Child implements A,B{//for different methods name
//
//	@Override
//	public void methodB() {
//		System.out.println("This is Method B");
//		
//	}
//
//	@Override
//	public void methodA() {
//		System.out.println("This is Method A");
//		
//	}	
//}



interface A{
	public void methodA();
}

interface B{
	public void methodA();
}

class Child implements A,B{//for same methods name

	@Override
	public void methodA() {
		System.out.println("It is interface  method");
		
	}

public class InterfaceInJava1 {

	public static void main(String[] args) {
		// multiple inheritance is not supported in Java, It can be solved by Multiple Interfaces

		Child child = new Child();
		child.methodA();
//		child.methodB();
	}
}
}
