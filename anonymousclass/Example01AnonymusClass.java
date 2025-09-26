package anonymousclass;
//interface
interface Greeting{
	void sayHello();
}
public class Example01AnonymusClass {

	public static void main(String[] args) {
		//Anonymous class implementation
		Greeting greet = new Greeting() {
			public void sayHello() {
				System.out.println("Hello from Anonymous Class!");
			}
		};
		greet.sayHello();
	}

}
