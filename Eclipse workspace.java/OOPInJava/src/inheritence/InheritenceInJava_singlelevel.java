package inheritence;

class Parent{
	int pData =100;
	public void parentMethod() {
		System.out.println("Its a Parent Method");
	}
	
//	private void parrentMethod1() {//doesn't work
//		System.out.println("Its a  private Parent Method");
//	}
	
	void parentMethod2() {
		System.out.println("Its a default Parent Method");
	}
	
	static void parentMethod3() {
		System.out.println("Its a  Static Parent Method");
	}
}

class Child2 extends Parent{
	int cData =200;
	public void childMethod() {
		System.out.println("Its a Child Method");
	}
	
//	private void childMethod1() {
//		System.out.println("Its a  private Child Method");
//	}
	
	void childMethod2() {
		System.out.println("Its a  default Child Method");
	}
	
	static void childMethod3() {
		System.out.println("Its a  Static hild Method");
	}
}


public class InheritenceInJava_singlelevel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Inheritance:
		 * ------------
		 * extending the properties of parent class to child class
		 * *properties(state and actions)
		 * 
		 * 
		 * 
		 * types of Inheritance:
		 * --------------------
		 * 1. single-level : single parent and child
		 * 2. multi-level : multiple parent and single child
		 * 3. heirarcichal : single parent and multiple child
		 * 4. hybrid : mixing of different inheritance (like interface to child  inheritance and parent class to child class inheritance)
		 * 5. multiple : not possible
		 * 
		 * 
		 * there is no default keyword used inside class...its only used inside interface
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Child2 child2 =new Child2();
		child2.childMethod();//public method
		child2.parentMethod();//public method
		child2.parentMethod2();//default method
		child2.childMethod2();//default method
		Parent.parentMethod3();//static method
		Child2.childMethod3();//static method
		System.out.println(child2.cData);
		System.out.println(child2.pData);
	}

}
