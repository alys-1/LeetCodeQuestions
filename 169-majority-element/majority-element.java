class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i< n; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
            if(hash.get(nums[i] )> n/2){
                return nums[i];
            }
        }
        return 0;
        
        
    }
}