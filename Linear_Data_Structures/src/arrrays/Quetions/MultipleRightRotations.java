package arrrays.Quetions;

import java.util.Arrays;

public class MultipleRightRotations {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {2,3};
		int ans[][]=multipleLeftRotation(a,b);
		
		for( int []row : ans) {
			 for(int element: row){
				 System.out.print(element+" ");
			
		}
			 System.out.println();
		}
		
		
		
		
	}
	
	public  static int[][] multipleLeftRotation(int[] A, int[] B) {
		
		
		int n=A.length;
        int m=B.length;
		for(int i=0;i<B.length;i++) {
			B[i]=n-B[i];
			System.out.println(B[i]);
		}
        //You Can Code Here

        

        int ans[][] = new int[m][n];

        //store the array elements twice
        int temp[]=new int[2*n];
        for(int i=0;i<n;i++){
          temp[i]=A[i];
          temp[i+n]=A[i];
        }

        for(int i=0;i<m;i++){
          int offset=(B[i])%n;
          for(int j=0;j<n;j++){
            ans[i][j]=temp[offset+j];
          }
        }

        return ans;

      
    }

}
