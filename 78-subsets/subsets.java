class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0, list, nums, new ArrayList<>());
        return list;
    }
    public void helper(int index, List<List<Integer>> list, int nums[], List<Integer> ds){
        list.add(new ArrayList<>(ds));
        for(int i = index; i < nums.length;  i++){
            ds.add(nums[i]);
            helper(i + 1, list,nums, ds);
            ds.remove(ds.size() - 1);
        }
    }
}