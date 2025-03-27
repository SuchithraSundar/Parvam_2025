package inheritence;

interface Interface{
	public void interfaceMethod();
}

class ParentP {
	public void P_Method() {
		System.out.println("Its a P_Method");
	}
}

class ChildC extends ParentP implements Interface{
	
	@Override
	public void interfaceMethod() {
		System.out.println("Its a Interface_Method");
	}
	
	public void C_Method() {
		System.out.println("Its a C_Method");
	}
}




public class InheritanceInJava_Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChildC c = new ChildC();
	c.C_Method();
	c.P_Method();
	c.interfaceMethod();
	}

}
