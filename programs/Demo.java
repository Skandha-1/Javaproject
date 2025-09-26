package programs;
public class Demo{
	public int x =10;
	private int y=20;
	protected int  z=30;
	int w =40;
	
	public void show() {
		System.out.println("public x:"+ x);
		System.out.println("public y:"+ y);
		System.out.println("public z:"+ z);

	}
}
 class AccessModifier  {

	public static void main(String[] args) {
			Demo d= new Demo();
			d.show();
			System.out.println("Acess public x:"+d.x);
			System.out.println(d.z);
			System.out.println(d.w);
	}

}
