package collections;

import java.util.*;


public class SetExample {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		
		//add
		names.add("Skandha");
		names.add("Sagar");
		names.add("ANkush");
		names.add("Alice");
		System.out.println("Names "+names);
		
		//remove(object)
		names.remove("Alice");
		System.out.println("Contains Alice "+ names.contains("Alice"));
		
	//size()
		System.out.println("Size"+names.size());
	//isEmpty()
		System.out.println("IS EMPTY"+names.isEmpty());
		//clera()
		names.clear();
		System.out.println("After clear "+ names);
	}

}
