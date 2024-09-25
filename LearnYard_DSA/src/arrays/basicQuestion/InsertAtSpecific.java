package arrays.basicQuestion;

import java.util.Scanner;

/*
 *  insert at any specific position in an array
 */
public class InsertAtSpecific {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the position index");
		int position=sc.nextInt();
		System.out.println("enter the value..");
		int value=sc.nextInt();
		insert(a,position,value);
		
		
	}
	
	public static void insert(int a[], int position,int value) {
		
		int answer[] = new int[a.length+1];
		int i=0, j=0;
		
		while(i<answer.length) {
			if(i == position) {
				answer[i]=value;
			}else {
				answer[i]=a[j];
				j++;
			}
			i++;
		}
		i=0;
		
		for( i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
		
		
		
	}

}
