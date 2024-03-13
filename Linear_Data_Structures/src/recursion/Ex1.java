package recursion;
/*
 * Recursion is a technique of making a function call itself.
 * 
 */
public class Ex1 {
	public static void main(String[] args) {
		//System.out.println("hello");
		print(5);
	}
	
	public static void print(int n) {
		if(n < 0) {
			return;
		}
		System.out.println("Hello World!");
		print(n-1);
	}

}
