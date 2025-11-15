package ProductOfArrayExceptSelf;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void productExceptSelf() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4};
        int[] product = solution.productExceptSelf(nums);
        assertEquals(24, product[0]);
        assertEquals(12, product[1]);
        assertEquals(8, product[2]);
        assertEquals(6, product[3]);
    }

}