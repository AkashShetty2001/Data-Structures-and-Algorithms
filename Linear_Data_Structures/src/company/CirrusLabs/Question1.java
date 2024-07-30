package company.CirrusLabs;

/*
 * given an 2d array print 
 * the row which is having greater sum 
 * finding the row with the greatest sum and printing
 */
public class Question1 {
	public static void main(String[] args) {
		int a[][]= {{9,11,15},{1,98,76},{100,87,64}};
		sum(a);
		
	}
	public static void sum(int a[][]) {
		int sum=0;
		int k=0;
		
		for(int i=0;i<a.length;i++) {
			int cSum=0;
			for(int j=0;j<a[i].length;j++) {
				cSum += a[i][j];	
			}
			if(cSum> sum) {
				sum=cSum;
				k=i;
			}
		}
		
		for(int i=k;i<=k;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
