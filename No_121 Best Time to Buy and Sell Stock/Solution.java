public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int maxPrice = prices[prices.length - 1];
        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice - prices[i]);
        }

        return maxProfit;
    }
}