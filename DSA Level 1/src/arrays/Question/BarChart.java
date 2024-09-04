package arrays.Question;

/*
 * A bar chart of astreks repsenting a value in an array
 */
public class BarChart {
	public static void main(String[] args) {
		int a[]= {5,4,3,2,0,2,1};
		barchartPrint(a);
	}

	private static void barchartPrint(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int i=max;i>=1;i--) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>=i) {
					System.out.println("*\t");
				}else {
					System.out.println("\t");
				}
			}
			System.out.println();
				
			}
			
		
	}

}
