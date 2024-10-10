class Solution {
    public int largestAltitude(int[] gain) {
       int []nums =new int[gain.length+1];
       nums[0] = 0;
       for(int i = 1; i< nums.length; i++){
        nums[i] = nums[i-1] + gain[i - 1];
       } 
       Arrays.sort(nums);
       return nums[nums.length - 1];
    }
}