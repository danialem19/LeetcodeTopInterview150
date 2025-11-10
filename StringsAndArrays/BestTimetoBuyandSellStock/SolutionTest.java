package BestTimetoBuyandSellStock;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

   @Test
   public void maxProfit_testOne() {
       Solution solution = new Solution();
       int[] prices = {7,1,5,3,6,4};
       assertEquals(5, solution.maxProfit(prices));
   }

    @Test
    public void maxProfit_testTwo() {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        assertEquals(0, solution.maxProfit(prices));
    }
}