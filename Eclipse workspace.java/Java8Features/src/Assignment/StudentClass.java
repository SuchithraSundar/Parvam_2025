package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students{
	public String name;
	public int Roll_no;
	public int age;
	public double marks;
	
	
	public Students(String name, int roll_no, int age, double marks) {
		super();
		this.name = name;
		Roll_no = roll_no;
		this.age = age;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", Roll_no=" + Roll_no + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
}

public class StudentClass {

	public static void main(String[] args) {
		
		//Filtering  Students with marks above 60
		
		List<Students> students = Arrays.asList(
		new Students("Suchithra", 1, 23,90),
		new Students("Kavya",2,22,88),
		new Students("Rachana",3,21,63),
		new Students("Manasa",4,22,74),
	    new Students("Ammu",5,21,55),
		new Students("Anusha",6,21,79),
		new Students("yashu",7,19,45)
		);
		
		System.out.println("Students with marks above 60");
		List<Students> stu= students.stream().filter(s-> s.marks>60).collect(Collectors.toList());
//		System.out.print(stu);
		stu.forEach(System.out::println);//to print each elements in new line
		
		
		

	}

}
