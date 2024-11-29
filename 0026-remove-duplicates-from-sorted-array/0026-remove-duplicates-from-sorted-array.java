class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIdx = 0;
        int nextIdx = 0;

        while(nextIdx < nums.length) {
            if(nums[nextIdx] != nums[insertIdx]) {
                nums[++insertIdx] = nums[nextIdx];
            }

            ++nextIdx;
        }
        return ++insertIdx;
    }
}