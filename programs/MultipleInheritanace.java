package programs;
interface Website {
	 void webpage();
}
interface Application{
	void webapp();
}
class ABC implements Website,Application{
	@Override
	public void webpage() {
		System.out.println("The Web  page will displays");
	}
	@Override
	public void  webapp() {
		System.out.println("The web app will show");
	}
}
public class MultipleInheritanace {

	public static void main(String[] args) {
		ABC w=new ABC();
		w.webapp();
		w.webpage();

	}

}
