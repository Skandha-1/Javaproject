package Assignement;
class Animal{
	void sound() {
		System.out.println("Some genereic animal sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dogs Barks");
	}

}
class Cat extends Animal{
	public void sound() {
		System.out.println("Cat Meows");
	}
}
public class Assignement2 {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.sound();
		Animal d =new Dog();
		d.sound();

	}

}
