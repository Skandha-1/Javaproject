package Assignement;
import java.util.HashMap;
import java.util.Map;

public class HrSystem {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Alice");
        employees.put(2, "Bob");
        employees.put(3, "Charlie");
        System.out.println("Approach 1:");
        for (Integer id : employees.keySet()) {
            System.out.println("Employee ID: " + id + ", Name: " + employees.get(id));
        }
        System.out.println("\nApproach 2:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

