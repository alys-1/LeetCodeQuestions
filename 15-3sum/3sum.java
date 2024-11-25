class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int a,b;
        Arrays.sort(nums);
        Set<List<Integer>> al = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            a = i+1;
            b = nums.length - 1;
            while( a < b){
                if(nums[a] + nums[b] == -(nums[i])){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[a]);
                    l.add(nums[b]);
                    al.add(l);
                    // while(a < b && nums[a] == nums[a+1]){
                    //     a++;
                    // }
                    // while(a < b && nums[b] == nums[b-1]){
                    //     b--;
                    // }
                    a++;
                    b--;
                }else if(nums[a] + nums[b] > -(nums[i])){
                    b--;
                }else{
                    a++;
                }
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        l.addAll(al);
        return l;
    }
}