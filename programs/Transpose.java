package programs;

public class Transpose {
public static void main (String[] args) {

	int[][] matrix = {{1, 2}, {3, 4}};
	int rows = matrix.length, cols = matrix[0].length;
	int[][] transpose = new int[cols][rows];
	for (int i = 0; i < rows; i++) {
	    for (int j = 0; j < cols; j++) {
	        transpose[j][i] = matrix[i][j];
	  
	      System.out.print(transpose[j][i]+" ");
	}
}
}
}