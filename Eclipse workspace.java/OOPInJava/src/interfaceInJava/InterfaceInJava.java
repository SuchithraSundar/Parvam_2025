package interfaceInJava;

interface Animal{
	public void makeSound();
}


class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog Barks");
	}
}

class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat meows");
		
	}	
}

interface Bird{
	public void makeSound();
}

class Duck implements Bird{

	@Override
	public void makeSound() {
		System.out.println("The Duck Quacks");
	}
	
}


public class InterfaceInJava {

	public static void main(String[] args) {
		/*Interface:
		 *----------
		 *
		 *It is blue print of the class
		 *The methods in the  interface by default 'abstract' (does not contain body)
		 *from java 8 we can write default and static methods in interface
		 *for single interface we can create multiple class
		 *
		 *declaration of interface:
		 *-------------------------
		 *
		 *interface interface_name{
		 *		//code;
		 *}
		 *
		 *example:
		 *-------
		 *interface Bird(){
		 *		public void makeSound();
		 *}
		 **/
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
		Duck duck = new Duck();
		duck.makeSound();
				

	}

}
