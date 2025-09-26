package programs;
class Animal1{
	int legs=4;
	String colour="White";
	void eat()
	{
		System.out.println("I am veg cat");
	}
	void bark() {
		System.out.println("Meow Meow Meow");
	}
	
	
}
public class Animal {

	public static void main(String[] args) {
		Animal1 cat=new Animal1();
		System.out.println(cat.legs);
		System.out.println(cat.colour);
		cat.eat();
		cat.bark();
	}

}
