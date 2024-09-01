package arrrays.Quetions.SubArrays;
import java.util.HashSet;

/*
 *  pattern1 return true if a Subarray == k (given sum); 
 */
public class Question1 {
	public static void main(String[] args) {
		int a[]= {2,8,2,6,-6,3,2};
		int k=5
				;
		System.out.println(subarray1(a,k));
	}
	
	public static boolean subarray1(int a[],int k) {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(0);
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			int rem=sum-k;
			if(hs.contains(rem)) {
				return true;
			}
			hs.add(sum);
		}
		return false;
		
	}

}
