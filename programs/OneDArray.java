package programs;

public class OneDArray {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		System.out.println("Traverse a 1D array");
		for (int arr:numbers) {
		System.out.println(arr);}
		
		
		int sum=0;
		int[] arr= {10,20,30,40,50};
		for (int i=0;i<arr.length;i++){
		  sum=sum+arr[i];
		}
		System.out.println(sum);
		
	 
		int[] numbers1= {20,35,85,69};
		int max=numbers[0];
		for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] > max) {
                max = numbers1[i];

	}
		}  System.out.println(max);

		}}	
