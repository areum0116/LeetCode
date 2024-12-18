class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int total = 0;
        for(int i = 1; i < prices.length; i++) {
            if(min < prices[i]) total += prices[i] - min;
            min = prices[i];
        }
        return total;
    }
}