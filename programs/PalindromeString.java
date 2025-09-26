package programs;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println(str + " → Palindrome");
        } else {
            System.out.println(str + " → Not a Palindrome");
        }
   
     //Assignment

	String sentence = "Java is fun";
	String[] words = sentence.split(" ");
	System.out.println(Arrays.toString(words));
    }}

