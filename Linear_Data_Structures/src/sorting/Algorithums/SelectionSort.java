package sorting.Algorithums;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) {
		int a[]= {7,9,4,1,9,16};
		sort(a);
		
	
		
		
	}
	public static void sort(int a[]) {
		
		for(int i=0;i<a.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[smallest]>a[j]) {
					smallest=j;
				}
			}
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
		}
		
		printArray(a);
	}
	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
