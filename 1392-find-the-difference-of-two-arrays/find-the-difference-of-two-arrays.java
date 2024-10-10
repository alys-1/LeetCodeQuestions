import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        
        List<Integer> onlyInNums1 = new ArrayList<>(set1);
        onlyInNums1.removeAll(set2);

        
        List<Integer> onlyInNums2 = new ArrayList<>(set2);
        onlyInNums2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(onlyInNums1);
        result.add(onlyInNums2);

        return result;
    }
}
