package programs;

public class Fibonacci {

	public static void main(String[] args) {
		int num=10,first=0,second=1;
		for (int i=2;i<=num;i++){

			int next=first+second;
			System.out.println(" "+next);
			first=second;
			second=next;
			

	}

}}
