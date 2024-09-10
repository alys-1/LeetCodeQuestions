class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int idx = 0;
            while(nums1[i] != nums2[idx]){
                idx++;

            }
            while(idx < nums2.length){
                if(nums1[i] < nums2[idx]){
                    break;
                }idx++;
            }
            if(idx == nums2.length) {
                nums1[i] = -1;
            }
            else nums1[i] = nums2[idx];
        }
        return nums1;
    }
}