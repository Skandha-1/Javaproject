package programs;

public class CountEvenOdd {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int target = 30;
		boolean found = false;
		for (int num : arr) {
		    if (num == target) {
		        found = true;
		        break;
		    }
		}
		System.out.println(found ? "Found" : "Not Found");// TODO Auto-generated method stub

	}

}
