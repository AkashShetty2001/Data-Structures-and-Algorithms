package arrays.dynamicArrays;
import java.util.ArrayList;

public class Syntax {
	
	public static void main(String args[]) {
		
		// for dynamic array use ArrayList( its class in collection api)
		// present in util package
		// it internally used dynamic array data structure..
		// size grows like capacity * 2
		
		ArrayList a1 = new ArrayList<>();
		
		// methods
		//add() -> O(1)  to add elemetns in arrayList
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		//size -> O(1)  to know the size of the array
		System.out.println(a1.size());
		
		
		//get(i) -> O(1)  to fetch value at particular index
		for(int i=0;i<a1.size();i++) {
			System.out.print(a1.get(i)+" ");  
		}
		
		System.out.println();
		// remove -> O(n)  to remove elemnet at particular index
	    int val=(int)a1.remove(1);
	    System.out.println("removed "+ val);
		
		for(int i=0;i<a1.size();i++) {
			System.out.print(a1.get(i)+" ");  
		}
		
	}

}
