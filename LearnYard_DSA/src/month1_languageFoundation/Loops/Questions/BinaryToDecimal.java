package month1_languageFoundation.Loops.Questions;
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number...");
		int n=sc.nextInt();
		System.out.println(binaryToDecimal(n));
	}
	
	public static int binaryToDecimal(int n) {
		
		int power=1;
		int sum=0;
		while(n>0) {
			
			int lastDigit= n%10; // finding last digit
			sum=sum+lastDigit * power;
			power =power*2; // after each iteration increasing 2^
			n=n/10; // remove last digit
			
		}
		
		return sum;
		
		
		
	}

}
