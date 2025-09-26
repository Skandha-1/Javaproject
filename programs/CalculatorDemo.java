package programs;
class Calculator{
	//non static method
		int add(int a, int b) {
			return a+b;
		}
	//static method
			static int multiply(int a,int b) {
			return a*b;
		}}
		
public class CalculatorDemo {

	public static void main(String[] args) {			
			Calculator cal=new Calculator();
			int sum =cal.add(10,20);
			System.out.println("Add"+sum);
			int mul=Calculator .multiply(5,4);
			System.out.println("multiplication"+mul);

	

	

}
	}


