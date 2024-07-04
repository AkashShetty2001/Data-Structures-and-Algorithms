package queue.implementation;
import java.util.*;


public class UsingMultipleStacks {
	public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		q.enqueue(5);
		System.out.println(q.peek());
	}

}
class QueueImplementation{
	Stack<Integer> s1= new Stack<>();
	Stack<Integer> s2= new Stack<>();
	
	public void enqueue(int val) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(val);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public int dequeue() {
		if(s1.isEmpty()) {
			return -1;
		}
		
		return s1.pop();
	}
	public int peek() {
		if(s1.isEmpty()) {
			return -1;
		}
		
		return s1.peek();
	}
}
