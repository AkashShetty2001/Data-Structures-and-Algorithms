package month1_languageFoundation;
import java.util.Scanner;

/*
 * Flowcharts:
 *  it is a diagramatic approach of solving a problem in step by step..
 */

public class L1_Flowcharts {
	public static void main(String args[]) {
		
		//chech if a given number u=is even or not
		
		//step 1: Take input number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		//step2 : logic building
		if(n % 2 == 0) {
			//if yes
			System.out.println("It is even..");
		}else {
			//if no
			System.out.println("It is odd..");
		}
		
		
		
	}

}
