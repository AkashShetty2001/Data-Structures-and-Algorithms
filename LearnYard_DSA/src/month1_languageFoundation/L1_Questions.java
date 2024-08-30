package month1_languageFoundation;

import java.util.Scanner;

public class L1_Questions {
	public static void main(String[] args) {
		
		//Q1 Greetings
		String message = "Hello world!!";
		System.out.println(message);
		
		System.out.println("========================");
		
		//input and output
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name!");
		String name= sc.next();
		System.out.println("Your name is:"+ name);
		
		System.out.println("========================");
		
		//Q3 Add 2 numbers
		System.out.println("Enter number 1:");
		int number1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int number2 = sc.nextInt();
		int addResult = number1 + number2;
		System.out.println("addtion result: "+addResult);
		
		System.out.println("========================");
		
		//Q4 sub 2 numbers
			System.out.println("Enter number 1:");
			int num1 = sc.nextInt();
			System.out.println("Enter number 2:");
			int num2 = sc.nextInt();
			int subResult = num1 - num2;
			System.out.println("addtion result: "+subResult);
					
			System.out.println("========================");
			
		
	}

}
