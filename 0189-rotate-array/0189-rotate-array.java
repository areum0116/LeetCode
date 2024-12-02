class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] tmp = new int[n];
        int idx = 0;
        for (int i = n - k; i < n; i++)
            tmp[idx++] = nums[i];
        for (int i = 0; i < n - k; i++)
            tmp[idx++] = nums[i];
        System.arraycopy(tmp, 0, nums, 0, n);
    }
}