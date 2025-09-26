package anonymousclass;

import java.util.ArrayList;
import java.util.List;

public class Exampe3Generic {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Skandha");
		names.add("Jain");
		
		for (String name:names) {
			System.out.println(name);
		}
	}

}
