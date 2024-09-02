package month1_languageFoundation;
import java.util.Scanner;

public class L2_Questions {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Homework Question
			 1. Enter two numbers and perform all arithmetic operations 
			2. Enter P, R, T and calculate simple interest.
//		 */
//		
		questionAirthmetic();
		System.out.println("the simple intrest is:"+simpleIntrest());
		inputDisplay();
		
	}
	
	public static void questionAirthmetic() {
		System.out.println("Enter 2 numbers");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		System.out.println("Addtion result :"+add(number1,number2));
		System.out.println("subtraction result :"+sub(number1,number2));
		System.out.println("multiplication result :"+mul(number1,number2));
		System.out.println("division result :"+divide(number1,number2));
		System.out.println("moduls result :"+moduls(number1,number2));
		
		
	}

	private static int moduls(int number1, int number2) {
		
		return number1 % number2;
		
	}

	private static double divide(int number1, int number2) {
	
		return number1 / number2;
	}

	private static int mul(int number1, int number2) {
		
		return number1 * number2;
		
	}

	private static int sub(int number1, int number2) {
		
		return number1 - number2;
		
	}

	private static int add(int number1, int number2) {
		
		return number1 + number2;
		
	}
	
	public static double simpleIntrest() {
		
		System.out.println("=====================");
		
		System.out.println("enter principal ammount:");
		int p=sc.nextInt();
		System.out.println("enetr time:");
		int t=sc.nextInt();
		System.out.println("enter rate of intrest:");
		int r=sc.nextInt();
		//sc.next().charAt(0);
		
		return (p*r*t) / 100;
	}
	
	public static void inputDisplay() {
		System.out.println("============");
		System.out.println("Enetr a character:");
		char c=sc.next().charAt(0);
		System.out.println("Enetr a integer:");
		int a=sc.nextInt();
		System.out.println("Enter a float");
		float f= sc.nextFloat();
		
		System.out.println( c+" "+a+" "+f);
	}
}
