package stack.implementation;
import java.util.List;
import java .util.ArrayList;

public class StackUsingaArrayList {
	   List a= new ArrayList();
	
	public  boolean isEmpty() {
		return a.size()==0;
	}
	
	public void push(int data) {
		a.add(data);
	}
	
	public void pop() {
//		if(isEmpty()) {
//			return -1;
//		}
		//return a.get(a.size()-1);
	}
	public static void main(String[] args) {
		
	}

}


