class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int l = 1;

                while(set.contains(num + l)){
                    l++;
                }
                res = Math.max(l, res);
            }
            
        }
        return res;
    }
}