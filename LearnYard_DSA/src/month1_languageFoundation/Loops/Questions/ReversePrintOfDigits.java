package month1_languageFoundation.Loops.Questions;
import java.util.Scanner;
/*
 * Question
 * print digits in reverse order.
 */

public class ReversePrintOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number....");
		int n=sc.nextInt();
		printReverse(n);
		
	}
	public static void printReverse(int n) {
		if(n==0) {
			System.out.println("0");
			return;
		}
		
		if(n < 0) {
			System.out.println("Plz enetr positive number");
			return;
		}
		while(n>0) {
			int lastDigit= n%10;
			System.out.print(lastDigit+" ");
			n=n/10;
		}
	}

}
