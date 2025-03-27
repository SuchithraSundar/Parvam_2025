package inheritence;

class ParentClass1{
	public void ParentClass1Method() {
		System.out.println("This is Parent method of heirarchical");
	}
}

class ChildClass1 extends ParentClass1{
	public void ChildClass1Method() {
		System.out.println("This is Child1 method of heirarchical");
	}
}

class ChildClass2 extends ParentClass1{
	public void ChildClass2Method() {
		System.out.println("This is Child2 method of heirarchical");
	}
}


public class InheritanceInJava_heirarchical {

	public static void main(String[] args) {
	// Heirarchical inheritance : Single parent multiple child3
    System.out.println("Childclass1 extending Parent1");
	ChildClass1  c = new ChildClass1();
	c.ChildClass1Method();
	c.ParentClass1Method();
	System.out.println();
	
	System.out.println("Childclass2 extending Parent1");
	ChildClass2 cc = new ChildClass2();
	cc.ChildClass2Method();
	cc.ParentClass1Method();
	System.out.println();
	
	System.out.println("ParentClass1");
	ParentClass1 p = new ParentClass1();
	p.ParentClass1Method();
	}

}
