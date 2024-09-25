class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i< nums1.length; i++){
            hs.add(nums1[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< nums2.length; i++){
            if(hs.contains(nums2[i])){
                arr.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        int []arr2 = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++){
            arr2[i] = arr.get(i);
        }
        return arr2;
    }
}