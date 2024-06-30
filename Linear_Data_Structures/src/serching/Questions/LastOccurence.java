package serching.Questions;

public class LastOccurence {
	public static void main(String[] args) {
		int a[]= {5,7,7,8,8,10};
		System.out.println(firstOcuurence(a,8));
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
				l=m+1;
				ans=m;
			}
		}
		return ans;
	}

}
