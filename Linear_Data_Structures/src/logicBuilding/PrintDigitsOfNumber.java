package logicBuilding;

import java.util.Scanner;

public class PrintDigitsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= sc.nextInt();
		printDigits(n);
	}
	
	public static void printDigits(int n) {
		//it is basically printing from right to left
//		while(n!=0) {
//			int rem=n%10;
//			System.out.println(rem);
//			n=n/10;
//		}
		
		//for left to right
		/*
		 * 1.find count
		 */
		
		int count=0;
		int num=n;
		while(num!= 0) {
			num=num/10;
			count=count+1;
		}
		
		int div=(int)Math.pow(10, count-1);
		System.out.println(div);
		//because the number can contain zero
		while(div != 0) {
			
			//it will give first digit
			int q=n/div;
			//print quotient
			System.out.println(q);
			
			//take reminder
			n=n%div;
			//System.out.println(n);
		
			//decrease divider 100->10->1
			div=div/10;
		
		}
	}

}
