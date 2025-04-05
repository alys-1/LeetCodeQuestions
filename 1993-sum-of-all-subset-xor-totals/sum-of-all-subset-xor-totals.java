class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int ts = 0;
        for(int i = 0; i< (1 << n); i++){
            int sx = 0;
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    sx ^= nums[j];

                }
            }
            ts += sx;
        }
        return ts;
    }
}