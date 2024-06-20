package arrrays.Quetions;

public class FindMaxMinInArray {
	public static void main(String[] args) {
		int a[]= {12,78,1000,9999,11111,39876};
		System.out.println(Max(a));
		System.out.println(Min(a));
	}
	public static int Max(int a[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}public static int Min(int a[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	

}
