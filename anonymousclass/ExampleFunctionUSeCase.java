package anonymousclass;

import com.google.common.base.Function;

public class ExampleFunctionUSeCase {

	public static void main(String[] args) {
		Function<String,Integer> getLength = str ->str.length();
		System.out.println("Length of 'Skandha' "+ getLength.apply("Skandha"));
		System.out.println("Length of 'Jain' :"+ getLength.apply("Jain"));
		
	}

}
