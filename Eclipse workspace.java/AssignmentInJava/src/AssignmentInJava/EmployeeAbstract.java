package AssignmentInJava;

abstract class Employee{
	public String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public abstract double calculateSalary();
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+calculateSalary());
	}
}

class FullTimeEmployee extends Employee{
	public double monthlySalary;

	public FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
	
}

class PartTimeEmployee extends Employee{
	public double hoursRate;
	public int hoursWork;
	
	public PartTimeEmployee(String name, double hoursRate, int hourWork) {
		super(name);
		this.hoursRate = hoursRate;
		this.hoursWork = hourWork;
	}

	@Override
	public double calculateSalary() {
		return hoursRate * hoursWork;
	}
	
	
	
}
public class EmployeeAbstract {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee emp = new FullTimeEmployee("Suchithra", 50000);
		Employee emp1 =new PartTimeEmployee("Mohan", 20, 1000);
		emp.display();
		emp1.display();
		
	}
}
