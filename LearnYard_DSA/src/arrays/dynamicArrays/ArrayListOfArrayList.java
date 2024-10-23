package arrays.dynamicArrays;
import java.util.ArrayList;


public class ArrayListOfArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(1);
		
		ArrayList<Integer> a2= new ArrayList<>();
		a2.add(1);
		a2.add(2);
		
		ArrayList<Integer> a3= new ArrayList<>();
		a3.add(1);
		a3.add(2);
		a3.add(3);
		
		
		// creating an ArrayList of ArrayList .
		// each element is an indiviual ArrayList.
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		
		// since we are a adding a new ArrayList use new keyword.
		a.add(new ArrayList(a1));
		a.add(new ArrayList(a2));
		a.add(new ArrayList(a3));
		
		for(int i=0;i<a.size();i++) {  // this for for how many arrayList are there
			for(int j=0;j<a.get(i).size();j++) { // this for how many elemnts in each arrayList
				System.out.print(a.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

}
