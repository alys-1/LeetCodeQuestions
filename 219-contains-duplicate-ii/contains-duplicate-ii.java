class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);
            }else{
                int previdx = hm.get(nums[i]);
                int diff = i - previdx;
                if(k >= diff){
                    return true;
                }
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}