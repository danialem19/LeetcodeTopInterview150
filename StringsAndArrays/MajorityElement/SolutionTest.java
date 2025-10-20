package MajorityElement;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMajorityElement_one() {
        Solution solution = new Solution();
        int[] nums = {3,2,3};
        assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    public void testMajorityElement_two() {
        Solution solution = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        assertEquals(2, solution.majorityElement(nums));
    }

}