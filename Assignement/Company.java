package Assignement;

import java.util.*;

public class Company {
	    public static void main(String[] args) {
	        Map<Integer, String> employees = new HashMap<>();

	        // Add employee data
	        employees.put(001, "Alice ");
	        employees.put(002, "Skandha");
	        employees.put(003, "Ankush");
	        employees.put(004, "Sagar");
	        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
	            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }
	}
