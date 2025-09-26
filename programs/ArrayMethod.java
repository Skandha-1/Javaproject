package programs;
import java.util.Arrays;
public class ArrayMethod {

	public static void main(String[] args) {
				int[] numbers = {50,10,20,20,30};
				//1.toString() array - string
				System.out.println("Original Arrays :"+Arrays.toString(numbers));
				
				//2.Sort() - sort in ascending order
				Arrays.sort(numbers);
				System.out.println("Original Array :"+Arrays.toString(numbers));
				
				//3.CopyOf() - create a new array with same values
				int[] copyArray = Arrays.copyOf(numbers, numbers.length);
				System.out.println("Original Array :"+Arrays.toString(copyArray));
				
				//4.fill() - Fill entire array with one value
				int[] filledArray = new int [5];
				Arrays.fill(filledArray,99);
				System.out.println("FilledArray :"+Arrays.toString(filledArray));
				
				//5.equals() - compare two arrays
				boolean isEqual = Arrays.equals(numbers,copyArray);
				System.out.println("Number==copyArray ? :"+isEqual);
				
				//6.compare() - Compare
				int result = Arrays.compare(numbers, copyArray);
				System.out.println("Original Array :"+result);
			}
		 
		}
		 
		 
