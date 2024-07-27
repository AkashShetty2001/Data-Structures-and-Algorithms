package logicBuilding;
import java.util.Scanner;

public class IsPrimeRange {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting range");
		int low=sc.nextInt();
		System.out.println("Enter the ending range");
		int high=sc.nextInt();
		isPrime( low, high);
		
	}
	
	public static void isPrime(int low,int high) {
		
		for(int i=low;i<=high;i++) {
			int count=0;
			
			for(int div=2;div*div <=i;div++) {
				if(i % div == 0) {
					count++;
					break;
				}
			}
			
			if(count==0) {
				System.out.println(i);
			}
		}
		
	}
	

}
