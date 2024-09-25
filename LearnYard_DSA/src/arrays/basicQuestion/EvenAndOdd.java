package arrays.basicQuestion;

import java.util.Arrays;

/*
 * put even  & odd elements in thier respective array 
 */

public class EvenAndOdd {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,5,15,16,8,90,8,7,9};
		
		// take count of even and odd to create a array
		int evencount=0;
		int oddCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evencount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		if(evencount > 0) {
		int even[]=new int[evencount];
		int indexEven=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2 == 0) {
					even[indexEven]=a[i];
					indexEven++;
				}
			}
			System.out.println("Even "+Arrays.toString(even));
		}
		
		if(oddCount > 0) {
		int odd[]= new int[oddCount];
		int indexOdd=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2 != 0) {
					odd[indexOdd]=a[i];
					indexOdd++;
				}
			}
			System.out.println("Odd "+Arrays.toString(odd));
		}
		
		
		
		
		//System.out.println(evencount+" "+oddCount);
	}
}
