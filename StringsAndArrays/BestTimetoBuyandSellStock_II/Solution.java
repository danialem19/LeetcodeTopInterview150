package BestTimetoBuyandSellStock_II;

public class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE, profit = 0;
        for (int p : prices) {
            if (p > minValue) {
                profit += (p - minValue);
            }
            minValue = p;
        }
        return  profit;
    }
}
