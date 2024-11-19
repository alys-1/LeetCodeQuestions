class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      HashMap<Integer, Integer> hm = new HashMap<>();
      for(int i= 0; i<nums.length; i++){
        hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
      }
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i :  hm.keySet()){
        if(hm.get(i) > 1){
            arr.add(i);
        }
      }
      int[] arrr = new int[arr.size()];
      for(int i = 0; i< arr.size(); i++){
        arrr[i] = arr.get(i);
      } 
      return arrr; 
    }
}