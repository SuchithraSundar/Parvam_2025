package AssignmentInJava;

class Shape{
	public double calculateArea() {
		return 0;
		
	}
	
	public void displayArea() {
		System.out.println("Area: "+calculateArea());
	}
}

class Circle extends Shape{
	public double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double calculateArea(){
		return Math.PI*radius* radius;
		
	}
}

class Rectangle  extends Shape{
	public double length;
	public double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length * width;
		
	}
	
	
}

public class Shapes {
	public static void main(String[] args) {
		
	Shape circle = new Circle(5);
	Shape rectangle = new Rectangle(4, 6);
	
	System.out.println("Area of Circle: ");
	circle.displayArea();
	
	System.out.println();
	
	System.out.println("Area of Rectangle: ");
	rectangle.displayArea();
	
	}

}
