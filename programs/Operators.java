package programs;
 
public class Operators {
 
	public static void main(String[] args) {
		
		int a = 10, b = 5;
		int applePrice = 10,mangoPrice = 5;
		int appleQty = 3,mangoQty = 2;
		//Arithmetic Operators
			int totalApples = applePrice + appleQty;
			int totalMangoes = mangoPrice * mangoQty;
			int totalBill = totalApples + totalMangoes;
			System.out.println(totalApples);
			System.out.println(totalMangoes);
			System.out.println(totalBill);
			System.out.println("Avg cost per item" + totalBill / (appleQty + mangoQty));
			System.out.println("Bill reminder if split among 3 friends" + (totalBill % 3));
			
			
		//Relational Operators
			System.out.println(applePrice == mangoPrice);
			System.out.println(applePrice > mangoPrice);
			System.out.println(mangoPrice <= applePrice);
			
		//Bitwise operators
			int discountCode1 = 10; //1010
			int discountCode2 = 5; //0101
			System.out.println("AND" + (discountCode1 & discountCode2));
			System.out.println("OR" + (discountCode1 | discountCode2));
			System.out.println("NOT" + (~discountCode1 ));
			System.out.println("XOR" + (discountCode1 ^ discountCode2));
			System.out.println("Double DiscountCode1: " + (discountCode1 << 1));
			System.out.println("Half discountCode1" + (discountCode1 >> 1));
			
		//Logical Operators
			
			boolean hasCoupon = true;
			boolean hasMembership = false;
			System.out.println(hasCoupon && hasMembership);
			System.out.println(hasCoupon || hasMembership);
			System.out.println(!hasCoupon);
			
		//Assignment operators
			int walletBalance = 100;
			System.out.println(walletBalance);
			walletBalance -= totalBill; //deduct bill
			System.out.println(walletBalance);
			walletBalance += 20;
			System.out.println(walletBalance);
		
		//Unary Operators
			int cartItems = 5;
			System.out.println(cartItems);
			System.out.println(++cartItems);
			System.out.println(cartItems++);
			System.out.println(cartItems);
			System.out.println(--cartItems);
			System.out.println(cartItems--);
			System.out.println(cartItems);
			System.out.println(~cartItems);
			
		//Ternary operators
			int maxPrice = (applePrice >mangoPrice) ? applePrice : mangoPrice;
			System.out.println(maxPrice);
			
 
	        // Arithmetic Operators
	        System.out.println("Addition: " + (a + b));
	        System.out.println("Subtraction: " + (a - b));
	        System.out.println("Multiplication: " + (a * b));
	        System.out.println("Division: " + (a / b));
	        System.out.println("Modulus: " + (a % b));
 
	        // Relational Operators
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a == b: " + (a == b));
 
	        // Logical Operators
	        boolean x = true, y = false;
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));
 
	        // Assignment Operators
	        int c = a;
	        c += b;
	        System.out.println("c after += b: " + c);
	}
}
 
 
 
 