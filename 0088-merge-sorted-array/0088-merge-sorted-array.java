class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pm = m - 1, pn = n - 1;
        int p = m + n - 1;

        while(pn >= 0) {
            if(pm >= 0 && nums1[pm] > nums2[pn]) {
                nums1[p--] = nums1[pm--];
            } else {
                nums1[p--] = nums2[pn--];
            }
        }
    }
}