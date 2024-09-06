package month1_languageFoundation;
import java.util.Scanner;

public class L3_coditionalsStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//
		/*
		 * 1. if(condition){
		 *       statement // if condition true
		 *       };
		 */
		/*
		int marks =39;
		if(marks >= 39) {
			System.out.println("congrats!! you passed..");
			
		}
		*/
		
		/*
		 * 2. if else
		 * if(condition){
		 * // statement // true
		 * }else{
		 *  // statements // condition false
		 *  }
		 */
		
//		int marks =40;
//		if(marks >= 39) {
//			System.out.println("congrats!! you passed..");	
//		}else {
//			System.out.println("Hard luck you failed");
//		}
		
		//nested if else
//		int a=10;
//		if(a>=10) {
//			if(a==10) {
//				System.out.println("the value is 10");
//			}else {
//				System.out.println("value is greater then 10");
//			}
//		
//		}
		
		// print days of week using a given day no through if else
		System.out.println("Please enter the day no, 1 means monday and 7 means sunday...");
		int dayNo=sc.nextInt();
		if(dayNo == 1) {
			System.out.println("Monday");
		}else if(dayNo == 2) {
			System.out.println("Tuesday");
		}else if(dayNo == 3) {
			System.out.println("wednesday");
		}else if(dayNo == 4) {
			System.out.println("Thrusday");
		}else if(dayNo == 5) {
			System.out.println("Friday");
		}else if(dayNo == 6) {
			System.out.println("Saturday");
		}else if(dayNo == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid day Number....");
		}
		
	}

}
