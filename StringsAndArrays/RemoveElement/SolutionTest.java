package RemoveElement;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void removeElement() {
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int num = solution.removeElement(nums, val);
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(2, num);
    }
}