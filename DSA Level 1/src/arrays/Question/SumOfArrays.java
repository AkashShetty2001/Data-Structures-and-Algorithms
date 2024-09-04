package arrays.Question;

/*
 * print sum of 2 Arrays
 */
public class SumOfArrays {
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		sum(a1,a2);
	}

	private static void sum(int[] a1, int[] a2) {
		for(int i=0;i<a1.length && i<a2.length;i++) {
			if((a1[i] <= 9 && a1[i] >= 0 ) && (a2[i] <= 9 && a2[i] >= 0 ) )
			System.out.print(a1[i]+a2[i]+" ");
			else {
				System.out.println("invaled elements");
				break;
			}
		}
		
	}
	

}
