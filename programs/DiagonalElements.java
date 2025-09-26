package programs;

public class DiagonalElements {

	public static void main(String[] args) {

		int[][] matrix = {{1, 2}, 
			          {5, 4}};
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
	    sum =sum+ matrix[i][i];
	}
	System.out.println("Diagonal Sum: " + sum);


	}

}
