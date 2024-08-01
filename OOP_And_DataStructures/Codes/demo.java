import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        // Initialize variables
        String abc = "hello";
        int i = 7;
        int j = 9;
        int k = 8;

        // Create the outer map
        Map<Map<String, Integer>, Integer> outerMap = new HashMap<>();

        // Create and populate the first inner map
        Map<String, Integer> innerMap1 = new HashMap<>();
        innerMap1.put(abc, 1);

        // Add the first inner map to the outer map with an associated integer value
        outerMap.put(innerMap1, 1);

        // Create and populate the second inner map
        Map<String, Integer> innerMap2 = new HashMap<>();
        innerMap2.put(abc, 2);

        // Add the second inner map to the outer map with an associated integer value
        outerMap.put(innerMap2, 2);

        // Print the outer map
        for (Map.Entry<Map<String, Integer>, Integer> entry : outerMap.entrySet()) {
            System.out.println("Inner Map: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
    }
}
