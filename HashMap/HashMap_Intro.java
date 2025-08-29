import java.util.*;

public class HashMap_Intro {
    public static void main(String[] args){
        HashMap<String, Integer> population = new HashMap<>();

        // Adding key-value pairs to the HashMap
        population.put("India", 1400000000);
        population.put("USA", 331000000);
        population.put("China", 1440000000);
        population.put("Brazil", 213000000);
        population.put("Nigeria", 206000000);
        population.put("Russia", 146000000);
        
        // Displaying the HashMap
        System.out.println("Population Map: " + population);

        // Get the population of a specific country
        System.out.println("Population of India: " + population.get("India"));

        // Check if a key exists
        System.out.println("Does USA exist in the map? " + population.containsKey("USA"));

        // Check if a value exists
        System.out.println("Is there a country with population 331000000? " + population.containsValue(331000000));

        // Remove a key-value pair
        population.remove("Brazil");

        // Displaying the updated HashMap
        System.out.println("Updated Population Map: " + population);

        // Iterating through the HashMap
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Population: " + entry.getValue());
        }

        // Size of the HashMap
        System.out.println("Size of the population map: " + population.size());

        // Clear the HashMap
        population.clear();
        System.out.println("Population map after clearing: " + population);

        // Check if the HashMap is empty
        System.out.println("Is the population map empty? " + population.isEmpty());

        // Demonstrating that HashMap allows null keys and values
        population.put(null, 0);

        population.put("Unknown", null);
        System.out.println("Population map with null key and value: " + population);

        // Final size of the HashMap
        System.out.println("Final size of the population map: " + population.size());

        // End of the program
        System.out.println("End of HashMap demonstration.");

        // Note: HashMap does not maintain any order of its elements.
        // If order is needed, consider using LinkedHashMap or TreeMap.
        // HashMap is not synchronized. For thread-safe operations, consider using ConcurrentHashMap.
        // HashMap allows one null key and multiple null values.
        // HashMap provides average O(1) time complexity for get and put operations.
        // HashMap is not suitable for scenarios where order of elements matters.
        // Always consider the load factor and initial capacity for performance tuning.
        // HashMap is part of the Java Collections Framework and implements the Map interface.
        // HashMap is widely used for its efficiency in key-value pair storage and retrieval.
        // HashMap is not suitable for scenarios where order of elements matters.
    }
}