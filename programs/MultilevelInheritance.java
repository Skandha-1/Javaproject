package programs;
class Device{
	void Ring() {
		System.out.println("The phone rins when someone calls");
	}

}
class Oneplus extends Device{
	void feature() {
		System.out.println("The phone have many features");
	}
	
}
class battery extends Oneplus{
	void batterypower() {
		System.out.println("The battery level is good");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		battery d1 =new battery();
		d1.Ring();
		d1.feature();
		d1.batterypower();
		
		
		
		

	}

}
