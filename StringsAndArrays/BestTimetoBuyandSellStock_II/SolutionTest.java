package BestTimetoBuyandSellStock_II;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void maxProfit() {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int profit = solution.maxProfit(prices);
        assertEquals(7, profit);
    }

    @Test
    public void maxProfit_one() {
        Solution solution = new Solution();
        int[] prices = {1,2,3,4,5};
        int profit = solution.maxProfit(prices);
        assertEquals(4, profit);
    }

    @Test
    public void maxProfit_two() {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit);
    }

}