package month1_languageFoundation;
import java.util.Scanner;

public class L3_HomeworkConditionals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*Conditionals Question - 
		Write a program to check whether a number is negative, positive or zero.
		Write a program to check whether a number is divisible by 5 and 11 or not.
		Write a program to check whether a number is even or odd.
		*/
		
		//Question1
		System.out.println(negativeOrPositive(sc));
		
		//Question2
		System.out.println(isDivisible(sc));
		
		//Question 3
		System.out.println(evenOrOdd(sc));
		
	}
	
	public static String negativeOrPositive(Scanner sc) {
		System.out.println("Enetr a number");
		int n=sc.nextInt();
		
		if( n > 0) {
			return "positive";
		}else if(  n == 0) {
			return "equal to zero";
		};
		
		return "negative";
				
	}
	
	public static String isDivisible(Scanner sc) {
		System.out.println("Enter a number to check whether it is divisible by 5 or 11");
		int n=sc.nextInt();
		
		if( n % 5 == 0 ) {
			return "it is divisible by 5";
		}else if( n % 11 == 0) {
			return " it is divisible by 11";
		};
		
		return " not divisible by 5 or 11";
	}
	
	public static String evenOrOdd(Scanner sc) {
		System.out.println("Enetr a number  to check ood or even..");
		int n=sc.nextInt();
		
		if( n %2 == 0) {
			return "even";
		}
		
		return "odd";
	}

}

