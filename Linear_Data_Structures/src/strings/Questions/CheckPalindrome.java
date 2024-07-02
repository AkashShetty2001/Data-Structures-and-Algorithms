package strings.Questions;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		boolean ans=checkPlaindrome(s);
		System.out.println(ans);
		
	} 
	public static boolean checkPlaindrome(String s) {
		int n=s.length();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	

}
