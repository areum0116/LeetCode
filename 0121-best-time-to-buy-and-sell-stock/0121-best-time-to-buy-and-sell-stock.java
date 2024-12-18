class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        int profit = 0;
        for (int price : prices) {
            if(price < min) {
                min = price;
                max = price;
            }
            if(max < price)
                max = price;
            profit = Math.max(max - min, profit);
        }
        return profit;
    }
}