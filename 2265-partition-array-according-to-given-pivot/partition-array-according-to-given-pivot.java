import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> pivots = new ArrayList<>();
        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                pivots.add(num);
            }
        }

        int index = 0;
        for (int num : left) {
            res[index++] = num;
        }
        for (int num : pivots) {
            res[index++] = num;
        }
        for (int num : right) {
            res[index++] = num;
        }

        return res;
    }
}
