package arrrays.Quetions.SubArrays;
//import java.util.ArrayList;
import java.util.HashMap;

/*
 * pattern 4
 * count no of SubArrays==k;
 */
public class Question4 {
	public static void main(String[] args) {
		int a[]= {2,8,2,6,-6,3,2};
		int k=2;
		System.out.println(subarrayCount(a,k)); 
	}
	public static int subarrayCount(int a[],int k) {
		
		int count=0;
		int sum=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0,1);
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			int rem=sum-k;
			
			count=count+hm.getOrDefault(rem, 0);
			hm.put(sum,hm.getOrDefault(sum, 0)+1);
		}
		
		return count;
	}

}
