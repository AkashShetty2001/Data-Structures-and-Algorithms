package stack.implementation;

public class UsingLinkedList {
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	static class Stack{
		public static Node head;
		
		public static boolean isEmpty() {
			return head==null;
		}
		
		public static void push(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			
			newNode.next=head;
			head=newNode;
			
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			
			int top=head.data;
			head=head.next;
			return top;
		}
		
		public static int peek() {
			return head.data;
		}
	}
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(1);
		System.out.println(s.peek());
		
		s.push(2);
		System.out.println(s.peek());
		s.push(3);
		System.out.println(s.peek());
		System.out.println(s.pop());
		s.push(4);
		System.out.println(s.peek());
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}
	}

}
