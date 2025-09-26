package programs;

public class CountVowelsConstants {

	public static void main(String[] args) {

			String str = "Java is fun".toLowerCase();
			int vowels = 0, consonants = 0;
			for (char ch : str.toCharArray()) {
			    if (ch >= 'a' && ch <= 'z') {
			        if ("aeiou".indexOf(ch) != -1) vowels++;
			        else consonants++;
			    }
			}
			System.out.println("Vowels: " + vowels);
			System.out.println("Consonants: " + consonants);


	}

}
