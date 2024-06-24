package linkedList.Implementaion;

public class DoublyLinkedList {
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		public Node(int data,Node next,Node prev) {
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
	
	
	public static void addFirstInDLL(int data) {
		
		
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	
	public static void addLastDLL(int data) {
		Node newNode=new Node(data);
		size++;
		if(tail==null) {
			head=tail=newNode;
			return;
		}
		
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
	}
	
	public static void addAtParticularIndexInDLL(int index,int data) {
		if(index < 0 || index > size) {
			System.out.println("Invalid Syntax");
		}
		
		if(index == 0) {
			addFirstInDLL(data);
			return;
		}else if(index==size) {
			addLastDLL(data);
			return;
		}
		
		Node newNode= new Node(data);
		size++;
		
		Node prev= head;
		int i=0;
		while(i<index-1) {
			prev=prev.next;
			i++;
		}
		
		newNode.next=prev.next;
		newNode.prev=prev;
		prev.next.prev=newNode;
		prev.next=newNode;
		
	}
	
	public static int removefirstInDLL() {
		if(size ==0) {
			System.out.println("LL is Empty..");
			return -1;
		}else if(size==1) {
			int val=head.data;
			head=tail=null;;
			size--;
			return val;
		}
		
		int val=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return val;
		
		
	}
	
	public static int removeLastInDLL() {
		if(head==null) {
			System.out.println("Empty");
			return -1;
		}else if(size==1) {
			int val=head.data;
			head=tail=null;
			size--;
			return val;
		}
		
			int val=tail.data;
			tail=tail.prev;
			tail.next=null;
			size--;
			return val;
	}
	
	public static int removeAtParticularIndex(int index) {
		if(index <0 || index >= size) {
			System.out.println("Invalid Index");
			return -1;
		}
		if(size==0) {
			return removefirstInDLL();
		}else if(index==size-1) {
			return removeLastInDLL();
		}
		
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		int val=temp.data;
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		size--;
		return val;
		
		
	}
	
	public static void print() {
		if(head==null) {
			System.out.println("LL IS Empty....");
			return; 
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		DoublyLinkedList.addFirstInDLL(5);
		DoublyLinkedList.addFirstInDLL(4);
		DoublyLinkedList.addFirstInDLL(3);
		DoublyLinkedList.addFirstInDLL(2);
		DoublyLinkedList.addFirstInDLL(1);
		DoublyLinkedList.print();
		
		System.out.println(DoublyLinkedList.removeAtParticularIndex(2));
		DoublyLinkedList.print();
		System.out.println(DoublyLinkedList.removeAtParticularIndex(2));
		DoublyLinkedList.print();
		System.out.println(DoublyLinkedList.removeAtParticularIndex(2));
		DoublyLinkedList.print();
		System.out.println(DoublyLinkedList.removeAtParticularIndex(1));
		DoublyLinkedList.print();
		System.out.println(DoublyLinkedList.removeAtParticularIndex(0));
		DoublyLinkedList.print();
	}

}
