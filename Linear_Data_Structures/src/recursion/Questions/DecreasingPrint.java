package recursion.Questions;

/*
 * Decresing Order
 */

public class DecreasingPrint {
	public static void main(String[] args) {
		//System.out.println("recursion");
		print(10);
	}
	public static void print(int n) {
		
		//bc
		if(n ==1) {
			System.out.println(n);
			return;
		}
		
		System.out.print(n+" "); //work
		print(n-1);// calling inner function
	}

}
