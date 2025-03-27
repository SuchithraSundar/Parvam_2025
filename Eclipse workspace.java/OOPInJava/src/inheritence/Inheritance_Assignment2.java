package inheritence;

interface I1{
	public void Method1();
}

interface I2{
	public void Method2();
}

interface I3 extends I1,I2{
	public  void Method3();
}

class P implements I3{

	@Override
	public void Method1() {
		System.out.println("Method from I1");
	}

	@Override
	public void Method2() {
		System.out.println("Method from I2");
	}

	@Override
	public void Method3() {
		System.out.println("Method from I3");
	}
	
	public void MethodP() {
		System.out.println("Method from P");
	}	
}

class C1 extends P{
	public void  MethodC1() {
		System.out.println("Method from C1");
	}
}

class C2 extends P{
	public void MethodC2() {
		System.out.println("Method from C2");
	}
}
public class Inheritance_Assignment2 {

	public static void main(String[] args) {
		
		C1 c = new C1();
		c.Method1();
		c.Method2();
		c.Method3();
		c.MethodP();
		c.MethodC1();
		
		System.out.println();
		
		C2 cc =new C2();
		cc.Method1();
		cc.Method2();
		cc.Method3();
		cc.MethodP();
		cc.MethodC2();

	}

}
