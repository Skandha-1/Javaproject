package programs;
interface A{
	void methodA();
}
interface B{
	void methodB();
}
class C implements A ,B{
	public void methodA() {
		System.out.println("method A");
	}
	public void methodB() {
		System.out.println("Method B");
	}
}
class D extends C{
	public void methodD() {
		System.out.println("Method D");
	
	}
}
public class Hybrid {

	public static void main(String[] args) {
		D d1=new D();
		d1.methodD();
		d1.methodB();
		d1.methodA();

	}

}
