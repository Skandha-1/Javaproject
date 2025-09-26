package collections;
import java.util.ArrayList;
import java.util.List;
public class ListExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		//add()
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		System.out.println("fruits "+fruits);

		//add(index,element)
		fruits.add(1,"Oranage");
		System.out.println("After addind aorabnage");
		//get(index)
		System.out.println("After adding at index 1"+fruits);
		
		//set(index element)
		fruits.set(2,"Grapes");
		System.out.println("After replacing index 2:"+fruits);
		
		//remove(index)
		fruits.remove(0);
		System.out.println("After removing Manago"+fruits);
		//remove(object)
		fruits.remove("Mango");
		System.out.println("After removing "+fruits);
		//Size()
		System.out.println("Size:"+fruits.size());
		//contains(object)
		System.out.println("Contains Grapes"+fruits.contains("Grapes"));
		//isemepty
		System.out.println("Is list empty"+fruits.isEmpty());
		//indexOd(object
		System.out.println(("Index of raoes"+fruits.indexOf("Grapes")));
		//lastindexof(object)
		fruits.add("Orange");
		System.out.println("THe last indecx"+fruits);
		//clear
		fruits.clear();
		System.out.println("The clear fruits"+fruits);
	}
	


}
