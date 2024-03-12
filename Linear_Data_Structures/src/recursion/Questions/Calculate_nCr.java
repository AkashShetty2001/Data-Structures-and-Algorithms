package recursion.Questions;

/*
 * calculate nCr problem.
 */
public class Calculate_nCr {
	public static void main(String args[]) {
		System.out.println(nCr(5,2));
	}
	
	public static int nCr(int n,int r) {
		
		//base case
		if(n == r || r == 0) {
			return 1;
		}
		 if(r > n || r <0) {
			 return 0;
		 }
		
		return (nCr(n-1,r-1)+ nCr(n-1,r));  //Tree Recursion
	}

}
