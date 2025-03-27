package control_statement_java;

public class Switch3 {

	public static void main(String[] args) {
		Object obj =2;
		switch(obj) {
		case String s -> System.out.println("String type");
		case Integer s -> System.out.println("Integer type");
		default -> System.out.println("Invalid type");
		}

	}

}
