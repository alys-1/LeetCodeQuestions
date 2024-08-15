class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Calculate mid index to prevent overflow

            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] > target) {
                high = mid - 1;  // Search in the left half
            } else {
                low = mid + 1;  // Search in the right half
            }
        }

        return -1;  // Target not found
    }
}
