package gecjava.src.student;

import  gecjava.src.student.Student;

public class App {
    public static void main(String[] args) throws Exception {
       Student std1 = new Student(22, "Suchithra");
       System.out.println("The std1 details are\n");
       System.out.println("Id: "+ std1.stdID);
       System.out.println("Name: "+ std1.stdName);
    }
}
