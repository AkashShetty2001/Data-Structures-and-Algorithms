package month1_languageFoundation.Loops.Questions;
import java.util.Scanner;


/*
 * Question:
 * 	print all numbers from 1 to n
 * n is number from user inout
 */
public class PrintAllNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a number..");
		int n=sc.nextInt();
		
		printAll(n);
		
		
	}
	
	public static void printAll(int n) {
		if(n ==0) {
			System.out.println("0");
			return;
		}
		
		if(n < 0) {
			System.out.println("Invalid number, plz give positive number");
			return;
		}
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
	}

}
