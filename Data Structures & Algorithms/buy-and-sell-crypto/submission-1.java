class Solution {
    public int maxProfit(int[] prices) {
        int fmin = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < fmin) {
                fmin = prices[i];
            }

            int fmax = prices[i] - fmin;
            profit = Math.max(profit, fmax);
        }

        return profit;
    }
}