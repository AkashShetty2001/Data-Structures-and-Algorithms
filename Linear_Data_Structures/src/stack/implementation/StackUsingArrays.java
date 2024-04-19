package stack.implementation;

public class StackUsingArrays {
	
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		
		
		
		
		
	}
	
	
	

}

class Stack{
	
	 private int size=3;
	 private int top=-1;
	 private int a[]= new int[size];
	 
	 public boolean isFull() {
		 return top == size-1; 
	 }
	 
	 public boolean isEmpty() {
		 return top == -1;
	 }
	 
	 public void push(int data) {
		 if(isFull()) {
			 System.out.println("Overflow");
		 }else {
			 top++;
			 a[top]=data;
		 }
	 }
	 
	 public int pop() {
		 if(isEmpty()) {
			 System.out.println("underflow");
			 return -1;
		 }else {
			 int temp=a[top];
			 top--;
			 return temp;
		 }
	 }
	 
	 public int peek() {
		 if(isEmpty()) {
			 System.out.println("underflow");
			 return -1;
		 }else {
			 return a[top];
		 }
	 }
	 
	 public void display() {
		 while(!isEmpty()) {
				System.out.print(pop()+" ");
				System.out.println();
			}
		 
	 }
	 
	 
}
