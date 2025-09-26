package programs;

public class OneDArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Declare the array
		int[] numbers= {10,20,30,40,50};
		
		//2.Declaration +Instantiation,then Initialization
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
	   
		//traverse and print the elements
		System.out.println("1D array Elements");
		for (int i=0;i<numbers.length;i++){
			System.out.println("Elements at index"+i +": "+ numbers[i]);
			
		}
		
	}

}



