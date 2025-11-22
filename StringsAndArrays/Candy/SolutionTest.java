package Candy;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void candyTestOne() {
        Solution solution = new Solution();
        int[] ratings = {1,6,10,8,7,3,2};
        assertEquals(18, solution.candy(ratings));
    }

    @Test
    public void candyTestTwo() {
        Solution solution = new Solution();
        int[] ratings = {1,2,87,87,87,2,1};
        assertEquals(13, solution.candy(ratings));
    }

    @Test
    public void candyTestThree() {
        Solution solution = new Solution();
        int[] ratings = {1,3,2,2,1};
        assertEquals(7, solution.candy(ratings));
    }

}