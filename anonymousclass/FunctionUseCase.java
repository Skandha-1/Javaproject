package anonymousclass;

import com.google.common.base.Function;

public class FunctionUseCase {

	public static void main(String[] args) {
		Function<String, Integer> getLength = new Function<String, Integer>() {
            
            public Integer apply(String str) {
                return str.length();
            }
        };
 
        System.out.println(getLength.apply("Hello"));
        System.out.println(getLength.apply("Selenium"));
    }
}

