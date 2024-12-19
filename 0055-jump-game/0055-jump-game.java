class Solution {
    public boolean canJump(int[] nums) {
        int goal = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > goal) return false;
            goal = Math.max(goal, i + nums[i]);
        }
        return true;
    }
}