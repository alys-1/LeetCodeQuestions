class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int c1 = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                for(int j = i+1; j< nums.length; j++){
                    nums[j] -= nums[i];
                }
                c1++;
            }
        }
        return c1;
    }
}