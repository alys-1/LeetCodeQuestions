class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                count++;
                if (count > 1) return false; 
                
            
                if (i > 1 && nums[i - 2] >= nums[i] && i + 1 < nums.length && nums[i - 1] >= nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
