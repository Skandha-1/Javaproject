package programs;

public class Loops {

	public static void main(String[] args) {
		// For loop
		System.out.println("For loop");
		for (int i=1;i<=5;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//while loop
		System.out.println("While loop");
		int j=5;
		while(j>=1) {
			System.out.print(j+" ");
			j--;
		}
		
	System.out.println("Do While");
	int k=1;
	do {		
		System.out.print(k + " ");
		k++;	}   
	while (k<=5);
   	System.out.println();
    	
   	
   	//for each (enhanced for loop)
   	String[] products= {"Laptop","Phone","Headphone","Mouse"};
   	System.out.println("products available in the store");
   	for (String product:products) {
   		System.out.println(product);
   	}
}
}

