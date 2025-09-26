package programs;

public class Caluclator1 { 
	static int a=12;
	public int x =10;
    int b=13;
	public static int add(int a,int b) {
		return a+b;
}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public static int modulus(int d,int e) {
	return d%e;
	}
	public static void main(String[] args) {
		Caluclator1 cal=new Caluclator1() ;
		//static using class name
		int a =Caluclator1.add(10,12);
		//non staitc using object name
		int b=cal.mul(12,5);
		int f =Caluclator1.modulus(35,89);
		int c=cal.div(15, 3);
		System.out.println("Addition :" + a);
		System.out.println("Mul :" +b);
		System.out.println("Divsion"+c);
		System.out.println("Divsion"+f);

		}
		}
	
