package arrays.Question;
import java.util.Scanner;


/*
 * find span
 * span=max ele-min ele
 */
public class SpanOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of Elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(span(a));
	}
	
	public static int span(int a[]) {
	
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		return max-min;
	}

}
