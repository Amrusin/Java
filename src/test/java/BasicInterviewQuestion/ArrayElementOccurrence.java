package BasicInterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementOccurrence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 2};
        // Create a HashMap to store element counts
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array and update the counts in the HashMap
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        System.out.println("Element Occurrences:");
        for (int num : map.keySet()) {
            System.out.println(num + ": " + map.get(num));
        }
    }
}