package functionsInJava.functions;

public class FunctionsInJava1 {
	
	//1. public function:
			// -> anywhere
			public void publicFunction() {
				System.out.println("This is  public function");
			}
			
	//2. private function:
			// -> within same class
			private void privateFunction() {
				System.out.println("This is  private function");
			}
			
	//3.default function:
			// -> within same package
			void deafultFunction() {
				System.out.println("This is default function");
			}
			
	//4.protect function:
			// -> within package and subclass in other package
			protected void ProtectedFunction() {
				System.out.println("This is protected function");
			}
			
	//5.static function:
			// -> access by using class name
			public static void StaticFunction() {
				System.out.println("This is static function");
			}
			


	public static void main(String[] args) {
		FunctionsInJava1 obj = new FunctionsInJava1();
		obj.publicFunction();
		obj.privateFunction();
		obj.deafultFunction();
		obj.ProtectedFunction();
		FunctionsInJava1.StaticFunction();
		
		
		
	}
	 

	
	

}
