package logicBuilding;
import java.util.Scanner;

public class OptimalIsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check..");
		int n=sc.nextInt();
		isPrime(n); 
	}
	
	public static void isPrime(int n) {
		int count=0;
		for(int i=2;i*i<=n;i++) {
			if(n % i == 0) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
