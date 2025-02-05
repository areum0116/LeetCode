class Solution {
    public boolean stoneGame(int[] piles) {
        int[] dp = Arrays.copyOf(piles, piles.length);
        for(int i = 1; i < piles.length; i++) {
            for(int j = 0; j < piles.length - i; j++) {
                dp[j] = Math.max(piles[j] - dp[j + 1], piles[j + i] - dp[j]);
            }
        }
        return dp[0] > 0;
    }
}