package month1_languageFoundation.Loops.Questions;
import java.util.Scanner;

public class PrintArmstrongNumberInRange {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			if(checkArmStrong(i)) {
				System.out.print(i+" ");
			}
				
		}	
	}
	
public static boolean checkArmStrong(int n) {
		
		// step2: count total number of digits
		int totalDigits=totalDigits(n);
		
		//calculate cube sum
		int sum=powerFunction( n, totalDigits);
		
		//check
		if(sum == n) {
			return true;
		}
		
		
		return false;
		
	}
	
	private static int powerFunction(int n,int totalDigits) {
	
		int sum=0;
		while(n>0) {
			int lastDigit=n %10;
			sum+=Math.pow(lastDigit, totalDigits);
			n=n/10;
		}
		return sum;
	}

	public static int totalDigits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}



}
