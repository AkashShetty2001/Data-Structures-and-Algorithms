package recursion;

/*
 * when only one function is called recursively.
 */
public class LinearRecursion {
	public static void main(String[] args) {
		fun(5);
	}
	
	public static void fun(int n) {
		if(n < 0) {
			return ;
		}
		System.out.println(n);
		fun(n-1);  //Linear recursive call
	}

}
