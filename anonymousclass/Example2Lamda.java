package anonymousclass;

interface GreetingHello{
	void sayHello();
}

public class Example2Lamda {

	public static void main(String[] args) {
		GreetingHello greet=() -> System.out.println("Hello from Lamda!");
		greet.sayHello();
	}

}
