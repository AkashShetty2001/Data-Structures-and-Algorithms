package month1_languageFoundation;
import java.util.Scanner;


//public class -> keyword
//public  -> its a public property it can be accessed by any data memebers of the class and outside the cllass.
//class -> it is a blueprint for creating objects.
public class L2_Language_basics {
	
	//main -> it is the starting point of execution in java program,
	// it is the name of the method
	
	public static void main(String[] args) {
		
		//println() -> print and move cursor to next line
		System.out.println("hello world!!");
		
		//print() -> print only
		System.out.print("hello world!!! ");
		
		// comments in java
		/*  multiline comments in java */ 
		
		
		
		//variables -> it is used to store information.
		/* syntax:
		 *  type name= value;
		 *  int a= 10; range( -2 * 10^9 to 2 * 10^9);
		 *  long a= 10;  range( -2 * 10^18 to -2 * 10^18);
		 *  char a='a'; // for storing single character
		 *  String a="hello"; // for storing sequence of character (String is a class);
		 *  float a= 9.098765; // for storing decial value upto 8 places
		 *  double d=1.098765432133 // decimal value upto 15 places
		 *  
		 */
		
		//concatination ( use + operatpr);
		System.out.println();
		int a=10;
		System.out.println("the value of a is :" + a);
		
		//Airthmetic and assignment operator
		/*
		 * airthmetic
		 * + addtion 
		 * - sub
		 * * multiplication
		 * / Quitent
		 * % moduls
		 * 
		 * Assignment
		 *  = assignment (right to left)
		 *  += compound assignment (add and assign)
		 */
		
		//Taking user input
		/*
		 * Scanner it is a class  present in util package
		 * package -> group of classes
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your name:");
		String name= sc.next();  // next(takes a single world) nexLine(" complite one line); 
		System.out.println(" your name  is:"+name);
		 
		
	}

}
