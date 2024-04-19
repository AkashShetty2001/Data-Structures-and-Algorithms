package backtracking.understanding;

import java.util.Arrays;

public class BacktrackingOnArrays {
	public static void main(String[] args) {
		int a[]=new int [5];
		changeArray(a,0,1);
		
		System.out.println(Arrays.toString(a));
	}
	public static void changeArray(int a[],int i, int val) {
		
		//base case
		if(a.length == i) {
			System.out.println(Arrays.toString(a));
			return;
		}
		
		//recursion(Kaam)
		a[i]=val;
		changeArray(a,i+1,val+1); //recursive call
		a[i]=(a[i] -2);  //backtracking step
	}

}
