package month1_languageFoundation.Loops.Questions;
import java.util.Scanner;

/*
 * Question:
 *    print all Odd numbers from 1 to n
 *    n is the user input
 */

public class PrintAllOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a number..");
		int n=sc.nextInt();
		
		printAllOdd(n);
		
	}
	
	public static void printAllOdd(int n) {
		if(n ==0) {
			System.out.println("0");
			return;
		}
		
		if(n < 0) {
			System.out.println("Invalid number, plz give positive number");
			return;
		}
//		for(int i=1;i<=n;i++) {
//			if(!(i%2==0)) {
//				System.out.println(i);
//			}
//		} // using logic
		
		// using loops
		// for loop -> used when we need to go to from 1 location to another 
		// here from 1 till n
		
		for(int i=1;i<=n;i=i+2) {
			System.out.print(i+" ");

		}
		
	}

}
