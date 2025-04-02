package com.CustomObjectInCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		/*handling the custom objects in collections
		 * lambda expression only apply for functional interface
		 * ex:(s1,s2)->s2.getRoll_num()-s1.getRoll_num());*/
		
		
		
		Student std1 =new Student("Suchi", 405, 23);
		Student std2 =new Student("Kavya", 406, 22);
		Student std3 =new Student("Indu", 401, 22);
		//Student std4 =new Student("Sharu", 404, 23);
		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		//students.add(std4);
		students.add(new Student("Rishu",400,20));
		System.out.println("Before");
		System.out.println(students);
		System.out.println();
		//students.remove(0);
		//System.out.println(students);
		
		
		System.out.println("Roll_no");
		System.out.println("Descending sorting");
		Collections.sort(students,(s1,s2)->s2.getRoll_num()-s1.getRoll_num());//for descending sorting
		System.out.println(students);
		System.out.println();
		
		System.out.println("Ascending sorting");
		Collections.sort(students,(s1,s2)->s1.getRoll_num()-s2.getRoll_num());//for ascending sorting
		System.out.println(students);
		System.out.println();
		
		System.out.println("Names");
		Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));
		System.out.println(students);
		System.out.println();

		System.out.println("Age");
		Collections.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());
		System.out.println(students);

		
		
	}

}
