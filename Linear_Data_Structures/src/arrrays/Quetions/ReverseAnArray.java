package arrrays.Quetions;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		reverseArray(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void reverseArray(int a[]) {
		int left=0;
		int right=a.length-1;
		
		while(left < right) {
			//swap
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
	}

}
