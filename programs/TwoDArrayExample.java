package programs;

public class TwoDArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and initialize a 2D array
		int[][]matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		//Traverse and print elements
		System.out.println("2D array elements");
		System.out.println("For each loop");
		for (int[] element :matrix) {
			for (int element2: element) {
				System.out.print(element2+" ");
			}
			System.out.println(" ");
 }
 
 
		System.out.println("Normal for loop");
 
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
	 }
			System.out.println(" ");
 }
}

}
