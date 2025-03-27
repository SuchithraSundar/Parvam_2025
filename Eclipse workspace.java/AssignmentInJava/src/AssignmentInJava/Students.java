package AssignmentInJava;

class Student{
	private String name;
	private double rollNumber;
	private double marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public boolean hasPassed() {
        return marks >= 40;
    }
	
	public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (hasPassed() ? "Passed" : "Failed"));
    }
}

public class Students {

	public static void main(String[] args) {
	
	Student student1 = new Student();
	
	student1.setName("Suchithra");
	student1.setRollNumber(405);
	student1.setMarks(588);
	
	student1.displayDetails();

	}

}
