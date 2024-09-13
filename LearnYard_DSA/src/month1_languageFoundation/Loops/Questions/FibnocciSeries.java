package month1_languageFoundation.Loops.Questions;

import java.util.Scanner;

//print fibnocci series till n terms..
public class FibnocciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print fib series");
		int n=sc.nextInt();
		
		printFib(n);
		
	}
	
	public static void printFib(int n) {
		
		if(n==0) {
			return;
		}else if(n==1) {
			System.out.println("1");
			return;
		}else if(n==2) {
			System.out.println("1");
			return;
		}
		
		
		
		int a=0;
		int b=1;
		 int c;
		 
		 System.out.print(a+" "+b+" ");
		 
		 for(int i=2;i<n;i++) {
			 c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
			
		 }
		
	}

}
