package com.dependencyInjection;

public class ConstructorDependencyInjection {
	public static void main(String[] args) {
		//constructor dependency injection:
			System.out.println("Constructor Injection");//it is recommended
			Address address = new Address("Hassan", "Karnataka");
			Student student = new Student(23, "Suchithra", address);
			
			System.out.println(student.getId());//display student id
			System.out.println(student.getName());//display student name
			
			//System.out.println(student.getAddress());//display address in the form of "com.dependencyInjection.Address@2dda6444"
			Address address1  = student.getAddress();//it will use to retrieve the data from Address object and store student address details inside address1 object
			
			System.out.println(address1.getCity());//display city
			System.out.println(address1.getState());//display state
			
			System.out.println();
			
		//setter dependency injection:
			System.out.println("Setter Injection");
			Address address2 = new Address();
			address2.setCity("Mysuru");
			address2.setState("Karnataka");
			
			Student student1 = new Student();
			student1.setId(26);
			student1.setName("Suchithra");
			student1.setAddress(address2);
			
			System.out.println(student1.getId());
			System.out.println(student1.getName());
			//System.out.println(student1.getAddress());
			System.out.println(address1.getCity());
			System.out.println(address1.getState());
			
			
		
	}

}
