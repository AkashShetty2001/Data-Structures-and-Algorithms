package serching.Questions;

public class FirstOcuurence {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,4,5,6,7,7};
		System.out.println(firstOcuurence(a,4));
	}
	public static int firstOcuurence(int a[],int k) {
		int l=0;
		int r=a.length-1;
		int ans=-1;
		while(l <=r) {
			int m=(l+(r-l)/2);
			if(k<a[m]) {
				r=m-1;
			}else if(k>a[m]) {
				l=m+1;
			}else {
				r=m-1;
				ans=m;
			}
		}
		return ans;
	}

}
