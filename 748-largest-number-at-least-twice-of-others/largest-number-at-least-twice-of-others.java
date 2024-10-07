class Solution {
    public int dominantIndex(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int l = clone[nums.length- 1];
        int p = clone[nums.length- 2];
        if( l >= 2 * p ){
            for(int i = 0; i< nums.length; i++){
                if(nums[i] == l){
                    return i;
                }
            }
        }
       return -1; 
    }
}