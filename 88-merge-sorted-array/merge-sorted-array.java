class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Indexes for nums1, nums2, and the merged array
        int i = m - 1; // Last element of nums1's initial part
        int j = n - 1; // Last element of nums2
        int k = m + n - 1; // Last element of merged array
        
        // Merge nums1 and nums2 starting from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // If nums2 still has elements, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
