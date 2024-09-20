package tasks.tasks_7;

import java.util.*;



public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Adding employee IDs and names
        employeeMap.put(1001, "Alice");
        employeeMap.put(1003, "Charlie");
        employeeMap.put(1002, "Bob");
        employeeMap.put(1005, "Eve");
        employeeMap.put(1004, "David");

        // Displaying the TreeMap sorted by employee ID
        System.out.println("Employee ID and Names (sorted by ID):");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
	}

}
