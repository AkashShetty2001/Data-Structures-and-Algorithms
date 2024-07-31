package strings.Questions;

public class ReverseAWordInString {

	public static void main(String[] args) {
		String s=" the sky is blue ";
		String ans=reverseWords(s);
		System.out.println(ans);
	}
	
	public  static String reverseWords(String s) {

        String words[]=s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
                sb.append(words[i]);
                sb.append(" ");
        }

        return sb.toString().trim();
        
    }
}
