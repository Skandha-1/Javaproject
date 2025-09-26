package programs;

public class Palindrome {
public static void main(String[] agrs) {
	int num =121;
	int temp =num;
	int rev=0;
	while (num>0) {
		int digit =num%10;
		rev=(rev*10)+digit;
		num/=10;
	}
	if (temp++==rev){
		System.out.println("Is a Palindrome");
}else {
	System.out.println("Is not Palindrome");
}
	
	
}
}
