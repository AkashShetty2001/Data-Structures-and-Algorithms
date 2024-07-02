package arrrays.Quetions.SubArrays;
import java.util.HashMap;

/*
 * Pattern3
 * find the length of the longest subarry
 * and return it.
 */
public class Question3 {
	public static void main(String[] args) {
		int a[]= {2,8,2,6,-6,3,2};
		int k=12;
		System.out.println(subarrayLength(a,k));
	}
	public static int subarrayLength(int a[],int k) {
		
		int sum=0;
		int maxLen=0;
		HashMap<Integer,Integer> hm= new HashMap<>();
		hm.put(0,-1);
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			int rem=sum-k;
			if(hm.containsKey(rem)) {
				int len=i-hm.get(rem);
				maxLen=Math.max(maxLen, len);
			}
			if(!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
		}
		return maxLen;
	}

}
