package arrrays.Quetions.SubArrays;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * pattern 2
 * return indexes of the SubArray.
 * 1 based indexing
 */
public class Questinon2 {
	public static void main(String[] args) {
		int a[]= {2,8,2,6,-6,3,2};
		int k=100;
		System.out.println(subarryIndexses(a,k));
		
	}
	public static ArrayList<Integer> subarryIndexses(int a[],int k){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);//no answer case;
		int sum=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0,-1);
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			int rem = sum-k;
			if(hm.containsKey(rem)) {
				int startingIndex=hm.get(rem)+1;
				list.set(0, startingIndex);
				list.add(i);
				break;
			}
			hm.put(sum,i);
		}
		
		
		return list;
	}

}
