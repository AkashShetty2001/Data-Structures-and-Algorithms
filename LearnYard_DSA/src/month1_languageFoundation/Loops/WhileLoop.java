package month1_languageFoundation.Loops;
//it is used when need to compute in a number
// and it will run untill the condition is true..

public class WhileLoop {
	public static void main(String[] args) {
		
		/*
		 * syntax
		 * 1.initiallization
		 * while(condition){
		 * // statements
		 * //updation
		 * };
		 * 
		 * //note 
		 * it may run infinately if the condition not given correctly..
		 * 
		 */
		
		//eg
		int i=1;
		while(i<=10) {
			// after 10 iteration i<=10 condition becomes fail..
			System.out.println(i+" hello..");
			i++;
		}
		
	}

}
