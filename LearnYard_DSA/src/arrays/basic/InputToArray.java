package arrays.basic;

import java.util.Scanner;

public class InputToArray {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//printing
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
