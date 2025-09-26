package programs;

public class StringImmutabilityDemo {

	public static void main(String[] args) {
		String original ="hello";
		String upper =original.toUpperCase();
		System.out.println("Original :"+original);
		System.out.println("Uppercase"+ upper);
		
		//Example to show immutablilty:
		original.concat("World");
		System.out.println("After concat (WIthout assignmaent:"+ original);
		original=original.concat("World");
		System.out.println("After concat (with asssignment):"+original);
		
		//lowerCase
		String original1="SKANDHA";
		String lower=original1.toLowerCase();
	   System.out.println("LowerCase :"+lower);
	   
	   System.out.println("Char conact");
	   char[] chars={'H','e','l','l','o'};
	   String str=new String(chars);
	   System.out.println("Concat char :"+str);
	    
	   
	}

}
