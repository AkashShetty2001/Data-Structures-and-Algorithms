package arrays.Question;

public class FindElement {
	public static void main(String[] args) {
		int target=11;
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int ans=findElement(a,target);
		if(ans != -1) {
		System.out.println("found at index "+ans);
		}else {
			System.out.println("not found!");
		}
		
	}

	private static int findElement(int[] a,int target) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==target){
			return i;
			}
		}
		return -1;
		
	}
	

}
