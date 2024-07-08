package strings.Questions;

public class ReverseAString {
	public static void main(String[] args) {
		String s="Akash";
		String ans=(reverseAString(s));
		System.out.println(ans);
		
	}
	
	public static String reverseAString(String s) {
		
		char c[]=s.toCharArray();
		int left=0;
		int right=c.length-1;
		
		while(left < right) {
			char temp=c[left];
			c[left]=c[right];
			c[right]=temp;
			left++;
			right--;
		}
		
		return  new String(c);
		
		/*
		 * StringBuilder sb = new StringBuilder(s);
		 * return sb.reverse().toString();
		 * 
		 */
		
		
		
		
	}
}
