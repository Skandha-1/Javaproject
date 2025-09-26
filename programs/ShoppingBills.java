package programs;
import java.util.Scanner;
public class ShoppingBills {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//nextline
		System.out.println("Enter a full Name");
		String fullName = sc.nextLine();
		//nextInt
		System.out.println("Enter age:");
		int age =sc.nextInt();
		
		System.out.println("Enter Gender");
		String gender =sc.next();
		
		System.out.println("Eneter cgpa");
		double cgpa =sc.nextDouble();
		
		System.out.println("Enter a height ");
		float height =sc.nextFloat();
		
		System.out.println("enter a phoneNumber");
		long phoneNo=sc.nextLong();
		
		System.out.println("are you an international");
		boolean isInternational = sc.nextBoolean();
		
		System.out.println("Name "+fullName);
		System.out.println("Age "+age);
		System.out.println("Gender "+gender);
		System.out.println("CGPA "+cgpa);
		System.out.println("Height "+height);
		System.out.println("PhoneNumber "+phoneNo);
		System.out.println("international "+isInternational);
				
	}

}
