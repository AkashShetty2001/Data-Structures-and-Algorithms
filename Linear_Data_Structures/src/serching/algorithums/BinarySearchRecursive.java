package serching.algorithums;

import java.util.Scanner;

public class BinarySearchRecursive {
	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5,6,7,8,9,10};
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter key to search:");
		  int key=sc.nextInt();
		  
		  System.out.println(binaryRecursive(a,key,0,a.length-1));
	}
	public static int binaryRecursive(int a[],int k,int l,int r) {
		//bc
		if(l> r) return -1;
		
		int m=l+(r-l)/2;
		if(a[m]==k) return m;
		else if(k<a[m]) return binaryRecursive(a,k,l,m-1);
		else return binaryRecursive(a,k,m+1,r);
			
		
	}

}
