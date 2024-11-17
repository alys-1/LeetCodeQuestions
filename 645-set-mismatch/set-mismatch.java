class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        Set<Integer> s = new HashSet<>();
        for(var num : nums){
            if(s.contains(num)){
                arr[0] = num;
            }
            s.add(num);
        }
        for(int i = 0; i<=  nums.length; i++){
            if(!s.contains(i)){
                arr[1] = i; 
            }
        }
        return arr;
    }
}