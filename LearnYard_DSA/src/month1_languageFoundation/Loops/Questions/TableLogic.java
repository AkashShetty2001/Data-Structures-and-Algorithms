package month1_languageFoundation.Loops.Questions;
import java.util.Scanner;

public class TableLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number of which table you have to print...");
		int n=sc.nextInt();
		
		printTables(n);

		
	}
	
	public static void printTables(int n){
		
		// i should go from 1 to 10 to print tables
		//so use for loop
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		
	}
	
	
	

}
