package Assignement;

public class ArrayAcessExample {

	public static void main(String[] args) {
		int[] productsIds= {1011,123,456};
		try {
			System.out.println("Array index out of bound"+productsIds[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("All execution is correct");
		}
	}

}
