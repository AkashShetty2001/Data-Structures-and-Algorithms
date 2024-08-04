package arrays;

public class Declaration {
	public static void main(String[] args) {
		
		
		//memory allocated in heap
		int a[]= new int[5];
		//by default jvm will assign value based on data type
		//index based accessing starts from 0
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		//.length is a property which gives size of array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
