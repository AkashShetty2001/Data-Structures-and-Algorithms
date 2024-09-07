package month1_languageFoundation;
import java.util.Scanner;

public class L3_Questions {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
//		//max of 2
//		
//		System.out.println("Enter 2 numbers to check max.");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		if(a>b) {
//			System.out.println("number "+ a+" is greater");
//		}else if(a==b) {
//			System.out.println("number "+a+" and  "+b+" are equal ");
//		}else {
//			System.out.println("number "+b+" is greater");
//		}
		
		//max of 3 using logical operators
		/*
		 *  1. && Logical and operator.(both condition should be true)
		 *  2. || Logical OR operator (any one cond, shpuld be true)
		 *  3, !  Logica=l Not operator ( reverse)
		 */
//		
//		int a=111;
//		int b=111;
//		int c=12;
//		
//		if(a>= b && a>=c) {
//			System.out.println("a is greater");
//		}else if(b>=c && b>=a) {
//			System.out.println("b is greater");
//		}else {
//			System.out.println("c is greater");
//		}
//		
		
		//Ternary operator
//		// (condition)? true: false;
//		int max = (9> 8) ? 9 : 8;
//		System.out.println(max);
		
		
		
		//switch case..
		//days of a week using 
//		System.out.println("Enter day No..");
//		 int dayNo=sc.nextInt();
//		 
//		 switch(dayNo) {
//		 case 1:
//			 System.out.println("Monday");
//			 break;
//			 
//		 case 2:
//			 System.out.println("Tuesday");
//			 break;
//			 
//		 case 3:
//			 System.out.println("Wednesday");
//			 break;
//			 
//		 case 4:
//			 System.out.println("Thrusday");
//			 break;
//			 
//		 case 5:
//			 System.out.println("Friday");
//			 break;
//			 
//		 case 6:
//			 System.out.println("saturday");
//			 break;
//			 
//		 case 7:
//			 System.out.println("Sunday");
//			 break;
//			 
//		default:
//			System.out.println("Invalid day No");		
//				 
//			 
//		 }
		
		//leap year
//		System.out.println("Enter year..");
//		int year=sc.nextInt();
//		
//		if(year % 4 == 0) {
//			if(year % 100 == 0) {
//				if(year % 400 == 0) {
//					System.out.println("Leap Year");
//				}else {
//					System.out.println("Non Leap year");
//				}
//				
//			}else {
//				System.out.println("Leap year");
//			}
//			
//		}else {
//			System.out.println("Non Leap year");
//		}
		
//		//shortend version of leap year code...
//		if((year % 400 == 0) || (year % 4 == 0) && (year %100 != 0)){
//			System.out.println("Leap Year");
//		}else {
//			System.out.println("Non Leap year..");
//		}
		
//		//check if a characetr is alphabet or digit..
//		System.out.println("enetr a character to check");
//		char c=sc.next().charAt(0);
//		
//		int value=c;
//		
//		if((value >= 65 && value <=90)||(value>=97 && value <=122)) {
//			System.out.println("Alphabet");
//		}else if(value >= 48 && value<=57){
//			System.out.println("Digits");
//		}else {
//			System.out.println("Special character");
//		}
		
		
	}

}
