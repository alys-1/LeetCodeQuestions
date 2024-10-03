class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] nums1 = nums.clone();
        Arrays.sort(nums1);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i< nums1.length; i++){
           if(!hm.containsKey(nums1[i])) {
            hm.put(nums1[i], i);
            }
           
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = hm.get(nums[i]);
        }
        return nums;
    }
}