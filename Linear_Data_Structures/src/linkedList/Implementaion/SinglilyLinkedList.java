package linkedList.Implementaion;

 class LinkedList{
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	static class Node{
		
		Node next;
		int data;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
	
	//Functions
	
	/*
	 * 1.Add First()
	 */
	
	public static void addFirst(int data) {
		
		Node newNode = new Node(data);
		size++;
		
		if(head==null) { //LL is empty
			head=tail=newNode;
		}
		
		newNode.next=head;
		head=newNode;	
	}
	
	// add last()
	public static void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
		}
		
		tail.next=newNode;
		tail=newNode;
	}
	
	
	//add in Middle()
	public static void addAtMiddle(int index, int data) {
		
		Node newNode = new Node(data);
		if(index == 0) {
			addFirst(data);
			return;
		}
		size++;
		
		Node prev=head;
		int i=0;
		
		while(i < index-1) {
			prev=prev.next;
			i++;
		}
		
		newNode.next=prev.next;
		prev.next=newNode;
	}
	
	//remove First();
	public static int removeFirst(){
		
		if(size==0) {
			System.out.println("LinkedList is empty...");
			return -1;
		}else if(size == 1) {
			int val=head.data;
			head=tail=null;
			size--;
			return val;
		}
		int val = head.data;
		head=head.next;
		size--;
		return val;
	}
	
	//remove Last()
	public static int removeLast() {
		if(size==0) {
			System.out.println("LinkedList is empty...");
			return -1;
		}else if(size == 1) {
			int val=head.data;
			head=tail=null;
			size--;
			return val;
		}
		
		Node prev=head;
		for(int i=0;i<(size-2);i++) {
			prev=prev.next;
		}
		
		int val=prev.next.data;
		prev.next=null;
		size--;
		tail=prev;
		
		return val;
		
		
	}
	
	public static int removeAtparticulatIndex(int index) {
		if(index==0) {
			return removeFirst();
		}else if(index==size -1) {
			return removeLast();	
		}
		
		Node prev=head;
		int i=0;
		while(i<index-1) {
			prev=prev.next;
			i++;
		}
		
		int val=prev.next.data;
		prev.next=prev.next.next;
		size--;
		return val;
	}

	
	
//	//Print()
	public static void print() {
		
		if(head==null) {
			System.out.println("LinkedList is empty...");
			return;
		}
		
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
}

public class SinglilyLinkedList extends LinkedList {
	public static void main(String[] args) {
		
//		LinkedList L1 = new LinkedList();
		
		LinkedList.addFirst(0);
		LinkedList.addLast(1);
		LinkedList.addLast(2);
		LinkedList.addLast(4);
		LinkedList.addAtMiddle(3, 3);
		LinkedList.print();
		
		
		
		
		
		System.out.println(LinkedList.size);

		
		
	}

}
