package month1_languageFoundation.Loops.Questions;

import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the digit...");
		int n= sc.nextInt();
		
		printLastDigit(n);
		
		//System.out.println(5/10); this will give 0 meaning that all digits have been processed
	}
	
	public static void printLastDigit(int n) {
		
		
		while(n>0) {
			int lastDigit= n %10;  // %(moduls) operator it will give remainder
			System.out.print(lastDigit+" ");
			n=n/10;  //Quotient..
		}
	}

}
