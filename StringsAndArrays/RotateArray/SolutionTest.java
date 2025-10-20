package RotateArray;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void rotate () {
        int[] nums = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate(nums, 3);
        assertEquals(5, nums[0]);
        assertEquals(6, nums[1]);
        assertEquals(7, nums[2]);
        assertEquals(1, nums[3]);
        assertEquals(2, nums[4]);
        assertEquals(3, nums[5]);
        assertEquals(4, nums[6]);
    }
}