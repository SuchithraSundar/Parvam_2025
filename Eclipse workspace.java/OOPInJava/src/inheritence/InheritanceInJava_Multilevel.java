package inheritence;

class GrandParentClass{
	public void grandParentMethod() {
		System.out.println("This is GrandParentClass Method");
	}
}

class ParentClass extends GrandParentClass{
	public void parentClassMethod() {
		System.out.println("This is ParentClass Method");
	}
}

class ChildClass extends ParentClass{
	public void ChildClassmethod() {
		System.out.println("his is ChildClass Method");
	}
}

public class InheritanceInJava_Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChildClass CC = new ChildClass();
	CC.ChildClassmethod();//child object
	CC.parentClassMethod();
	CC.grandParentMethod();
	
	ParentClass PP = new ParentClass();
	PP.parentClassMethod();
	PP.grandParentMethod();
	
	GrandParentClass GG =new GrandParentClass();
	GG.grandParentMethod();
	}

}
