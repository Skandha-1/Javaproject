package programs;
class Calc{
	int add(int a,int b) {
	return a+b;
}
double add(double a,double b) {
	return a+b;
}
String add(String a ,String b) {
	return a+" "+b;
}
public class ComplieTime {
}

	public static void main(String[] args) {
		Calc c=new Calc();
		c.add(12, 50);
		c.add(15, 50);

	}

}
