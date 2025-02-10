class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(arr[i])){
             hm.put(arr[i], i);
            }
        }
        for(int i= 0; i <nums.length; i++){
            nums[i] = hm.get(nums[i]);
        }
        return nums;
    }
}