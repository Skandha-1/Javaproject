package programs;
class laptop{
	String brands;
	int ramSize;
	//default constructoer 
	laptop(){
		brands="HP";
		ramSize=8;
		System.out.println(brands+ramSize);
		
	}
	 void display() {
        System.out.println("Displaying web page on " + brands + " laptop.");

	}

    static void laptopInfo() {
        System.out.println("Laptops are portable computers used for various tasks.");
    }
}

public class Mobile {

	public static void main(String[] args) {
		laptop lap=new laptop();
		laptop.laptopInfo();
		lap.display();
		
	}

}
