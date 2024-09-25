package arrays.basicQuestion;

/*
 * print all subarrays
 */
public class PrintSubArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		printSubArray(a);
		
	}
	
	public static void printSubArray(int a[]) {
		int n=a.length;
		
		for(int i=0;i<n;i++) { // starting point..
			for(int j=i;j<n;j++) { // ending point...
				
				//subarray(i to j)
				for(int k=i;k<j;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
				
			}
		}
		
	}

}
