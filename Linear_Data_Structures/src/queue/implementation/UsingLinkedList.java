package queue.implementation;

public class UsingLinkedList {
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	static class Queue{
		public static Node head=null;
		public static Node tail=null;
		
		public static boolean isEmpty() {
			return head==null;
		}
		
		public static void add(int data) {
			Node newNode = new Node(data);
			
			if(head==null) {
				head=tail=newNode;
				return;
			}
			
			tail.next=newNode;
			tail=newNode;
		}
		
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int val=head.data;
			if(head.next==null) {
				head=tail=null;
			
			}else {
				head=head.next;
			}
			
			
			return val;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	} 
	public static void main(String[] args) {
		Queue q= new Queue();
		//q.add(1);
//		System.out.println(q.peek());
//		System.out.println(q.remove());
		q.add(2);
		//q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
		
	}

}
