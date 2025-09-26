package programs;

public class ConditionalStatements {

	public static void main(String[] args) {
//Simple if
		double cartValue =1200;
		if(cartValue>1000) {
			System.out.println("Simple if: You are eligible for a free gift!");
		}
		//else if 
		boolean isPremiumMember =true;
		if(isPremiumMember) {
			System.out.println("you get 20% hike");
		}
		else {
			System.out.println("you get 5% off");
		}
		
		//Example 3:If else ladder
		int points=1000;
				if(points <50) {
					System.out.println("Bronze member");
				}
				else if (points <200) {
					System.out.println("Gold member");
				}else {
					System.out.println("Platinum Member");
					
				}
				
			// Traditional Switch statement
				
				int paymentMethod =2;
				switch (paymentMethod) {
				case 1:
					System.out.println("Payment on credit card");
				case 2:
					System.out.println("Payment by upi");
				case 3:
					System.out.println("Payment by wallet");
				default:
					System.out.println("Payment method not recognized");
				}
				
		//Example 5: Enhanced Switch (java 14+)
				int deliveryDay =6;
				String deliveryType =switch(deliveryDay) {
				case 1,2,3,4,5->"Week day delivery";
				case 6,7->"Weekday Delivery --extra charges apply";
				default ->"Invalid";
				};
				System.out.println(deliveryType);
		}
	}
	
	

