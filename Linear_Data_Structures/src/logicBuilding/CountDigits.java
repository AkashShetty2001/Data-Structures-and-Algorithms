package logicBuilding;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(countDigits(n));
	}
	public static int countDigits(int n) {
		int count=0;
		if(n==0) {
			return 1;
		}
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
