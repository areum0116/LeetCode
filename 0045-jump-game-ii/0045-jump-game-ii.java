class Solution {
    public int jump(int[] nums) {
        int count = 0, curEnd = 0, curFarthest = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if(i == curEnd) {
                count++;
                curEnd = curFarthest;
            }
        }
        return count;
    }
}