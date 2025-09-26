package programs;
class Animal2{
	public int a=10;
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal2{
	void bark() {
		System.out.println("Dog barks");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.bark();

	}

}
