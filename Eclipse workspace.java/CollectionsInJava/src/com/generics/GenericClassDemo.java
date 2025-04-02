package com.generics;

//class Student{//normal class which will only take specified data type instance variables only and generate constructor to it 
//	int student_id;
//
//	public Student(int student_id) {
//		super();
//		this.student_id = student_id;
//	}
//	
//	public int returnValue() {
//		return student_id;
//	}
//}

class Student<T>{/*generic class which can take different data types,here we specified  type of object as T for generic class Student, 
	by calling this T  we can provide various data type for instance,constructor,and method*/
	T student_id;

	public Student(T student_id) {
		super();
		this.student_id = student_id;
	}
	
	public T returnValue() {
		return student_id;
	}
}


public class GenericClassDemo {
	public static void main(String[] args) {
		
		
//	Student std = new Student(12); //normal method implementation by object
//	int value = std.returnValue();
//	System.out.println("Student id is: "+value);
//	}
		
	Student<Integer> std1 = new Student<>(12);//generic class implementation by Student class with specific type of object  within <>
	System.out.println(std1.returnValue());	
	Student<String> std2 = new Student<>("Suchithra");
	System.out.println(std2.returnValue());


}
}
