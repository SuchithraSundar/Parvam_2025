package inheritence;

interface Interface1{
	public void interfaceMethod1();
}

interface Interface2{
	public void  interfaceMethod2();
}

class Parent1 {
	public void Parent1Method() {
		System.out.println("Method from Parent1");
	}
}

class Child1 extends  Parent1 implements Interface1, Interface2{

	@Override
	public void interfaceMethod2() {
		System.out.println("Method from I1");
		
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("Method from I2");
		
	}
	public void Child1Method() {
		System.out.println("Method from Child1");
	}
	
}

public class Inheritance_Assignment1 {
	public static void main(String[] args) {
		
		Child1 C =  new Child1();
		C.interfaceMethod1();
		C.interfaceMethod2();
		C.Parent1Method();
		C.Child1Method();
	}

}
