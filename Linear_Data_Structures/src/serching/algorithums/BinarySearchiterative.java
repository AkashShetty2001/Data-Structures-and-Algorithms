package serching.algorithums;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchiterative {
  public static void main(String[] args) {
	  
	  int a[]= {1,2,3,4,5,6,7,8,9,10};
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter key to search:");
	  int key=sc.nextInt();
	  
	  System.out.println(binarySearch(a,key));
	
}
  
  public static int binarySearch(int a[],int key) {
	  
	  Arrays.sort(a);
	  int left=0;
	  int right=a.length-1;
	  while(left <= right) {
	  int mid=left+(right-left)/2;
	  
	  if(a[mid]==key) {
		  return mid;
	  }else if(key<a[mid]) {
		  right=mid-1;
	  }else {
		  left=mid+1;
	  }
	  }
	  return -1;
  }



}
