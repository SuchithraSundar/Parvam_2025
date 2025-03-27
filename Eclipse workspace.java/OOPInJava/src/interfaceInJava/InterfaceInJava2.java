package interfaceInJava;

interface Interface1{
	public void method();//abstract method - has no  body content
	public default void defaultMethod() {//default method has body content
		System.out.println("It is Default method in interface");
	};
	public static void staticMethod() {//static method has body content and it can be access via ClassName
		System.out.println("It is Static method in interface");
	}
	
}

class Child1 implements Interface1{

	@Override
	public void method() {
		System.out.println("This is Method");
		
	}
	
}


public class InterfaceInJava2 {

	public static void main(String[] args) {
		/*
		 * default and static method inside interface
		 * when we writing abstract,default,statics methods then only abstract and default methods are available within implementation class
		 * where as the static method is not available to implement class as it can access via main Class name(in this case it is Interface1) 
		 * 
		 * there is no concept of constructor in interface*/
		Child1 child1 =new Child1();
		child1.method();
		child1.defaultMethod();
//		child1.staticMethod();//it doesn't work
		Interface1.staticMethod();
	}

}
