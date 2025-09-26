package programs;
class Animal3{
	void sound() {
		System.out.println("Animal Makes sound");
	}
}
class Dog3 extends Animal3{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat4 extends Animal3{
	void sound() {
		System.out.println("Cat meows");
	}
}
public class RunTime {
	public static void main(String[] args) {
		Animal3 a = new Dog3();
		a.sound();
		Animal3 b=new Cat4();
		b.sound();
}}
