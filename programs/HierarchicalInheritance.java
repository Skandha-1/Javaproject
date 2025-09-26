package programs;
class car{
	void drive() {
		System.out.println("It dirves a car");
	}
}
class BMW extends car{
	void speed() {
		System.out.println("The spped capacity is more");
	}
	
}
class Swift extends car{
	void engine() {
		System.out.println("The engine is vey slow");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		BMW b= new BMW();
		Swift s=new Swift();
		b.drive() ;
		s.engine();
		b.speed();
		

	}

}
