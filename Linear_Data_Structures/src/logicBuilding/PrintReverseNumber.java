package logicBuilding;
import java.util.*;

public class PrintReverseNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();	
		printReverseDigitOfNumber(n);
	}
	
	public static void printReverseDigitOfNumber(int n) {
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			System.out.println(rem);
			temp=temp/10;
		}
	}

}
