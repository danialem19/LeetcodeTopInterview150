package BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = -1, min = Integer.MAX_VALUE;
        for (int p : prices) {
            if(p < min) {
                min = p;
            } else {
                profit = Math.max(profit, p - min);
            }
        }
        return profit;
    }
}
