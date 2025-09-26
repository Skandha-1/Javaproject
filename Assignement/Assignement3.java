package Assignement;
class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	 int add(int a,int b,int c) {
		return a+b+c;
	}
	 double add(double a, double b) {
		 return a+b;
}  }
public class Assignement3 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
        System.out.println(c.add(45, 50));
        System.out.println(c.add(10, 20,45));
        System.out.println(c.add(5.2350, 10.2358));
	}

}
