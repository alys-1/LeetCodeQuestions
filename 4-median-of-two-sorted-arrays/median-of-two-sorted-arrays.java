import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] merged = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) merged[k++] = a[i];
        for (int i = 0; i < m; i++) merged[k++] = b[i];

        Arrays.sort(merged);
        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2];
        } else {
            int mid1 = merged[total / 2 - 1], mid2 = merged[total / 2];
            return ((double) mid1 + (double) mid2) / 2.0;
        }
    }
}
