package collections;
import java.util.HashMap;
import java.util.Map;
 
public class MapExample {
 
	public static void main(String[] args) {
		Map<Integer,String> employees = new HashMap<>();
		
		//put
		employees.put(101, "John");
		employees.put(102, "Alice");
		employees.put(103, "Bob");
		System.out.println(employees);
 
		//get key
		System.out.println(employees.get(101));
		
		//remove(key)
		employees.remove(101);
		System.out.println(employees);
		
		//containskey(key)
		System.out.println(employees.containsKey(101));
		
		//containsValue(value)
		System.out.println(employees.containsValue("Alice"));
		
		//size()
		System.out.println(employees.size());
		
		//isEmpty()
		System.out.println(employees.isEmpty());
		
		//KeySet()
		System.out.println(employees.keySet());
		
		//values()
		System.out.println(employees.values());
		
		//entrySet()
		System.out.println("Iterating entries");
		for(Map.Entry<Integer,String> entry : employees.entrySet()) {
			System.out.println("Id : " + entry.getKey() + ", Name: " + entry.getValue());
		}
		//clear
		employees.clear();
		System.out.println(employees);
	}
 
}
 
 