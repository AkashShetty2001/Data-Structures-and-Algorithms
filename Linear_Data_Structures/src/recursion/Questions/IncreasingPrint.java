package recursion.Questions;

/*
 * increasing Order
 */

public class IncreasingPrint {
	public static void main(String[] args) {
		//System.out.println("recursion");
		print(15);
	}
	public static void print(int n) {
		
		//bc
		if(n ==1) {
			System.out.print(n+" ");
			return;
		}
		
		
		print(n-1);// calling inner function
		System.out.print(n+" "); //work
	}

}
