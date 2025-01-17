class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hs.put(nums[i], hs.getOrDefault(nums[i],0) + 1);
            if(hs.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return 0;
        
    }
}