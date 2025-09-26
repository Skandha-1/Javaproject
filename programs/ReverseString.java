package programs;

public class ReverseString {

	public static void main(String[] args) {
//		String name="java is fun";
//		String rev=" ";
//		for (int i =name.length()-1;i>=0;i--) {
//			rev=rev+name.charAt(i);
//		}
//		System.out.println(rev);
//		
		//Assignment
  
       String sentence="Java is Fun";
       String[] words = sentence.split(" ");  // Split the sentence into words
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
       System.out.println(reversed);
        }
    }


	


