import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

       
        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num); 
                }
                countMap.remove(num); 
            }
        }

        // Step 3: Handle remaining elements in arr1 that were not in arr2
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();  // Get the number
            int count = entry.getValue();  // Get the frequency of that number
            for (int i = 0; i < count; i++) {
                remaining.add(num);  // Add it to the remaining list count times
            }
        }

        
        Collections.sort(remaining);
        result.addAll(remaining); 

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
