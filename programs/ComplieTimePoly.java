package programs;
class Calc1{
	int add(int a,int b) {
	return a+b;
}
double add(double a,double b) {
	return a+b;
}
String add(String a ,String b) {
	return a+" "+b;
}}
public class ComplieTimePoly {

	public static void main(String[] args) {
		Calc1 c=new Calc1();
		System.out.println( c.add(12, 50));
		System.out.println(c.add(15, 50));

	}

}