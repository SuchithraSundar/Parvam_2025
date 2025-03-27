package operators_in_java;

public class Operators {

	public static void main(String[] args) {
		/*	Arithmetic Operators : +, - , *, /, %
			Unary Operators : ++, -- (increment and decrement)
			Assignment Operator : =, +=, -=, *=, /= ,%=
			Relational Operators : <, >, <=, >=, !=, == (similar to comparison operators) - true or false
			Logical Operators : &&, ||, ! - true o
;			Ternary Operator: ?, :
			Bitwise Operators: &, |, ~
			Shift Operators: >>, <<
			instance of operator*/
		
		//Arithmetic operator:
//		  int a = 10;
//        int b = 3;
//        
//        System.out.println("a+b is :"+(a+b));
//        System.out.println("a-b is :"+(a-b));
//        System.out.println("a*b is :"+(a*b)); 
//        System.out.println("a/b is :"+(a/b));
//        System.out.println("a%b is :"+(a%b));
        
        
        //Unary operators:
//        int c = 20;
//        int d = 20;
//        System.out.println("Postincrement : " + (c++));
//        System.out.println("Preincrement : " + (++c));
//
//        System.out.println("Postdecrement : " + (d--));
//        System.out.println("Predecrement : " + (--d));
        
        
        //Assignment operator:
//        int e = 7;
//        System.out.println("e += 3: " + (e += 3));
//        System.out.println("e -= 2: " + (e -= 2));
//        System.out.println("e *= 4: " + (e *= 4));
//        System.out.println("e /= 3: " + (e /= 3));
//        System.out.println("e %= 2: " + (e %= 2));
        
        
        //Relational operator:
//        int a = 10;
//        int b = 3;
//        int c = 5;
//
//        System.out.println("a > b: " + (a > b));
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a >= b: " + (a >= b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a == c: " + (a == c));
//        System.out.println("a != c: " + (a != c));
        
        
        //Logical operator:
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        
        //Ternary operator:
//        int a = 20, b = 10, c = 30, result;
//        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
//        System.out.println("Max of three numbers = "+ result);
        
        
     // Bitwise operator:
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
        
        
     //Shift operator:
        int a = 10;
    
        // Using left shift
        System.out.println("a<<1 : " + (a << 1));
      
        // Using right shift
        System.out.println("a>>1 : " + (a >> 1));
    }
 }       
